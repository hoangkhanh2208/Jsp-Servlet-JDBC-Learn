<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="helloBean" class="com.jsptutorial.beans.HelloBean">
		<h3>Say Hello:</h3>
		<jsp:getProperty property="hello" name="helloBean" />
		<jsp:setProperty property="name" name="helloBean" value="Ksanh" />
		<h3>Say Hello after setName</h3>
		<jsp:getProperty property="hello" name="helloBean" />
	</jsp:useBean>



</body>
</html>