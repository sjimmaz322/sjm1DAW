/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecanica;

/**
 *
 * @author samjimmaz
 */
public class Rueda {
    
    private int diametro;
    private boolean inflado;

    public Rueda(int diametro, boolean inflado) {
        this.diametro = diametro;
        this.inflado = inflado;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public void inflar() {
        this.inflado = true;
    }

    public void desinflar() {
        this.inflado = false;
    }

    public boolean isInflado() {
        return inflado;
    }

    @Override
    public String toString() {
        return "Rueda{" + "diametro=" + diametro + ", inflado=" + inflado + '}';
    }
    
    
    
}
