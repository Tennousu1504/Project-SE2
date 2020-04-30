<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>EDIT INFO</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="nav-bar.jsp"></jsp:include>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<form action="update" method="post">
					<h3 class="text-center">UPDATE CORONA</h3>
					<input type="hidden" name="iso_code" value="<c:out value='${corona.iso_code}' />" >

					<fieldset class="form-group">
						<label>LOCATION</label> <input type="text"
							value="<c:out value='${corona.location}' />" class="form-control"
							name="location" >
					</fieldset>

					<fieldset class="form-group">
						<label>Date</label> <input type="text"
							value="<c:out value='${corona.date}' />" class="form-control"
							name="date">
					</fieldset>

					<fieldset class="form-group">
						<label>Total Cases</label> <input type="text"
							value="<c:out value='${corona.total_cases}' />" class="form-control"
							name="total_cases">
					</fieldset>
					
					<fieldset class="form-group">
						<label>New Cases </label> <input type="text"
							value="<c:out value='${corona.new_cases}' />" class="form-control"
							name="new_cases" >
					</fieldset>

					<fieldset class="form-group">
						<label>Total Deaths</label> <input type="text"
							value="<c:out value='${corona.total_deaths}' />" class="form-control"
							name="total_deaths">
					</fieldset>

					<fieldset class="form-group">
						<label>New Deaths</label> <input type="text"
							value="<c:out value='${corona.new_deaths}' />" class="form-control"
							name="new_deaths">
							</fieldset>
							
								<fieldset class="form-group">
						<label>Total Cases (per million)</label> <input type="text"
							value="<c:out value='${corona.total_cases_per_million}' />" class="form-control"
							name="total_cases_per_million">
					</fieldset>

					<fieldset class="form-group">
						<label>New cases (per million)</label> <input type="text"
							value="<c:out value='${corona.new_cases_per_million}' />" class="form-control"
							name="new_cases_per_million">
					</fieldset>
					
					<fieldset class="form-group">
						<label>Total Deaths (per million) </label> <input type="text"
							value="<c:out value='${corona.total_deaths_per_million}' />" class="form-control"
							name="total_deaths_per_million" >
					</fieldset>

					<fieldset class="form-group">
						<label>New death (per million)</label> <input type="text"
							value="<c:out value='${corona.new_deaths_per_million}' />" class="form-control"
							name="new_deaths_per_million">
					</fieldset>
 <div class="col text-center">
						<button type="submit" class="btn btn-success">UPDATE</button>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>
