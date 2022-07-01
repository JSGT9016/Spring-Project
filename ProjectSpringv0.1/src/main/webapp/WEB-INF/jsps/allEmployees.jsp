<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Database Employees</title>
</head>
<body>
<h2>Employees</h2>
<table>
	<tr>
		<th> Employee Number </th>
		<th> Last Name </th>
		<th> First Name </th>
		<th> Extension </th>
		<th> E-mail </th>
		<th> Office Code </th>
		<th> Reports To Employee ID </th>
		<th> Job Title </th>
	</tr>

	<c:forEach items="${employees}" var="employee">
		<tr>
			<td>${employee.employeeNumber}</td>
			<td>${employee.lastName}</td>
			<td>${employee.firstName}</td>
			<td>${employee.extension}</td>
			<td>${employee.email}</td>
			<td>${employee.officeCode}</td>
			<td>${employee.reportsTo}</td>
			<td>${employee.jobTitle}</td>
			
		</tr>
	</c:forEach>

</table>
</body>
</html>