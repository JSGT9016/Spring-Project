<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Database Orders</title>
</head>
<body>
<h2>Orders</h2>
<table>
	<tr>
		<th> Order Number </th>
		<th> Order Date </th>
		<th> Required Date </th>
		<th> Shipped Date </th>
		<th> Status </th>
		<th> Comments </th>
		<th> Customer Number </th>
	</tr>

	<c:forEach items="${orders}" var="order">
		<tr>
			<td>${order.orderNumber}</td>
			<td>${order.orderDate}</td>
			<td>${order.requiredDate}</td>
			<td>${order.shippedDate}</td>
			<td>${order.status}</td>
			<td>${order.comments}</td>
			<td>${order.customerNumber}</td>
		</tr>
	</c:forEach>

</table>
</body>
</html>