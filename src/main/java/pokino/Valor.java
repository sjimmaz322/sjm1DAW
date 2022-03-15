/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pokino;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import static pokino.Palo.values;

/**
 *
 * @author samjimmaz
 */
public enum Valor {

    AS("As"), DOS("Dos"), TRES("Tres"), CUATRO("Cuatro"), CINCO("Cinco"), SEIS("Seis"),
    SIETE("Siete"), OCHO("Ocho"), NUEVE("Nueve"), SOTA("Sota"), CABALLO("Caballo"), REY("Rey");

    private final String tipo;

    private static final List<Valor> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RD = new Random();

    private Valor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public static Valor randomType() {
        return VALUES.get(RD.nextInt(SIZE));
    }

}
