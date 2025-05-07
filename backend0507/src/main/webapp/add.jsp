<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDaoImple"%>
<%@page import="dao.BoardDaoInter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% // service 메서드 영역 즉 지역변수
	request.setCharacterEncoding("utf-8");
	// form에서 전송 되어 온 파라미터 받아서 변수에 저장하기
	String subject = request.getParameter("subject");
	String writer = request.getParameter("writer");
	String contents = request.getParameter("contents");
	String reip = request.getParameter("reip");
	
	System.out.println("subject : " + subject);
	System.out.println("writer : " + writer);
	System.out.println("contents : " + contents);
	System.out.println("reip : " + reip);
	
	// BoardVO 이유 : BoardDaoInter 에 추상메서드인 void addBoard(BoardVO vo);
	// 전달해서 호출하기 위함
	BoardVO vo = new BoardVO();
	vo.setSubject(subject);
	vo.setWriter(writer);
	vo.setContents(contents);
	vo.setReip(reip);
	
	// BoardDaoInter에 정의한 추상메서드 중에 addBoard 호출해서
	// 사용자가 입력하는
	BoardDaoInter dao = BoardDaoImple.getDao();
	dao.addBoard(vo);
	
	response.sendRedirect("boardList.jsp");
%>