package interfaces;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;


public class Panel {

    public static void main(String[] args) {
      JFrame ventanaPrincipal = new JFrame("Samuel Jiménez Mazas");

        // Establecemos tamaño y posición
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        //La ventana no se puede redimensionar
        ventanaPrincipal.setResizable(false);

        //Creamos los 5 paneles y los añadimos a la ventana
        MiPanel verde = new MiPanel(Color.CYAN);
        verde.getEtiqueta().setText("Panel Color Cián");
        ventanaPrincipal.add(verde, BorderLayout.SOUTH);

        MiPanel amarillo = new MiPanel(Color.LIGHT_GRAY);
        amarillo.getEtiqueta().setText("Panel Color Gris claro");
        ventanaPrincipal.add(amarillo, BorderLayout.EAST);

        MiPanel magenta = new MiPanel(Color.RED);
        magenta.getEtiqueta().setText("Panel Color Rojo");
        ventanaPrincipal.add(magenta, BorderLayout.WEST);

        MiPanel naranja = new MiPanel(Color.pink);
        naranja.getEtiqueta().setText("Panel Color Rosa");
        ventanaPrincipal.add(naranja, BorderLayout.NORTH);

        MiPanel azul = new MiPanel(Color.GREEN);
        azul.getEtiqueta().setText("Panel Color Verde");
        ventanaPrincipal.add(azul, BorderLayout.CENTER);

    }

}
