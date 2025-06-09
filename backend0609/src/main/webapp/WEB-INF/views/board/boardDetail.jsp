<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDaoImple"%>
<%@page import="dao.BoardDaoInter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardDetail</title>
</head>
<body>
	<div style="width: 400px; margin: 20px auto">
		<p>number : ${vo.num }</p>
		<p>subject : ${vo.subject }</p>
		<p>writer : ${vo.writer }</p>
		<p>contents : ${vo.contents }</p>
		<button onclick="location='myict.ict?cmd=blist'">리스트</button>
		<form method="post" action="myict.ict" onsubmit="return boardDel()">
			<input type="hidden" name="cmd" value="bdel">
			<input type="hidden" name="num" value="${vo.num }">
			<input type="submit" value="삭제">
		</form>
		<form method="post" action="myict.ict" onsubmit="return boardUp()">
			<input type="hidden" name="cmd" value="bupform">
			<input type="hidden" name="num" value="${vo.num }">
			<input type="submit" value="수정">
		</form>
	</div>
	<script>
		function boardDel() {
			return confirm("정말로 삭제할까요?");
		}
		function boardUp() {
			return confirm("정말로 수정할까요?");
		}
	</script>
</body>
</html>