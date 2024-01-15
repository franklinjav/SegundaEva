import java.util.Arrays;

public class Gallina extends Animal{
    //Atributos

    private int [] huevossemana;

    //Constructores

    public Gallina(String nombre, int edad, float peso) {
        super(nombre,edad,peso);
        huevossemana = new int[7];
        for (int i = 0; i < huevossemana.length; i++) {
            huevossemana[i] = (int) (Math.random()*3);
        }
    }
    public Gallina() {
        super();
        huevossemana = new int[7];
        for (int i = 0; i < huevossemana.length; i++) {
            huevossemana[i] = (int) (Math.random()*3);
        }
    }

    //Gets y Sets


    public int[] getHuevossemana() {
        return huevossemana;
    }

    public void setHuevossemana(int[] huevossemana) {
        this.huevossemana = huevossemana;
    }

    public String toString() {
        return super.toString() + String.format("He puesto: %s", Arrays.toString(huevossemana));
    }


}
