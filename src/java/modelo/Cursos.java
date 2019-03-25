/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo; 

import controlador.*;
import dao.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Cursos {
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
    // listar todos los productos
    public static List<BeanCurso> listaCursos() throws SQLException { 
        List<BeanCurso> listaCursos = new ArrayList<BeanCurso>();
        String sql = "SELECT * FROM cursos ORDER BY CursoID desc";
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
            listaCursos.add(curso);
        }
        con.close();
        return listaCursos;
    }
}
