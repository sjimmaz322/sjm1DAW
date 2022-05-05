package tarea7c;

public class Registro {

    private String curso, iniciales, asignatura, aula;
    private int dia, hora;

    public Registro(String curso, String iniciales, String asignatura, String aula, int dia, int hora) {
        this.curso = curso;
        this.iniciales = iniciales;
        this.asignatura = asignatura;
        this.aula = aula;
        this.dia = dia;
        this.hora = hora;
    }

    public Registro() {
        this.curso = "";
        this.iniciales = "";
        this.asignatura = "";
        this.aula = "";
        this.dia = 0;
        this.hora = 0;
    }
    

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "curso=" + curso + ", iniciales=" + iniciales + ", asignatura=" + asignatura + ", aula=" + aula + ", dia=" + dia + ", hora=" + hora;
    }
    
}
