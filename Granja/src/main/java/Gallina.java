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

    //Métodos

    public float media() {
        float sum = 0;
        for (int i = 0; i < huevossemana.length; i++) {
            sum = sum + huevossemana[i];
        }
        return sum/ huevossemana.length;
    }

    //toString

    public String toString() {
        return super.toString() + String.format("Huevos puestos en una semana: %s\nLa media de Huevos es de: %.2f\n", Arrays.toString(huevossemana),media());
    }


}
