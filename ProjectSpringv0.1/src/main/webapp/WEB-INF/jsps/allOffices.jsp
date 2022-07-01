<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Database Offices</title>
</head>
<body>
<h2>Offices</h2>
<table>
	<tr>
		<th> Office Code </th>
		<th> City </th>
		<th> Phone </th>
		<th> Address Line 1 </th>
		<th> Address Line 2 </th>
		<th> State </th>
		<th> Country </th>
		<th> Postal Code </th>
		<th> Territory </th>
	</tr>

	<c:forEach items="${offices}" var="office">
		<tr>
			<td>${office.id}</td>
			<td>${office.city}</td>
			<td>${office.phone}</td>
			<td>${office.addressLine1}</td>
			<td>${office.addressLine2}</td>
			<td>${office.state}</td>
			<td>${office.country}</td>
			<td>${office.postalCode}</td>
			<td>${office.territory}</td>
		</tr>
	</c:forEach>

</table>
</body>
</html>