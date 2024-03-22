<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo File</title>

</head>
<body>

<% out.print("This is Demo File"); %><br>
<%! String name = "John"; %>
<%! int age = 22; %>

<%= "Name is : " +name  %><br>
<%= "Age is : " +age  %>


</body>
</html>