package pokino;


import java.util.TreeSet;
/*
 * @author samjimmaz
 */
public class PruebasPokino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Naipe[][] carton1 = new Naipe[5][5];
        boolean[][] estado = new boolean[5][5];
        TreeSet<Naipe> naipes = new TreeSet<Naipe>();

        for (int i = 0; i < 52; i++) {
            Naipe n = new Naipe();
            naipes.add(n);
        }
    }

    public static void mostrarCarton(Naipe[][] matriz) {

        System.out.println("|" + matriz[0][0] + "|" + matriz[0][1] + "|" + matriz[0][2] + "|" + matriz[0][3] + "|" + matriz[0][4] + "|");
        System.out.println("|" + matriz[1][0] + "|" + matriz[1][1] + "|" + matriz[1][2] + "|" + matriz[1][3] + "|" + matriz[1][4] + "|");
        System.out.println("|" + matriz[2][0] + "|" + matriz[2][1] + "|" + matriz[2][2] + "|" + matriz[2][3] + "|" + matriz[2][4] + "|");
        System.out.println("|" + matriz[3][0] + "|" + matriz[3][1] + "|" + matriz[3][2] + "|" + matriz[3][3] + "|" + matriz[3][4] + "|");
        System.out.println("|" + matriz[4][0] + "|" + matriz[4][1] + "|" + matriz[4][2] + "|" + matriz[4][3] + "|" + matriz[4][4] + "|");

    }

    public static void estadoCarton(boolean[][] matriz) {

        System.out.println("|" + matriz[0][0] + "|" + matriz[0][1] + "|" + matriz[0][2] + "|" + matriz[0][3] + "|" + matriz[0][4] + "|");
        System.out.println("|" + matriz[1][0] + "|" + matriz[1][1] + "|" + matriz[1][2] + "|" + matriz[1][3] + "|" + matriz[1][4] + "|");
        System.out.println("|" + matriz[2][0] + "|" + matriz[2][1] + "|" + matriz[2][2] + "|" + matriz[2][3] + "|" + matriz[2][4] + "|");
        System.out.println("|" + matriz[3][0] + "|" + matriz[3][1] + "|" + matriz[3][2] + "|" + matriz[3][3] + "|" + matriz[3][4] + "|");
        System.out.println("|" + matriz[4][0] + "|" + matriz[4][1] + "|" + matriz[4][2] + "|" + matriz[4][3] + "|" + matriz[4][4] + "|");

    }

    public static void rellenarCarton(Naipe[][] aux) {
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                Naipe n = new Naipe();
                aux[i][j] = n;
            }
        }
    }

    public static void limpiarCarton(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = false;
            }
        }
    }
}
