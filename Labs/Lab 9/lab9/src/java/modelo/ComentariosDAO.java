/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Andrea Lozada Rodríguez 1727791
 */   
public class ComentariosDAO {
    private Connection conexion;


    private void abrirConexion() throws SQLException{
            String dbURI="jdbc:derby://localhost:1527/Comentarios";
            String username = "fcfm";
            String password = "lsti01";
            conexion=DriverManager.getConnection(dbURI, username, password);
            
    }
    private void cerrarConexion() throws SQLException{
            conexion.close();
    }
    
    public void insertar(ComentariosPOJO comentario){
        try{ 
            abrirConexion();
        
        String insert= "insert into COMENTARIOS (NOMBRE, COMENTARIO) values('"+ comentario.getNombre() + "','"+ comentario.getComentario() + "')";
            Statement stmt = conexion.createStatement();
           // int filas=
           stmt.executeUpdate(insert);
            
            cerrarConexion();
          //  return filas > 0;
            
            }catch(SQLException ex){
           
        }
        //return false;
    }
  public ArrayList<ComentariosPOJO>  buscar(ComentariosPOJO comentario) {
        
         try{ 
            abrirConexion();
             ArrayList<ComentariosPOJO> comentarioList = new  ArrayList();
            
             String select = "select NOMBRE, comentario from COMENTARIOS where NOMBRE = '"  + comentario.getNombre() + "' and COMENTARIO like '%" + comentario.getComentario() + "%'";
            Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(select);
              
              while(rs.next()){
                    ComentariosPOJO cpojo = new ComentariosPOJO();
             
                    cpojo.setNombre(rs.getString("NOMBRE"));
                    cpojo.setComentario(rs.getString("COMENTARIO"));
                    comentarioList.add(cpojo);
              }
             cerrarConexion();
              return comentarioList;
        }catch(SQLException ex){
          return null;  
        }
         
   
    
       }
}