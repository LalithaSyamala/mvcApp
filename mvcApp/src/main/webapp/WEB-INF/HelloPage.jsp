<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter your details</h2>

<form action="addEmpDetails" method="POST">

<Label>ID: </Label>
<input type="text" name="id" placeholder="id"><br>
<Label>Name: </Label>
<input type="text" name="name" placeholder="Name"><br>
<Label>Role: </Label>
<input type="text" name="role" placeholder="role"><br>
<Label>Address: </Label>
<input type="text" name="address" placeholder="Address"><br><br>
<input type="submit" value="Submit">

</form>
</body>
</html>