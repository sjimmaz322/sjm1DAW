/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokino;

/**
 *
 * @author samjimmaz
 */
public class Naipe {
    
    Palo paloCarta;
    Valor valorCarta;

    public Naipe() {
        
    }

    public Palo getPaloCarta() {
        return paloCarta;
    }

    public Valor getValorCarta() {
        return valorCarta;
    }

    @Override
    public String toString() {
        
        return "El naipe es un "+valorCarta+" de "+paloCarta;
    }
    
    
}
