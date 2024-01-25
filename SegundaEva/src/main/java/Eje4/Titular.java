package src.main.java.Eje4;

public class Titular {
    //Atributos
    private String nombre;
    private String correo;

    //Constructores

    public Titular() {
        nombre = "Aleatorio";
        correo = nombre.concat("@gmail.com");
    }

    public Titular(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    //Gets y Sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //toString

    @Override
    public String toString() {
        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
