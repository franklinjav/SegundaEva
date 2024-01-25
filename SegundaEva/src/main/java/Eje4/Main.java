package src.main.java.Eje4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        Contacto[] agenda = new Contacto[20];
        int cont_contac = 0;
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Introduzca:\n1 Para crear un conacto\n2 Para ver si un contacto es igual a otro\n3 Para modificar datos de un contacto \n4 Para salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("De momento ha creado " + cont_contac + " contactos, puede crear un máximo de 20");
                    System.out.println("Introduzca el nombre del contacto");
                    String nombre = teclado.nextLine();
                    System.out.println("Introduzca el número del contacto");
                    String numero = teclado.nextLine();
                    System.out.println("Introduzca el correo del contacto");
                    String correo = teclado.nextLine();
                    boolean verdad = false;
                    if (cont_contac == agenda.length-1) {
                        System.out.println("Ya ha introducido el número máximo de contactos");
                    } else {
                        for (int i = 0; i < agenda.length && verdad == false; i++) {
                            if (agenda[i] == null) {
                                agenda[i] = new Contacto(new Titular(nombre, correo), numero);
                                verdad = true;
                                cont_contac++;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Hay " + cont_contac + " contactos en la agenda");
                    System.out.println("Introduzca el número en agenda del contacto");
                    int cont1 = teclado.nextInt();
                    System.out.println("Introduzca el número en agenda contacto con el que desea comparar");
                    int cont2 = teclado.nextInt();
                    if (GestorContactos.compararContactos(agenda[cont1],agenda[cont2])) {
                        System.out.println("Los contactos tienen el mismo número (son iguales)");
                    } else {
                        System.out.println("Los contactos son diferentes (tienen diferentes números)");
                    }
                    break;
                case 3:
                    System.out.println("Hay " + cont_contac + " contactos en la agenda");
                    System.out.println("Introduzca el número en agenda del contacto que desea modificar");
                    int cont = teclado.nextInt();
                    int opcion2 = 0;
                    System.out.println("Introduzca:\n1 Para cambiar el nombre\n2 Para cambiar el número de teléfono\n3 Para cambiar el correo\n4 Para salir");
                    opcion2 = teclado.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("Introduzca el nuevo nombre");
                            String nuevo_nombre = teclado.nextLine();
                            agenda[cont].getTitular().setNombre(nuevo_nombre);
                            System.out.println("Nombre modificado");
                            break;
                        case 2:
                            System.out.println("Introduzca el nuevo número de teléfono");
                            String nuevo_num = teclado.nextLine();
                            agenda[cont].setNumero(nuevo_num);
                            System.out.println("Número modificado");
                            break;
                        case 3:
                            System.out.println("Introduzca el nuevo correo");
                            String nuevo_correo = teclado.nextLine();
                            agenda[cont].getTitular().setCorreo(nuevo_correo);
                            break;
                        case 4:
                            System.out.println("Saliendo...");
                            break;
                        case 5:
                            System.out.println("No es una opción válida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Saliendo.....");
                    break;
                default:
                    System.out.println("No ha introducido una opción válida");
                    break;
            }
        }
    }
}
