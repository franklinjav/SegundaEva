public class Utilidades {
    public static final String[] nombres = {"Nombre1", "Nombre2","Nombre3","Nombre4","Nombre5","Nombre6","Nombre7"};
    public static String getNombres() {
        return nombres[(int) (Math.random()*nombres.length)];
    }

}
