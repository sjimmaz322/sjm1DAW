/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad6;

/**
 *
 * @author samjimmaz
 */
public class Empleado extends Persona{
    
    private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, String nif, int edad, int salario) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        
        String atributosSuper = super.toString();
        
        return atributosSuper+"Empleado{" + "salario=" + salario + '}';
    }
    
    public void subirSueldo(int aum){
        this.salario += aum; 
    }
    
    
}
