<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotels List</title>

</head>
<body>

<table>
<tr>
<th>id</th>
<th>Hotel Name</th>
<th>Hotel Type</th>
<th>Rankings</th>
<th>Rooms Available</th>
<th>Address</th>
<th>Price list</th>
</tr>
</table>
<%
session = request.getSession();
out.println(session.getAttribute("al"));
%>




</body>
</html>