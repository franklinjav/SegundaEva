package Eje1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Introduzca 1 Para jugar a los números perfectos. 2 Para sacar un pirámide y 3 Para salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca un número para saber si es perfecto");
                    int num = teclado.nextInt();
                    OperecionesVarias.perfecto(num);
                    break;
                case 2:
                    OperecionesVarias.pirámide();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
        }
    }
}
