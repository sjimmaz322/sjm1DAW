package tarea7a;

import java.time.LocalDate;

public class Profesor {

    private String nombre, DNI, puesto, evaluador, coordinador, telefono;
    private LocalDate fechInicio, fechFin;

    public Profesor(){
        
    }
    
//    public Profesor(String nombre, String DNI, String puesto, LocalDate fechaToma, LocalDate fechaCese, String telefono, String evaluador, String coordinador) {
//        this.nombre = nombre;
//        this.DNI = DNI;
//        this.puesto = puesto;
//        this.fechInicio = fechaToma;
//        this.fechFin = fechaCese;
//        this.telefono = telefono;
//        this.evaluador = evaluador;
//        this.coordinador = coordinador;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(String evaluador) {
        this.evaluador = evaluador;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    public LocalDate getFechInicio() {
        return fechInicio;
    }

    public void setFechInicio(LocalDate fechInicio) {
        this.fechInicio = fechInicio;
    }

    public LocalDate getFechFin() {
        return fechFin;
    }

    public void setFechFin(LocalDate fechFin) {
        this.fechFin = fechFin;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + "," + DNI + "," + puesto + "," + fechInicio + "," + fechFin + "," + telefono + ", evaluador:" + evaluador + ", coordinador:" + coordinador;
    }

}
