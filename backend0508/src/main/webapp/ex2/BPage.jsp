<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="APage.jsp"%>
	<%
	int num2 = 100;
	%>
	<p style="color: red">num : <%=num %></p>
	<p>num2 : <%=num2 %></p>
</body>
</html>