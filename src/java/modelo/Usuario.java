/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.BeanUsuario;
import dao.Conexion;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
     
    public static boolean userRegister(BeanUsuario usuario) {
        boolean agregado = false;
        try {
            Conexion c=new Conexion();
            Connection con=c.getConexion();
            if(con!=null){
                
                Statement st;
                st = con.createStatement();
                //st.executeUpdate("INSERT INTO `usuario` (`Nombre`, `Apellidos`, `Nivel`, `Password`, `Direccion`, `Email`, `Nacimiento`) VALUES ('"+usuario.getNombre()+"','"+usuario.getApellidos()+"',"+usuario.getNivel()+",'"+usuario.getPassword()+"','"+usuario.getDireccion()+"','"+usuario.getEmail()+"','"+usuario.getNacimiento()+"')");
                st.executeUpdate("INSERT INTO `usuario` (`Nombre`, `Apellidos`, `Nivel`, `Password`, `Direccion`, `Email`, `Nacimiento`, `Admin`) VALUES ('"+usuario.getNombre()+"', '"+usuario.getApellidos()+"', '"+usuario.getNivel()+"','"+usuario.getPassword()+"', '"+usuario.getDireccion()+"','"+usuario.getEmail()+"', NULL, FALSE)");
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
    public static void tipoUsuario(BeanUsuario usuario) throws SQLException { 
        CallableStatement cst;
        Statement st;
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        st = con.createStatement();
        cst = con.prepareCall("SELECT UserID FROM usuario WHERE email = '"+usuario.getEmail()+"'");
        ResultSet rs = cst.executeQuery();
    
        while(rs.next()){
            if(usuario.getEmail() == "coondee@hotmail.com"){ 
                st.executeUpdate("INSERT INTO Administrador (UserID) VALUES ("+rs.getInt("UserID")+")");
                st.close();
            } else { 
                st.executeUpdate("INSERT INTO Docentes (UserID) VALUES ("+rs.getInt("UserID")+")");
                st.close();
            }
        } 
        cst.close();
    } 
    public static boolean EmailChecker(BeanUsuario usuario) {
        String query="SELECT * FROM Usuario WHERE Email=?"; 
        try{
            Conexion c=new Conexion();
            Connection con=c.getConexion();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,usuario.getEmail()); 

            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                return true;
            } 
        } catch(Exception e){
             
        }  
        return false;
    }
    public static boolean userLogin(String email,String pass) throws SQLException{
        String query="SELECT * FROM Usuario WHERE Email=? AND Password=?"; 
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        boolean st =false;
        PreparedStatement ps=con.prepareStatement(query);
        try{  
            ps.setString(1,email);
            ps.setString(2,pass);  

            ResultSet rs=ps.executeQuery();

            st = rs.next();        
        } catch(Exception e){
             
        }  
        return st;
    }
    public static PreparedStatement obtenerUsuario(BeanUsuario usuario) throws SQLException{
        String query="SELECT * FROM Usuario WHERE Email=?"; 
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        PreparedStatement ps=con.prepareStatement(query);
        try{  
            ps.setString(1,usuario.getEmail());
            ps.setString(2,usuario.getPassword());
            ps.setString(3,usuario.getEmail());
            ps.setBoolean(4,usuario.isAdmin()); 

            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                return ps;
            } 
        } catch(Exception e){
             
        }  
        return ps;
    }
    public static List<BeanUsuario> listaUsuarios() throws SQLException { 
        List<BeanUsuario> listaUuarios = new ArrayList<BeanUsuario>();
        String sql = "SELECT * FROM USUARIO\n" +
"    WHERE Admin = 0";
        Conexion c=new Conexion();
        Connection con=c.getConexion();
        Statement statement = con.createStatement();
        ResultSet resulSet = statement.executeQuery(sql);

        while (resulSet.next()) { 
            BeanUsuario usuario = new BeanUsuario(); 
            usuario.setId(resulSet.getInt("UserID"));
            usuario.setNombre(resulSet.getString("Nombre"));
            usuario.setApellidos(resulSet.getString("Apellidos")); 
            listaUuarios.add(usuario);
        }
        con.close();
        return listaUuarios;
    }
}