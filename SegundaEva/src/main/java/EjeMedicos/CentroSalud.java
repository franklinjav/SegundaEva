package src.main.java.EjeMedicos;

public class CentroSalud {
    //Atributos

    private int identificador;
    private String nombre;
    private String domicilio;
    private String cod_post;

    //Constructores


    public CentroSalud() {
        identificador = 25;
        nombre = "Elipa";
        domicilio = "Calle de la elipa, 25";
        cod_post = "28017";
    }

    public CentroSalud(int identificador, String nombre, String domicilio, String cod_post) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.cod_post = cod_post;
    }

    //Gets y Sets

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCod_post() {
        return cod_post;
    }

    public void setCod_post(String cod_post) {
        this.cod_post = cod_post;
    }


    //toString

    @Override
    public String toString() {
        return "CentroSalud{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", cod_post='" + cod_post + '\'' +
                '}';
    }
}
