package EjemploModular;

import java.util.Scanner;

public class main {
    public static int suma (int x, int y) {
        int resultado = x + y;
        return resultado;
    }
    public static int resta (int x,int y) {
        int resultado2 = x - y;
        return resultado2;
    }
    public static int multi (int x,int y) {
        int resultado3 = x * y;
        return resultado3;
    }
    public static int divi (int x,int y) {
        int resultado4 = x / y;
        return resultado4;
    }
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
                System.out.println(suma(operando1,operando2));
                break;
            case 2:
                System.out.println(resta(operando1,operando2));
                break;
            case 3:
                System.out.println(multi(operando1,operando2));
                break;
            case 4:
                System.out.println(divi(operando1,operando2));
                break;
            default:
                System.out.println("No es una opción válida");
                break;
        }
    }

}
