/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package otros;

import javax.swing.JOptionPane;

/**
 *
 * @author samjimmaz
 */
public class EjemploTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero1 = 0, numero2 = 0, division = 0;
        boolean seguir;
        
        String numero1Txt = JOptionPane.showInputDialog(null, "Introduce el número 1");

        try {
            numero1 = Integer.parseInt(numero1Txt);

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Como el número introducido no es correcto se tomará el valor 1"+
                     " como valor predeterminado");
            numero1=1;
        }
        JOptionPane.showMessageDialog(null, numero1);
    }

}
