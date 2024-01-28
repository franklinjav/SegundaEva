package src.main.java.ProyectoPrueba;

public class Mesero extends Empleado{
    //Atributos

    private double propinas;
    private String idiomas;

    //Constructores

    public Mesero() {
        super();
        propinas = 80;
        idiomas = "Español/Inglés";
    }

    public Mesero(String nombre, String apellidos, String tlf, String direccion, String dni, int edad, double salario, double propinas, String idiomas) {
        super(nombre, apellidos, tlf, direccion, dni, edad, salario);
        this.propinas = propinas;
        this.idiomas = idiomas;
    }

    //Gets y Sets


    public double getPropinas() {
        return propinas;
    }

    public void setPropinas(double propinas) {
        this.propinas = propinas;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    //toString


    @Override
    public String toString() {
        return super.toString() + String.format("\nPropinas acumuladas en el mes: " + propinas + "\nIdiomas: " + idiomas);
    }

    //Métodos
    @Override
    public double calcularSalario() {
        return 0;
    }
}
