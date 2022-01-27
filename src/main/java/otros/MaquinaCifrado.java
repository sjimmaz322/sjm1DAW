package otros;
public class MaquinaCifrado {
    public static void main(String[] args) {
        int i,h = 0;
        int j, k =0;
        String fraseOriginal = "Informe 345/32 Buque de Carga en el Atlantico.";
        for (i = 1; i <= fraseOriginal.length(); i += 2) {
            char x = (char) ((fraseOriginal.charAt(i)) + 11);
            System.out.print(fraseOriginal.charAt(h));
            System.out.print(x);
            h+=2;
        }
        System.out.print(" - ");
        String fraseEncriptada = "Iyfzrxe+3?5:3= Mu|up oe+Clrra+ey pl+Allnino9";
        for (j = 1; j <= fraseOriginal.length(); j += 2) {
            char y = (char) ((fraseEncriptada.charAt(j)) - 11);
            System.out.print(fraseEncriptada.charAt(k));
            System.out.print(y);
            k+=2;
        }
    }
}