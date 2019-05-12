/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author David
 */
public class Control extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(); 
        // Obten de la solicitud, la tarea seleccionada del menú de canciones
        String tareaSel = request.getParameter("tarea");
        String cursoid = request.getParameter("cursoid");
        // Obten el objeto session que contiene a las variables con ámbito de sesion

        RequestDispatcher rd;
        String siguiente = null;

        // Guarda en la variable de sesion tareaSel, la tarea seleccionada
        session.setAttribute("tareaSel", tareaSel);

        // establece la pagina JSP o servlet que inicia
        // el caso de uso seleccionado
        switch (tareaSel) {
            case "docentes":
                siguiente = "docentes";
                break;
            case "crearcurso":
                siguiente = "crearcurso.jsp";
                break;
            case "cursos":
                siguiente = "VerCursos";
                break;
            case "listaHorarios":
                siguiente = "Cursos?tarea=listaHorarios"; 
                break;
            case "listaProductos":
                siguiente = "ObtenProductos";
                break;
            case "listarReqReactivos":
                siguiente = "ObtenReqReactivos";
                break;
            case "actualizarAnalisis":
                siguiente = "obtenProducto";
                break;
            case "agregarReqReactivo":
                siguiente = "ObtenReqReactivos";
                break;    
            case "consultarReqReactivo":
                siguiente = "capturaCveAnalisis.jsp";
                break;  
            case "inventariarReactivo":
                siguiente = "InventariaReactivo";
                break;  
            case "desinventariarReactivo":
                siguiente = "DesInventariaReactivo";
                break;  
            case "consultarInventariosReactivos":
                siguiente = "obtenProducto";
                break;  
            case "listaAnalisis":
                siguiente = "ObtenAnalisis";
                break; 
            case "despliegaInventarioReactivos":
                siguiente = "ObtenInventarioReactivos";
                break;   
            default:
                break;
        }

        // Obten el objeto RequestDispatcher
        rd = request.getRequestDispatcher(siguiente);

        // Redirecciona a la página JSP siguiente
        rd.forward(request, response); 
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
