/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author samjimmaz
 */
public class PruebaSaludo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame("App");
	// La ventana no se puede redimensionar
	frame.setResizable(false);
	// Posición de la ventana
    	frame.setLocationRelativeTo(null);
	// Incluimos el panel en la ventana
    	frame.add(new Saludo());
       // Ajusta el frame al contenido
       frame.pack();
	// Hacemos visible la ventana
    	frame.setVisible(true);
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


    }


