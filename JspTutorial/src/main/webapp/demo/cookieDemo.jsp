<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.jsptutorial.Utils.CookieUtils"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<body>
	<%
	CookieUtils.demoUserCookie(request, response, out);
	%>

	<a href="">Try again!!</a>
</body>
</html>