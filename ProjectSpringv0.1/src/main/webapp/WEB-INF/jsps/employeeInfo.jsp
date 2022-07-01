<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Info</title>
</head>
<body>
<h2>Employee Info</h2>
<pre>

		Employee ID : ${employee.employeeNumber}
		Last Name : ${employee.lastName}
		First Name : ${employee.firstName}
		Extension : ${employee.extension}
		Email : ${employee.email}
		Office Code : ${employee.officeCode}
		Reports To : ${employee.reportsTo}
		job Title : ${employee.jobTitle}
</pre>

</body>
</html>