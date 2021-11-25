package pootema4;

public class Empleado {
    private String nombre, apellidos, NIF, sueldoBase, pagoHoraExtra, horasExtrasRealizadas, IRPF, estadoCivil, numHijos;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, String NIF, String sueldoBase, String pagoHoraExtra, String horasExtrasRealizadas, String IRPF, String estadoCivil, String numHijos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtrasRealizadas = horasExtrasRealizadas;
        this.IRPF = IRPF;
        this.estadoCivil = estadoCivil;
        this.numHijos = numHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(String sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(String pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public String getHorasExtrasRealizadas() {
        return horasExtrasRealizadas;
    }

    public void setHorasExtrasRealizadas(String horasExtrasRealizadas) {
        this.horasExtrasRealizadas = horasExtrasRealizadas;
    }

    public String getIRPF() {
        return IRPF;
    }

    public void setIRPF(String IRPF) {
        this.IRPF = IRPF;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(String numHijos) {
        this.numHijos = numHijos;
    }

    @Override
    public String toString() {
        return "Empleado {" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", sueldoBase=" +
                sueldoBase + ", pagoHoraExtra=" + pagoHoraExtra + ", horasExtrasRealizadas=" + horasExtrasRealizadas +
                ", IRPF=" + IRPF + ", estadoCivil=" + estadoCivil + ", numHijos=" + numHijos + '}';
    }
    
}