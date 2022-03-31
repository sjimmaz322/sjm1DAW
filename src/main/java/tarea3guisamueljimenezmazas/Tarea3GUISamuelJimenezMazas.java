/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tarea3guisamueljimenezmazas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author samjimmaz
 */
public class Tarea3GUISamuelJimenezMazas extends JPanel implements ActionListener {

    Random rd = new Random();

    private JButton botonNombre, botonApellido, botonGenerar;
    private JTextArea texto;
    private JLabel etiqueta;

    public Tarea3GUISamuelJimenezMazas() {
        initComponents();
    }

    private void initComponents() {

        botonNombre = new JButton("Nombre");
        botonApellido = new JButton("Apellido");
        botonGenerar = new JButton("Generar Aleatorio");
        etiqueta = new JLabel("Numero");
        texto = new JTextArea(1, 25);
        texto.setBackground(Color.ORANGE);

        this.setLayout(new FlowLayout());

        this.add(botonNombre);
        this.add(texto);
        // Añadimos el botón al panel
        this.add(botonApellido);
        this.add(botonGenerar);
        this.add(etiqueta);
        // Controlador del evento
        botonApellido.addActionListener(this);

        botonNombre.addActionListener(this);

        botonGenerar.addActionListener(this);

    }

    public JButton getBotonNombre() {
        return botonNombre;
    }

    public void setBotonNombre(JButton botonNombre) {
        this.botonNombre = botonNombre;
    }

    public JButton getBotonApellido() {
        return botonApellido;
    }

    public void setBotonApellido(JButton botonApellido) {
        this.botonApellido = botonApellido;
    }

    public JButton getBotonGenerar() {
        return botonGenerar;
    }

    public void setBotonGenerar(JButton botonGenerar) {
        this.botonGenerar = botonGenerar;
    }

    public JTextArea getTexto() {
        return texto;
    }

    public void setTexto(JTextArea texto) {
        this.texto = texto;
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == botonNombre) {

            texto.setBackground(Color.WHITE);
            texto.setText("Samuel Alejandro");

        }

        if (ae.getSource() == botonApellido) {

            texto.setBackground(Color.BLUE);
            texto.setText("Jiménez Mazas");

        }
        if (ae.getSource() == botonGenerar) {
            int num = rd.nextInt(11);
            String numero = String.valueOf(num);
            texto.setText(numero);
            texto.setBackground(Color.ORANGE);
//            etiqueta.
        }
    }
}
