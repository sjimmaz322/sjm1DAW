/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6bhospital;

import java.time.LocalDate;
import java.util.Scanner;

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
        if (this.especialidad.equalsIgnoreCase("Cirugía")) {
            irpf = (25 / 100) * super.getSalario();

        }
        irpf = (23.5 / 100) * super.getSalario();

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

    public void tratarPaciente(Paciente paciente) {
        System.out.println("Introduzca la medicina a recetar");
        Scanner sc = new Scanner(System.in);
        String medicamento = sc.nextLine();
        System.out.println("\n"+this.getNombre() + " " + this.getApellidos() + " como médico le ha recetado a "
                + paciente.getNombre() + " " + paciente.getApellidos() + " como paciente la medicina: " + medicamento);

        paciente.tomarMedicina(medicamento);

    }

    public void renovarNif(LocalDate solicitud) {
        this.getDni().setCaducidad(solicitud.plusYears(10));
    }

}
