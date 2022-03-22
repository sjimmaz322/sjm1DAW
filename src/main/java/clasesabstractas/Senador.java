package clasesabstractas;

/*
 * @author samjimmaz
 */
public class Senador extends Legislador {

    private double extraSesion;

    public Senador(double extraSesion, String provinciaRepresenta, String partidoPolitico, String nombre, String apellido, String nif) {
        super(provinciaRepresenta, partidoPolitico, nombre, apellido, nif);
        this.extraSesion = extraSesion;
    }

    public double getExtraSesion() {
        return extraSesion;
    }

    public void setExtraSesion(double extraSesion) {
        this.extraSesion = extraSesion;
    }

    public String getProvinciaRepresenta() {
        return provinciaRepresenta;
    }

    public void setProvinciaRepresenta(String provinciaRepresenta) {
        this.provinciaRepresenta = provinciaRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSiendo senador y cobrando un extra por sesión de " + extraSesion + " €.";
    }

    @Override
    public String camaraTrabaja() {
        return "Senador";
    }
}
