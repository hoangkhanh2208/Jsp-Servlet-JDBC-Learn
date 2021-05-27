<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1><c:out value="${1 + 1}"></c:out></h1>
	
	<c:set scope="request" var="A" value="Hello cc"></c:set>
	
	AA:<c:out value="${A}"></c:out>
	
	<c:remove scope="request" var="A"/>
	AA: <c:out value="${A}"></c:out>
	
	<c:url value="abcabc.jsp" var="myUrl">
		<c:param name="color" value="Blue"></c:param>
		<c:param name="name" value="Khanh"></c:param>
	</c:url>
	
	<c:out value="${myUrl }"></c:out>
</body>
</html>