package paquetea;

import java.util.ArrayList;

public class Diccionario {

    public static void main(String[] args) {
        
        Traductor diccionario1 = new Traductor();

        // diccionario1.aniadeElemento(eng, esp);
        /*1*/
        diccionario1.aniadeElemento("Soul", "Alma");
        /*2*/
        diccionario1.aniadeElemento("Dark", "Oscuro");
        /*3*/
        diccionario1.aniadeElemento("Chosen", "Elegido");
        /*4*/
        diccionario1.aniadeElemento("Hollow", "Hueco");
        /*5*/
        diccionario1.aniadeElemento("Blacksmith", "Herrero");
        /*6*/
        diccionario1.aniadeElemento("Knight", "Caballero");
        /*7*/
        diccionario1.aniadeElemento("Dragon", "Dragón");
        /*8*/
        diccionario1.aniadeElemento("Pinwheel", "Molinete");
        /*9*/
        diccionario1.aniadeElemento("Bell", "Campana");
        /*10*/
        diccionario1.aniadeElemento("Wolf", "Lobo");
        
        ArrayList listaIngles = diccionario1.listaIngles();
        for (int i = 0; i < listaIngles.size(); i++) {
            System.out.println(listaIngles.get(i));
            
        }
        ArrayList listaEspaniol = diccionario1.listaEspaniol();
        for (int i = 0; i < listaEspaniol.size(); i++) {
            System.out.println(listaEspaniol.get(i));
            
        }
        
        diccionario1.remplazarElemento("Hollow", "Vacío");
    }

}
