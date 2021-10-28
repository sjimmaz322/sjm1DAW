package ejerciciosbucles;

public class Ej1 {

    public static void main(String[] args) {

        int x = 2;
        // Este bucle imprime x, imprime un guión y le suma 1 a x mientras que x sea menor que 100
        //Se detiene cuando x valga 101
        while (x <= 100) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1; // x++; ++x; x+=1;
        }
        System.out.println("");
        System.out.println("x vale: " + x);
    }

}
