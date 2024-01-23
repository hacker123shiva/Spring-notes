<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page isELIgnored="false"   %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
 
<h1>My name is ${name}  </h1>
<h2>Roll no is ${rollno}</h2>
<h2>I am here for help</h2>
<hr>
<h2>Marks :: </h2>

 <c:forEach value="item" items="${marks}">
<h1>${item }</h1> 
 <c:out value="${item }"></c:out>
</c:forEach>
 
 

</body>
</html>