package src.main.java.ProyectoPrueba;

public class Utilidades {
    //Arrays de nombres y DNIs

    public static final String[] nombres = {"Juan", "Pedro", "Lucía", "Pablo", "Fernanda", "María", "Frank", "Luisa", "Luis"};
    public static String generarDni() {
        int letra = (int) (Math.random()*(90 - 65 + 1) + 65);
        String numero = String.valueOf((int) (Math.random()*99999999 + 1));
        return numero.concat(String.valueOf((char)letra));
    }
    public static String ponerNombres() {
        return nombres[(int) (Math.random()* nombres.length)];
    }
}
