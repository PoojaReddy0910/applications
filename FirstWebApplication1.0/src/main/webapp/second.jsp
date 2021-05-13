<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=new java.util.Date()%>
 <%
String username = request.getParameter("username");

String password = request.getParameter("password");
if(username.equals("pooja")  && password.equals("ojas")){

 

%>
<table>
<tr>
<td>
Name: <%= username %>
</td>
</tr>


</table>
<%
}
else{%>
<table>
<h1>Invalid User</h1>
<%} %>
</table>

 
</body>
</html>