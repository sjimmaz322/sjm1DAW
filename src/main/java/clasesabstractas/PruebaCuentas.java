package clasesabstractas;

import java.util.ArrayList;

/*
 * @author samjimmaz
 */
public class PruebaCuentas {

    public static void main(String[] args) {

        ArrayList<Cuenta> registro = new ArrayList();

        CuentaCorriente cuco1 = new CuentaCorriente(250, 500, new Persona("Alejandro", "Mazas", "31014322H"));

        registro.add(cuco1);

        CuentaAhorro cuah1 = new CuentaAhorro(2.7, 12.5, 250, new Persona("Samuel", "Jiménez", "20903211G"));

        registro.add(cuah1);

        System.out.println(registro.get(0).toString());
        System.out.println("---");
        System.out.println(registro.get(1).toString());
        registro.get(0).actualizarSaldo();
        registro.get(1).actualizarSaldo();
        registro.get(0).retirar(200);
        registro.get(1).retirar(250);

    }

}
