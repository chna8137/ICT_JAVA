<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- 1. taglib 지시자를 사용해서 JSTL선언
	Tomcat 9 : http;//java.sun.com/jsp/jstl/core
	Tomcat 10버전부터 변경 : jakarta.tags.core
--%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex4_jstlforEach.jsp</title>
<style>
table {
	margin: 10px auto;
	border-collapse: collapse;
}

td {
	border: 1px solid #999;
	padding: 8px;
	text-align: center;
}
</style>
</head>
<body>
	<%-- foreach : begin(초기식), end(조건식), step(증감식), varStatus(변수명), var, items 등의 속성을 갖고 잇ㄷ다. --%>
	<div style="width: 300px; margin: auto">
		<table>
			<c:forEach begin="1" end="10" step="1" varStatus="i">
				<tr>
					<td>${i.count} / ${i.index}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>