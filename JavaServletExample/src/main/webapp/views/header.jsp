<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%!int count = 0;

	int addCount() {
		return count++;
	}%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>The include Directive Example</h2>
		<p>
			This site has been visited
			<%=addCount()%>
			times.
		</p>
	</center>
	<br />
	<br />
</body>
</html>