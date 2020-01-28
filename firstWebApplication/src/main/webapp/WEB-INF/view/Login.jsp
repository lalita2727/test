<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo From JSP</title>
</head>


<body>

<form action="/login" method="post">
<p><font color="red">${errorMessage}</font></p>
Username: <input type="text" name="username"/>
<br>
<br>
Password: <input type="password" name="password"/>
<br>
<br>
<input type="Submit" value="login"/>
</form>
</body>
</html>