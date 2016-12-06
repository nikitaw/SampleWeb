<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Sample Demo Module</title>
 <style>
		body {
			background-color: powderblue;
		}
		
		h1 {
			color: blue;
			position: center;
		}

		h3 {
			color: red;
			position: center;
		}
		
		div{
			position: center;
			background-image: url("images/welcome.jpg");
		}
</style>
</head>
<body>
<div>
 	<h1>Demo Application</h1> 
	<h3>${message}</h3>
	<h3>No of hits on this page : ${counter}</h3>
 </div>
</body>
</html>