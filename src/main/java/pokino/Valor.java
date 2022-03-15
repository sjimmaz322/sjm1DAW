/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pokino;

/**
 *
 * @author samjimmaz
 */
public enum Valor {
    
    AS("As"), DOS("Dos"),TRES("Tres"),CUATRO("Cuatro"),CINCO("Cinco"),SEIS("Seis"),
    SIETE("Siete"),OCHO("Ocho"),NUEVE("Nueve"),SOTA("Sota"),CABALLO("Caballo"),REY("Rey");
    
    
    private final String tipo;

    private Valor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
