<%-- 
    Document   : success
    Created on : 19/02/2017, 12:19:29 PM
    Author     : Armando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesión válido</title>
    </head>
    <body>

        <h1>Inicio de sesión válido</h1>

        <h2>Hola <%= request.getAttribute("username") %></h2>
    </body>
</html>