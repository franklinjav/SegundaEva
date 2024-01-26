package src.main.java.EjeMedicos;

import java.util.Arrays;

public class MedicoAsistenciaDomiciliaria extends Medico{
    //Atributos

    private int[] km_visita;
    private double tarifakm;

    //Constructores


    public MedicoAsistenciaDomiciliaria() {
        km_visita = new int[31];
        for (int i = 0; i < km_visita.length; i++) {
            km_visita[i] = (int) (Math.random()*50+1);
        }
        tarifakm = 2;
    }

    public MedicoAsistenciaDomiciliaria(String nombre, int edad, String sexo, double horas, double salario_hora, int[] km_visita, double tarifakm) {
        super(nombre, edad, sexo, horas, salario_hora);
        this.km_visita = km_visita;
        this.tarifakm = tarifakm;
    }

    //Métodos
    @Override
    public double calcularSalario() {
        int sum = 0;
        for (int i = 0; i < km_visita.length; i++) {
            sum = sum + km_visita[i];
        }
        return sum*tarifakm;
    }

    //toSting


    @Override
    public String toString() {
        return super.toString() + String.format("Los kilometros recorridos cada día del mes son:\n" + Arrays.toString(km_visita));
    }
}
