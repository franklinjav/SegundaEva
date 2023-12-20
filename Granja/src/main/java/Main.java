import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String opcion = "10";
        while (!opcion.equals("5")) {
            System.out.println("Introduzca:\n 1 Para acceder a la gallina\n 2 Para acceder a las ovejas\n 3 Para acceder a los cerdos\n 4 Para acceder a las vacas\n 5 Para salir");
            opcion = teclado.nextLine();
            switch (opcion) {
                case "1":
                    break;
                case "2":
                    int opcion_oveja = 10;
                    while (opcion_oveja != 3) {
                        System.out.println("Introduzca:\n 1 Si desea generar datos aleatorios de una oveja\n 2 Si desea introducir los dato de forma manual\n 3 Si desea salir");
                        opcion_oveja = teclado.nextInt();
                        teclado.nextLine();
                        switch (opcion_oveja) {
                            case 1:
                                System.out.println("---------------------------------------------");
                                Oveja ovejarandom = new Oveja();
                                System.out.println(ovejarandom.toString());
                                System.out.println("---------------------------------------------");
                                break;
                            case 2:
                                System.out.println("Introduzca el nombre de la oveja");
                                String nombre = teclado.nextLine();
                                System.out.println("Introduzca el nombre de la oveja");
                                float peso = teclado.nextFloat();
                                System.out.println("Introduzca el nombre de la oveja");
                                int edad = teclado.nextInt();
                                System.out.println("Introduzca el nombre de la oveja");
                                float lana = teclado.nextFloat();
                                break;
                            case 3:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("No ha introducido una opción válida");
                                break;
                        }
                        break;
                    }
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    System.out.println("No ha introducido una opción válida");
                    break;
            }
        }
    }
}
