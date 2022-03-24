/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6bhospital;

/**
 *
 * @author samjimmaz
 */
public class Medico extends Employee {

    private String especialidad;

    public Medico(String especialidad, String numSS, double salario, String nombre, String apellidos, Nif dni) {
        super(numSS, salario, nombre, apellidos, dni);
        this.especialidad = especialidad;
    }

    @Override
    public void renovarNif() {

    }

    @Override
    public double calcularIRPF() {
        double irpf = 0;
        return irpf;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCon una especialidad en " + especialidad;
    }
    
    
    
}
