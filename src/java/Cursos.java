/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controlador.BeanAsistencia;
import controlador.BeanCurso;
import controlador.BeanHorarios;
import controlador.BeanInscritos;
import controlador.BeanUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

/**
 *
 * @author David
 */
public class Cursos extends HttpServlet {

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
         
        System.out.println(":: "+request.getParameter("tarea"));
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        String rq = request.getParameter("tarea");
        if (rq.equals("listaHorarios")) { 
            try {
                listaHorarios(request, response);
            } catch (ParseException ex) {
                Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            if (rq.equals("pasarLista")) { 
                listaInscritos(request, response);
            } else {
                if (rq.equals("asistenciaDocente")) { 
                    asistenciaDocente(request, response);
                } else {
                    if (rq.equals("faltaDocente")) { 
                        faltaDocente(request, response);
                    } else {
                        if (rq.equals("eliminarHorario")) {
                            eliminarHorario(request, response);
                        } else {
                            if (rq.equals("agregarDocentes")) {
                                agregarDocentes(request, response);
                            } else {
                                if (rq.equals("agregarDocente")) {
                                     agregarDocente(request, response);
                                } else {
                                    if (rq.equals("eliminarCurso")) {
                                        eliminarCurso(request, response);   
                                    }
                                }
                            }
                        }
                    }
                }
            }
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
        String rq = request.getParameter("tarea");

        if (rq.equals("CrearCurso")) { 
            crearCurso(request, response);
        } else {
            if (rq.equals("CrearHorario")) {
                try {
                    agregarHorario(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                if (rq.equals("listaHorarios")) { 
                    try {
                        listaHorarios(request, response);
                    } catch (ParseException ex) {
                        Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    if (rq.equals("eliminarCurso")) {
                        eliminarCurso(request, response);   
                    }
                }
            }
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
    public void agregarHorario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        BeanHorarios bh = new BeanHorarios(); 
        HttpSession session=request.getSession(); 
        int curso_id = Integer.parseInt(request.getParameter("curso_id"));
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String datetime = ""+date+" "+time+""; 
        
        bh.setIdcurso(curso_id);
        bh.setDatetime(datetime); 
        
        
        
        boolean sw=modelo.Cursos.crearHorario(bh); 
        if(sw){
            response.sendRedirect("Cursos?tarea=listaHorarios&cursoid="+curso_id+""); 
        }else{ 
            session.invalidate();
            request.setAttribute("errorMessage", "Algún error ocurrió en el proceso");

            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);     
        }  
        
    }
    public void crearCurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        response.setContentType("text/html;charset=UTF-8");
        Usuario dao=new Usuario();
        BeanUsuario bu = new BeanUsuario();
        bu.setEmail(request.getSession(false).getAttribute("email").toString());
        
        
        java.util.Date dt = new java.util.Date(); 
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        String currentTime = sdf.format(dt);

        try {
            PrintWriter out = response.getWriter();
            if(dao.obtenerUsuario(bu) != null) {
                HttpSession session=request.getSession(); 
                ResultSet rs = dao.obtenerUsuario(bu).executeQuery();
                String executedQuery = rs.getStatement().toString(); 
                while (rs.next()) {
                    int userID = rs.getInt("UserID");
                    String Nombre = request.getParameter("nombre");
                    
                    BeanCurso bcurso=new BeanCurso(userID,currentTime,Nombre); 
                    
                    boolean sw=modelo.Cursos.crearCurso(bcurso); 
                    if(sw){ 
                        response.sendRedirect(request.getContextPath() + "/Control?tarea=cursos"); 
                    }else{ 
                        session.invalidate();
                        request.setAttribute("errorMessage", "Algún error ocurrió en el proceso");

                        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                        rd.forward(request, response);     
                    }   
                }  
            } else {
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
     
    public void listaHorarios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException { 
        RequestDispatcher dispatcher = request.getRequestDispatcher("horarios.jsp");
        List<BeanHorarios> listaHorarios = null;
        String cursoid = request.getParameter("cursoid");
        try {
            listaHorarios = modelo.Cursos.listaHorarios(cursoid); 
        } catch (SQLException ex) {
            Logger.getLogger(docentesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("listaHorarios", listaHorarios);
        dispatcher.forward(request, response);
    }
    public void listaInscritos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        List<BeanAsistencia> listaInscritos = null;
        String inscritosid = request.getParameter("horaid");
        BeanInscritos bi = new BeanInscritos();
        bi.setInscritosid(Integer.parseInt(inscritosid));
        RequestDispatcher dispatcher = request.getRequestDispatcher("inscritos.jsp"); 
        try {
            listaInscritos = modelo.Inscritos.listaInscritos(bi);
            System.out.println(listaInscritos);
        } catch (SQLException ex) {
            Logger.getLogger(docentesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("listaDocentes", listaInscritos);
        dispatcher.forward(request, response);
    }
    public void asistenciaDocente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BeanAsistencia ba = new BeanAsistencia();
        System.out.println(request.getParameter("userid"));
        System.out.println(request.getParameter("horaid"));
        modelo.Asistencia.asistenciaLista(Integer.parseInt(request.getParameter("horaid")),Integer.parseInt(request.getParameter("userid")),true);
        response.sendRedirect(request.getContextPath() + "/Cursos?tarea=pasarLista&horaid="+request.getParameter("horaid")+""); 
    }
    public void faltaDocente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BeanAsistencia ba = new BeanAsistencia();
        System.out.println(request.getParameter("userid"));
        System.out.println(request.getParameter("horaid"));
        modelo.Asistencia.asistenciaLista(Integer.parseInt(request.getParameter("horaid")),Integer.parseInt(request.getParameter("userid")),false);
        response.sendRedirect(request.getContextPath() + "/Cursos?tarea=pasarLista&horaid="+request.getParameter("horaid")+""); 
    }
    public void eliminarHorario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BeanHorarios ba = new BeanHorarios(); 
        modelo.Asistencia.eliminarLista(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect(request.getContextPath() + "/Cursos?tarea=listaHorarios");  
    }
    public void agregarDocentes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BeanUsuario ba = new BeanUsuario(); 
        RequestDispatcher dispatcher = request.getRequestDispatcher("usuarios.jsp"); 
        List<BeanUsuario> listaUsuarios = null;
        try { 
            listaUsuarios = modelo.Usuario.listaUsuarios(); 
        } catch (SQLException ex) {
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("listaUsuarios", listaUsuarios);
        request.setAttribute("CursoID", request.getParameter("id"));
        dispatcher.forward(request, response);
    }
    public void agregarDocente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userid = request.getParameter("userid");
        String cursoid = request.getParameter("cursoid");
        
        BeanCurso cu = new BeanCurso();
         
        try {
            modelo.Cursos.agregarUsuariosLista(userid, cursoid);
            response.sendRedirect("Cursos?tarea=agregarDocentes&id="+cursoid+""); 
        } catch (SQLException ex) {
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarCurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
    
        response.sendRedirect(request.getContextPath() + "/eliminar.jsp");  
    } 
}
