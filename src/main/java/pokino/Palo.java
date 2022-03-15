package pokino;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * @author samjimmaz
 */
public enum Palo {

    ESPADAS("Espadas"), BASTOS("Bastos"), OROS("Oros"), COPAS("Copas");

    private final String tipo;
    private static final List<Palo> VALUES
            = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RD = new Random();

    private Palo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public static Palo randomType() {
        return VALUES.get(RD.nextInt(SIZE));
    }

}
