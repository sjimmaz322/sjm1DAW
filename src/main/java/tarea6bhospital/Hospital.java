/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6bhospital;

import java.util.ArrayList;

/**
 *
 * @author samjimmaz
 */
public class Hospital {

    private String nombre;
    private String direccion;

    private ArrayList<Employee> listaEmpleados;
    private ArrayList<Paciente> listaPacientes;

    public void contratarEmpleado(Employee empleado) {
        listaEmpleados.add(empleado);
    }

    public void ingresarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public Hospital(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaEmpleados = new ArrayList<>();
        this.listaPacientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Employee> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Employee> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    @Override
    public String toString() {
        return "Este hospital es el Hospital " + nombre + " ubicado en " + direccion + "\nCon una lista de empleados:\n" + listaEmpleados + "\nY una lista de pacientes:\n" + listaPacientes;

    }

}
