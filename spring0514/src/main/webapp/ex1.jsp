<%@page import="ex1.Ex1_Hello"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	// springContainer를 선언한다.
	// 스프링이 관리할 bean객체를 정의한 스프링 bean xml문서를 읽어와서 싱글톤으로 생성해주는 컨테이너
	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1.xml");
	// ex1.Ex1_Hello
	// 이미 생성된 빈의 아이디를 가지고 주소 반환 받아서 참조변수 ex1ref에 저장한 것
	Ex1_Hello ex1ref = ctx.getBean("ex1", Ex1_Hello.class);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%=ex1ref.printHello() %>
</body>
</html>