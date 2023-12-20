public class Oveja {
    private String nombre;
    private float peso;
    private int edad;
    private float lana;

    //gets y sets******************************************

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public  float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public float getLana() {
        return lana;
    }
    public void setLana(float lana) {
        this.lana = lana;
    }

    //Constructores*******************************

    public Oveja() {
        nombre = getNombreOveja();
        edad = (int) (Math.random()*21);
        peso = (float) (Math.random()*100 + 10);
        lana = (float) (Math.random()*6);
    }

    public Oveja(String nombre,float peso,int edad,float lana) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.lana = lana;
    }

    //Array de nombres**********************************

    public static final String[] nombres = {"Nombre1", "Nombre2","Nombre3","Nombre4","Nombre5","Nombre6","Nombre7"};


    //Get de Array para sacar nombres

    public static String getNombreOveja() {
        return nombres[(int) (Math.random()*nombres.length)];
    }

    //ToString***********************

    public String toString() {
        return String.format("Nombre de la Oveja: %s\nTengo: %d años\nPeso: %.2f Kg\nHe producido: %.2f Kg de lana",nombre,edad,peso,lana);
    }
}
