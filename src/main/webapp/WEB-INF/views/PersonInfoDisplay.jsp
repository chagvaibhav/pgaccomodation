<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person Information</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h2>Entered Person Information is as follows :</h2>
	<br>
	<table>
		<tr>
			<td><b><spring:message code="label.name" /></b></td>
			<td>${personInfo.name}</td>
		</tr>
		<tr>
			<td><b><spring:message code="label.dob" /></b></td>
			<td>${personInfo.dob}</td>
		</tr>
		<tr>
			<td><b><spring:message code="label.mobile" /></b></td>
			<td>${personInfo.mobile}</td>
		</tr>
		<tr>
			<td><b><spring:message code="label.city" /></b></td>
			<td>${personInfo.address.city}</td>
		</tr>
		<tr>
			<td><b><spring:message code="label.state" /></b></td>
			<td>${personInfo.address.state}</td>
		</tr>
		<tr>
			<td><b><spring:message code="label.country" /></b></td>
			<td>${personInfo.address.country}</td>
		</tr>
		<tr>
			<td><b><spring:message code="label.pincode" /></b></td>
			<td>${personInfo.address.pincode}</td>
		</tr>
	</table>
</body>
</html>