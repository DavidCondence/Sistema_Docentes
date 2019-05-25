/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.BeanAsistencia;
import controlador.BeanHorarios;
import controlador.BeanInscritos;
import controlador.BeanUsuario;
import dao.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
public class Inscritos {
    public static PreparedStatement obtenerUsuario(BeanInscritos inscritos) throws SQLException{
        String query="SELECT * FROM inscritos WHERE InscritosID=?"; 
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        PreparedStatement ps=con.prepareStatement(query);
        try{   
            ps.setInt(1,inscritos.getInscritosid()); 

            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                return ps;
            } 
        } catch(Exception e){
             
        }  
        return ps;
    }
    public static List<BeanAsistencia> listaInscritos(BeanInscritos inscritos) throws SQLException { 
        List<BeanAsistencia> listaInscritos = new ArrayList<BeanAsistencia>();
        String sql = "SELECT usuario.`nombre`, asistencia.asistencia AS asistencia,asistencia.`userid`  FROM asistencia\n" +
                    "INNER JOIN usuario ON asistencia.`UserID` = usuario.`UserID`\n" +
                    "WHERE asistencia.`HorarioID` = "+inscritos.getInscritosid()+"";
        
        Conexion c=new Conexion();
        Connection con=c.getConexion();
  
        Statement statement = con.createStatement();
        ResultSet resulSet = statement.executeQuery(sql);
        
        while (resulSet.next()) {
            BeanAsistencia beanasistencia = new BeanAsistencia(); 
            beanasistencia.setNombre(resulSet.getString("nombre"));  
            beanasistencia.setAsistencia(resulSet.getBoolean("asistencia")); 
            beanasistencia.setUserid(resulSet.getInt("userid"));
            listaInscritos.add(beanasistencia);
        }
        con.close();
        return listaInscritos;
    }
}
