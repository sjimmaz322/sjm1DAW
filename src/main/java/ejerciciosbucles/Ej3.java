/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbucles;

/**
 *
 * @author samjimmaz
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x = 15;

        while (x <= 15*Math.pow(2, 24)) {
            System.out.print(x);
            System.out.print(" - ");
            x = (x * 2);
        }
    }
    
}
