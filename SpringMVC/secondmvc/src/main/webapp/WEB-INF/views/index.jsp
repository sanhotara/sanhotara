<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Form</title>
</head>
<body>
	<form:form action="save" method="post" modelAttribute="user">
		User Name: <form:input type="text" path="name" />
		<br>
		<br>
		Email: <form:input type="email" path="email" style="margin-left:34px;" />
		<br>
		<br> 
		Password: <form:input type="password" path="password"  style="margin-left:10px;" />
		<br>
		<br>
		Confirm Password: <form:input type="password" path="confirm_password" />
		<br>
		<br>
		<input type="submit" value="Register">
        <br>
        <br>
        <!-- <form:radiobutton path="email" />
        <form:checkbox path="email" value="91"/>
        <form:select path="password" />
        <form:textarea path="name" col="5" row="2" />
        <form:hidden path="name" />
        <form:select path="name" value="1">
            <form:option value="1">1</form:option>
	        <form:option value="2">2</form:option>
        </form:select>
        <form:label path="email">Contact</form:label> -->
	</form:form>
</body>
</html>