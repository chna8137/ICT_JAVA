<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex3_EL.jsp</title>
</head>
<body>
	<h1>EL예제 3</h1>
	<div style="width: 300px; margin: 20px auto">
		<h2>추천 가수</h2>
		<ol>
			<li>${singerList[0] }</li>
			<li>${singerList[1] }</li>
		</ol>
		<ol>
			<li>이름 : ${customerList[0].name }</li>
			<li>이메일 : ${customerList[0].email }</li>
			<li>전화번호 : ${customerList[0].phone }</li>
		</ol>
	</div>
</body>
</html>