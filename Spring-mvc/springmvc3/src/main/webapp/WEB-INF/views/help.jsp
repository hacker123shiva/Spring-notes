<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name=(String)request.getAttribute("name");
%>
<h1>My name is <%=name %></h1>
<h2>I am here for help</h2>
</body>
</html>