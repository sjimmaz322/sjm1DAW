/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumejemplos;

import java.time.LocalDate;
import java.time.YearMonth;

/**
 *
 * @author samjimmaz
 */
public class TestEnum {
    
    public static void main(String[] args) {
        
            Pizza bbq = Pizza.BARBACOA;
            Tarjetas card1 = Tarjetas.TARJETA1;
            Tarjetas card3 = Tarjetas.TARJETA3;
           
            
            
            Pizza.values();//Devuelve array con todos los objetos.
            
            switch(bbq){
                case BARBACOA:
                    break;
                case CARBONARA:
                    break;
            }
            if (card1.getCaducidad().isAfter(YearMonth.now())){
                System.out.println("La cosa va bien");
            }
            if (card3.getCaducidad().isAfter(YearMonth.now())){
                System.out.println("La cosa va bien");
            }else{
                System.out.println("Tarjeta caducada");
            }
            
    }
}
