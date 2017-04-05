/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import modelo.*;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utils.Log;

/**
 *
 * @author Armando Rodrigo Botello Alanis, 1722884
 */
@WebServlet(urlPatterns = {"/ComentariosControlador"})
public class ComentariosControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException{
        response.setContentType("text/html;charset=UTF-8");
        Log L;
        L = Log.getInstance("Log.txt");
        L.write("message");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          String accion = request.getParameter("accion");
          String nombre = request.getParameter("nombre");
          String comentario = request.getParameter("comentario");
          
            if (accion.equals("comentario")){
                
            try{
                ComentariosDAO cdao = new ComentariosDAO();
                ComentariosPOJO cpojo = new ComentariosPOJO();
                cpojo.setNombre(nombre);
                cpojo.setComentario(comentario);
                cdao.insertar(cpojo);
                response.sendRedirect("buscar.jsp");
            }catch(IOException ex){
                L.write("Exception");
            }
            if (accion.equals("buscar")){
                
                try{
                ComentariosDAO cdao = new ComentariosDAO();
                ComentariosPOJO cpojo = new ComentariosPOJO();
                cpojo.setNombre(nombre);
                cpojo.setComentario(comentario);

                List bcom = cdao.buscar(cpojo);
                HttpSession session = request.getSession();
                session.setAttribute("Comentarios", bcom);
                
                response.sendRedirect("buscar.jsp");
                }catch(Exception ex){
                    L.write("Exception");
                }
            }
            else{
                response.sendRedirect("error.jsp");
            }   
        }
    }
}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ComentariosControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ComentariosControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
