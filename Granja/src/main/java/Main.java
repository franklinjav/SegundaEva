import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String opcion = "10";
        while (!opcion.equals("6")) {
            System.out.println("Introduzca:\n 1 Para acceder a la gallina\n 2 Para acceder a las ovejas\n 3 Para acceder a los cerdos\n 4 Para acceder a las vacas\n 5 Para generar una lista de vacas y gallinas\n 6 Para salir");
            opcion = teclado.nextLine();
            switch (opcion) {
                case "1":
                    int opcion_gallina = 10;
                    while (opcion_gallina != 3) {
                        System.out.println("Introduzca:\n 1 Si desea generar datos aleatorios de una gallina\n 2 Si desea introducir los datos de forma manual\n 3 Si desea salir");
                        opcion_gallina = teclado.nextInt();
                        teclado.nextLine();
                        switch (opcion_gallina) {
                            case 1:
                                System.out.println("---------------------------------------------");
                                Gallina gallinarandom = new Gallina();
                                System.out.println(gallinarandom);
                                System.out.println("---------------------------------------------");
                                break;
                            case 2:
                                System.out.println("Introduzca el nombre de la gallina");
                                String nombre = teclado.nextLine();
                                System.out.println("Introduzca el peso de la gallina");
                                float peso = teclado.nextFloat();
                                System.out.println("Introduzca la edad de la gallina");
                                int edad = teclado.nextInt();
                                Gallina gallina = new Gallina(nombre, edad, peso);
                                System.out.println(gallina);
                                System.out.println("---------------------------------------------");
                                break;
                            case 3:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("No ha introducido una opción válida");
                                break;
                        }
                    }
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
                                System.out.println(ovejarandom);
                                System.out.println("---------------------------------------------");
                                break;
                            case 2:
                                System.out.println("Introduzca el nombre de la oveja");
                                String nombre = teclado.nextLine();
                                System.out.println("Introduzca el peso de la oveja");
                                float peso = teclado.nextFloat();
                                System.out.println("Introduzca la edad de la oveja");
                                int edad = teclado.nextInt();
                                System.out.println("Introduzca cuanta lana ha producido la oveja");
                                float lana = teclado.nextFloat();
                                Oveja oveja = new Oveja(nombre,edad,peso,lana);
                                System.out.println(oveja);
                                System.out.println("---------------------------------------------");
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
                    int opcion_cerdo = 10;
                    while (opcion_cerdo != 3) {
                        System.out.println("Introduzca:\n 1 Si desea generar datos aleatorios de un cerdo\n 2 Si desea introducir los datos de forma manual\n 3 Si desea salir");
                        opcion_cerdo = teclado.nextInt();
                        teclado.nextLine();
                        switch (opcion_cerdo) {
                            case 1:
                                System.out.println("---------------------------------------------");
                                Cerdo cerdorandom = new Cerdo();
                                System.out.println(cerdorandom);
                                System.out.println("---------------------------------------------");
                                break;
                            case 2:
                                System.out.println("Introduzca el nombre del cerdo");
                                String nombre = teclado.nextLine();
                                System.out.println("Introduzca el peso del cerdo");
                                float peso = teclado.nextFloat();
                                System.out.println("Introduzca la edad del cerdo");
                                int edad = teclado.nextInt();
                                System.out.println("Introduzca la cantidad de comida que ha consumido el cerdo");
                                float comida = teclado.nextFloat();
                                Cerdo cerdo = new Cerdo(nombre, edad, peso, comida);
                                System.out.println(cerdo);
                                System.out.println("---------------------------------------------");
                                break;
                            case 3:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("No ha introducido una opción válida");
                                break;
                        }
                    }
                    break;
                case "4":
                    int opcion_vaca = 10;
                    while (opcion_vaca != 3) {
                        System.out.println("Introduzca:\n 1 Si desea generar datos aleatorios de una vaca\n 2 Si desea introducir los datos de forma manual\n 3 Si desea salir");
                        opcion_vaca = teclado.nextInt();
                        teclado.nextLine();
                        switch (opcion_vaca) {
                            case 1:
                                System.out.println("---------------------------------------------");
                                Vaca vacarandom = new Vaca();
                                System.out.println(vacarandom);
                                System.out.println("---------------------------------------------");
                                break;
                            case 2:
                                System.out.println("Introduzca el nombre de la vaca");
                                String nombre = teclado.nextLine();
                                System.out.println("Introduzca el peso de la vaca");
                                float peso = teclado.nextFloat();
                                System.out.println("Introduzca la edad de la vaca");
                                int edad = teclado.nextInt();
                                System.out.println("Introduzca la cantidad de leche que ha producido la vaca");
                                float leche = teclado.nextFloat();
                                Vaca vaca = new Vaca(nombre, edad, peso);
                                System.out.println(vaca);
                                System.out.println("---------------------------------------------");
                                break;
                            case 3:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("No ha introducido una opción válida");
                                break;
                        }
                    }
                    break;
                case "5":
                    Granja granja = new Granja();
                    System.out.println(granja);
                    break;
                case "6":
                    System.out.println("Saliendo...");
                    System.out.println("---------------------------------------------");
                    break;
                default:
                    System.out.println("No ha introducido una opción válida");
                    break;
            }
        }
    }
}
