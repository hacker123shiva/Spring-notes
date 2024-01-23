<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${Header }</h1>
<h2>${desc }</h2>
<h3 style="color:green">${msg }</h3>
<h1>UserName is :: ${user.getName()}</h1>
 <h1>Email is :: ${user.getEmail()}</h1>
</body>
</html>