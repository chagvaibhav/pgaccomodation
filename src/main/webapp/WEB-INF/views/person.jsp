<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Person Information</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<form:errors path="personInfo.*" />

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
				<td>Date Of Birth :</td>
				<td><input type="text" name="dob"></td>
			</tr>
			<tr>
				<td>Mobile :</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td><h4>Person Address</h4></td>
			</tr>
			<tr>
				<td>City :</td>
				<td><input type="text" name="address.city"></td>
				<td>State :</td>
				<td><input type="text" name="address.state"></td>
				<td>Country :</td>
				<td><input type="text" name="address.country"></td>
				<td>Pincode :</td>
				<td><input type="text" name="address.pincode"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>