<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/student/studentRegProcess" method="post" modelAttribute ="student">
student Id:<input type="text"name="studentId">
<br>
student Name:<input type="text"name="studentName">
<br>
Email:<input type="text"name="email">
<br>
Mobile:<input type="text"name="mobile">
<br>
username:<input type="text"name="username">
<br>
Password:<input type="text"name="password">
<br>
<input type="submit" value="Register">
<br>
Existing student:<a href="student/"></a>
</form>
</body>
</html>
