package tarea6bhospital;

/*
 * @author samjimmaz
 */
public enum Grupo {
    
    D(15.0),
    E(16.0),
    F(17.0);
    
    private double irpf;

    private Grupo(double irpf) {
        this.irpf = irpf;
    }

    public double getIrpf() {
        return irpf;
    }
    
    
    
    
}
