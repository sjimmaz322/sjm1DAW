package herencia.ejercicio5;

import java.util.Objects;

/*
 * @author samjimmaz
 */
public class Cliente {

    /*
    5.- Implementa la clase Cliente que hay en el apartado de “Sobrescritura del método equals” de los apuntes de clase.
    Incluye los constructores, getters, setters y toString. Sobrescribe también los métodos equals y hashCode.
    Realiza una clase que incluya el método main() con el siguiente código:
    Creación de 5 objetos Cliente, uno con el constructor por defecto y cuatro con el parametrizado.
    De los cuatro objetos creados con el parametrizado, 3 tendrán los mismos estados. 
    Imprime los hashCode de cada instancia, y comprueba cuáles son iguales y cuáles distintos.
    Comprobaciones de las propiedades transitiva, reflexiva, simétrica y nula.
     */
    private String nombre;
    private String dni;
    private int edad;

    public Cliente() {
        this.nombre = "NoName";
        this.dni = "12345678Z";
        this.edad = 18;
    }

    public Cliente(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    

    // Se omiten constructores, getters, setters
    @Override
    public int hashCode() {

        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.dni);
        hash = 59 * hash + this.edad;
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

        Cliente other = (Cliente) obj;

// Se comparan los estados de los objetos
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
}
