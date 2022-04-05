<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello World!</h2>
	<a href="demoServlet"> Click Me! </a>
	<br>
	<a href="demoGeneric"> Click Me Generic! </a>
	<br>
	<a href="demoHttp"> Click Me HTTP! </a>
	<br>

	<a href="registration.jsp"> Register here! </a>
	<form action="login" method=post>
		User Name:<input type="text" name="userName" /><br /> 
		Password:<input	type="password" name="userPass" /><br /> 
		<input type="submit" value="login" />
	</form>


	<a href="servlet1">click here</a>

	<form action="servlet1">
		Name:<input type="text" name="name" /><br /> 
		Password:<input	type="password" name="password" /><br /> 
		<input type="submit" value="login">

	</form>



</body>
</html>
