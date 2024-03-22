<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Form BackEnd</title>

</head>

<body>

<% String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String email = request.getParameter("email");%>
	
<%= "First Name : "+fname %><br>	
<%= "Last Name : "+lname %> <br>
<%= "Email : "+email %>
</body>
</html>