package pokino;

import java.util.Objects;
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
        
        return valorCarta.getTipo()+" de "+paloCarta.getTipo();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.rd);
        hash = 11 * hash + Objects.hashCode(this.paloCarta);
        hash = 11 * hash + Objects.hashCode(this.valorCarta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Naipe other = (Naipe) obj;
        if (this.paloCarta != other.paloCarta) {
            return false;
        }
        return this.valorCarta == other.valorCarta;
    }
    
    
}
