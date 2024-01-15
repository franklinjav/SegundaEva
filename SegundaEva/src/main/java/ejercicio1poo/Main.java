package src.main.java.ejercicio1poo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        //probar que funciona la clase punto
        Punto punto1 = new Punto(1,5);
        Punto punto2 = new Punto();
        System.out.println(punto1);
        System.out.println(punto2);
        double distanpuntos = punto1.calcularDistanciaDesde(punto2);
        System.out.println("La distancia entre puntos es: " + distanpuntos);
        System.out.println("------------------------------------------------");
        //probar la clase circulo
        Circulo circulo = new Circulo();
        System.out.println(circulo);
        System.out.println("La distancia desde el punto1 al círculo es: " + circulo.calcularDistanciaDesde(punto1));
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        //probar la clase triangulo
        System.out.println("Introduzca la posición x del primer vértice");
        double x1 = teclado.nextDouble();
        System.out.println("Introduzca la posición y del primer vértice");
        double y1 = teclado.nextDouble();
        System.out.println("Introduzca la posición x del segundo vértice");
        double x2 = teclado.nextDouble();
        System.out.println("Introduzca la posición y del segundo vértice");
        double y2 = teclado.nextDouble();
        System.out.println("Introduzca la posición x del tercer vértice");
        double x3 = teclado.nextDouble();
        System.out.println("Introduzca la posición y del tercer vértice");
        double y3 = teclado.nextDouble();
        Triangulo triangulo = new Triangulo();
        if (triangulo.calcularTriangulo()) {
            System.out.println(triangulo);
            System.out.println("la distancia mas cercana desde el punto1 al vertice mas cercano es: " + triangulo.calcularDistanciaDesde(punto1));
            System.out.println("El area del triangulo es: " + triangulo.calcularArea());
            System.out.println("El perimetro del triangulo es: " + triangulo.calcularPerimetro());
        } else {
            System.out.println("No se puede formar un triangulo con estos puntos");
        }
    }
}
