package src.main.java.ProyectoPrueba;

public abstract class Empleado {
    //Atributos

    private String nombre;
    private String dni;
    private int edad;
    private double salario;

    //Constructores

    public Empleado() {
        nombre = Utilidades.ponerNombres();
        dni = Utilidades.generarDni();
        edad = (int) ((Math.random()*50 + 1) + 20);
    }
    public Empleado(String nombre, String dni, int edad, double salario) {
        this.nombre = nombre;
        this.dni = dni.toUpperCase();
        this.edad = edad;
    }


    //Gets y Sets


    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // toString


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
