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
public class CuentaCorriente extends Cuenta {

    private final double interes = 1.5;
    private double saldoMin;

    public CuentaCorriente(double saldoMin, double saldo, Persona persona) {
        super(saldo, persona);

        this.saldoMin = Math.abs(saldoMin);
    }

    public double getInteres() {
        return interes;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public void actualizarSaldo() {
        if (saldo>1000){
            saldo = saldo +(saldoMin*(interes/100));
        }else{
            saldo = saldo +(saldo*(interes/100));
        }

    }

    @Override
    public void retirar(double cuantia) {
        if((saldo-cuantia)>saldoMin){
           saldo -= cuantia;
        }else{
            System.out.println("Operación no disponible\nMotivo:Saldo insuficiente");
        }

    }

    @Override
    public String toString() {
        return super.toString() + "\nEs del tipo Cuenta Corriente con un interés de " + interes + " y un saldo mínimo de " + saldoMin;

    }

}
