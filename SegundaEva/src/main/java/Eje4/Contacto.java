package src.main.java.Eje4;

public class Contacto {
    //Atributos

    private Titular titular;
    private String numero;

    //Constructores


    public Contacto(Titular titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public Contacto() {
        titular = new Titular();
        numero = String.valueOf((int)(Math.random()*99999999));
    }

    //Gets y Sets


    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    //toString


    @Override
    public String toString() {
        return "Contacto{" +
                "titular=" + titular +
                ", numero='" + numero + '\'' +
                '}';
    }
}
