<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align = "center">DashBoard</h1>
<h2>
<%
session = request.getSession();
out.println("Hey Mr"+ " "+session.getAttribute("name")+" "+"you are welcome to Dash Board");
%>
</h2>
<br>
<br>
<br>
<section>
<nav>
<h1><a href="HotelsList">Hotels list</a></h1>
<h1><a href="roomdetails.jsp">Room Details</a></h1>
<h1><a href="Logout">Logout</a></h1>
</nav>
</section>
</body>
</html>