/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

import javax.swing.JFrame;

/**
 *
 * @author samjimmaz
 */
public class VentanaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Construimos la ventana
	JFrame ventanaPrincipal = new JFrame ("Samuel Alejandro Jiménez Mazas");

	// Establecemos posición y tamaño
	ventanaPrincipal.setBounds(250, 250, 800, 600);

	// Hacemos visible la ventana
	ventanaPrincipal.setVisible(true);

// Acción por defecto al pulsar el botón de cierre 	 ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
