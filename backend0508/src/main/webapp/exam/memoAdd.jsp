<%@page import="exam.MemoModel"%>
<%@page import="exam.MemoModelInter"%>
<%@page import="exam.MemoVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
String methods = request.getMethod();
MemoVO vo = new MemoVO();
String str = "";

if (methods.equals("POST")) {
	int num = Integer.parseInt(request.getParameter("num"));
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String contents = request.getParameter("contents");
	String reip = request.getParameter("reip");
	String[] ch1 = request.getParameterValues("ch1");

	vo.setNum(num);
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContents(contents);
	vo.setReip(reip);
	vo.setCh1(ch1);

	MemoModelInter mi = MemoModel.getModel();
	str = mi.printMemo(vo);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><%=str%></p>
</body>
</html>