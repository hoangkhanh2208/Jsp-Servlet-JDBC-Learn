<%@page import="com.hoangkhanh.beans.UserAccount"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file = "header.jsp" %>
<center>
<p>Thanks for visiting my page.</p>


User Name: <b><%=request.getAttribute("username") %></b></br>
User Name: <b><%= request.getAttribute("password") %></b></br>
</center>
<%@ include file="footer.jsp" %>
</table>
</body>
</html>