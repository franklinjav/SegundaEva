package src.main.java.EjeCuentas;

public class CuentaCorriente {
    //Atributos

    private Titular titular;
    private String numeroc;
    private double saldo;

    //Constructores


    public CuentaCorriente(Titular titular, String numeroc) {
        this.titular = titular;
        this.numeroc = numeroc;
        saldo = 15.3;
    }

    public CuentaCorriente(Titular titular, String numeroc, double saldo) {
        this.titular = titular;
        this.numeroc = numeroc;
        this.saldo = saldo;
    }

    //Gets y Sets


    public Titular getTitular() {
        return titular;
    }

    public String getNumeroc() {
        return numeroc;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //toString

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "titular=" + titular +
                ", numeroc='" + numeroc + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    //Métodos

    public void ingresar(double sumar) {
        saldo = saldo + sumar;
    }
    public void reintegro(double restar) {
        saldo = saldo - restar;
    }
}
