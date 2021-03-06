/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author samjimmaz
 */
public class Microondas extends Electrodomestico implements Silencioso{

    private int potenciaMax;

    public Microondas(int potenciaMax, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMax = potenciaMax;
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMicroondas{" + "potenciaMax=" + potenciaMax + '}';
    }

    public void silencio() {
        System.out.println("El Microondas modelo " + super.getModelo() + " emite sólamente 40dB.");
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.potenciaMax;
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
        final Microondas other = (Microondas) obj;
        return this.potenciaMax == other.potenciaMax;
    }
    


}
