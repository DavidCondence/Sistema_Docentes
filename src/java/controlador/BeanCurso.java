package controlador; 
public class BeanCurso {
    int cursoid,userid;
    String fechahora;
    String nombre;
    String nombreDocente;

    public BeanCurso() {
    }

    public BeanCurso(int UserID, String FechaHora, String nombre) {
        this.userid = UserID;
        this.fechahora = FechaHora;
        this.nombre = nombre;
    }
    
    public BeanCurso(int CursoID, int UserID, String FechaHora, String nombre) {
        this.cursoid = CursoID;
        this.userid = UserID;
        this.fechahora = FechaHora;
        this.nombre = nombre;
    }

    public BeanCurso(int cursoid, int userid, String fechahora, String nombre, String nombreDocente) {
        this.cursoid = cursoid;
        this.userid = userid;
        this.fechahora = fechahora;
        this.nombre = nombre;
        this.nombreDocente = nombreDocente;
    }
    
    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
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

    public String getFechahora() {
        return fechahora;
    }

    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "BeanCurso{" + "CursoID=" + cursoid + ", UserID=" + userid + ", FechaHora=" + fechahora + ", nombre=" + nombre + '}';
    }
    
}
