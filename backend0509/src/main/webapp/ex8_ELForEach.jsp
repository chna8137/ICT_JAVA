<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex8_ELForEach.jsp</title>
</head>
<body>
	<h1>EL예제 3</h1>
	<div style="width: 300px; margin: 20px auto">
		<h2>추천 가수</h2>
		<ol>
		<%-- items는 ${} 배열, 리스트 등 집합일 때 받아오는 속성
			for(string e : singerList) {}
		 --%>
			<c:forEach items="${singerList}" var="e">
				<li>${e}</li>
			</c:forEach>
		</ol>
		<ol>
			<c:forEach items="${customerList}" var="e">
				<li>${e.name}</li>
				<li>${e.email}</li>
				<li>${e.phone}</li>
				<hr/>
			</c:forEach>
<%-- 			<li>이름 : ${customerList[0].name }</li>
			<li>이메일 : ${customerList[0].email }</li>
			<li>전화번호 : ${customerList[0].phone }</li> --%>
		</ol>
	</div>
</body>
</html>