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
public class BeanInscritos {
    int inscritosid,cursoid,userid;

    public BeanInscritos() {
    }

    public BeanInscritos(int InscritosID, int CursoID, int UserID) {
        this.inscritosid = InscritosID;
        this.cursoid = CursoID;
        this.userid = UserID;
    }

    public int getInscritosid() {
        return inscritosid;
    }

    public void setInscritosid(int inscritosid) {
        this.inscritosid = inscritosid;
    }

    public int getCursoid() {
        return cursoid;
    }

    public void setCursoid(int cursoid) {
        this.cursoid = cursoid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "BeanInscritos{" + "InscritosID=" + inscritosid + ", CursoID=" + cursoid + ", UserID=" + userid + '}';
    }
    
}
