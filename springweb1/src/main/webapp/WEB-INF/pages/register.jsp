<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" 
integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
</head>
<body>
<h2>Welcome To Registration Page </h2>
<form method="post" action="register">

UserName:<input type="text" name="uname" class="form-control">
<br/>
Password:<input type="password" name="pass" class="form-control">
<br/>
Email:<input type="text" name="email" class="form-control">
<br/>
city:<input type="text" name="city" class="form-control">
<br/>
<input type="submit"  class="btn btn-danger" value="Register"/>
</form>
</body>
</html>