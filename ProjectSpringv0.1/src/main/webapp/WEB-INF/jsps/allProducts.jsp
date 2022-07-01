<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Database Products</title>
</head>
<body>
<h2>Products</h2>
<table>
	<tr>
		<th> Product Code </th>
		<th> Product Name </th>
		<th> Product Line </th>
		<th> Product Scale </th>
		<th> Product Vendor </th>
		<th> Product Description </th>
		<th> Quantity in Stock </th>
		<th> Buy Price </th>
		<th> MSRP </th>
	</tr>

	<c:forEach items="${products}" var="product">
		<tr>
			<td>${product.productCode}</td>
			<td>${product.productName}</td>
			<td>${product.productLine}</td>
			<td>${product.productScale}</td>
			<td>${product.productVendor}</td>
			<td>${product.productDescription}</td>
			<td>${product.quantityInStock}</td>
			<td>${product.buyPrice}</td>
			<td>${product.msrp}</td>
		</tr>
	</c:forEach>

</table>
</body>
</html>