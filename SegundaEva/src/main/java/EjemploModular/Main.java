package EjemploModular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculando:\n Introduzca 1 para sumar. 2 para restar. 3 para multlipicar y 4 para dividir");
        int opcion = teclado.nextInt();
        System.out.println("Introduzca un operando");
        int operando1 = teclado.nextInt();
        System.out.println("Introduzca un operando");
        int operando2 = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(Calculadora.suma(operando1,operando2));
                break;
            case 2:
                System.out.println(Calculadora.resta(operando1,operando2));
                break;
            case 3:
                System.out.println(Calculadora.multi(operando1,operando2));
                break;
            case 4:
                System.out.println(Calculadora.divi(operando1,operando2));
                break;
            default:
                System.out.println("No es una opción válida");
                break;
        }
    }

}
