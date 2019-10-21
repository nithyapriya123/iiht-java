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
<h1>Admin Login</h1>
<form action="AdminLogin" method="post">
User Name:<input type="text" name="username">
Password:<input type="password" name="password">
<br>
<input type="submit" value="Login">

</form>
</body>
</html>