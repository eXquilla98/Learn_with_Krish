<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<% 
if(application.getAttribute("db")== null){
	
	DB db=new DB();
	application.setAttribute("db", db);
}


%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<form method="POST" action="SignUp">
<span>Email</span>
<input type="text" name="email" placeholder="Enter your Email here"></br>
<span>User Name</span>
<input type="text" name="username" placeholder="Enter your Username here"></br>
<span>Password</span>
<input type="password" name="password" placeholder="Enter your password here"></br>
<input type="submit" value="submit"></form>

</body>
</html>