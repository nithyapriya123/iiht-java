<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="./addCourse" method ="post" modelAttribute="course">
Course Name:<form:input path="courseName" type="text"/>

<form:errors path="courseName" cssClass="error"/>
<br>
Duration(In Months) :<form:input path="duration" type="text"/>
<br>
Fees:<form:input path="fees" types="text"/>
<br>

<input type="submit" value="Register">
</form:form>
</body>
</html>