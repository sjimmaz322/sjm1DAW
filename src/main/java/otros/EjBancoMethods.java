package otros;

import javax.swing.JOptionPane;

public class EjBancoMethods {
    private int age;
    
    private static boolean filtrarEdad(boolean a) {
        final int MIN_AGE = 18, MAX_AGE = 65;
        int age;
        
            String edadTexto = JOptionPane.showInputDialog("Introduzca su edad");
            age = Integer.parseInt(edadTexto);
            
            if (age > MIN_AGE && age < MAX_AGE) {
                return true;
            }
            else{
                return false;
            }
    }

        
    

    private static boolean filtrarPrestamo(boolean a) {
        
        int salary = 0, moneyAsked = 0;
        final int MONTHS_IN_YEAR = 12;
        final double MULTIPLY_FACTOR = 5.85;
        double creditLimit = 0;

        String salarioTexto = JOptionPane.showInputDialog("Introduzca su salario bruto mensual");
        salary = Integer.parseInt(salarioTexto);

        creditLimit = (salary * MONTHS_IN_YEAR * MULTIPLY_FACTOR);

        
            String cantidadPrestamoTexto = JOptionPane.showInputDialog("Introduzca el dinero que desea solicitar");
            moneyAsked = Integer.parseInt(cantidadPrestamoTexto);
            
            if (moneyAsked <= creditLimit) {
                return true;
            }
            else {
                return false;
            }
    }

    private static boolean filtrarDevolucion(boolean a) {
        
        int deadlines = 0;
        int age = 0;
        final int MIN_DEADLINES = 5, MAX_DEADLINES = 30, LIMIT_DEADLINES = 75;


            String plazosTexto = JOptionPane.showInputDialog("Introduzca los años en los que desea devolver el préstamo");
            deadlines = Integer.parseInt(plazosTexto);
            
            if ((deadlines < MAX_DEADLINES) && (deadlines > MIN_DEADLINES) && (age + deadlines < LIMIT_DEADLINES)) {
                return true;
            }
            else {
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


        boolean seguir0 = false, seguir1 = false, seguir2 = false, seguir3 = false;


        seguir1 = filtrarEdad(seguir0);
        seguir2 = filtrarPrestamo(seguir0);
        seguir3 = filtrarDevolucion(seguir0);

        if ((seguir1==true && seguir2==true && seguir3==true)){
            JOptionPane.showMessageDialog(null, "Solicitud Aprobada");
        }
        else {
            JOptionPane.showMessageDialog(null, "Solicitud Denegada");
        }
    }

}
