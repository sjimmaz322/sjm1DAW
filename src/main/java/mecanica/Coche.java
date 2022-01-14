/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecanica;

/**
 *
 * @author samjimmaz
 */
public class Coche {

    private Motor motor;
    private Puerta puertaPiloto;
    private Puerta puertaCopiloto;
    private Rueda delanteraIzda;
    private Rueda delanteraDrcha;
    private Rueda traseraIzda;
    private Rueda traseraDrcha;

    public Coche(Motor motor, Puerta puertaPiloto, Puerta puertaCopiloto, Rueda delanteraIzda, Rueda delanteraDrcha, Rueda traseraIzda, Rueda traseraDrcha) {
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.delanteraIzda = delanteraIzda;
        this.delanteraDrcha = delanteraDrcha;
        this.traseraIzda = traseraIzda;
        this.traseraDrcha = traseraDrcha;
    }

    public Coche() {

    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    public Rueda getDelanteraIzda() {
        return delanteraIzda;
    }

    public void setDelanteraIzda(Rueda delanteraIzda) {
        this.delanteraIzda = delanteraIzda;
    }

    public Rueda getDelanteraDrcha() {
        return delanteraDrcha;
    }

    public void setDelanteraDrcha(Rueda delanteraDrcha) {
        this.delanteraDrcha = delanteraDrcha;
    }

    public Rueda getTraseraIzda() {
        return traseraIzda;
    }

    public void setTraseraIzda(Rueda traseraIzda) {
        this.traseraIzda = traseraIzda;
    }

    public Rueda getTraseraDrcha() {
        return traseraDrcha;
    }

    public void setTraseraDrcha(Rueda traseraDrcha) {
        this.traseraDrcha = traseraDrcha;
    }

    @Override
    public String toString() {
        return "Coche{" + "motor=" + motor + ", puertaPiloto=" + puertaPiloto + ", puertaCopiloto="
                + puertaCopiloto + ", delanteraIzda=" + delanteraIzda + ", delanteraDrcha=" + delanteraDrcha + ", traseraIzda="
                + traseraIzda + ", traseraDrcha=" + traseraDrcha + '}';
    }

}
