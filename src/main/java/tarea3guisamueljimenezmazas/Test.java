/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea3guisamueljimenezmazas;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author samjimmaz
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        // La ventana no se puede redimensionar
        frame.setResizable(false);
        
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        // Posición de la ventana
        frame.setLocationRelativeTo(null);
        // Incluimos el panel en la ventana
        frame.add(new Tarea3GUISamuelJimenezMazas());
        // Ajusta el frame al contenido
        frame.pack();
        // Hacemos visible la ventana
        frame.setVisible(true);
        //Acción por defecto al pulsar el botón de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        
        Tarea3GUISamuelJimenezMazas panel = new Tarea3GUISamuelJimenezMazas();
        panel.getEtiqueta().setText("Panel Color Cián");
        frame.add(panel, BorderLayout.CENTER);

    }

}
