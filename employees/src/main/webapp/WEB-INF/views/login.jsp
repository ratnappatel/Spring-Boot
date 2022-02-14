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
<form:form method="post" action="/user/login">
Enter User Id <input type="text" name="id"><br>
Enter Password<input type="password" name="password"><br>
<input type="submit" value="Login">
</form:form>
</body>
</html>