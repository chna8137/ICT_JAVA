<%@page import="ex1.Ex1_Hello"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	// springContainer�� �����Ѵ�.
	// �������� ������ bean��ü�� ������ ������ bean xml������ �о�ͼ� �̱������� �������ִ� �����̳�
	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1.xml");
	// ex1.Ex1_Hello
	// �̹� ������ ���� ���̵� ������ �ּ� ��ȯ �޾Ƽ� �������� ex1ref�� ������ ��
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