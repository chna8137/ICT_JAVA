<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/login.jsp</title>
<style>
	table {
		width: 100%;
		border-collapse: collapse;
	}
	th {
		padding: 8px;
		background-color: #f1f1f1;
		font-weight: normal;
		width: 90px;
	}
	td {
		padding: 8px;
		background-color: #f1f1f1;
	}
	thead th {
		padding: 12px;
	}
	input[type="text"], input[type="password"] {
		width: 70%;
		padding: 6px 10px;
		border: 1px solid #ccc;
		border-radius: 5px;
	}
	input[type="submit"] {
		background-color: skyblue;
		color: white;
		padding: 10px 20px;
		border-radius: 4px;
		cursor: pointer;
		border: none;
	}
	input[type="submit"]:hover {
	background-color: #2980b9;
}
</style>
</head>
<body>
	<div style="width: 350px; margin: auto;">
		<form method="POST" action="main.ict">
		<input type="hidden" name="cmd" value="login">
			<table>
				<thead>
					<tr>
						<th colspan="2">Login</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th>아이디</th>
						<td><input type="text" name="userid"></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" name="password"></td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<th colspan="2"><input type="submit" value="로그인"></th>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>