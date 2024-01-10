package SegundaEva.src.main.java.ejercicio2poo;

public class Asignatura {

    //Atributos

    private int identificador;
    private double nota;

    //Constructores

    public Asignatura(int nota) {
        this.nota = nota;
    }

    //Gets y Sets


    public int getIdentificador() {
        return identificador;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //toString

    @Override
    public String toString() {
        return "Asignatura{" +
                "identificador=" + identificador +
                ", nota=" + nota +
                '}';
    }
}
