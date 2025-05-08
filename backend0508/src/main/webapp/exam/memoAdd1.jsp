<%@page import="exam.MemoVO"%>
<%@page import="org.apache.commons.beanutils.BeanUtils"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%
	Map<String, String[]> maps = request.getParameterMap();
	for(Map.Entry<String, String[]> e : maps.entrySet()) {
		System.out.println("Key => " + e.getKey() + " : " + Arrays.toString(e.getValue()));
	}
	System.out.println("---------------------------");
%> --%>
<%
MemoVO vo = new MemoVO();
try {
	// map이 키 값을 찾아서 vo의 property에 매핑해준다.
	BeanUtils.populate(vo, request.getParameterMap());
} catch (Exception e) {
	e.printStackTrace();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memoAdd1</title>
</head>
<body>
<p>title : <%=vo.getTitle() %> </p>
<p>writer : <%=vo.getWriter() %> </p>
<p>contents : <%=vo.getContents() %> </p>
<p>선택항목 : <%=Arrays.toString(vo.getCh1())%> </p>
</body>
</html>