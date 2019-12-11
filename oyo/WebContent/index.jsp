<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>registration form</title>
</head>

<h2 ALIGN="CENTER">Registration form</h2>

<form action="Register" method="post">
<table border="0" align="center">
<tbody>

<tr>
<td><label for="name">Name: </label></td>
<td><input id="name" maxlength="50" name="name" type="text" /></td>
</tr>

<tr>
<td><label for="mobilenumber">Mobile No: </label></td>
<td><input id="mobilenumber" maxlength="50" name="mobilenumber" type="text" /></td>
</tr>


<tr>
<td><label for="email">EmailAddress:</label></td>
<td><input id="email" maxlength="50" name="email" type="text" /></td>
</tr>

<tr>
<td><label for="username">UserName:</label></td>
<td><input id="username" maxlength="50" name="username" type="text" /></td>
</tr>

<tr>
<td><label for="password">Password:</label></td>
<td><input id="password" maxlength="50" name="password"
type="password" /></td>
</tr>

<tr>
<td align="right"><input name="Submit" type="Submit" value="Register" /></td>
</tr>
<tr>
<td align="center"><h3>Click here to login if already registered</h3></td>
<td align="center"><a href= "login.jsp">Login</a></td>
</tr>

</tbody>
</table>
</form>
</html>