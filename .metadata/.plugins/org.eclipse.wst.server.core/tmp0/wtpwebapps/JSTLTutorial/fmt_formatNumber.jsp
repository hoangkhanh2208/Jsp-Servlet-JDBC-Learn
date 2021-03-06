<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>fmt:formatNumber example</h2>
	<c:set var="accountBalance" value="12345.6789"></c:set>
	 <h3>accountBalance = <c:out value="${accountBalance}"/></h3>
	 
	 <p>formatNumber (type='currency'):
	 <strong><fmt:formatNumber value="${accountBalance}" type="currency"/></strong>
	 </p>
	 
	 <p>formatNumber (type='number', maxIntegerDigits= '3'):
	 <strong><fmt:formatNumber value="${accountBalance}" type="number" maxIntegerDigits="5"/></strong>
	 </p>
	 
	  <p>
        formatNumber (type='number', maxFractionDigits= '3'):
        <strong>
           <fmt:formatNumber type="number" maxFractionDigits="4" value="${accountBalance}" />
        </strong>
     </p>
     
     <p>
        formatNumber (type='number', groupingUsed= 'false'):
        <strong>
           <fmt:formatNumber type="number" groupingUsed="false" value="${accountBalance}" />
        </strong>
     </p>
	 
	 
</body>
</html>