import java.util.Arrays;

public class Granja {
    //Atributos

    private Animal [] animales;

    //Gets y Sets


    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    //Constructores


    public Granja() {
        animales = new Animal[10];
        for (int i = 0; i < animales.length; i++) {
            if (i%2==0) {
                animales[i] = new Vaca();
            } else {
                animales[i] = new Gallina();
            }
        }
    }

    //toStrings


    @Override
    public String toString() {
        return String.format("El array de animales queda de la siguiente manera: %s", Arrays.toString(animales));
    }
}
