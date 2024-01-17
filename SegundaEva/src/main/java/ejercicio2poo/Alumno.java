package src.main.java.ejercicio2poo;

public class Alumno {
    //Atributos

    private Asignatura matematicas;
    private Asignatura fisica;
    private Asignatura quimica;

    //Constructores

    public Alumno(Asignatura matematicas,Asignatura fisica,Asignatura quimica) {
        this.matematicas = matematicas;
        this.fisica = fisica;
        this.quimica = quimica;
    }
    public Alumno(int matematicas, int fisica, int quimica) {
        this.matematicas = new Asignatura(matematicas);
        this.fisica = new Asignatura(fisica);
        this.quimica = new Asignatura(quimica);
    }
}
