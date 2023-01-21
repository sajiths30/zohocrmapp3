<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Leads</title>
</head>
<body>
<h2>ALL LEADS</h2>
<table>
<tr>
<th>Sim</th>
<th>Mobile</th>
<th>Email</th>
</tr>
<c:forEach var="lead" items="${leads}">
<tr>
<td><a href="leadinfo?id=${lead.id}">${lead.sim}</a></td>
<td>${lead.mobile}</td>
<td>${lead.email}</td>
</tr>
</c:forEach>
</table>
</body>
</html>