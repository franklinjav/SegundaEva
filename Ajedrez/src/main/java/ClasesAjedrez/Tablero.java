package ClasesAjedrez;

public class Tablero {
    //Atributos

    Pieza[][] tablero = new Pieza[8][8];

    //Constructores

    public Tablero() {
        tablero[0][0] = new Torre(true);
        tablero[0][7] = new Torre(true);
        tablero[7][0] = new Torre(false);
        tablero[7][7] = new Torre(false);
    }

    //Métodos

    public void pintarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] != null) {
                    System.out.print(tablero[i][j].getClass().getSimpleName() + " ");
                } else {
                    System.out.print("nada ");
                }
            }
            System.out.println();
        }
    }

}
