<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%!
    public int sum(int a, int b){
    	return a + b;
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%Random rd = new Random();
		int randomInt = rd.nextInt(3);
		
		if(randomInt == 0){
	%>
	
	<h1>Random value = <%= randomInt %></h1>
	
	<%}else if(randomInt == 1){ %>
	
	<h2>Random value = <%= randomInt %></h2>
	<%}else{%>
	<h3>Random value = <%= randomInt %></h3>
	<%} %>
	
	<a href="<%= request.getRequestURI()%> ">Try again</a>
	
	<% 
	int a = 5;
	int b = 9;
	%>
	<h2>chó <%=sum(a, b) %></h2>
</body>
</html>