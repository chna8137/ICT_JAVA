<%@page import="ex1.CustomerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex1_EL.jsp</title>
</head>
<body>
<h1>EL예제 1</h1>
<%-- <%
CustomerVO vo = (CustomerVO)request.getAttribute("customer");
%>
<p>Name : <%=vo.getName() %> </p> --%>
<div style="width: 300px; margin: auto">
	<ul>
		<li>Num : ${customer.num}</li>
		<li>Name : ${customer.name}</li>
		<li>Email : ${customer.email}</li>
		<li>Phone : ${customer.phone}</li>
		<li>Cdate : ${customer.cdate}</li>
	</ul>
</div>
</body>
</html>