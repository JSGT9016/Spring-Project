<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Database Customers</title>
</head>
<body>
<h2>Customers:</h2>
<table>
	<tr>
		<th> Customer ID : </th>
		<th> Name : </th>
		<th> Last Name : </th>
		<th> First Name : </th>
		<th> Phone : </th>
		<th> Address 1 : </th>
		<th> Address 2 : </th>
		<th> City : </th>
		<th> State : </th>
		<th> Postal Code : </th>
		<th> Country : </th>
		<th> Credit Limit : </th>
		<th> Employee number </th>
	</tr>

	<c:forEach items="${customerList}" var="customer">
		<tr>
			<td>${customer.customerNumber}</td>
			<td>${customer.customerName}</td>
			<td>${customer.contactLastName}</td>
			<td>${customer.contactFirstName}</td>
			<td>${customer.phone}</td>
			<td>${customer.addressLine1}</td>
			<td>${customer.addressLine2}</td>
			<td>${customer.city}</td>
			<td>${customer.state}</td>
			<td>${customer.postalCode}</td>
			<td>${customer.country}</td>
			<td>${customer.creditLimit}</td>
			<td>${customer.employeeRef.employeeNumber}</td>
			
		</tr>
	</c:forEach>

</table>
</body>
</html>