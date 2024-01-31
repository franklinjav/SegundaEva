package ClasesAjedrez;

public class Juego {
    //Atributos

    private int turno;

    //Gets y Sets


    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    //Métodos

    public Movimiento jugada(String jugada, Tablero tablero) {
        int posix1 = 0;
        int posiy1 = 0;
        int posix2 = 0;
        int posiy2 = 0;
        if ((jugada.toUpperCase().charAt(0) >= 'A' && jugada.toUpperCase().charAt(0) <= 'H' && jugada.toUpperCase().charAt(2) >= 'A' && jugada.toUpperCase().charAt(2) <= 'H') && (jugada.charAt(1) >= '1' && jugada.charAt(1) <= '8' && jugada.charAt(3) >= '1' && jugada.charAt(3) <= '8')) {
            posix1 = jugada.toUpperCase().charAt(0) - 65;
            posiy1 = jugada.charAt(1) - 49;
            posix2 = jugada.toUpperCase().charAt(2) - 65;
            posiy2 = jugada.charAt(3) - 49;
        }
        return new Movimiento(new Posicion(posix1,posiy1),new Posicion(posix2,posiy2));
    }
}
