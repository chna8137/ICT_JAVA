<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- JSP 기초
	선언부, 스크립트릿, 표현식으로 구분된다.
 --%>
<%!// 여기는 서블릿의 멤버필드 영역 (선언부)
	private int age = 20;

	// 메서드 정의
	public String msg(String msg) {
		String res = "";
		if (msg.contains("하이")) {
			res = "당신의 나이는 " + age + "입니다.";
		} else {
			res = "당신의 나이를 모르겠어요";
		}
		return res;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex1_basic01.jsp</title>
</head>
<body>
<%
	// 스크립트 릿 영역 -> service 메서드 안 (로컬 영역)
	String myMsg = msg("하이 반가워요");
%>
<p><%=myMsg %></p>
</body>
</html>