package bdpersonajes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaPersonajes {

    private ArrayList<Personaje> listaPersonajes;

    //Constructor por defecto
    public ListaPersonajes() {
        this.listaPersonajes = new ArrayList<>();
    }

    public void imprimirConsola() {//Método que imprime por consola todos los elementos de la lista

        System.out.println("Imprimiendo lista...");
        listaPersonajes.forEach(System.out::println);
    }

    public void imprimirVentana() {//Método que muestra por ventana cada elemento de la lista uno por uno

        JOptionPane.showMessageDialog(null, "La lista se imprimirá a continuación, una ventana por cada personaje");
        for (int i = 0; i < listaPersonajes.size(); i++) {
            JOptionPane.showMessageDialog(null, listaPersonajes.get(i).toString());

        }
    }

    public void insertarPersonaje(Personaje personaje) {//Método para añadir un personaje

        if (personaje != null) {
            listaPersonajes.add(personaje);
        }
    }

    public boolean eliminarPersonaje(Personaje personaje) {//Método para eliminar un personaje

        return listaPersonajes.remove(personaje);
    }

    public int getNumPersonajes() {//Método para ver cuantos personajes se han creado

        return listaPersonajes.size();

    }

    //Un buscador de transfondos iguales aparte sería inútil, aparte de que ningún director de juego permitiría dos personajes
    //con el mismo transfondo salvo muy contadas excepciones.
    //Así como buscar personajes por puntos de experiencia siendo la coincidencia muy difícil de que ocurra
    
    public Personaje buscarNombre(String nombre) {//Método para buscar el primer personajes con un determinado nombre
        Personaje aux = new Personaje(nombre, "", "", "", 0, 0, 0, 0, 0.0, "");
        int indice = listaPersonajes.indexOf(aux);
        if (indice >= 0) {
            return listaPersonajes.get(indice);
        }
        return null;
    }

    public Personaje buscarRaza(String raza) {//Método para buscar el primer personaje que pertenezca a una raza
        Personaje aux = new Personaje("", raza, "", "", 0, 0, 0, 0, 0.0, "");
        int indice = listaPersonajes.indexOf(aux);
        if (indice >= 0) {
            return listaPersonajes.get(indice);
        }
        return null;
    }

    public Personaje buscarArquetipo(String arquetipo) {//Método para buscar el primer personaje que pertenezca a un determinado arquetipo
        Personaje aux = new Personaje("", "", arquetipo, "", 0, 0, 0, 0, 0.0, "");
        int indice = listaPersonajes.indexOf(aux);
        if (indice >= 0) {
            return listaPersonajes.get(indice);
        }
        return null;
    }

    public Personaje buscarAlineacion(String alineacion) {//Método para buscar el primer personaje que pertenezca a una alineación concreta
        Personaje aux = new Personaje("", "", "", alineacion, 0, 0, 0, 0, 0.0, "");
        int indice = listaPersonajes.indexOf(aux);
        if (indice >= 0) {
            return listaPersonajes.get(indice);
        }
        return null;
    }

    public Personaje buscarAlineacion(int nivel) {//Método para buscar el primer personaje que tenga cierto nivel
        Personaje aux = new Personaje("", "", "", "", nivel, 0, 0, 0, 0.0, "");
        int indice = listaPersonajes.indexOf(aux);
        if (indice >= 0) {
            return listaPersonajes.get(indice);
        }
        return null;
    }

    public Personaje buscarEdad(int edad) {//Método para buscar el primer personaje que tenga la edad buscada
        Personaje aux = new Personaje("", "", "", "", 0, edad, 0, 0, 0.0, "");
        int indice = listaPersonajes.indexOf(aux);
        if (indice >= 0) {
            return listaPersonajes.get(indice);
        }
        return null;
    }

    public Personaje buscarPVida(int puntosDeVida) {//Método para buscar el primer personaje que posea determinados puntos de vida
        Personaje aux = new Personaje("", "", "", "", 0, 0, puntosDeVida, 0, 0.0, "");
        int indice = listaPersonajes.indexOf(aux);
        if (indice >= 0) {
            return listaPersonajes.get(indice);
        }
        return null;
    }

    public Personaje buscarPMana(int puntosDeMana) {//Método para buscar el primer personaje que tenga ciertos puntos de magia/maná
        Personaje aux = new Personaje("", "", "", "", 0, 0, 0, puntosDeMana, 0.0, "");
        int indice = listaPersonajes.indexOf(aux);
        if (indice >= 0) {
            return listaPersonajes.get(indice);
        }
        return null;
    }

    public ArrayList<Personaje> buscarNombres(String nombre) {//Método para buscar todos los personajes que compartan nombre
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getNombre().equalsIgnoreCase(nombre)) {
                aux.add(pj);
            }
        }
        return aux;

    }

    public ArrayList<Personaje> buscarRazas(String raza) {//Método para buscar todos los personajes que compartan raza
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getRaza().equalsIgnoreCase(raza)) {
                aux.add(pj);
            }
        }
        return aux;

    }

    public ArrayList<Personaje> buscarArquetipos(String arquetipo) {//Método para buscar todos los personajes que compartan el arquetipo
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getArquetipo().equalsIgnoreCase(arquetipo)) {
                aux.add(pj);
            }
        }
        return aux;

    }

    public ArrayList<Personaje> buscarNiveles(int nivel) {//Método para buscar todos los personajes que compartan nivel
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getNivel() == (nivel)) {
                aux.add(pj);
            }
        }
        return aux;

    }

    public ArrayList<Personaje> buscarNivelesRango(int minimo, int maximo) {//Método para buscar todos los personajes que estén entre el rango deseado
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getNivel() >= minimo && pj.getNivel() <= maximo) {
                aux.add(pj);
            }
        }
        return aux;

    }

    public ArrayList<Personaje> buscarEdades(int edad) {//Método para buscar todos los personajes que tengan cierta edad
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getEdad() == (edad)) {
                aux.add(pj);
            }
        }
        return aux;

    }

    public ArrayList<Personaje> buscarEdadesRango(int minimo, int maximo) {//Método para buscar todos los personajes que compartan un rango de edad
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getEdad() >= minimo && pj.getEdad() <= maximo) {
                aux.add(pj);
            }
        }
        return aux;

    }

    public ArrayList<Personaje> buscarPuntosVida(double puntosVida) {//Método para buscar todos los personajes que compartan los mismos puntos de vida
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getHealthPoints() == (puntosVida)) {
                aux.add(pj);
            }
        }
        return aux;

    }

    public ArrayList<Personaje> buscarPVRango(int minimo, int maximo) {//Método para buscar todos los personajes que compartan un rango de puntos de vida
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getHealthPoints() >= minimo && pj.getHealthPoints() <= maximo) {
                aux.add(pj);
            }
        }
        return aux;

    }

    public ArrayList<Personaje> buscarPuntosMagia(double puntosMagia) {//Método para buscar todos los personajes que compartan los mismos puntos de magia
        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getManaPoints() == (puntosMagia)) {
                aux.add(pj);
            }
        }
        return aux;

    }

    public ArrayList<Personaje> buscarPMRango(int minimo, int maximo) {//Método para buscar todos los personajes que compartan el mismo rango de puntos de magia/maná

        ArrayList<Personaje> aux = new ArrayList<>();

        for (Personaje pj : this.listaPersonajes) {
            if (pj.getManaPoints() >= minimo && pj.getManaPoints() <= maximo) {
                aux.add(pj);
            }
        }
        return aux;

    }
}
