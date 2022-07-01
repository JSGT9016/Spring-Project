<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Database Payments</title>
</head>
<body>
<h2>Payments</h2>
<table>
	<tr>
		<th> Check Number </th>
		<th> Customer Number </th>
		<th> Payment Date </th>
		<th> Amount </th>
	</tr>

	<c:forEach items="${payments}" var="payment">
		<tr>
			<td>${payment.checkNumber}</td>
			<td>${payment.customerNumber}</td>
			<td>${payment.paymentDate}</td>
			<td>${payment.amount}</td>
		</tr>
	</c:forEach>

</table>
</body>
</html>