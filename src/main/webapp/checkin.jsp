<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>checkin</title>
</head>
<body>

<form action="getLog">
Date:<input type="date" name="date" pattern="yyy-mm-dd"><br><br>
<input type="submit" value="GETLOG">
</form>   <br><br>

<form action="getAllLog" method="get">
<input type="submit" value="GETALLLOG" >
</form><br> <br>

<form action="checkOut">
Name:<input type="text" name="name"><br><br>
<input type="submit" value="CHECKOUT">
</form>

</body>
</html>