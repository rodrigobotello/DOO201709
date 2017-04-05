<%-- 
    Document   : buscar
    Created on : 19/03/2017, 04:17:40 PM
    Author     : Armando
--%>

<%@page import="modelo.ComentariosPOJO"%>
<%@page import="java.util.*"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar</title>
    </head>
    <body>
        <form action="ComentariosControlador" method="post">
        <h1>Buscar</h1>
        
            <label>Nombre:</label>
            <input type="text" name ="nombre" value=""/>
            <br>
            <label>Comentarios</label>
            <textarea rows="5"  name="comentario"> </textarea>
            <br>
            <input type="submit" name = "enviar" value="Enviar"/>
            <input type="hidden" name="action" value="buscar">
            </form>
           <% if(session != null){
              ArrayList  comentarios = (ArrayList)session.getAttribute("comentarios");
               if(comentarios != null){  
            
             %>
            <table border="1">
             <tr>
                <th>Nombre</th>
                <th>Comentario</th>
            </tr>
            <% for (Object o: comentarios){
                ComentariosPOJO comentario = (ComentariosPOJO) o;
            %>
            <tr>
                <td><%=comentario.getNombre()%></td>
                <td><%=comentario.getComentario()%></td>
                
            </tr>
          <% } %>
        </table>
        <%  }
        }
        %>
        
    </body>
</html>
