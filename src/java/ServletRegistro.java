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
import modelo.Usuario; 
import controlador.BeanUsuario; 
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import static modelo.Usuario.EmailChecker;
public class ServletRegistro extends HttpServlet {
 private static final long serialVersionUID = 1L; 
    public ServletRegistro() {
    } 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        String nombre=request.getParameter("nombre");
        String apellidos=request.getParameter("apellidos");
        String nivel= request.getParameter("nombre");
        String password=request.getParameter("password");
        String email=request.getParameter("email"); 
        if(!nombre.equalsIgnoreCase("") && !apellidos.equalsIgnoreCase("") && !password.equalsIgnoreCase("") && !email.equalsIgnoreCase("")){
                 
            BeanUsuario busuario=new BeanUsuario(nombre, apellidos, nivel, password,null, email,null,false); 
            if(!Usuario.EmailChecker(busuario)){
                boolean sw=Usuario.userRegister(busuario); 
                if(sw){
                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                }else{ 
                    session.invalidate();
                    request.setAttribute("errorMessage", "Algún error ocurrió en el proceso");

                    RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                    rd.forward(request, response);     
                }
            } else {
                session.invalidate();
                request.setAttribute("errorMessage", "Correo electronico ya existe en el sistema.");

                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);  
            }
        }
    }
}