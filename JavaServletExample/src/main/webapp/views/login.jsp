<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<div style="width: 500px; margin: 30px auto;">
			<h2>Đăng ký thành viên</h2>
			<%
				if(request.getParameter("error") != null){%>
					<p style='color:red'>Sai tên đăng nhập hoặc mật khẩu </p>
				<%}%>
			<form action="<%= request.getContextPath()%>/exam1" method="post">
				<div>
					<label>Tên đăng nhập: </label>
					<input type="text" name="username" value="" />
				</div>
				<br />
				<div>
					<label>Mật khẩu: </label>
					<input type="password" name="password" value="" />
				</div>
				<br />
				<div>
					<input type="submit" name="submit" value="Đăng ký" />
					<input type="reset" name="reset" value="Nhập lại" />
				</div>
			</form>
		</div>
</body>
</html>