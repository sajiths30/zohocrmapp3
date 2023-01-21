<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list contacts</title>
</head>
<body>
<h2>ALL CONTACTS</h2>
<table>
<tr>
<th>Sim</th>
<th>Mobile</th>
<th>Email</th>
<th>Billing</th>
</tr>
<c:forEach var="contact" items="${contacts}">
<tr>
<td>${contact.sim}</td>
<td>${contact.mobile}</td>
<td>${contact.email}</td>
<td><a href="createBill?id=${contact.id}">Billing </a>
</tr>
</c:forEach>
</table>
</body>
</html>