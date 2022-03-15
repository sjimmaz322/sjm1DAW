package pokino;

/*
 * @author samjimmaz
 */
public enum Palo {
    
    ESPADAS("Espadas"),BASTOS("Bastos"),OROS("Oros"),COPAS("Copas");
    
    private final String tipo;

    private Palo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
}
