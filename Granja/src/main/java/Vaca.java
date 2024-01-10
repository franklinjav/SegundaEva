public class Vaca {
    //Atributos

    private String nombre;
    private int edad;
    private float peso;
    private float leche;

    //Constructores

    public Vaca() {
        nombre = getNombreVaca();
        edad = (int) (Math.random()*30+1);
        peso = (float) (Math.random()*151+20);
        leche = (float) (Math.random()*10+1);
    }
    public Vaca(String nombre, int edad, float peso, float leche) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.leche = leche;
    }

    //Gets y Sets

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLeche(float leche) {
        this.leche = leche;
    }

    public float getLeche() {
        return leche;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    //Array de nombres

    public static final String[] nombreVaca = {"NombreVaca1", "NombreVaca2","NombreVaca3","NombreVaca4","NombreVaca5","NombreVaca6","NombreVaca7"};

    //Métodos

    public String getNombreVaca() {
        return nombreVaca[(int) (Math.random()*nombreVaca.length)];
    }

    //toString


    @Override
    public String toString() {
        return String.format("Nombre de la vaca: %s\nTengo %d años\nMi peso es: %.2f Kg\nHe producido: %.2f L de leche", nombre, edad, peso, leche);
    }
}
