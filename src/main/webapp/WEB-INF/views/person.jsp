<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Person Information</title>
</head>
<body>

	<a href="/PgAccomodation/person?siteLanguage=en">English</a> |
	<a href="/PgAccomodation/person?siteLanguage=fr">French</a>

	<h1>${headerMessage}</h1>
	<form:errors path="personInfo.*" />

	<form action="person">
		<table>
			<tr>
				<td><b><spring:message code="label.name" /></b></td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td><b><spring:message code="label.dob" /></b></td>
				<td><input type="text" name="dob"></td>
			</tr>
			<tr>
				<td><b><spring:message code="label.mobile" /></b></td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td><h4>Person Address</h4></td>
			</tr>
			<tr>
				<td><b><spring:message code="label.city" /></b></td>
				<td><input type="text" name="address.city"></td>
				<td><b><spring:message code="label.state" /></b></td>
				<td><input type="text" name="address.state"></td>
				<td><b><spring:message code="label.country" /></b></td>
				<td><input type="text" name="address.country"></td>
				<td><b><spring:message code="label.pincode" /></b></td>
				<td><input type="text" name="address.pincode"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>