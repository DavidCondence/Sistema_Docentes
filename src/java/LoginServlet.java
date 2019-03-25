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
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        Usuario dao=new Usuario();
        BeanUsuario bu = new BeanUsuario();
        bu.setEmail(email);
        bu.setPassword(password); 
        try {
            if(dao.userLogin(bu) != null) {
                HttpSession session=request.getSession();
                
                ResultSet rs = dao.userLogin(bu).executeQuery();
                String executedQuery = rs.getStatement().toString(); 
                while (rs.next()) {
                    if (rs.getBoolean("Admin") == true) {
                        System.out.println("es admin");
                        session.setAttribute("admin",rs.getBoolean("Admin")); 
                    } else {
                        System.out.println("No es admin");
                    }
                }
                session.setAttribute("email",email); 
                response.sendRedirect("Bienvenido.jsp");
            }else {
                HttpSession session=request.getSession();
                session.invalidate();
                request.setAttribute("errorMessage", "Algún campo incorrecto.");
                
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
