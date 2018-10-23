<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person Information</title>
</head>
<body>
	<h2>Entered Person Information is as follows :</h2>
	<br>
	<table>
		<tr>
			<td><b>First Name</b></td>
			<td>${personInfo.firstName}</td>
		</tr>
		<tr>
			<td><b>Middle Name</b></td>
			<td>${personInfo.middleName}</td>
		</tr>
		<tr>
			<td><b>Last Name</b></td>
			<td>${personInfo.lastName}</td>
		</tr>
		<tr>
			<td><b>City</b></td>
			<td>${personInfo.city}</td>
		</tr>
		<tr>
			<td><b>State</b></td>
			<td>${personInfo.state}</td>
		</tr>
		<tr>
			<td><b>Country</b></td>
			<td>${personInfo.country}</td>
		</tr>
	</table>
</body>
</html>