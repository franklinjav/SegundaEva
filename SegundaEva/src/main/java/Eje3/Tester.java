package Eje3;

import Eje2.OperacionesString;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion = "0";
        int [] arraymain = new int[10];
        while (!opcion.equals("7")) {
            System.out.println("Introduzca: \n 1 Para cargar un array\n 2 Para visualizar el contenido del array\n 3 Para ordenar el array\n 4 Para calcular la media del array\n 5 Para devolver una copia del array invertido\n 6 Para verificar si hay un número en específico\n 7 Para salir");
            opcion = teclado.nextLine();
            switch (opcion) {
                case "1":
                    OperacionesArrays.cargar(arraymain);
                    System.out.println("Array cargado");
                    break;
                case "2":
                    OperacionesArrays.mostar(arraymain);
                    break;
                case "3":
                    System.out.println("El array ordenado es el siguiente:");
                    OperacionesArrays.orden(arraymain);
                    break;
                case "4":
                    OperacionesArrays.media(arraymain);
                    break;
                case "5":
                    OperacionesArrays.invert(arraymain);
                    break;
                case "6":
                    OperacionesArrays.estar(arraymain);
                    break;
                case "7":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No ha introducido una opción válida");
                    break;
            }
        }
    }
}
