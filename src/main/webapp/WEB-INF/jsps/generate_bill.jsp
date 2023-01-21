<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
<h2>Billing</h2>
<form action="saveBill" method="post">
<pre>
Sim <input type="text" name="sim" value="${contact.sim}"/>
Mobile<input type="text" name="mobile" value="${contact.mobile}"/>
Email<input type="text" name="email" value="${contact.email}"/>
Product Name<input type="text" name="productname"/>
Quantity<input type="text" name="quantity"/>
Amount<input type="text" name="Amount"/>
<input type="submit" value="generate"/>
</pre>
</form>
</body>
</html>