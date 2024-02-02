package ClasesAjedrez;

public class Movimiento {
    //Atributos

    Posicion posIni;
    Posicion posFin;

    //Constructores


    public Movimiento() {
    }

    public Movimiento(Posicion posIni, Posicion posFin) {
        this.posIni = posIni;
        this.posFin = posFin;
    }

    //Gets y Sets


    public Posicion getPosIni() {
        return posIni;
    }

    public void setPosIni(Posicion posIni) {
        this.posIni = posIni;
    }

    public Posicion getPosFin() {
        return posFin;
    }

    public void setPosFin(Posicion posFin) {
        this.posFin = posFin;
    }

    //toString


    @Override
    public String toString() {
        return "Movimiento{" +
                "posIni=" + posIni +
                ", posFin=" + posFin +
                '}';
    }

    //Métodos

    public boolean esVertical() {
        boolean vertical = false;
        if (posIni.getColumna() == posFin.getColumna() && posIni.getFila() != posFin.getFila()) {
            vertical = true;
        }
        return vertical;
    }
    public boolean esHorizontal() {
        boolean horizontal = false;
        if (posIni.getFila() == posFin.getFila() && posIni.getColumna() != posFin.getColumna()) {
            horizontal = true;
        }
        return horizontal;
    }
    public boolean esDiagonal() {
        boolean diagonal = false;
        if (Math.abs(posIni.getColumna() - posFin.getColumna()) == Math.abs(posIni.getFila() - posFin.getFila())) {
            diagonal = true;
        }
        return diagonal;
    }
    public int saltoHorizontal(Posicion posIni,Posicion posFin) {
        int cant = 0;
        if (esHorizontal()) {
            cant = posIni.getColumna() - posFin.getColumna();
        }
        return cant;
    }
    public int saltoVertical(Posicion posIni,Posicion posFin) {
        int cant = 0;
        if (esVertical()) {
            cant = posIni.getFila() - posFin.getFila();
        }
        return cant;
    }
}
