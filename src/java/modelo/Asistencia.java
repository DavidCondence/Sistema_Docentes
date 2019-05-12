/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.BeanCurso;
import dao.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author David
 */
public class Asistencia {
    public static boolean asistenciaLista(int horaid, int userid, boolean estado) {
        boolean agregado = false;
        try {
            Conexion c=new Conexion();
            Connection con=c.getConexion();
            if(con!=null){
                
                Statement st;
                st = con.createStatement();
                st.executeUpdate("UPDATE asistencia SET asistencia="+estado+" WHERE HorarioID="+horaid+" AND UserID="+userid+"");
                //st.executeUpdate("INSERT INTO `cursos` (`UserID`, `FechaHora`, `Nombre`) VALUES ("+curso.getUserid()+", '"+curso.getFechahora()+"', '"+curso.getNombre()+"')");
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
    public static boolean eliminarLista(int horaid){
        System.out.println("si entra");
        boolean eliminado = false;
        try {
            Conexion c=new Conexion();
            Connection con=c.getConexion();
            if(con!=null){
                Statement st;
                st = con.createStatement();
                st.executeUpdate("DELETE FROM horarios WHERE HorarioID="+horaid+"");
      
                eliminado=true;
                st.close();
                //tipoUsuario(usuario);
            }
        } catch (SQLException e) {
            eliminado=false;
            e.printStackTrace();
        } 
        return eliminado; 
    }
}
