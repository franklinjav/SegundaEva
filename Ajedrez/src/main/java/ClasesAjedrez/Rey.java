package ClasesAjedrez;

public class Rey extends Pieza{
    //Constructores

    public Rey(boolean color) {
        super(color);
    }
    //Métodos

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
