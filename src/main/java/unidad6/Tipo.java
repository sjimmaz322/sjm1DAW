package unidad6;

/*
 * @author samjimmaz
 */
public enum Tipo {
    
    ANALISTA("Analista de Sistemas"),
    SENIOR("Categoría Senior"),
    JUNIOR("Categoría Junior");

    private final String TIPO;

    private Tipo(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getTIPO() {
        return TIPO;
    }

    
}
