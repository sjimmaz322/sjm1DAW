package herencia;

import java.util.Random;

/**
 *
 * @author samjimmaz
 */
public class Vehicles {
  private Long bastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public Vehicles(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

    public Vehicles() {
    }
    

    public Long getBastidor() {
        return bastidor;
    }

    public void setBastidor(Long bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    public String getAtributos() {

        String atributosSuperClase;

        // Llamada al método getAtributos() de la clase Vehiculo
        atributosSuperClase =  bastidor + ";" + matricula + ";" + marca + ";" + modelo + ";" + color + ";" + tarifa + ";" + disponible;

        // Ahora concateno los atributos de la superclase con los de la subclase
        return atributosSuperClase;
    }

    @Override
    public String toString() {
        return  bastidor + ":" + matricula + ":" + marca + ":" + modelo + ":" + color + ":" + tarifa + ":" + disponible;
    }
    

}
