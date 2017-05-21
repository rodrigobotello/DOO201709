<%-- 
    Document   : login
    Created on : 21/02/2017, 07:39:04 PM
    Author     : Arman
--%>
<%
            if(session.getAttribute("username") != null)
                 response.sendRedirect ("success.jsp");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>BIENVENIDO!</h1>
        <form action="LoginController" method="POST">
        Usuario:
        <input type="text" name="username">
        <br>
        Contraseña:
        <input type="password" name="password">
        <br>
        Email:
        <input type="text" name="email">
        <br>
        Nombre:
        <input type="text" name="nombre">
        <br>
        Apellidos:
        <input type="text" name="apeliidos">
        <br>
        Ocupación:
        <input type="text" name="ocupacion">
        <br>
        <input type="submit" value="Iniciar sesion">
        </form>
    </body>
</html>


