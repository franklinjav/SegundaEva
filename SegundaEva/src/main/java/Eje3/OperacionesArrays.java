package Eje3;

import java.util.Arrays;
import java.util.Scanner;

public class OperacionesArrays {
    public static void cargar (int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random()*10 + 1);
        }
    }
    public static void mostar(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void orden(int[] x) {
        Arrays.sort(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void media(int[] x) {
        int cont = 0;
        for (int i = 0; i < x.length; i++) {
            cont = cont + x[i];
        }
        System.out.println("La media es de: " + (cont/x.length));
    }
    public static void invert(int[] x) {
        System.out.println("El array invertido es el siguiente:");
        for (int i = x.length-1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void estar(int[] x) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número que desea buscar");
        int y = teclado.nextInt();
        boolean verdad = false;
        for (int i = 0; i < x.length && verdad == false; i++) {
            if (x[i] == y) {
                verdad = true;
            }
        }
        if (verdad) {
            System.out.println("El número que ha introducido se encuentra en el array");
        } else {
            System.out.println("El número que ha introducido no se encuentra en el array");
        }
    }
}
