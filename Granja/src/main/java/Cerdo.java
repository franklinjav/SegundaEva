public class Cerdo {
    //Atributos

    private String nombre;
    private int edad;
    private  float peso;
    private  float comida;

    //Constructores

    public Cerdo() {
        nombre = getNombreVaca();
        edad = (int) (Math.random()*20+1);
        peso = (float) (Math.random()*101+20);
        comida = (float) (Math.random()*5);
    }
    public Cerdo() {}

    //Arrays de nombres

    public static final String [] nombreCerdo = {"NombreCerdo1,NombreCerdo2,NombreCerdo3,NombreCerdo4,NombreCerdo5"};

    //Metodos

    public String getNombreVaca() {
        return nombreCerdo[(int) (Math.random()*nombreCerdo.length)];
    }
}
