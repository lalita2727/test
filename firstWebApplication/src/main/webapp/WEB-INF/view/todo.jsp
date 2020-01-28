<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todos</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">

</head>


<body>
<div class="container">
<h1>Add a Todo</h1>
<form:form method="post">
	<fieldset class="form-group">
		<label>Description</label>
		<input name="desc" type="text" class="form-control" required="required" />
	</fieldset>
<input class="btn btn-success" type="submit" value="Add"/ >
</form:form>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>