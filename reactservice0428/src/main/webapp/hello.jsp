<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true"%>
<%

response.setHeader("Access-Control-Allow-Origin", "*");
response.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
response.setHeader("Access-Control-Allow-Headers", "Content-Type");

response.setContentType("application/json");
response.setCharacterEncoding("utf-8");

// 지역변수, String msg = request.getparameter("파라미터");
// http://192.168.0.24/reactservice0428/hello.jsp
/* String msg = "안녕하세요"; */
String msg = "{\"message\":\"안녕하세요\"}";

%><%=msg%>