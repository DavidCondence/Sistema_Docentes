/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
public class BeanUsuario {
    private String Nombre,Apellidos,Nivel,Password,Direccion,Email,Nacimiento; 
    private boolean admin;
    private int id;
    public BeanUsuario() {
    }

    public BeanUsuario(int id, String Nombre, String Apellidos, String Nivel, String Password, String Direccion, String Email, String Nacimiento, boolean admin) {
        this.id=id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Nivel = Nivel;
        this.Password = Password;
        this.Direccion = Direccion;
        this.Email = Email;
        this.Nacimiento = Nacimiento;
        this.admin = admin;
    }
    public BeanUsuario( String Nombre, String Apellidos, String Nivel, String Password, String Direccion, String Email, String Nacimiento, boolean admin) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Nivel = Nivel;
        this.Password = Password;
        this.Direccion = Direccion;
        this.Email = Email;
        this.Nacimiento = Nacimiento;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    @Override
    public String toString() {
        return "BeanUsuario{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Nivel=" + Nivel + ", Password=" + Password + ", Direccion=" + Direccion + ", Email=" + Email + ", Nacimiento=" + Nacimiento + '}';
    }
     
}