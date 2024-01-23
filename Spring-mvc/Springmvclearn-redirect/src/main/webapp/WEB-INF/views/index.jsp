<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<h1>  This is my home page</h1>
<h1>home controller</h1>
<h2>/home url</h2>
 
<%
     String name=(String)request.getAttribute("name");
     Integer id=(Integer)request.getAttribute("id");
     List<String> friends=(List<String>)request.getAttribute("friends");
%>

<h2>Name is <%=name %></h2>
<h2>Id id  <%=id %></h2>
<h2>Friends list  are::  <%
for(String s: friends)
{ 
	%>
	
	 <h1><%=s %></h1>
	 </hr>
	 <%
	 
}
%></h2>
</body>
</html>