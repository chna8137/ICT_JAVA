<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>info</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="card" style="width: 80%;">
				<div class="card-header">FreeBoard Detail</div>
				<div class="card-body">
					<h5 class="card-title">제목 : ${v.subject }</h5>
					<h6 class="card-subtitle mb-2 text-muted">작성자 : ${v.writer }</h6>
					<p class="card-text">내용 : ${v.content }</p>
					<p class="card-text">아이피 : ${v.reip }</p>
					<p class="card-text">날짜 : ${v.fdate }</p>
				</div>
			</div>

			<div class="container text-center" role="group">
				<form method="post" action="fboardDelete?num=${v.num }">
					<button class="btn btn-primary"
						onclick="location='fboardList'">삭제</button>
				</form>
				&nbsp;
				
				<button class="btn btn-primary"
					onclick="location='fboardUpdateForm?num=${v.num}'">수정</button>
					</form>
				&nbsp;
				<button class="btn btn-danger" type="button"
					onclick="location='fboardList'">리스트</button>
			</div>

		</div>
	</div>
</body>
</html>