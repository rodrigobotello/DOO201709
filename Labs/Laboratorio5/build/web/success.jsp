<%-- 
    Document   : success
    Created on : 21/02/2017, 07:39:44 PM
    Author     : arman
--%>
<%
            if(session.getAttribute("username") == null)
                 response.sendRedirect ("login.jsp");
%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.io.*,java.util.*"
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Inicio de sesión válido</h1>

        <h2>Hola <%= session.getAttribute("username") %></h2>
    </body>
</html>