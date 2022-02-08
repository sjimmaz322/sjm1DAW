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

    public void insertarPersonaje(Personaje personaje) {

        if (personaje != null) {
            listaPersonajes.add(personaje);
        }
    }

    public boolean eliminarPersonaje(Personaje personaje) {

        return listaPersonajes.remove(personaje);
    }

    public int getNumPersonajes() {

        return listaPersonajes.size();
    }

    public Personaje buscarNombre(String nombre) {
        Personaje aux = new Personaje(nombre, "", "", "", 0, 0, 0, 0);
        int indice = listaPersonajes.indexOf(aux);
        if (indice >= 0) {
            return listaPersonajes.get(indice);
        }
        return null;
    }

    public Personaje buscarRaza(String raza) {
        Personaje aux = new Personaje("", raza, "", "", 0, 0, 0, 0);
        int indice = listaPersonajes.indexOf(aux);
        if (indice >= 0) {
            return listaPersonajes.get(indice);
        }
        return null;
    }

    public Personaje buscarArquetipo(String arquetipo) {
        Personaje aux = new Personaje("", "", arquetipo, "", 0, 0, 0, 0);
        int indice = listaPersonajes.indexOf(aux);
        if (indice >= 0) {
            return listaPersonajes.get(indice);
        }
        return null;
    }

    public ArrayList<Personaje> buscarNombres(String nombre) {
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getNombre().equalsIgnoreCase(nombre)) {
                aux.add(pj);
            }
        }
        return aux;

    }
    public ArrayList<Personaje> buscarRazas(String raza) {
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getRaza().equalsIgnoreCase(raza)) {
                aux.add(pj);
            }
        }
        return aux;

    }
    public ArrayList<Personaje> buscarArquetipos(String arquetipo) {
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getRaza().equalsIgnoreCase(arquetipo)) {
                aux.add(pj);
            }
        }
        return aux;

    }

}
