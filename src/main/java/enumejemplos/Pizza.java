package enumejemplos;

//Clase privadas que contiene objetos constantes

public enum Pizza {
    
    private final int tamanio;
    private final String nombre;
    private final String[] ingredientes;
    private final double precio;

    private Pizza(int tamanio, String nombre, String[] ingredientes, double precio) {
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public double getPrecio() {
        return precio;
    }
    
    
}
