package Calcetines;

import Calcetines.Calcetines;
import java.util.ArrayList;
import java.util.Random;

public class CajonCalcetines {

    //Clase random que nos creará un tamaño aleatorio de cajón
    Random rd = new Random();
    //Atributos de la clase que son calcetines
    private Calcetines calcetin;
    //ArrayList que es la lista de los calcetines contenidos en el cajon
    private ArrayList<Calcetines> contenido;
    //Generador del tamaño del cajón
    private int tamanio = rd.nextInt(20 - 1) + 1;

    public CajonCalcetines(ArrayList<Calcetines> contenido) {//Constructor paremetrizado que recibe la ArrayList
        this.contenido = new ArrayList<>();
    }

    public CajonCalcetines() {//Constructor por defecto
        this.contenido = new ArrayList<>();
    }

    public void rellenarCajon() {//Método para rellena el cajón de manera aleatoria
        for (int i = 0; i < tamanio; i++) {
            Calcetines calcetino = new Calcetines();
            contenido.add(calcetino);
        }
    }

    public void imprimirCajon() {//Método para ver el contenido del cajón

        System.out.println("Imprimiendo lista...");
        contenido.forEach(System.out::println);
    }

    public Calcetines getCalcetin() {
        return calcetin;
    }

    public int getTamanio() {
        return tamanio;
    }

    public ArrayList<Calcetines> getContenido() {
        return contenido;
    }

    public String[] compararCalcetines() {//Método para comparar calcetines (no funciona y no tiene pinta de que vaya a hacerlo)
        ArrayList<String> desparejo = new ArrayList<>();
        String[] desparejado = new String[contenido.size()];
        for (int i = 0; i < contenido.size(); i++) {
            contenido.get(i);
            for (int j = 1; j < contenido.size(); j++) {
                if (!(contenido.get(i).equals(contenido.get(j)))) {
                    desparejo.add(contenido.get(i).toString());

                }
            }
        }

        return desparejado;
    }

}
