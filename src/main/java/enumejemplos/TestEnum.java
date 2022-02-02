/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumejemplos;

/**
 *
 * @author samjimmaz
 */
public class TestEnum {
    
    public static void main(String[] args) {
        
            Pizza bbq = Pizza.BARBACOA;
           
            Pizza.values();//Devuelve array con todos los objetos.
            
            switch(bbq){
                case BARBACOA:
                    break;
                case CARBONARA:
                    break;
            }
    }
}
