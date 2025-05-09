<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex5_if</title>
</head>
<body>
	<p>request 파라미터 : ${param.type} / ${param.type eq 'guest' }</p>
	<h2>JSTL IF문의 조건으로 사용</h2>
	<c:if test="${param.type eq 'guest' }">
		<b>반갑습니다 ${param.type }님 회원가입하세요!</b>
	</c:if>
</body>
</html>