package Eje2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion = "0";
        while (opcion!="5") {
            System.out.println("Introduzca: \n 1 Para devolver las iniciales de su nombre y sus apellidos\n 2 Para concatenar dos frases o palabras y pasarlas a mayúsculas\n 3 Para contar las palabras\n 4 Para saber cuantas veces aparece una palabra en un texto\n 5 Para salir");
            opcion = teclado.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Introduzca su nombre");
                    String nombre = teclado.nextLine();
                    System.out.println("Introduzca su primer apellido");
                    String apellido = teclado.nextLine();
                    System.out.println("Introduzca su segundo apellido");
                    String apellido2 = teclado.nextLine();
                    System.out.println(OperacionesString.iniciales(nombre,apellido,apellido2));
                    break;
                case "2":
                    OperacionesString.concatenar();
                    break;
                case "3":
                    System.out.println("Introduzca una frase para contar las palabras que contiene");
                    String texto = teclado.nextLine();
                    System.out.println(OperacionesString.contador(texto));
                    break;
                case "4":
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No ha introducido una opción válida");
                    break;
            }
        }
    }
}
