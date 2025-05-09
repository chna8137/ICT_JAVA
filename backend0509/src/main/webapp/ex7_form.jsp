<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex7_form.jsp</title>
</head>
<body>
<div style="width: 350px; margin: 50px auto">
	<div>
		<form action="ex7servlet" method="post">
			<p>start : <input type="number" name="start"></p>
			<p>start : <input type="number" name="end"></p>
			<p>range : <input type="number" name="range"></p>
			<p><input type="submit" value="send"></p>
		</form>
	</div>
</div>
</body>
</html>