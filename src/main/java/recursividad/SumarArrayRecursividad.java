package recursividad;

public class SumarArrayRecursividad {

    public static void main(String[] args) {

        int num[] = {7, 1, 2, 3, 4};
        System.out.println(sumar(num, num.length));

    }

    private static int sumar(int[] array, int tamanio) {
        if (tamanio == 1) {//Caso base
            return array[0];//Ciclo pasivo
        } else {
            return array[tamanio - 1] + sumar(array, tamanio - 1);//Ciclo activo
        }
    }
}
