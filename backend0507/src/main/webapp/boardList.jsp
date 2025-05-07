<%@page import="vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.BoardDaoImple"%>
<%@page import="dao.BoardDaoInter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList.jsp</title>
<style>
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #FFF9C4;
}

#customers tr:hover {
	background-color: #FFFCF0;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	background-color: #AED581;
	color: white;
}
</style>
</head>
<body>
	<div style="width: 450px; margin: auto">
		<table id="customers">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성날짜</th>
			</tr>
			<%
			BoardDaoInter dao = BoardDaoImple.getDao();
			List<BoardVO> list = dao.listBoard();
			for (BoardVO e : list) {
			%>
			<tr>
				<td><%=e.getNum()%></td>
				<td><a href="boardDetail.jsp?num=<%=e.getNum()%>"><%=e.getSubject()%></a></td>
				<td><%=e.getWriter()%></td>
				<td><%=e.getBdate()%></td>
			</tr>
			<%
			}
			%>
			<tr>
				<th colspan="4">
					<button onclick="location='boardForm.jsp'">입력</button>
				</th>
			</tr>
		</table>
	</div>
</body>
</html>