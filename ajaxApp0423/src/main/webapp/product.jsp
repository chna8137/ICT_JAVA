<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="ex1_css.ProductVO"%>
<%@page import="java.util.List"%>
<%@page import="ex1_css.ProductModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true" %>
<%
	// Cross domain을 허용 - Ajax요청시 보안 설정을 허용
	response.setHeader("Access-Control-Allow-Origin", "*");
	response.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
	response.setHeader("Access-Control-Allow-Headers", "Content-Type");
	
	// json으로 응답
	/* response.setContentType("application/json"); */
	response.setContentType("text/html;charset=UTF-8");
	response.setCharacterEncoding("utf-8");
	
	// Model로 부터 json으로 표현할 가상 데이터를 불러오기
	// ProductModel 생성하기
	ProductModel ref = ProductModel.getpModel(); // 싱글톤으로 적용된 메서드를 호출해서 생성함.
	
	List<ProductVO> productList = ref.getProList();
	// Jackson ObjectMapper를 사용하여 자바 객체를 JSON으로 변환
	ObjectMapper objectMapper = new ObjectMapper();
	String jsonResponse = objectMapper.writeValueAsString(productList);
	
	// 테스트
	/* for(ProductVO e : productList) { */
	// [{"num" : 1, "ptitle" : "상품1", "pcont" : "상품1 : 설명 텍스트"}, .....]
%><%=jsonResponse %>
<%-- <%=e.getPtitle() %> --%>
<%-- <%=e.getImg() %> --%>
<% //} %>
