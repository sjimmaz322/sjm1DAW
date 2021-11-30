package pootema4;

public class Empleado {

    private String nombre, apellidos, NIF;
    private int sueldoBase, pagoHoraExtra, horasExtrasRealizadas, IRPF, numHijos;
    private boolean estadoCivil;

    public Empleado() {
        this.nombre = "";
        this.apellidos = "";
        this.NIF = "";
        this.sueldoBase = 0;
        this.pagoHoraExtra = 0;
         if (pagoHoraExtra < 10 || pagoHoraExtra > 25) {
            throw new IllegalArgumentException("Pago por horas fuera de rango");
        }
        this.horasExtrasRealizadas = 0;
        this.IRPF = 0;
        this.estadoCivil = false;
        this.numHijos = 0;
    }

    public Empleado(String nombre, String apellidos, String NIF, int sueldoBase, int pagoHoraExtra, int horasExtrasRealizadas,
            int IRPF, boolean estadoCivil, int numHijos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
         if (pagoHoraExtra < 10 || pagoHoraExtra > 25) {
            throw new IllegalArgumentException("Pago por horas fuera de rango");
        }
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
        if (pagoHoraExtra < 10 || pagoHoraExtra > 25) {
            throw new IllegalArgumentException("Pago por horas fuera de rango");
        }
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public int getHorasExtrasRealizadas() {
        return horasExtrasRealizadas;
    }

    public void setHorasExtrasRealizadas(int horasExtrasRealizadas) {
        this.horasExtrasRealizadas = horasExtrasRealizadas;
    }

    public int getIRPF() {
        if (estadoCivil = true) {
            IRPF -= 2;
        }
        IRPF = (IRPF - numHijos);
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

    public int getbonoHoraExtra() {

        return (this.pagoHoraExtra * this.horasExtrasRealizadas);
    }

    public int getsueldoBruto() {
        return (sueldoBase + (pagoHoraExtra * horasExtrasRealizadas));
    }

    public int getempleadoIRPF(int IRFP, boolean estadoCivil, int numHijos) {
        int IRPF = this.IRPF;
        if (estadoCivil = true) {
            IRPF -= 2;
        }
        IRPF = (IRPF - numHijos);
        return IRPF;
    }

    public int getsueldoNeto() {
        return ((sueldoBase + (pagoHoraExtra * horasExtrasRealizadas)) - (sueldoBase + (pagoHoraExtra * horasExtrasRealizadas)) * (IRPF/100));

    }
    public void BasicInfo(){
        //nombre, apellidos, NIF, estado civil y número de hijos.

        System.out.println("El nombre del empleado es: " + this.nombre + "\n"+
                "sus apellidos son: " + this.apellidos + "\n"+
                "su estado civil es: " + this.estadoCivil + "\n"+
                "y tiene "+this.numHijos+"hijos");
    }
    public void AllInfo(){
        System.out.println("El nombre del empleado es: " + this.nombre + "\n"+
                "sus apellidos son: " + this.apellidos + "\n"+
                "su estado civil es: " + this.estadoCivil + "\n"+
                "tiene "+this.numHijos+"hijos"+"\n"+
                "cobra un plus de horas extras de :"+(this.pagoHoraExtra * this.horasExtrasRealizadas)+"\n"+
                "su sueldo bruto es: "+ (sueldoBase + (pagoHoraExtra * horasExtrasRealizadas))+"\n"+
                "tiene una retención del IRPF de :"+(sueldoBase + (pagoHoraExtra * horasExtrasRealizadas)) * (IRPF/100)+"\n"+
                "y su sueldo neto es: "+((sueldoBase + (pagoHoraExtra * horasExtrasRealizadas)) - (sueldoBase + (pagoHoraExtra * horasExtrasRealizadas)) * (IRPF/100)));
        
        
    }
}
