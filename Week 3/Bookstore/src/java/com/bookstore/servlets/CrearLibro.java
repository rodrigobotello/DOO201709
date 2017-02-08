/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author arman
 */
public class CrearLibro extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String nombre = request.getParameter("nombre");
            String precio = request.getParameter("precio");
            String isbn = request.getParameter("isbn");
            String fe = request.getParameter("fe");
            String genero = request.getParameter("genero");
            String editorial = request.getParameter("editorial");
            String autor = request.getParameter("autor");
              
            out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");

                out.println("<title>Se ha creado un libro</title>");
                out.println("<link href=\"static/hojaestilo.css\" rel=\"stylesheet\" />");

                out.println("</head>");
                out.println("<body>");

                out.println("<h1>Se ha creado un libro</h1>");
                out.println("<p>Nombre: " + nombre + "<p/>");
                out.println("<p>Precio: " + precio + "<p/>");
                out.println("<p>isbn: " + isbn + "<p/>");
                out.println("<p>Fecha de publicacion: " + fe + "<p/>");
                out.println("<p>Genero: " + genero + "<p/>");
                out.println("<p>Editorial: " + editorial + "<p/>");
                out.println("<p>Autor: " + autor + "<p/>");
                out.println("</body>");
                out.println("</html>");
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
