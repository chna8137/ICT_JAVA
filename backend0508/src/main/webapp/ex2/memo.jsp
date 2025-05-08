<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@include file="header.jsp"%>
	<main>
		<div style="width: 500px; margin: auto;">
			<h2>메모 작성 폼</h2>
			<form method="post" action="memoAdd1.jsp">
				<input type="hidden" name="reip"
					value="<%=request.getRemoteAddr()%>" />
				<p>
					<label>번호: <input type="number" name="num" required></label>
				</p>
				<p>
					<label>제목: <input type="text" name="title" required></label>
				</p>
				<p>
					<label>작성자: <input type="text" name="writer" required></label>
				</p>
				<p>
					<label>내용:<br> <textarea name="contents" rows="5"
							cols="50" required></textarea>
					</label>
				</p>
				<p>
					<input type="checkbox" name="ch1" value="자바"> 자바 <input
						type="checkbox" name="ch1" value="서블릿" checked="checked">서블릿
					<input type="checkbox" name="ch1" value="오라클">오라클 <input
						type="checkbox" name="ch1" value="리액트">리액트 <input
						type="checkbox" name="ch1" value="자바스크립트"> 자바스크립트 <input
						type="checkbox" name="ch1" value="클라우드">클라우드
				</p>
				<p>
					<input type="submit" value="저장">
				</p>
			</form>
		</div>
	</main>
	<%@include file="footer.jsp"%>