/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

/**
 *
 * @author Armando Rodrigo Botello Alanis 1722884
 */
public class Registro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String nombre = request.getParameter("nombre");
           String usuario = request.getParameter("usuario");
           String email = request.getParameter("email");
           String contraseña = request.getParameter("nombre");
           String mes = request.getParameter("MesN");
           String sexo = request.getParameter("Sexo");
           String adm = request.getParameter("adm");
            
            String limpio_nombre = limpiar(nombre);
            String limpio_usuario = limpiar(usuario);
            String limpio_email = limpiar(email);
            String limpio_mes = limpiar(mes);
            String limpio_sexo = limpiar(sexo);
            String limpio_adm= limpiar(adm);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos que usted introdujo</h1>" + "<ul><li>" + limpio_nombre + "</li>" + "<li>" + limpio_usuario + "</li>" + "<li>" + limpio_email + "</li>" + "<li>" + limpio_mes + "</li>" + "<li>" + limpio_sexo + "</li>" + "<li>" + limpio_adm + "</li>" + "</ul>");
            out.println("</body>");
            out.println("</html>");
            out.println("<a href=\"index.html\">" + "Registro");
        }
    }
        private String limpiar(String Cadena_vieja){
        try{
            String Cadena_nueva=URLEncoder.encode(Cadena_vieja, "UTF-8");
            return Cadena_nueva;
        }catch(Exception ex){
            return "";
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
        processRequest(request, response);
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
        processRequest(request, response);
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
