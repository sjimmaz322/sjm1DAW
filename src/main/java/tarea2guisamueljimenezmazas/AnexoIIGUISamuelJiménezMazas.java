/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2guisamueljimenezmazas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author samjimmaz
 */
public class AnexoIIGUISamuelJiménezMazas extends JPanel implements ActionListener {

    private JButton botonNombre, botonApellido;
    private JTextArea texto;

    public AnexoIIGUISamuelJiménezMazas() {
        initComponents();
    }

    private void initComponents() {

        botonNombre = new JButton("Nombre");
        botonApellido = new JButton("Apellido");
        texto = new JTextArea(1, 25);
        texto.setBackground(Color.ORANGE);

        this.setLayout(new FlowLayout());

        this.add(botonNombre);
        this.add(texto);
        // Añadimos el botón al panel
        this.add(botonApellido);
        // Controlador del evento
        botonApellido.addActionListener(this);

        botonNombre.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == botonNombre) {

            this.setBackground(Color.WHITE);
            texto.setText("Samuel Alejandro");

        }

        if (ae.getSource() == botonApellido) {

            this.setBackground(Color.BLUE);
            texto.setText("Jiménez Mazas");

        }
    }

}
