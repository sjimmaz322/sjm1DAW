package tarea6bhospital;

/*
 * @author samjimmaz
 */
public enum Grupo {
    
    C(17.5),
    D(18.0),
    E(18.5);
    
    private double irpf;

    private Grupo(double irpf) {
        this.irpf = irpf;
    }

    public double getIrpf() {
        return irpf;
    }
    
    
    
    
}
