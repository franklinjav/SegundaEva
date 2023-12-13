package Eje1;

import java.util.Scanner;

public class OperecionesVarias {
    public static void perfecto (int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x%i==0) {
                sum = sum + i;
            }
        }
        if (sum == x) {
            System.out.println("Su número es perfecto");
        } else {
            System.out.println("Su número no es perfecto");
        }
    }

    public static void pirámide () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número de filas que desea en su pirámide");
        int cant = teclado.nextInt();
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }
}
