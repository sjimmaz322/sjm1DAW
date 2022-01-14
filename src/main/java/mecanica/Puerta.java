/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecanica;

/**
 *
 * @author samjimmaz
 */
public class Puerta {
    
    private boolean estado; //Abierta true
    private Ventana ventana;

    public Puerta(boolean estado, Ventana ventana) {
        this.estado = estado;
        this.ventana = ventana;
    }

    public boolean isEstado() {
        return estado;
    }

    public void abrir() {
        this.estado = true;
    }
    public void cerrar(){
        this.estado = false;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", ventana=" + ventana + '}';
    }
    
    
    
}
