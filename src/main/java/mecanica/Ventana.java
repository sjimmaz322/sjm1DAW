/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecanica;

/**
 *
 * @author samjimmaz
 */
public class Ventana {
    
    private boolean tintado; //True tintado
    private boolean estado; //True abierta

    public Ventana(boolean tintado, boolean abierto) {
        this.tintado = tintado;
        this.estado = abierto;
    }

    public boolean isTintado() {
        return tintado;
    }

    public void setTintado(boolean tintado) {
        this.tintado = tintado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void subir () {
        this.estado = true;
    }
    public void bajar (){
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Ventana{" + "tintado=" + tintado + ", estado=" + estado + '}';
    }
    
}
