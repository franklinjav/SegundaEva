import java.util.Arrays;

public class Vaca extends Animal{
    //Atributos
    private float [] leche;

    //Constructores

    public Vaca() {
        super();
        leche = new float[7];
        for (int i = 0; i < leche.length; i++) {
            leche[i] = (float) (Math.random()*10+1);
        }
    }
    public Vaca(String nombre, int edad, float peso) {
        super(nombre,edad,peso);
        leche = new float[7];
        for (int i = 0; i < leche.length; i++) {
            leche[i] = (float) (Math.random()*10+1);
        }
    }

    //Gets y Sets

    public void setLeche(float [] leche) {
        this.leche = leche;
    }

    public float[] getLeche() {
        return leche;
    }

    //Métodos
    public float media() {
        float sum = 0;
        for (int i = 0; i < leche.length; i++) {
            sum = sum + leche[i];
        }
        return sum/ leche.length;
    }

    //toString


    @Override
    public String toString() {
        return super.toString() + String.format("Litros de leche producidos en una semana: %s\nLa media de litros de leche es de: %.2f\n", Arrays.toString(leche),media());
    }
}
