/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia.ejercicio11;

/**
 *
 * @author samjimmaz
 */
public class Romboide extends Figuras {

    protected double altura, base;

    public Romboide(double altura, double base) {
        super(altura, base);
    }

    public Romboide() {
        this.altura = 3;
        this.base = 3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "El rombóide tiene una altura de " + altura + " y una base de " + base;
    }

    @Override
    public String calcularArea() {
        String area = "El área del romboide es: " + altura * base + " unidades cuadradas";
        return area;
    }
}
