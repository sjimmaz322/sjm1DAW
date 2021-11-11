package otros;

import javax.swing.JOptionPane;

public class EjBancoMethods {

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
        
        int edad;
        int salario;
        double limiteCredito;
        int cantidadPrestamo;
        int plazos;
        int ejecucion;
        final double FACTOR_MULTIPLICATIVO = 5.85;
        final int MESES_ANUALIDAD = 12;
        final int EDAD_MINIMA = 18;
        final int EDAD_MAXIMA = 65;
        final int TOPE_DEVOLUCION = 75;
        final int PLAZO_MINIMO = 5;
        final int PLAZO_MAXIMO = 30;

        do {
            String ejecucionTexto = JOptionPane.showInputDialog("¿Desea ejecutar el programa?" + "\n" + "Introduzca 1 para si" + "\n"
                    + "Introduzca 0 para no");
            ejecucion = Integer.parseInt(ejecucionTexto);
            if (ejecucion == 1) {
                do {
                    String edadTexto = JOptionPane.showInputDialog("Introduzca su edad" + "\n"
                            + "Si los datos son incorrectos se pedirán de nuevo");
                    edad = Integer.parseInt(edadTexto);
                    if (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
                        JOptionPane.showMessageDialog(null, "Los datos son incorrectos" + "\n"
                                + "Rango de edad permitido: 18 - 65 años");
                    }
                } while (edad < EDAD_MINIMA || edad > EDAD_MAXIMA);
                String salarioTexto = JOptionPane.showInputDialog("Introduzca su salario bruto mensual");
                salario = Integer.parseInt(salarioTexto);
                limiteCredito = (salario * MESES_ANUALIDAD * FACTOR_MULTIPLICATIVO);
                do {
                    String cantidadPrestamoTexto = JOptionPane.showInputDialog("Introduzca el dinero que desea solicitar" + "\n"
                            + "Si los datos son incorrectos se pedirán de nuevo");
                    cantidadPrestamo = Integer.parseInt(cantidadPrestamoTexto);
                    if (cantidadPrestamo > limiteCredito) {
                        JOptionPane.showMessageDialog(null, "Los datos son incorrectos" + "\n"
                                + "El máximo solicitable será el salario anual multiplicado por el factor multiplicativo (5.85)");
                    }
                } while (cantidadPrestamo > limiteCredito);
                do {
                    String plazosTexto = JOptionPane.showInputDialog("Introduzca los años en los que desea devolver el préstamo" + "\n"
                            + "Si los datos son incorrectos se pedirán de nuevo");
                    plazos = Integer.parseInt(plazosTexto);
                    if ((plazos > PLAZO_MAXIMO) || (plazos < PLAZO_MINIMO) || (edad + plazos > TOPE_DEVOLUCION)) {
                        JOptionPane.showMessageDialog(null, "Los datos son incorrectos" + "\n"
                                + "Años de devolución minimos: 5" + "\n"
                                + "Años de devolución máximos: 30" + "\n"
                                + "Atención: Los años en los que devuelva el préstamo sumados a su edad no podrá ser superior al límite permitido."
                                + "\n" + "Límite permitido: 75 años.");
                    }
                } while ((plazos > PLAZO_MAXIMO) || (plazos < PLAZO_MINIMO) || (edad + plazos > TOPE_DEVOLUCION));
                JOptionPane.showMessageDialog(null, "Su préstamo ha sido concedido");
            } else {
                JOptionPane.showMessageDialog(null, "El programa ha sido cancelado de manera exitosa");
            }
        } while (ejecucion == 1);
    }

}
