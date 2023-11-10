<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center;">
<h1>Welcome to home page!!!</h1>
<h2>Enter your details</h2>

<form action="getDetails" method="POST">

<Label>FirstName: </Label>
<input type="text" name="firstName" placeholder="FirstName"><br>
<Label>LastName: </Label>
<input type="text" name="lastName" placeholder="LastName"><br>
<Label>Email: </Label>
<input type="email" name="email" placeholder="Email"><br>
<input type="submit" value="Submit">

</form>
</body>
</html>