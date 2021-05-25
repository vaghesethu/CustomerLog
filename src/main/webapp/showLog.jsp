<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>showLog</title>
</head>
<body>
yeah!

<ul>
<c:forEach  var="li" items="${user}">
       <li>${user.name}<li>
</c:forEach>
</ul>

</body>
</html>