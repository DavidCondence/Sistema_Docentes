/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controlador.BeanUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;
 
public class LoginServlet extends HttpServlet {  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.sendRedirect("index.jsp");
    } 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        Usuario dao=new Usuario();
    
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        
        try {
            HttpSession session=request.getSession();
            if(dao.userLogin(email, pass)) {
                session.setAttribute("email",email);
                session.setAttribute("admin",true);
                response.sendRedirect("Panel");
            }  else {
                request.setAttribute("errorMessage", "Algún campo incorrecto.");
                RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
                rs.include(request, response);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
    } 
}
