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
public class BeanHorarios {
    int idcurso,horarioid;
    String datetime, time; 
    String nombreCurso;
    public BeanHorarios() {
    }
    
    public BeanHorarios(int idcurso,int userid, String datetime) {
        this.idcurso = idcurso;
        this.datetime = datetime;
        this.horarioid = userid;
    }

 
    
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public int getHorarioid() {
        return horarioid;
    }

    public void setHorarioid(int horarioid) {
        this.horarioid = horarioid;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    

    @Override
    public String toString() {
        return "BeanHorarios{" + "idcurso=" + idcurso + ", date=" + datetime + ", time=" + time + '}';
    }
    
}
