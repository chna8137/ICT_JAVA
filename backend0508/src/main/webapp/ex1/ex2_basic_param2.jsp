<%@page import="ex1.BasicModel"%>
<%@page import="ex1.BasicModelInter"%>
<%@page import="ex1.BasicVO"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 인코딩 추가하기
	request.setCharacterEncoding("UTF-8");
	String methods = request.getMethod();
	System.out.println(methods);
	int n1 = 0;
	int n2 = 0;
/* 	String reip = "";
	String r1 = "";
	String[] ch1 = null;
	String sel1 = ""; */
	
	// VO 객체를 생성한 후 해당 영역에서 setter로 값 저장하기
	BasicVO vo = new BasicVO();
	if(methods.equals("GET")) {
		n1 = Integer.parseInt(request.getParameter("num1"));
		n2 = Integer.parseInt(request.getParameter("num2"));
	} else if(methods.equals("POST")) {
		// 총 3개의 파라미터 전송 : reip, r1, ch1[]
		String reip = request.getParameter("reip");
		String r1 = request.getParameter("r1");
		// check된 값만 파라미터로 넘어와서 배열로 반환
		String[] ch1 = request.getParameterValues("ch1"); // getParameterValues 체크박스 전용
		String sel1 = request.getParameter("sel1");
		
		vo.setReip(reip);
		vo.setR1(r1);
		vo.setCh1(ch1);
		vo.setSel1(sel1);
		
		// 우리가 만든 메서드에게 VO주소를 매개변수를 전달해서 해당 기능이 수행되도록 구현
		BasicModelInter bm = BasicModel.getModel();
		// 기능이 적용된 vo를 반환 받는다
		vo = bm.changeData(vo);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="width:350px; margin: auto">
		<% if(methods.equals("GET")) { %>
			<p>파라미터 n1 : <%=n1 %></p>
			<p>파라미터 n2 : <%=n2 %></p>
		<% } else if(methods.equals("POST")) { %>
			<p>접속자 IP : <%=vo.getReip() %></p>
			<p>동의 여부 : <%=vo.getR1() %></p>
			<p>선택한 과목 : <%=Arrays.toString(vo.getCh1()) %></p>
			<p>선택한 개발자 : <%=vo.getSel1() %></p>
		<% } %>
	</div>
</body>
</html>