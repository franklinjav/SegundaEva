package Eje2;

import java.util.Scanner;

public class OperacionesString {
    public static String iniciales (String x,String y,String f) {
        String ini1 = String.valueOf(x.charAt(0));
        String ini2 = String.valueOf(y.charAt(0));
        String ini3 = String.valueOf(f.charAt(0));
        String iniciales = ini1.concat(ini2.concat(ini3));
        return iniciales;
    }
    public static void concatenar () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una frase o palabra");
        String frase1 = teclado.nextLine();
        System.out.println("Introduzca la frase o palabra que desea unir con la anterior");
        String frase2 = teclado.nextLine();
        System.out.println(frase1.concat(frase2).toUpperCase());
    }
    public static int contador (String x) {

    }
}
