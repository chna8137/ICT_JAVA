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
					<h5 class="card-title">���� : ${v.subject }</h5>
					<h6 class="card-subtitle mb-2 text-muted">�ۼ��� : ${v.writer }</h6>
					<p class="card-text">���� : ${v.content }</p>
					<p class="card-text">������ : ${v.reip }</p>
					<p class="card-text">��¥ : ${v.fdate }</p>
				</div>
			</div>

			<div class="container text-center" role="group">
				<form method="post" action="fboardDelete?num=${v.num }">
					<button class="btn btn-primary"
						onclick="location='fboardList'">����</button>
				</form>
				&nbsp;
				
				<button class="btn btn-primary"
					onclick="location='fboardUpdateForm?num=${v.num}'">����</button>
					</form>
				&nbsp;
				<button class="btn btn-danger" type="button"
					onclick="location='fboardList'">����Ʈ</button>
			</div>

		</div>
	</div>
</body>
</html>