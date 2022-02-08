package ejerciciosclase;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaPersonajes {
    
    private ArrayList<Personaje> listaPersonajes;

    public ListaPersonajes() {
        this.listaPersonajes = new ArrayList<>();
    }
    
    public void insertarLibro(Personaje personaje) {
        
        if (personaje != null) {
            listaPersonajes.add(personaje);
        }
    }
    public void imprimirConsola() {
        
        System.out.println("Imprimiendo lista...");
        listaPersonajes.forEach(System.out::println);
    }
   
    
    
}
