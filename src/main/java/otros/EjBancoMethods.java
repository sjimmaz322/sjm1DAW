package otros;

import javax.swing.JOptionPane;

public class EjBancoMethods {

    private static boolean filtrarEdad(boolean a) {
        final int MIN_AGE = 18, MAX_AGE = 65;
        int age = 0;
        do {
            String edadTexto = JOptionPane.showInputDialog("Introduzca su edad" + "\n"
                    + "Si los datos son incorrectos se pedirán de nuevo");
            age = Integer.parseInt(edadTexto);
            if (age < MIN_AGE || age > MAX_AGE) {
                JOptionPane.showMessageDialog(null, "Los datos son incorrectos" + "\n"
                        + "Rango de edad permitido: 18 - 65 años");
            }
        } while (age < MIN_AGE || age > MAX_AGE);

        return (true);
    }

    private static boolean filtrarPrestamo(boolean a) {
        int salary = 0, moneyAsked = 0;
        final int MONTHS_IN_YEAR = 12;
        final double MULTIPLY_FACTOR = 5.85;
        double creditLimit = 0;

        String salarioTexto = JOptionPane.showInputDialog("Introduzca su salario bruto mensual");
        salary = Integer.parseInt(salarioTexto);

        creditLimit = (salary * MONTHS_IN_YEAR * MULTIPLY_FACTOR);

        do {
            String cantidadPrestamoTexto = JOptionPane.showInputDialog("Introduzca el dinero que desea solicitar" + "\n"
                    + "Si los datos son incorrectos se pedirán de nuevo");
            moneyAsked = Integer.parseInt(cantidadPrestamoTexto);
            if (moneyAsked > creditLimit) {
                JOptionPane.showMessageDialog(null, "Los datos son incorrectos" + "\n"
                        + "El máximo solicitable será el salario anual multiplicado por el factor multiplicativo (5.85)");
            }
        } while (moneyAsked > creditLimit);
        return (true);
    }

    private static boolean filtrarDevolucion(boolean a) {
        int deadlines = 0, age= 0;
        final int MIN_DEADLINES = 5, MAX_DEADLINES = 30, LIMIT_DEADLINES = 75;

        do {
            String edadTexto = JOptionPane.showInputDialog("Introduzca su edad de nuevo");
            age = Integer.parseInt(edadTexto);
            String plazosTexto = JOptionPane.showInputDialog("Introduzca los años en los que desea devolver el préstamo" + "\n"
                    + "Si los datos son incorrectos se pedirán de nuevo");
            deadlines = Integer.parseInt(plazosTexto);
            if ((deadlines > MAX_DEADLINES) || (deadlines < MIN_DEADLINES) || (age + deadlines > LIMIT_DEADLINES)) {
                JOptionPane.showMessageDialog(null, "Los datos son incorrectos" + "\n"
                        + "Años de devolución minimos: 5" + "\n"
                        + "Años de devolución máximos: 30" + "\n"
                        + "Atención: Los años en los que devuelva el préstamo sumados a su edad no podrá ser superior al límite permitido."
                        + "\n" + "Límite permitido: 75 años.");
            }
        } while ((deadlines > MAX_DEADLINES) || (deadlines < MIN_DEADLINES) || (age + deadlines > LIMIT_DEADLINES));
        return (true);
    }

    public static void main(String[] args) {
        /*
        1-
        Metodo que diga si la edad es válida o no.
        Método reciba edad y devuelva resultado (Boolean).(Return)
        2-
        Método que diga si el dinero pedido es válido o no.
        Método reciba dinero a pedir y devuelve resultado (Boolean). (Return)
        3-
        Método que diga si los años de devolución son correctos o no.
        Método recibe años a devolver y devuelve resultado (Boolean). (Return)
         */


        boolean seguir0 = false, seguir1 = false, seguir2 = false, seguir3 = false;


        seguir1 = filtrarEdad(seguir0);
        seguir2 = filtrarPrestamo(seguir0);
        seguir3 = filtrarDevolucion(seguir0);

        if ((seguir1==true && seguir2==true && seguir3==true)){
            JOptionPane.showMessageDialog(null, "Solicitud Aprobada");
        }
        if (!(seguir1==true && seguir2==true && seguir3==true)){
            JOptionPane.showMessageDialog(null, "Solicitud Denegada");
        }
    }

}
