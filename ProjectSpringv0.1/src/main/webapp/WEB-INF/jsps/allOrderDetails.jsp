<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Database Order Details</title>
</head>
<body>
<h2>Order Details</h2>
<table>
	<tr>
		<th> Order Number </th>
		<th> Product Code </th>
		<th> Quantity Ordered </th>
		<th> Price Each </th>
		<th> Order Line Number </th>
	</tr>

	<c:forEach items="${orderDetails}" var="orderDet">
		<tr>
			<td>${orderDet.orderNumber}</td>
			<td>${orderDet.productCode}</td>
			<td>${orderDet.quantityOrdered}</td>
			<td>${orderDet.priceEach}</td>
			<td>${orderDet.orderLineNumber}</td>
		</tr>
	</c:forEach>

</table>
</body>
</html>