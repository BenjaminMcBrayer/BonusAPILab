<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Date Fact</title>
</head>
<body>
<h1>Welcome to the Fact Generator</h1>
<br>
<h2>Enter Day and Month for a Date-related Fact</h2>
<br>
<form action="findfact">
	Day of Month: <input type="text" name="day"><br>
	Month: <input type="text" name="month"><br>
	<input type="submit" value="Submit">
</form>
<br>
<br>
<form action="findfacttype">
	<select name="facttype">
	<option value="trivia">Trivia</option>
	<option value="math">Math</option>	
	<option value="date">Date</option>	
	<option value="year">Year</option>
	</select>
	<input type="submit" value="Submit">
</form>

</body>
</html>