package src.main.java.EjeMedicos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Prueba clase médicoCentrosalud
        MedicoCentroSalud medicocentro1 = new MedicoCentroSalud(new CentroSalud());
        System.out.println("Introduzca el nombre del médico");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca la edad del médico");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el sexo del médico");
        String sexo = teclado.nextLine();
        System.out.println("Introduzca la cantidad de horas trabajadas por el médico");
        double horas = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Introduzca la cantidad que cobra el medico por hora");
        double salario = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Introduzca el indentificador del centro de salud del doctor");
        int id = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el nombre del centro de salud del doctor");
        String nombrec = teclado.nextLine();
        System.out.println("Introduzca la direccion del centro de salud");
        String domi = teclado.nextLine();
        System.out.println("Introduzca el codigo postal del centro");
        String cod = teclado.nextLine();
        MedicoCentroSalud medicocentro2 = new MedicoCentroSalud(nombre,edad,sexo,horas,salario,new CentroSalud(id,nombrec,domi,cod));
        System.out.println(medicocentro1);
        System.out.println("Salario: " + medicocentro1.calcularSalario());
        System.out.println(medicocentro2);
        System.out.println("Salario: " + medicocentro2.calcularSalario());
    }
}
