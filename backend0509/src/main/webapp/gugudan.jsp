<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	margin: 20px auto;
	border-collapse: collapse;
}

td {
	border: 1px solid #999;
	padding: 8px;
	text-align: center;
}

th {
	background-color: #f0f0f0;
	padding: 8px;
}
</style>
</head>
<body>
	<div style="width: 300px; margin: auto">
		<table>
			<c:forEach begin="0" end="9" var="i" step="1">
				<tr>
					<c:forEach begin="${start}" end="${end}" var="j" step="1">
						<c:choose>
							<c:when test="${i == 0}">
								<td>${j}단</td>
							</c:when>
							<c:when test="${j == dan}">
								<td style="background-color: ${color}">${j}x ${i} = ${j*i}</td>
							</c:when>
							<c:otherwise>
								<td>${j}x ${i} = ${j*i}</td>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</tr>
			</c:forEach>
		</table>
</body>
</html>