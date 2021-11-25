package pootema4;

public class Empleado {

    private static String nombre, apellidos, NIF;
    private static int sueldoBase, pagoHoraExtra, horasExtrasRealizadas, IRPF, numHijos;
    private static boolean estadoCivil;
    
    public static int CHE(int pagoHoraExtras, int horasExtrasRealizadas){
        int pagoHE = (int)pagoHoraExtra*(int)horasExtrasRealizadas;
        return pagoHE;
    }

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, String NIF, int sueldoBase, int pagoHoraExtra, int horasExtrasRealizadas,
            int IRPF, boolean estadoCivil, int numHijos) {
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

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(int pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public int getHorasExtrasRealizadas() {
        return horasExtrasRealizadas;
    }

    public void setHorasExtrasRealizadas(int horasExtrasRealizadas) {
        this.horasExtrasRealizadas = horasExtrasRealizadas;
    }

    public int getIRPF() {
        return IRPF;
    }

    public void setIRPF(int IRPF) {
        this.IRPF = IRPF;
    }

    public boolean getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    @Override
    public String toString() {
        return "Empleado {" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", sueldoBase="
                + sueldoBase + ", pagoHoraExtra=" + pagoHoraExtra + ", horasExtrasRealizadas=" + horasExtrasRealizadas
                + ", IRPF=" + IRPF + ", estadoCivil=" + estadoCivil + ", numHijos=" + numHijos + '}';
    }
        
}
