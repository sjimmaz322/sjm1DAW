/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author samjimmaz
 */
public class Frigorifico extends Electrodomestico implements Silencioso{
    
    private double capacidadL;

    public Frigorifico(double capacidadL, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidadL = capacidadL;
    }

    public double getCapacidadL() {
        return capacidadL;
    }

    public void setCapacidadL(double capacidadL) {
        this.capacidadL = capacidadL;
    }

    @Override
    public String toString() {
        return super.toString()+"Frigorifico{" + "capacidadL=" + capacidadL + '}';
    }
    
    public void silencio() {
        System.out.println("El Frigorífico modelo "+ super.getModelo()+ " emite sólamente 50dB.");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.capacidadL) ^ (Double.doubleToLongBits(this.capacidadL) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Frigorifico other = (Frigorifico) obj;
        return Double.doubleToLongBits(this.capacidadL) == Double.doubleToLongBits(other.capacidadL);
    }

    



    
}
