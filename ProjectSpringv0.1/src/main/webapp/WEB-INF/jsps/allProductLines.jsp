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
<h2>Product Lines</h2>
<table>
	<tr>
		<th>Product Line </th>
		<th>Description </th>
	</tr>

	<c:forEach items="${productLinesList}" var="pl">
		<tr>
			<td>${pl.productLine}</td>
			<td>${pl.textDescription}</td>
		</tr>
	</c:forEach>

</table>
</body>
</html>