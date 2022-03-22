/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas;

/**
 *
 * @author samjimmaz
 */
public class Diputado extends Legislador {

    private int asientoOcupa;

    public Diputado(int asientoOcupa, String provinciaRepresenta, String partidoPolitico, String nombre, String apellido, String nif) {
        super(provinciaRepresenta, partidoPolitico, nombre, apellido, nif);
        this.asientoOcupa = asientoOcupa;
    }

    public int getAsientoOcupa() {
        return asientoOcupa;
    }

    public void setAsientoOcupa(int asientoOcupa) {
        this.asientoOcupa = asientoOcupa;
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
    public String camaraTrabaja() {
        return "Diputado";
    }

    @Override
    public String toString() {
        return super.toString()+"\nSiendo diputado que ocupa el asiento número "+asientoOcupa+".";
    }

    
}
