/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.BeanUsuario;
import dao.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class docentes {
    public List<BeanUsuario> getDocentes() throws SQLException {
        List<BeanUsuario> docentes = new ArrayList<BeanUsuario>();
        CallableStatement cst;
        Statement st;
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        st = con.createStatement();
        cst = con.prepareCall("SELECT * FROM usuario");
        ResultSet rs = cst.executeQuery();
     
        while(rs.next()){
            BeanUsuario beanUSuario = new BeanUsuario();
            beanUSuario.setNombre(rs.getString("nombre"));
            beanUSuario.setEmail(rs.getString("email"));
            docentes.add(beanUSuario);
        } 
        return docentes;
    }
    // listar todos los productos
    public static List<BeanUsuario> listaDocentes() throws SQLException { 
        List<BeanUsuario> listadocentes = new ArrayList<BeanUsuario>();
        String sql = "SELECT * FROM usuario ORDER BY UserID desc";
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        Statement statement = con.createStatement();
        ResultSet resulSet = statement.executeQuery(sql);

        while (resulSet.next()) {
            BeanUsuario docente = new BeanUsuario(); 
            docente.setId(resulSet.getInt("UserID"));  
            docente.setNombre(resulSet.getString("Nombre"));
            docente.setApellidos(resulSet.getString("Apellidos"));
            docente.setEmail(resulSet.getString("Email"));  
            listadocentes.add(docente);
        }
        con.close();
        return listadocentes;
    }
    public static int listaDocentesCount() throws SQLException {  
        String sql = "SELECT count(*) FROM usuario";
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
}
