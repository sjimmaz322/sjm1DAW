package tarea6bhospital;

/* 
 * @author samjimmaz
 */
public abstract class Employee extends Person{
    
    protected String numSS;
    protected double salario;

    public Employee(String numSS, double salario, String nombre, String apellidos, Nif dni) {
        super(nombre, apellidos, dni);
        this.numSS = numSS;
        this.salario = salario;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public abstract void renovarNif();
    
    public abstract double calcularIRPF();

    @Override
    public String toString() {
        return super.toString()+"\nNúmero de la Seguridad Social "+numSS+ " con un salario de "+salario+" €.";
    }
    
    
}
