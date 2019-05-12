/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controlador.BeanCurso;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David
 */
public class Panel extends HttpServlet { 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); 

        
        List<BeanCurso> listaCursos = null;
        int listaCursosCount = 0;
        int listaDocentesCount = 0;
        try {
            listaCursos = modelo.Cursos.listaCursos();
            listaCursosCount = modelo.Cursos.listaCursosCount();
            listaDocentesCount = modelo.docentes.listaDocentesCount();
            System.out.println(listaCursos);
        } catch (SQLException ex) {
            Logger.getLogger(docentesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("listaCursos", listaCursos); 
        request.setAttribute("listaCursosCount", listaCursosCount);
        request.setAttribute("listaDocentesCount", listaDocentesCount);
        System.out.println(listaCursosCount);
         
        try (PrintWriter out = response.getWriter()) { 
            request.getRequestDispatcher("/jspf/new.jsp").include(request, response);
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
