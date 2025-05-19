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
			<form method="post" action="fboardInsert" autocomplete="off">
				<input type="hidden" name="reip"
					value="<%=request.getRemoteAddr()%>">
				<div class="row mb-3">
					<label for="subject" class="col-sm-2 col-form-label">����</label>
					<div class="col-sm-10">
						<input type="text" name="subject" class="form-control"
							id="subject">
					</div>
				</div>
				<div class="row mb-3">
					<label for="writer" class="col-sm-2 col-form-label">�ۼ���</label>
					<div class="col-sm-10">
						<input type="text" name="writer" class="form-control" id="writer">
					</div>
				</div>
				<div class="row">
					<label for="content" class="col-sm-2 col-form-label">����</label>
					<div class="col-sm-10">
						<textarea name="content" rows="10" cols="50" id="content"></textarea>
					</div>
				</div>
				<div class="row mb-3">
					<label for="pwd" class="col-sm-2 col-form-label">��й�ȣ</label>
					<div class="col-sm-10">
						<input type="password" name="pwd" class="form-control" id="pwd">
					</div>
				</div>
				<div class="container text-center" role="group">
					<button class="btn btn-primary" type="submit">���ۼ�</button>
					<button class="btn btn-danger" type="button"
						onclick="location='fboardList'">����Ʈ</button>
				</div>
			</form>
		</div>
	</div>

</body>
</html>