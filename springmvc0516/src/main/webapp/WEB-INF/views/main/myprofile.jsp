<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>myprofile</title>
</head>
<body>
	<c:forEach var="e" items="${list }">
		<p>${e }</p>
	</c:forEach>
</body>
</html>