/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author David
 */
public class BeanAsistencia {
    String nombre;
    int userid;
    Boolean asistencia;

    public BeanAsistencia() {
    } 

    public BeanAsistencia(String nombre, int userid, Boolean asistencia) {
        this.nombre = nombre;
        this.userid = userid;
        this.asistencia = asistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Boolean getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Boolean asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "BeanAsistencia{" + "nombre=" + nombre + ", userid=" + userid + ", asistencia=" + asistencia + '}';
    }
      
}
