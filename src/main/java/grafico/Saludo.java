/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

// Se implementa la interfaz
public class Saludo extends JPanel implements ActionListener{
    
	private JButton botonSaludar, botonDespedir;
	private JTextArea texto;
    
	public Saludo(){
    		initComponents();
	}
    
    	private void initComponents(){
   	 
    	botonSaludar = new JButton("Saludar");
        botonDespedir = new JButton("Despedir");
    	texto = new JTextArea(1,25);
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

   	 	// Si el botón pulsado es botonSaludar
    	if(ae.getSource() == botonSaludar){
        	texto.setText("Hola amigos!!");
    	} else { 
        	texto.setText("Adios amigos!!");
    	}
	}	
       	 
}


