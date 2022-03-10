package unidad6;

/*
 * @author samjimmaz
 */
public class Programador extends Empleado {

    private Tipo tipo;

    public Programador(Tipo tipo, String nombre, String nif, int edad, int salario) {
        super(nombre, nif, edad, salario);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String atributosSuper = super.toString();

        return atributosSuper + "Programador{" + "tipo=" + tipo + '}';
    }

}
