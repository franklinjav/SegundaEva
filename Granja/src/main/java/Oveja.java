public class Oveja extends Animal{

    private float lana;

    //gets y sets******************************************

    public float getLana() {
        return lana;
    }
    public void setLana(float lana) {
        this.lana = lana;
    }

    //Constructores*******************************

    public Oveja() {
        super();
        lana = (float) (Math.random()*6);
    }

    @Override
    public float media() {
        return 0;
    }

    public Oveja(String nombre,int edad, float peso, float lana) {
        super(nombre,edad,peso);
        this.lana = lana;
    }


    //ToString***********************

    public String toString() {
        return super.toString() + String.format("He producido: %.2f Kg de lana",lana);
    }
}
