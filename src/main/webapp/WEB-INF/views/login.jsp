<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yahoo!</title>
</head>
<body>

<form method = "post">

	<div>
		<p> 
			<font color = "red">
				${errorMessage}
			</font>
		</p>
	</div>

	<div>
		Username <input type = "text" name = "username">
	</div>

	<p> </p>
	
	<div>
		Password <input type = "password" name = "password">
	</div>
	
	<p> </p>
	
	<div>
		<input type = "Submit" value = "Login">
	</div>
	
</form>

</body>
</html>