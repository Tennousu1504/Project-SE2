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

	<h1>Login to continue!</h1>
   <form action="access" method="post"> 
    Enter your name: <input type="text" name="yourName" size="20" /> <br/>
    Password: <input type="passWord" name="passWord" size="20" /> <br/>
      <input type="submit" value="Login" />
</form>
</body>
</html>