public class Gallina {
    private String nombre;
    private int edad;
    private float peso;


    private static final String[] nombres ={"Paco","Max","Quien","Goku","MartiMcfly"};
    public static String getNombreAleatorio() {
        return nombres[(int) (Math.random()*5)];
    }

    public Gallina(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;

    }
    public Gallina() {
        nombre = getNombreAleatorio();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Me llamo " + nombre + " peso " + peso + "KG" + " y tengo " + edad + " años");
    }


}
