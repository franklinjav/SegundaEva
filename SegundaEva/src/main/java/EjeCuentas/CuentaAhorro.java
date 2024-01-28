package src.main.java.EjeCuentas;

public class CuentaAhorro extends CuentaCorriente{
    //Atributos

    private double interes;

    //Constructores

    public CuentaAhorro(Titular titular,String numeroc,double saldo,double interes) {
        super(titular,numeroc,saldo);
        this.interes = interes;
    }
    public CuentaAhorro(Titular titular,String numeroc,double saldo) {
        this(titular,numeroc,saldo,15.3);
    }
    public CuentaAhorro(Titular titular,String numeroc) {
        this(titular,numeroc,15.3,2.5);
    }

    //Gets y Sets

    public double getInteres() {
        return interes;
    }

    //Métodos

    public double calcularInteres() {
        return getSaldo()+getInteres();
    }
}
