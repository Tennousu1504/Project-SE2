<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>FIT CORONA</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head></head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<ul class="nav navbar-nav">
				<li><a href="<%=request.getContextPath()%>/new">Add Info</a></li>
				<li><a href="<%=request.getContextPath()%>/login">Login</a></li>
				<li><a href="<%=request.getContextPath()%>/chart">Chart</a></li>
				<li><a href="<%=request.getContextPath()%>/edit">Edit</a></li>
			</ul>
		</div>
	</nav>
</body>
</html>