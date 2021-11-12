package otros;

import javax.swing.JOptionPane;

public class EjBancoMethods {

    // private static int age;
    private static boolean filtrarEdad(int age) {

        final int MIN_AGE = 18, MAX_AGE = 65;

        if (age > MIN_AGE && age < MAX_AGE) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean filtrarPrestamo(int salary, int moneyAsked, double creditLimit) {

        final int MONTHS_IN_YEAR = 12;
        final double MULTIPLY_FACTOR = 5.85;

        if (moneyAsked <= creditLimit) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean filtrarDevolucion(int age, int deadlines) {

        final int MIN_DEADLINES = 5, MAX_DEADLINES = 30, LIMIT_DEADLINES = 75;

        if ((deadlines < MAX_DEADLINES) && (deadlines > MIN_DEADLINES) && (age + deadlines < LIMIT_DEADLINES)) {
            return true;
        } else {
            return false;
        }
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

        final int MIN_AGE = 18, MAX_AGE = 65;
        int age;
        int deadlines;
        final int MIN_DEADLINES = 5, MAX_DEADLINES = 30, LIMIT_DEADLINES = 75;
        int salary, moneyAsked;
        final int MONTHS_IN_YEAR = 12;
        final double MULTIPLY_FACTOR = 5.85;
        double creditLimit;
        
        boolean seguir0 = false, seguir1 = false, seguir2 = false, seguir3 = false;

        String edadTexto = JOptionPane.showInputDialog("Introduzca su edad");
        age = Integer.parseInt(edadTexto);

        String salarioTexto = JOptionPane.showInputDialog("Introduzca su salario bruto mensual");
        salary = Integer.parseInt(salarioTexto);

        creditLimit = (salary * MONTHS_IN_YEAR * MULTIPLY_FACTOR);

        String cantidadPrestamoTexto = JOptionPane.showInputDialog("Introduzca el dinero que desea solicitar");
        moneyAsked = Integer.parseInt(cantidadPrestamoTexto);

        String plazosTexto = JOptionPane.showInputDialog("Introduzca los años en los que desea devolver el préstamo");
        deadlines = Integer.parseInt(plazosTexto);
/*
        seguir1 = filtrarEdad(seguir0);
        seguir2 = filtrarPrestamo(seguir0);
        seguir3 = filtrarDevolucion(seguir0);
*/
        if ((seguir1 == true && seguir2 == true && seguir3 == true)) {
            JOptionPane.showMessageDialog(null, "Solicitud Aprobada");
        } else {
            JOptionPane.showMessageDialog(null, "Solicitud Denegada");
        }
    }

}
