/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas;

import java.util.Random;

/**
 *
 * @author samjimmaz
 */
public class CuentaAhorro extends Cuenta {

    private double interes;
    private double comisionAnual;

    public CuentaAhorro(double interes, double comisionAnual, double saldo, Persona persona) {
        super(saldo, persona);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public void actualizarSaldo(double cuantia) {

    }

    @Override
    public void retirar(double cuantia) {

    }

    @Override
    public String toString() {

        return super.toString() + "\nEs del tipo Cuenta de Ahorros con un interés de " + interes + " y una comisión anual de " + comisionAnual;

    }

}
