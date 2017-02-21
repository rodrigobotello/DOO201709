<%-- 
    Document   : login
    Created on : 19/02/2017, 12:19:19 PM
    Author     : Armando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>BIENVENIDO!</h1>
        <form action="LoginController">
        Usuario:
        <input type="text" name="username">
        <br>
        Contraseña:
        <input type="password" name="password">
        <br>
        <input type="submit" value="Iniciar sesion">
        </form>
    </body>
</html>
