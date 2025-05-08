<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex2_basic_param</title>
</head>
<body>
	<div style="width: 400px; margin: auto">
		<a href="ex2_basic_param2.jsp?num1=10&num2=20">Get방식</a>
		<form method="post" action="ex2_basic_param2.jsp" style="width:500px">
		<input type="hidden" name="reip" value="<%=request.getRemoteAddr() %>">
			<p>
				<input type="radio" name="r1" value="yes" checked="checked">yes 
				<input type="radio" name="r1" value="no">no
			</p>
			<p>
				<input type="checkbox" name="ch1" value="자바">자바 
				<input type="checkbox" name="ch1" value="서블릿" checked="checked">서블릿
				<input type="checkbox" name="ch1" value="오라클">오라클
				<input type="checkbox" name="ch1" value="리액트">리액트
				<input type="checkbox" name="ch1" value="자바스크립트">자바스크립트
				<input type="checkbox" name="ch1" value="클라우드">클라우드
			</p>
			<p>
				<select name="sel1">
					<option value="백엔드" >백엔드</option>
					<option value="프론트엔드">프론트엔드</option>
				</select>
			</p>
			<p>
				<input type="submit" value="전송">
			</p>
			
		</form>
	</div>
</body>
</html>