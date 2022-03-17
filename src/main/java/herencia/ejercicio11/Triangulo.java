/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia.ejercicio11;

/**
 *
 * @author samjimmaz
 */
public class Triangulo extends Figuras {
    private double altura, base;

    public Triangulo(double altura, double base) {
        super(altura, base);
    }

    public Triangulo() {
        this.altura=3;
        this.base=3;
    }

    @Override
    public double getAltura() {
        return altura;
    }

    @Override
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getBase() {
        return base;
    }

    @Override
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "El triángulo tiene una altura de "+altura+" y una base de "+base;
    }
    
    
}
