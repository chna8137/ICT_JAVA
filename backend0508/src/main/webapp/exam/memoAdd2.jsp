<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="exam.MemoVO"/>
<%-- <jsp:setProperty property="title" name="" value="vo" param="title"/> --%>
<jsp:setProperty property="*" name="vo"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memoAdd2</title>
</head>
<body>
<p>title : <%=vo.getTitle() %> </p>
<p>writer : <%=vo.getWriter() %> </p>
<p>contents : <%=vo.getContents() %> </p>
</body>
</html>