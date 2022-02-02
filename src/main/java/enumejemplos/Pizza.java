package enumejemplos;

//Clase privadas que contiene objetos constantes

public enum Pizza {
    
    //Es importante el orden en el que las pones, value devuelve un array con los nombres en orden
    BARBACOA(22,"Barbacoa Cream", new String[]{"Carne","Bacon","Queso","Salsa BBQ"}, 13.0),
    CARBONARA(22,"Carbonara", new String[]{"Nata","Bacon","Queso","Cebolla","Champiñones"}, 13.0),
    JAMONYQUESO(22,"Carbonara", new String[]{"Jamon York","Queso","Tomate"}, 13.0);
    
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
