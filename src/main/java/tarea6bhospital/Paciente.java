/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6bhospital;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author samjimmaz
 */
public class Paciente extends Person {

    private String numHistorial;

    public Paciente(String numeroHistoria, String nombre, String apellidos, Nif dni) {
        super(nombre, apellidos, dni);
        this.numHistorial = numeroHistoria;
    }

    public String getNumHistorial() {
        return numHistorial;
    }

    public void setNumHistorial(String numHistorial) {
        this.numHistorial = numHistorial;
    }

    public void tomarMedicina(String medicamento) {
        Random random = new Random();
        boolean estado = random.nextBoolean();
        System.out.println(" ");
        System.out.println("Soy "+super.getNombre()+" estoy tomando " + medicamento);
        
        String cura = estado?"Me siento mejor (Vivirá)":"Apuntad mi epitafio (De esta no sale)";
        System.out.println(cura);
    }


    public void renovarNif(LocalDate solicitud) {
        this.getDni().setCaducidad(solicitud.plusYears(10));
    }

    @Override
    public String toString() {
        return super.toString()+"Número de historial: "+numHistorial;
    }
    
}
