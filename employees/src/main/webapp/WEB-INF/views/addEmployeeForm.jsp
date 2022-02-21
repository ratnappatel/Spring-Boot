<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" action="/employees/add" modelAttribute="e">
Enter Employee Name: <input type="text" name="name"><br>
Enter Employee Salary: <input type="text" name="salary"><br>
Enter Employee Department No: <input type="text" name="departmentNo"><br>
<input type="submit" value="Add Employee"><input type="reset" value="Reset">
</form:form>

</body>
</html>