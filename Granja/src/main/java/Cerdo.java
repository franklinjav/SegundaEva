public class Cerdo extends Animal {
    //Atributos

    private float comida;

    //Constructores

    public Cerdo() {
        super();
        comida = (float) (Math.random() * 5);
    }

    public Cerdo(String nombre, int edad, float peso, float comida) {
        super(nombre, edad, peso);
        this.comida = comida;
    }

    //Gets y Sets

    public float getComida() {
        return comida;
    }

    public void setComida(float comida) {
        this.comida = comida;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() + String.format("He consumido: %.2f Kg de comida", comida);
    }
}
