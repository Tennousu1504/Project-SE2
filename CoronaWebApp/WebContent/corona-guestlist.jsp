<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<link href="<c:url value="/WebContent/main.css" />" rel="stylesheet">
	<link href="${mainCss}" rel="stylesheet" />
<head>
<title>FIT CORONA</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

 <ul class="nav navbar-nav">
				<li><a href="<%=request.getContextPath()%>/login">Login</a></li>
				<li><a href="<%=request.getContextPath()%>/chart">Chart</a></li>
			</ul>
	<br>
      <div class="row">
		<div class="container">
			<h3 class="text-center">CORONA LIST</h3>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Iso code</th>
						<th>Location </th>
						<th>Date </th>
						<th>Total Cases </th>
						<th>New Cases</th>
						<th>Total Deaths </th>
						<th>New Deaths</th>
						<th>Total Cases (per million) </th>
						<th>New Cases (per million) </th>
						<th>Total Deaths (per million) </th>
						<th>New Deaths (per million) </th>
						<%-- <th>Total Tests </th>
						<th>New Tests</th>
						<th>Total Tests (per thousand)</th>
						<th>New Tests (per thousand) </th>
						<th>Tests Units </th> --%>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="corona" items="${listCorona}">

						<tr>
							<td><c:out value="${corona.iso_code}" /></td>
							<td><c:out value="${corona.location}" /></td>
							<td><c:out value="${corona.date}" /></td>
							<td><c:out value="${corona.total_cases}" /></td>
							<td><c:out value="${corona.new_cases}" /></td>
							<td><c:out value="${corona.total_deaths}" /></td>
							<td><c:out value="${corona.new_deaths}" /></td>
							<td><c:out value="${corona.total_cases_per_million}" /></td>
							<td><c:out value="${corona.new_cases_per_million}" /></td>
							<td><c:out value="${corona.total_deaths_per_million}" /></td>
							<td><c:out value="${corona.new_deaths_per_million}" /></td>
							<%-- <td><c:out value="${corona.total_tests}" /></td>
							<td><c:out value="${corona.new_tests}" /></td>
							<td><c:out value="${corona.total_tests_per_thousand}" /></td>
							<td><c:out value="${corona.new_tests_per_thousand}" /></td>
							<td><c:out value="${corona.tests_units}" /></td> --%>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
