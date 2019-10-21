<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${message}
<h1>Student Login</h1>
<form action="studentLogin" method="post">
User Name:<input type="text" name="username">
Password:<input type="password" name="password">
<br>
<input type="submit" value="Login">
New Student<a href="studentregister">Register</a>
</form>
</body>
</html>