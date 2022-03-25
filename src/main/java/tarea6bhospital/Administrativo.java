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
public class Administrativo extends Employee {

    private Grupo grupo;

    public Administrativo(Grupo grupo, String numSS, double salario, String nombre, String apellidos, Nif dni) {
        super(numSS, salario, nombre, apellidos, dni);
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Nif getDni() {
        return dni;
    }

    public void setDni(Nif dni) {
        this.dni = dni;
    }

    public void renovarNif(LocalDate solicitud) {
        this.getDni().setCaducidad(solicitud.plusYears(10));
    }

    public void registrarDocumento(String nombreDoc, String hash){
        System.out.println("\nEl administrativo "+this.getNombre()+" "+this.getApellidos()+" registra el documento de nombre "
                +"'"+ nombreDoc +"'"+" cuyo hashCode es "+"'"+hash.hashCode()+"'");
    }
    
    @Override
    public double calcularIRPF() {
        double irpf = ((this.getGrupo().getIrpf() * super.getSalario()) / 100);
        return irpf;
    }
}
