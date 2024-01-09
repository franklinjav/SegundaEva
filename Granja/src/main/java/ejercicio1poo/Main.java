package ejercicio1poo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
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
    }
}
