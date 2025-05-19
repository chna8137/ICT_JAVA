<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>write</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<h2>FreeBoard</h2>
			<form method="post" action=fboardUpdate autocomplete="off">
				<input type="hidden" name="reip"
					value="<%=request.getRemoteAddr()%>">
				<div class="row mb-3">
					<label for="subject" class="col-sm-2 col-form-label">제목</label>
					<div class="col-sm-10">
						<input type="text" name="subject" class="form-control"
							id="subject" value=${v.subject }>
					</div>
				</div>
				<div class="row mb-3">
					<label for="writer" class="col-sm-2 col-form-label">작성자</label>
					<div class="col-sm-10">
						<input type="text" name="writer" class="form-control" id="writer" value="${v.writer }">
					</div>
				</div>
				<div class="row">
					<label for="content" class="col-sm-2 col-form-label">내용</label>
					<div class="col-sm-10">
						<textarea name="content" rows="10" cols="50" id="content">${v.content }</textarea>
					</div>
				</div>
				<div class="container text-center" role="group">
					<button class="btn btn-primary" type="submit">수정</button>
					<button class="btn btn-danger" type="button"
						onclick="location='fboardList'">리스트</button>
				</div>
			</form>
		</div>
	</div>

</body>
</html>