<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex6_forEachChoose</title>
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
	<div style="width: 450px; margin: 20px auto">
		<table>
			<c:forEach begin="${start}" end="${end}" step="1" var="i">
				<c:choose>
					<c:when test="${i % range == 0}">
						<tr>
							<td style="background-color: orange;">${i}</td>
						</tr>
					</c:when>
					<c:when test="${i % range != 0}">
						<tr>
							<td style="background-color: skyblue;">${i}</td>
						</tr>
					</c:when>
				</c:choose>
			</c:forEach>
		</table>
	</div>
</body>
</html>