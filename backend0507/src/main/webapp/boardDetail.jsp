<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDaoImple"%>
<%@page import="dao.BoardDaoInter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	// BoardDaoInter 상세보기를 구현한 추상 메서드를 호출
	BoardDaoInter dao = BoardDaoImple.getDao();
	// select * from board where num=? : BoardVO에 저장해서 반환됨
	BoardVO vo = dao.detailBoard(num);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardDetail</title>
</head>
<body>
	<div style="width: 400px; margin: 20px auto">
		<p>number : <%=vo.getNum() %></p>
		<p>subject : <%=vo.getSubject() %></p>
		<p>writer : <%=vo.getWriter() %></p>
		<p>contents : <%=vo.getContents() %></p>
		<button onclick="location='boardList.jsp'">리스트</button>
	</div>
</body>
</html>