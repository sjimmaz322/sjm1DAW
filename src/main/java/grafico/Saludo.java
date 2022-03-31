/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

// Se implementa la interfaz
public class Saludo extends JPanel implements ActionListener {

    private JButton botonSaludar, botonDespedir;
    private JTextArea texto;

    public Saludo() {
        initComponents();
    }

    private void initComponents() {

        botonSaludar = new JButton("Saludar");
        botonDespedir = new JButton("Despedir");
        texto = new JTextArea(1, 25);
        texto.setBackground(Color.ORANGE);

        this.setLayout(new FlowLayout());

        this.add(botonSaludar);
        this.add(texto);
        // Añadimos el botón al panel
        this.add(botonDespedir);
        // Controlador del evento
        botonDespedir.addActionListener(this);

// Se le indica al objeto boton que escuche eventos tipo click
// y se pasa como argumento una referencia de tipo ActionListener
// En este caso se pasa this que es el panel sobre el 
// que está el botón y que implementa la interfaz ActionListener
        botonSaludar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Random rd = new Random();
        // Si el botón pulsado es botonSaludar
        if (ae.getSource() == botonSaludar) {
            int num = rd.nextInt(10) + 1;
            switch (num) {
                case 1:
                    texto.setText("Hola amigo!!");
                    break;
                case 2:
                    texto.setText("Hello my friend!!");
                    break;
                case 3:
                    texto.setText("Salut mon ami!!");
                    break;
                case 4:
                    texto.setText("Bon giorno mio amico!!");
                    break;
                case 5:
                    texto.setText("Gutten tag!!");
                    break;
                case 6:
                    texto.setText("Priviet tovarish!!");
                    break;
                case 7:
                    texto.setText("Ohayo sempai!!");
                    break;
                case 8:
                    texto.setText("Kali mera!!");
                    break;
                case 9:
                    texto.setText("Ni hao!!");
                    break;
                case 10:
                    texto.setText("...!!");
                    break;
            }

        } else {
            int num = rd.nextInt(10) + 1;
            switch (num) {
                case 1:
                    texto.setText("Adios amigos!!");
                    break;
                case 2:
                    texto.setText("Good bye my friend!!");
                    break;
                case 3:
                    texto.setText("Au revoir mon ami!!");
                    break;
                case 4:
                    texto.setText("Ciao mio amico!!");
                    break;
                case 5:
                    texto.setText("Auf Wiedersehen!!");
                    break;
                case 6:
                    texto.setText("Do svidaniya tovarish!!");
                    break;
                case 7:
                    texto.setText("Sayonara!!");
                    break;
                case 8:
                    texto.setText("Antio sas!!");
                    break;
                case 9:
                    texto.setText("Zàijiàn!!");
                    break;
                case 10:
                    texto.setText("...!!");
                    break;
            }
        }

    }
}
