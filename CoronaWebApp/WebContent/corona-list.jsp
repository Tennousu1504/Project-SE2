<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<br>

	<div class="row">
		<div class="container">
			<h3 class="text-center">CORONA LIST</h3>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Mã Cuốc Gia</th>
						<th>Tên Nước </th>
						<th>Ngày Cuối Phát Hiện Bệnh</th>
						<th>Tổng Số Ca </th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="corona" items="${listCorona}">

						<tr>
							<td><c:out value="${corona.iso_code}" /></td>
							<td><c:out value="${corona.location}" /></td>
							<td><c:out value="${corona.date}" /></td>
							<td><c:out value="${corona.total_cases}" /></td>
						
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
