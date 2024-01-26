package src.main.java.EjeMedicos;

public class MedicoCentroSalud extends Medico{
    //Atributos

    private CentroSalud centro;

    //Constructores


    public MedicoCentroSalud(CentroSalud centro) {
        super();
        this.centro = centro;
    }

    public MedicoCentroSalud(String nombre, int edad, String sexo, double horas, double salario_hora, CentroSalud centro) {
        super(nombre, edad, sexo, horas, salario_hora);
        this.centro = centro;
    }

    //Métodos
    @Override
    public double calcularSalario() {
        return getHoras() * getSalario_hora();
    }

}
