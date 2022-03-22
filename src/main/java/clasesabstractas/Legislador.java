package clasesabstractas;

/*
 * @author samjimmaz
 */
 /*
Declara una clase abstracta Legislador que herede de la clase Persona, con un atributo provinciaQueRepresenta y partidoPolitico.
Incluye en la clase Legislador los métodos getters, setters y toString, además de los constructores correspondientes.
Declara un método abstracto getCamaraEnQueTrabaja() que devuelva un String, indicando si es un “Senador” o un “Diputado”. 
Crea dos clases concretas que hereden de Legislador: la clase Diputado y la clase Senador.
La clase Diputado tiene como atributo el número de asiento que ocupa.
La clase Senador tiene como atributo el salario extra a cobrar por sesión.
Implementa constructores, getters, setters y toString, así como los métodos abstractos necesarios en ambas clases.
Crea una lista de legisladores y muestra por pantalla la cámara en que trabajan haciendo uso del polimorfismo,
así como sus datos haciendo uso del método polimórfico toString.
 */
public abstract class Legislador extends Persona {

    protected String provinciaRepresenta, partidoPolitico;

    public Legislador(String provinciaRepresenta, String partidoPolitico, String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
        this.provinciaRepresenta = provinciaRepresenta;
        this.partidoPolitico = partidoPolitico;
    }

    public String getProvinciaRepresenta() {
        return provinciaRepresenta;
    }

    public void setProvinciaRepresenta(String provinciaRepresenta) {
        this.provinciaRepresenta = provinciaRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEs un legislador por la provincia de " + provinciaRepresenta + " representado al partido político: " + partidoPolitico;
    }
    
    public abstract String camaraTrabaja();

}
