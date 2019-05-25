<%-- 
    Document   : home
    Created on : 17/03/2019, 11:58:57 PM
    Author     : David
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        response.setHeader("Cache-Control","no-cach,no-store,must-revalidate");
        if(session.getAttribute("username")==null){
            response.sendRedirect("index.jsp"); 
        }
        %>

        <p>Welcome <%=email%></p>    
        <a href="logout.jsp">Logout</a>
    </body>
</html>
