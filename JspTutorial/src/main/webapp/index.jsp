<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello JSP</h1>
	
	<%
	String getURL = (String)request.getAttribute("reqURL");
	out.print(getURL);
	//response.sendRedirect("demo/JavaInHtml.jsp");
	%>
</body>
</html>