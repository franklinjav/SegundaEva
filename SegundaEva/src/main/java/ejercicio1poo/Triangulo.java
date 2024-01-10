package SegundaEva.src.main.java.ejercicio1poo;

public class Triangulo {

    //Atributos
    private Punto vert1;
    private Punto vert2;
    private Punto vert3;

    //Constructores

    public Triangulo() {
        this.vert1 = new Punto();
        this.vert3 = new Punto();
        this.vert2 = new Punto();
    }
    public Triangulo(Punto punto1,Punto punto2,Punto punto3) {
        this.vert1 = punto1;
        this.vert2 = punto2;
        this.vert3 = punto3;
    }
    public Triangulo(double x1,double y1,double x2,double y2,double x3,double y3) {
        this.vert1 = new Punto(x1,y1);
        this.vert2 = new Punto(x2,y2);
        this.vert3 = new Punto(x3,y3);
    }

    //Gets y Sets


    public Punto getVert1() {
        return vert1;
    }

    public Punto getVert2() {
        return vert2;
    }

    public Punto getVert3() {
        return vert3;
    }

    //Metodos

    public double calcularDistanciaDesde(Punto punto1) {
        double distancia1 = vert1.calcularDistanciaDesde(punto1);
        double distancia2 = vert2.calcularDistanciaDesde(punto1);
        double distancia3 = vert3.calcularDistanciaDesde(punto1);
        return Math.min(distancia1,Math.min(distancia2,distancia3));
    }
    public double calcularArea() {
        double lado1 = vert1.calcularDistanciaDesde(vert2);
        double lado2 = vert2.calcularDistanciaDesde(vert3);
        double lado3 = vert3.calcularDistanciaDesde(vert1);
        double semip = (lado1+lado2+lado3)/2;
        return Math.sqrt(semip*(semip-lado1)*(semip-lado2)*(semip-lado3));
    }
    public double calcularPerimetro() {
        double lado1 = vert1.calcularDistanciaDesde(vert2);
        double lado2 = vert2.calcularDistanciaDesde(vert3);
        double lado3 = vert3.calcularDistanciaDesde(vert1);
        return lado1+lado2+lado3;
    }
    public boolean calcularTriangulo() {
        boolean verdad = true;
        if (vert1.calcularDistanciaDesde(vert2) > (vert1.calcularDistanciaDesde(vert3)+vert2.calcularDistanciaDesde(vert3)) && vert1.calcularDistanciaDesde(vert3) > (vert1.calcularDistanciaDesde(vert2)+vert2.calcularDistanciaDesde(vert3)) && vert2.calcularDistanciaDesde(vert3) > (vert1.calcularDistanciaDesde(vert3)+vert2.calcularDistanciaDesde(vert1))) {
            verdad = false;
        }
        return verdad;
    }

    //toString


    @Override
    public String toString() {
        return "Triangulo{" +
                "vert1=" + vert1 +
                ", vert2=" + vert2 +
                ", vert3=" + vert3 +
                '}';
    }
}
