<%@page import="org.apache.tomcat.util.threads.StopPooledThreadException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
String name;
if(session.getAttribute("user")==null){
	response.sendRedirect("Login.jsp");
}else{
	
	User user=(User)session.getAttribute("user");
	name=user.getUsername();
}
if(request.getAttribute("un")!= null){
	
	 name= request.getAttribute("uname").toString(); 
}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<h1> Hello     </h1>
</body>T
</html>