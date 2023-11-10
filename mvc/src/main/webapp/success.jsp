<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center;">
<h1>Your Details are: </h1>

<c:forEach var="i" items="${data}">
	<h3>FirstName: ${i.firstName}</h3>
	<h3>lastName: ${i.lastName}</h3>
	<h3>Email: ${i.email}</h3>
	<hr>
</c:forEach>

</body>
</html>