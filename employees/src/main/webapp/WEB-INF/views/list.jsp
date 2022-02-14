<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of Employees..</h1>

<table border="5">
	<tr>
		<th>Id</th><th>Name</th><th>Salary</th><th>Department No</th>
		<th>UpdateEmployee</th><th>Remove Employee</th>
	</tr>
	<c:forEach var="e" items="${emps}">
		<tr>
			<td>${e.getId()}</td>
			<td>${e.getName()}</td>
			<td>${e.getSalary()}</td>
			<td>${e.getDepartmentNo()}</td>
			<td><a href="edit/e.getId()">Edit</a></td>
			<td><a href="delete/e.getId()">Delete</a></td>
		</tr>
	</c:forEach>	
</table>
<a href="">Add New Employee</a>
</body>
</html>