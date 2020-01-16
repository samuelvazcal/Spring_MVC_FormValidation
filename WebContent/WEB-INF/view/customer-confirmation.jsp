<!-- Add the reference for the Spring form tag library -->
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation Page</title>
</head>
<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}
</body>
</html>