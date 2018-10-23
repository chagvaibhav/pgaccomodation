<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Person Information</title>
</head>
<body>
	<form action="person" method="post">
		<table>
			<tr>
				<td>First Name :</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td>Middle Name :</td>
				<td><input type="text" name="middleName"></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td>City :</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>State :</td>
				<td><input type="text" name="state"></td>
			</tr>
			<tr>
				<td>Country :</td>
				<td><input type="text" name="country"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>