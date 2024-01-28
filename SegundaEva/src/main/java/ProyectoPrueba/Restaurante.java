package src.main.java.ProyectoPrueba;

import java.util.Arrays;

public class Restaurante {
    //Atributos

    private Empleado[] empleados;

    //Constructores

    public Restaurante() {
        empleados = new Empleado[5];
        for (int i = 0; i < empleados.length; i++) {
            if (i%2==0) {
                empleados[i] = new Mesero();
            } else {
                empleados[i] = new Cocinero();
            }
        }
    }

    public Restaurante(int cant) {
        empleados = new Empleado[cant];
        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = null;
        }
    }

    //toString

    @Override
    public String toString() {
        return String.format("\nEl restaurante dispone de los siguientes empleado: " + Arrays.toString(empleados));
    }

    //Métodos

    public void darBaja(String dni) {
        boolean salir = false;
        for (int i = 0; i < empleados.length && salir == false; i++) {
            if (dni.equalsIgnoreCase(empleados[i].getDni())) {
                empleados[i] = null;
                salir = true;
            }
        }
    }
    public void darAlta(Empleado empleado) {
        boolean salir = false;
        for (int i = 0; i < empleados.length && salir == false; i++) {
            if (empleados[i] == null) {
                empleados[i] = empleado;
                salir = true;
            }
        }
        if (salir == false) {
            System.out.println("Ya ha alcanzado la cantidad máxima de empleados");
        }
    }

    public void listarEmpleados(int edad) {
        System.out.println("La lista de empleado con " + edad + " años de edad o más son:");
        boolean nadie = true;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getEdad() >= edad) {
                System.out.println(empleados[i].toString());
                nadie = false;
            }
        }
        if (nadie) {
            System.out.println("No hay empleados con esta edad o mayores");
        }
    }
    //??
    public void modificarAtri(String dni) {
        boolean salir = false;
        for (int i = 0; i < empleados.length && salir == false; i++) {
            if (empleados[i].getDni().equalsIgnoreCase(dni)) {
                System.out.println("Los datos del empleado son los siguientes:");
                System.out.println(empleados[i].toString());
            }
        }
    }
}
