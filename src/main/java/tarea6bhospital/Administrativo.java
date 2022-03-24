/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6bhospital;

/**
 *
 * @author samjimmaz
 */
public class Administrativo extends Employee {
    
    private Grupo grupo;

    public Administrativo(Grupo grupo, String numSS, double salario, String nombre, String apellidos, Nif dni) {
        super(numSS, salario, nombre, apellidos, dni);
        this.grupo = grupo;
    }
    
    

    @Override
    public void renovarNif() {

    }
    @Override
    public double calcularIRPF(){
        double irpf = 0;
        return irpf;
    }
}
