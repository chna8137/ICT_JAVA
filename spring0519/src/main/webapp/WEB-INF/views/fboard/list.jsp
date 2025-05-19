<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>list</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="e" items="${flist}">
				<tr>
					<td>${e.num }</td>
					<td><a href="fboardHit?num=${e.num}" class="link-secondary">${e.subject }</a></td>
					<td>${e.writer }</td>
					<td>${e.hit }</td>
					<td>${e.fdate }</td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<th colspan="5"><input type="button" value="write" onclick="location='fboardForm'"></th>
			</tr>
		</tfoot>
	</table>
</body>
</html>