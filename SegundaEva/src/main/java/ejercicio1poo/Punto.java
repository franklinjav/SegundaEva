package SegundaEva.src.main.java.ejercicio1poo;

public class Punto {

    //atributos

    private double posix;
    private double posiy;

    //constructores

    public Punto(){
        this.posix = Math.random()*10-5;
        this.posiy = Math.random()*10-5;
    }
    public Punto(double posix,double posiy) {
        this.posix = posix;
        this.posiy = posiy;
    }

    //gets y sets

    public double getPosix() {
        return posix;
    }
    public double getPosiy() {
        return posiy;
    }

    //métodos

    public double calcularDistanciaDesde(Punto punto1) {
        double disx = punto1.getPosix() - this.posix;
        double disy = punto1.getPosiy() - this.posiy;
        return Math.sqrt(disx*disx+disy*disy);
    }

    //toString

    @Override
    public String toString() {
        return "Punto{" +
                "posix=" + posix +
                ", posiy=" + posiy +
                '}';
    }
}
