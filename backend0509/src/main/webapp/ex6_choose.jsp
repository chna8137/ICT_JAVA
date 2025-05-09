<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex6_choose</title>
</head>
<body>
	<div style="width: 300px; margin: auto">
		<c:choose>
			<c:when test="${param.type eq 'guest' }">
				<p style="color: orange;">안녕하세요 guest 고객님!</p>
			</c:when>
			<c:when test="${param.type eq 'member' }">
				<p style="color: blue;">안녕하세요 member 고객님!</p>
			</c:when>
			<c:when test="${param.type eq 'vip' }">
				<p style="color: green;">안녕하세요 vip 고객님!</p>
			</c:when>
			<c:otherwise>
				<p style="color: red;">정상적인 경로가 아닙니다...!!</p>			
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>