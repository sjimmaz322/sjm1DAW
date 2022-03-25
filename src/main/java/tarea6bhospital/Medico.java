/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6bhospital;

import java.time.LocalDate;

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
    public double calcularIRPF() {
        double irpf = 0;
        if(this.especialidad.equalsIgnoreCase("Cirugía")){
            irpf = (25/100)*super.getSalario();
        }else{     
            irpf = (23.5/100)*super.getSalario();
        }
        return irpf;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCon una especialidad en " + especialidad;
    }

    public void tratarPaciente(Paciente paciente, String medicina) {
        System.out.println("El médico " + this.getNombre() + " le ha recetado al paciente "
                + paciente.getNombre() + " la medicina " + medicina);

        paciente.tomarMedicina(medicina);

    }

    @Override
    public void renovarNif() {
        super.getDni().setCaducidad(LocalDate.now().plusYears(10));
    }

}
