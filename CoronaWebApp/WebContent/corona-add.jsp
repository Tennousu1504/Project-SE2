<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>FIT CORONA</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

    <jsp:include page="nav-bar.jsp"></jsp:include>
	<br>

	<form action="insert" method="post">
	Iso Code <input type="text" name="iso_code"><br><br>
	Location <input type="text" name="location"><br><br>
	Date <input type="text" name="date"><br><br>
	Total_Cases <input type="text" name="total_cases"><br><br>
	New Cases <input type="text" name="new_cases"><br><br>
    Total Deaths <input type="text" name="total_deaths"><br><br>
	New Deaths <input type="text" name="new_deaths"><br><br>
	Total Cases (per million)<input type="text" name="total_cases_per_million"><br><br>
	New Cases (per million) <input type="text" name="new_cases_per_million"><br><br>
	Total Deaths (per million) <input type="text" name="total_deaths_per_million"><br><br>
	New Deaths (per million) <input type="text" name="new_deaths_per_million"><br><br>
	<input type="submit" value="Add">
	</form>
	
</body>
</html>
