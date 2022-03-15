package pokino;

/*
 * @author samjimmaz
 */
public class Carton {
    // 5x5
    /*
    Premios:
        4 esquinas
        Centro
        Poker
        Full
        Estampa 4 de la misma esquina
        Pokino 5 en horizontal, vertical o diagonal.
    
    Necesario:
    Barajas.
    
    */
    
    private final int FILAS = 5;
    private final int COLUMNAS = 5;
    private Naipe[][] carton;

    public Carton() {
        this.carton = new Naipe[FILAS][FILAS];
    }




    
    
}
