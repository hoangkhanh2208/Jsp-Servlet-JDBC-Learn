<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="width: 500px; margin: 50px auto;background:#D0D01A;padding:30px">
			<h2>Quản lý admin || ITPHUTRAN.COM</h2>
			<%
				if(session.getAttribute("username") != null){
			%>
			<p>Username :<strong><%=session.getAttribute("username") %></strong> </p>
			<p>Hello :<strong><%=request.getAttribute("dis") %></strong> </p>
			<%} %>
		</div>
</body>
</html>