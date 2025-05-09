<%@page import="ex1.CustomerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="customer" class="ex1.CustomerVO" />
<jsp:setProperty property="*" name="customer" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customerForm.jsp</title>
</head>
<body>
	<form method="post" action="customer">
		<!-- <p>Num  : <input type="number" name="num"/></p> -->
		<p>Name <input type="text" name="name" value="테스형"/></p>
		<p>Email  : <input type="email" name="email" value="tess01@ict.co.kr"/></p>
		<p>Phone  : <input type="text" name="phone" value="02-1010-8888"/></p>
		<input type="submit" value="저장">
	</form>
</body>
</html>