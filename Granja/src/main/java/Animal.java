public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected float peso;

    //Gets y Sets

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //Constructores


    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public Animal() {
        nombre = Utilidades.getNombres();
        edad = (int) (Math.random()*10+1);
        peso = (float) (Math.random()*100+1);
    }

    //toString

    public String toString() {
        return String.format("Nombre: %s\nTengo %d años\nMi peso es: %.2f Kg\n", nombre, edad, peso);
    }
}
