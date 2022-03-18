package clasesabstractas;

/*
 * @author samjimmaz
 */
public class PruebaCuentas {

    public static void main(String[] args) {

//      Cuenta c1 = new Cuenta(204.65, new Persona("Samuel", "Jiménez", "31014322H"));
//        
//      System.out.println(c1.toString());

//      CuentaCorriente cuco1 = new CuentaCorriente(saldoMin, saldo, persona);

        CuentaCorriente cuco1 = new CuentaCorriente(250, 500, new Persona("Samuel", "Jiménez", "31014322H"));
        
        System.out.println(cuco1.toString());
        
        cuco1.actualizarSaldo();
        System.out.println("Tras actualizar");
        System.out.println(cuco1.toString());
        System.out.println("Retiramos cantidad correcta");
        cuco1.retirar(200);
        System.out.println(cuco1.toString());
        System.out.println("Retiramos cantidad incorrecta");
        cuco1.retirar(400);
        System.out.println(cuco1.toString());
        
//        CuentaAhorro cuah1 = new CuentaAhorro(interes, comisionanual, saldo, persona);

        CuentaAhorro cuah1 = new CuentaAhorro(1.5, 12.5, 500, new Persona("Samuel", "Jiménez", "31014322H"));
        System.out.println(cuah1.toString());
        cuah1.actualizarSaldo();
        System.out.println("Tras actualizar");
        System.out.println(cuah1.toString());
        System.out.println("Retiramos cantidad que deja saldo positivo");
        cuah1.retirar(400);
        System.out.println(cuah1.toString());
        System.out.println("Retiramos cantidad que nos deja saldo negativo");
        cuah1.retirar(200);
        System.out.println(cuah1.toString());
        cuah1.setComisionAnual(1000);
        cuah1.actualizarSaldo();
        System.out.println(cuah1.toString());

    }

}
