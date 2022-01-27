package relacionc;

public class PruebaComplejo {

    public static void main(String[] args) {

        Complejo numComplejo1 = new Complejo(4, 5);
        Complejo numComplejo2 = new Complejo(3, 1);
        Complejo numComplejoAux = new Complejo(0, 0);

        System.out.println("En este punto se han creado " + Complejo.Contador() + " números complejos");
        numComplejoAux = numComplejo1.sumar(numComplejo2);
        System.out.println("Sumar " + numComplejo1 + " y " + numComplejo2 + " da como resultado: " + numComplejoAux);
        System.out.println("-");
        System.out.println("En este punto se han creado " + Complejo.Contador() + " números complejos");
        System.out.println("-");

        numComplejoAux = numComplejo1.restar(numComplejo2);
        System.out.println("Restar " + numComplejo1 + " y " + numComplejo2 + " da como resultado: " + numComplejoAux);
        System.out.println("-");
        System.out.println("En este punto se han creado " + Complejo.Contador() + " números complejos");
        System.out.println("-");

        numComplejoAux = numComplejo1.multiplicar(numComplejo2);
        System.out.println("Multiplicar " + numComplejo1 + " y " + numComplejo2 + " da como resultado: " + numComplejoAux);
        System.out.println("-");
        System.out.println("En este punto se han creado " + Complejo.Contador() + " números complejos");
        System.out.println("-");

        numComplejoAux = numComplejo1.dividir(numComplejo2);
        System.out.println("Dividir " + numComplejo1 + " y " + numComplejo2 + " da como resultado: " + numComplejoAux);
        System.out.println("-");
        System.out.println("En este punto se han creado " + Complejo.Contador() + " números complejos");
        System.out.println("-");
        if (numComplejo1.equals(numComplejo2)) {
            System.out.println("Los dos números complejos son iguales");
        } else {
            System.out.println("Los dos números complejos no son iguales");
        }
        System.out.println("-");
        System.out.println("En este punto se han creado " + Complejo.Contador() + " números complejos");

        Complejo numComplejo3 = new Complejo(3, 3);
        Complejo numComplejo4 = new Complejo(3, 3);
        System.out.println("-");
        if (numComplejo3.equals(numComplejo4)) {
            System.out.println("Los dos números complejos son iguales");
        } else {
            System.out.println("Los dos números complejos no son iguales");
        }
        System.out.println("-");
        System.out.println("En este punto se han creado " + Complejo.Contador() + " números complejos");
    }

}
