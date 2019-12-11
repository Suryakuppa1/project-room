<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="Login" method="post">
<table border = "0"  align="center">

<tr>
<td colspan=2><center><font size=4><b>Login Page</b></font></center></td>
</tr>

<tr>
<td><label for="username">UserName:</label></td>
<td><input id="username" maxlength="50" name="username" type="text"  size = "25"/></td>

</tr>

<tr>
<td><label for="password">Password:</label></td>
<td><input id="password" maxlength="50" name="password" size ="25"
type="password" /></td>
</tr>

<tr>
<td align = "right"><input name = "Submit" type="Submit"  value="Login"></td>
</tr>

</table>
</form>
</body>
</html>