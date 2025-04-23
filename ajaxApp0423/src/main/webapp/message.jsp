<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 공백 제거해주는 기능 -->
    <%@page trimDirectiveWhitespaces="true" %>
<%--message.jsp--%>

<%
	// Header
	response.setHeader("Access-Control-Allow-Origin", "*");
	response.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
	response.setHeader("Access-Control-Allow-Headers", "Content-Type");

	// jsp에서는 내장객체라고 해서 섭르릿에서 사용한 객체를 축약형으로 제공
	// HttpServletRequest req -> MIME 타입 - 브라우저에게 타입을 알려주는 응답 방법
	response.setContentType("application/json");
	response.setCharacterEncoding("utf-8");
	String jsonResponse = "{\"msg\":\"반가워요\", \"name\":\"테스형\"}";
%>




<%=jsonResponse%>