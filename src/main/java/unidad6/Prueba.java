package unidad6;

/*
 * @author samjimmaz
 */
public class Prueba {

    public static void main(String[] args) {

        Persona p1 = new Persona("Samuel", "31014322H", 28);

        System.out.println(p1);

        Empleado e1 = new Empleado("Samuel", "31014322H", 28, 1200);

        System.out.println(e1);

        Programador pr1 = new Programador(Tipo.JUNIOR, "Samuel", "31014322H", 28, 1200);

        System.out.println(pr1);

        //p1.subirSueldo(300); //No funciona, el padre intenta entrar a un método del hijo, y no se puede.
        e1.subirSueldo(300);
        pr1.subirSueldo(300);

    }

}
