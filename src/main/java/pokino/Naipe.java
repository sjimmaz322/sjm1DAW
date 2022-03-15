package pokino;

import java.util.Random;

/*
 * @author samjimmaz
 */
public class Naipe {
    Random rd = new Random();
    Palo paloCarta;
    Valor valorCarta;

    public Naipe() {
        this.paloCarta = Palo.randomType();
        this.valorCarta = Valor.randomType();
    }


    public Palo getPaloCarta() {
        return paloCarta;
    }

    public Valor getValorCarta() {
        return valorCarta;
    }

    @Override
    public String toString() {
        
        return "El naipe es: "+valorCarta.getTipo()+" de "+paloCarta.getTipo();
    }
    
    
}
