/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo; 

import controlador.*;
import dao.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cursos {
    public static boolean crearHorario(BeanHorarios horario) {
        boolean agregado = false;
        int key=0;
        try {
            Conexion c=new Conexion();
            Connection con=c.getConexion();
            if(con!=null){
                String datetime;
                Statement st;
                st = con.createStatement();
                st.executeUpdate("INSERT INTO `horarios` (`CursoID`, `FechaHora`) VALUES ("+horario.getIdcurso()+", '"+horario.getDatetime()+"')", Statement.RETURN_GENERATED_KEYS);
                
                ResultSet rs = st.getGeneratedKeys();
                if ( rs.next() ) {
                    // Retrieve the auto generated key(s).
                    key = rs.getInt(1); 
                }
                
                 
                agregado=true;
                st.close();
                //tipoUsuario(usuario); 
                //agregarUsuariosLista(key);
            }
        } catch (SQLException e) {
            agregado=false;
            e.printStackTrace();
        } 
        return agregado;
    } 
    public static boolean crearCurso(BeanCurso curso) {
        boolean agregado = false;
        try {
            Conexion c=new Conexion();
            Connection con=c.getConexion();
            if(con!=null){
                
                Statement st;
                st = con.createStatement();
                st.executeUpdate("INSERT INTO `cursos` (`UserID`, `FechaHora`, `Nombre`) VALUES ("+curso.getUserid()+", '"+curso.getFechahora()+"', '"+curso.getNombre()+"')");
                agregado=true;
                st.close();
                //tipoUsuario(usuario);
            }
        } catch (SQLException e) {
            agregado=false;
            e.printStackTrace();
        } 
        return agregado;
    } 
    public static List<BeanCurso> listaCursos() throws SQLException { 
        List<BeanCurso> listaCursos = new ArrayList<BeanCurso>();
        String sql = "SELECT c.`CursoID`, c.`UserID`, c.`FechaHora`, c.`Nombre`, u.`Nombre` AS NombreDocente FROM cursos c\n" +
"    INNER JOIN usuario u ON u.`UserID` = c.`UserID`\n" +
"        ORDER BY c.`CursoID` desc";
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        Statement statement = con.createStatement();
        ResultSet resulSet = statement.executeQuery(sql);

        while (resulSet.next()) { 
            BeanCurso curso = new BeanCurso(); 
            curso.setCursoid(resulSet.getInt("CursoID")); 
            curso.setUserid(resulSet.getInt("UserID")); 
            curso.setFechahora(resulSet.getString("FechaHora"));
            curso.setNombre(resulSet.getString("Nombre")); 
            curso.setNombreDocente(resulSet.getString(5)); 
            listaCursos.add(curso);
        }
        con.close();
        return listaCursos;
    }
    public static int listaCursosCount() throws SQLException {  
        String sql = "SELECT count(*) FROM Cursos";
        int Cursos=0;
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        Statement statement = con.createStatement();
        ResultSet resulSet = statement.executeQuery(sql);

        while (resulSet.next()) { 
            Cursos = resulSet.getInt(1);
        }
        con.close();
        return Cursos;
    }
    public static PreparedStatement obtenerCurso(BeanCurso curso) throws SQLException{
        String query="SELECT * FROM cursos WHERE CursoID=?"; 
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        PreparedStatement ps=con.prepareStatement(query);
        try{  
            ps.setInt(1,curso.getCursoid());
            ps.setInt(2,curso.getUserid());
            ps.setString(3,curso.getFechahora());
            ps.setString(4,curso.getNombre()); 

            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                return ps;
            } 
        } catch(Exception e){
             
        }  
        return ps;
    }
    public static List<BeanHorarios> listaHorarios(String cursoid) throws SQLException, ParseException { 
       
        List<BeanHorarios> listaHorarios = new ArrayList<BeanHorarios>();
        String sql = "SELECT h.`HorarioID`, c. `Nombre`, h.`FechaHora` FROM horarios h\n" +
"    INNER JOIN cursos c ON c.`CursoID` = h.`CursoID`\n" +
"        AND h.`CursoID` = "+cursoid+" \n" +
"            ORDER BY h.`CursoID` desc";
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        Statement statement = con.createStatement();
        ResultSet resulSet = statement.executeQuery(sql);

        while (resulSet.next()) {
            BeanHorarios horario = new BeanHorarios();  
        
            horario.setHorarioid(resulSet.getInt("HorarioID"));  
            horario.setDatetime(resulSet.getString("FechaHora")); 
            
            listaHorarios.add(horario);
        }
        con.close();
        return listaHorarios;
    }
    public static void agregarUsuariosLista(String userid, String cursoid) throws SQLException { 
        List<BeanHorarios> listaHorarios = new ArrayList<BeanHorarios>();
        int curso_id = Integer.parseInt(cursoid);
        String sql = "SELECT * FROM horarios WHERE CursoID = "+curso_id+""; 
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        Statement statement = con.createStatement();
        ResultSet resulSet = statement.executeQuery(sql); 
        while (resulSet.next()) {
            BeanHorarios horario = new BeanHorarios();   
            horario.setHorarioid(resulSet.getInt("HorarioID"));
            horario.setIdcurso(resulSet.getInt("CursoID")); 
            listaHorarios.add(horario);
        } 
        System.out.println(listaHorarios);
        for (int i = 0; i < listaHorarios.size(); i++) {
            //System.out.println(validarUsuarioInscrito(listaHorarios.get(i).getIdcurso(), userid) );
            
            if (validarUsuarioInscrito(listaHorarios.get(i).getIdcurso(), userid) == false) {
                agregearDocenteCurso(listaHorarios.get(i).getIdcurso(), userid); 
            } 
           
        } 
        agregarDocenteListas(userid,cursoid);
        con.close();
    }
    public static void agregearDocenteCurso(int cursoid, String userid){
        try {
            Conexion c=new Conexion();
            Connection con=c.getConexion();
            if(con!=null){ 
                Statement st;
                st = con.createStatement(); 
                st.executeUpdate("INSERT INTO inscritos (CursoID,UserID) VALUES ("+cursoid+","+userid+")"); 
                st.close();
                //tipoUsuario(usuario);
                 
            }
        } catch (SQLException e) { 
            e.printStackTrace();
        }  
    } 
    public static boolean validarUsuarioInscrito(int cursoid, String userid) throws SQLException{
        String query="SELECT * FROM inscritos WHERE CursoID ="+cursoid+" AND UserID = "+userid+""; 
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        boolean agregado =false;
        
        Statement statement = con.createStatement();
        ResultSet resulSet = statement.executeQuery(query);
    
        agregado = resulSet.next();
        
        
        return agregado;
    }
    public static boolean validarDocenteListaInscrito(int horarioid, String userid) throws SQLException{
        String query="SELECT * FROM asistencia WHERE HorarioID ="+horarioid+" AND UserID = "+userid+""; 
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        boolean agregado =false;
        
        Statement statement = con.createStatement();
        ResultSet resulSet = statement.executeQuery(query);
    
        agregado = resulSet.next();
        
        
        return agregado;
    }
    public static void agregarDocenteLista(int horarioid,String userid, boolean asistencia){
        try {
            Conexion c=new Conexion();
            Connection con=c.getConexion();
            if(con!=null){ 
                Statement st;
                st = con.createStatement(); 
                st.executeUpdate("INSERT INTO asistencia (HorarioID,UserID,asistencia) VALUES ("+horarioid+","+userid+", 0)"); 
                st.close();
                //tipoUsuario(usuario);
                 
            }
        } catch (SQLException e) { 
            e.printStackTrace();
        }  
    }
    public static void agregarDocenteListas(String userid, String cursoid) throws SQLException { 
        List<BeanHorarios> listaHorarios = new ArrayList<BeanHorarios>();
        int curso_id = Integer.parseInt(cursoid);
        String sql = "SELECT * FROM horarios WHERE CursoID = "+curso_id+""; 
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        Statement statement = con.createStatement();
        ResultSet resulSet = statement.executeQuery(sql); 
        while (resulSet.next()) {
            BeanHorarios horario = new BeanHorarios();   
            horario.setHorarioid(resulSet.getInt("HorarioID"));
            horario.setIdcurso(resulSet.getInt("CursoID")); 
            listaHorarios.add(horario);
        } 
        System.out.println(listaHorarios);
        for (int i = 0; i < listaHorarios.size(); i++) {
            //System.out.println(validarUsuarioInscrito(listaHorarios.get(i).getIdcurso(), userid) );
            if (validarDocenteListaInscrito(listaHorarios.get(i).getHorarioid(),userid)==false) {
                agregarDocenteLista(listaHorarios.get(i).getHorarioid(),userid,false);
            }  
        } 
        con.close();
    }
}
