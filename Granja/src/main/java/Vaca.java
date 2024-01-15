public class Vaca extends Animal{
    //Atributos
    private float leche;

    //Constructores

    public Vaca() {
        super();
        leche = (float) (Math.random()*15+1);
    }
    public Vaca(String nombre, int edad, float peso, float leche) {
        super(nombre,edad,peso);
        this.leche = leche;
    }

    //Gets y Sets

    public void setLeche(float leche) {
        this.leche = leche;
    }

    public float getLeche() {
        return leche;
    }


    //toString


    @Override
    public String toString() {
        return super.toString() + String.format("He producido: %.2f L de leche",leche);
    }
}
