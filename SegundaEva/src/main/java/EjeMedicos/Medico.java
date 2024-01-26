package src.main.java.EjeMedicos;

public abstract class Medico {
    //Atributos

    protected String nombre;
    protected int edad;
    protected String sexo;
    protected double horas;
    protected double salario_hora;

    //Constructores


    public Medico() {
        nombre = "Juan";
        edad = 50;
        sexo = "M";
        horas = 8;
        salario_hora = 20;
    }

    public Medico(String nombre, int edad, String sexo, double horas, double salario_hora) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.horas = horas;
        this.salario_hora = salario_hora;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getSalario_hora() {
        return salario_hora;
    }

    public void setSalario_hora(double salario_hora) {
        this.salario_hora = salario_hora;
    }

    //Métodos

    public abstract double calcularSalario();

    //toString


    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", horas=" + horas +
                ", salario_hora=" + salario_hora +
                '}';
    }
}
