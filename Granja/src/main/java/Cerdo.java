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
    public Cerdo(String nombre, int edad, float peso, float comida) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.comida = comida;
    }

    //Gets y Sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getComida() {
        return comida;
    }

    public void setComida(float comida) {
        this.comida = comida;
    }

    //Arrays de nombres

    public static final String [] nombreCerdo = {"NombreCerdo1,NombreCerdo2,NombreCerdo3,NombreCerdo4,NombreCerdo5"};

    //Metodos

    public String getNombreVaca() {
        return nombreCerdo[(int) (Math.random()*nombreCerdo.length)];
    }

    //toString

    @Override
    public String toString() {
        return "Cerdo{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", comida=" + comida +
                '}';
    }
}
