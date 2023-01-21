<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2>Create | Lead</h2>
<form action="saveLead" method="post">
<pre>
Sim:
<select name="sim" >
  <option value="idea">Idea</option>
  <option value="jio">Jio</option>
  <option value="vodafone">Vodofone</option>
  <option value="airtel">Airtel</option>
</select>
Mobile<input type="text" name="mobile"/>
Email<input type="text" name="email"/>
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>