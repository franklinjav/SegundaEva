package SegundaEva.src.main.java.ejercicio1poo;

public class Circulo {
    //Atributos

    private Punto puntocir;
    private double radio;

    //Constructores

    public Circulo() {
        this.radio = Math.random()*3;
        this.puntocir = new Punto();
    }
    public Circulo(Punto centro, double radio) {
        puntocir = centro;
        this.radio = radio;
    }
    public Circulo(double x, double y, double radio) {
        this.puntocir = new Punto(x,y);
        this.radio = radio;
    }

    //Gets y Sets


    public Punto getPuntocir() {
        return puntocir;
    }
    public double getRadio() {
        return radio;
    }

    //Métodos

    public double calcularDistanciaDesde(Punto punto1) {
        return puntocir.calcularDistanciaDesde(punto1) - radio;
    }
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

    //toString


    @Override
    public String toString() {
        return "Circulo{" +
                "puntocir=" + puntocir +
                ", radio=" + radio +
                '}';
    }
}
