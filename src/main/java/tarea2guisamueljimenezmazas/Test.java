package tarea2guisamueljimenezmazas;

import javax.swing.JFrame;

public class Test {

    public static void main(String[] args) {

        JFrame frame = new JFrame("App");
	// La ventana no se puede redimensionar
	frame.setResizable(false);
	// Posición de la ventana
    	frame.setLocationRelativeTo(null);
	// Incluimos el panel en la ventana
    	frame.add(new AnexoIIGUISamuelJiménezMazas());
        // Ajusta el frame al contenido
        frame.pack();
	// Hacemos visible la ventana
    	frame.setVisible(true);
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

}
