<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<h1> Login to ngockhuong.com </h1>
	<%
		String err = request.getParameter("err");
		if("1".equals(err)){
			out.print("<h4 style=\"color: red;\">Login faile!</h4>");
		}
	%>
	
	<form action="/JavaWebMVC/login" method="POST">
		<label> Username: </label>
        <input type="text" name="username"> <br>
        <label> Password: </label>
        <input type="password" name="password"> <br>
        <label>&nbsp; </label>
        <input type="submit" value="Login" name="submit">
	</form>
</body>
</html>