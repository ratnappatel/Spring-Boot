<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot Login Form</title>
</head>
<body>
	<form:form name="loginForm" method="post" action="/">
		<div align="center">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type=text path="userName" name="userName" required/>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type=password path="password" name="password" required/>
				</tr>
				<tr>
					<td><input type=submit value="Login"/></td>
				</tr>
			</table>
			<div style="color:red">${error}</div>
		</div>
	</form:form>
</body>
</html>