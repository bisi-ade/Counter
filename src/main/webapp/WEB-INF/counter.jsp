<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!-- c:out ; c:forEach ; c:if -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
  <!-- Bootstrap -->
  <link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
    crossorigin="anonymous">
</head>
<body>
    <div class="container">Session Counter</div>
    <h1>You have visited <a href="/">http://localhost:8080</a> <c:out value="${count}"/> times.</h1>
	<a href="/"><button class="btn btn-primary">Go Back</button></a>
	<a href="/counter2"><button class="btn btn-info">Add Two to Counter</button></a>
	<a href="/reset"><button class="btn btn-danger">Reset Sessions Counter</button> 
</body>
</html>