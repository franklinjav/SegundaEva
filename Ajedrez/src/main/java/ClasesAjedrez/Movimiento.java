package ClasesAjedrez;

public class Movimiento {
    //Atributos

    Posicion posIni;
    Posicion posFin;

    //Constructores


    public Movimiento() {
        posIni = new Posicion();
        posFin = new Posicion();
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

    public boolean esVertical(Posicion posIni,Posicion posFin) {
        boolean vertical = false;
        if (posIni.getColumna() == posFin.getColumna() && posIni.getFila() != posFin.getFila()) {
            vertical = true;
        }
        return vertical;
    }
    public boolean esHorizontal(Posicion posIni,Posicion posFin) {
        boolean horizontal = false;
        if (posIni.getFila() == posFin.getFila() && posIni.getColumna() != posFin.getColumna()) {
            horizontal = true;
        }
        return horizontal;
    }
    public boolean esDiagonal(Posicion posIni,Posicion posFin) {
        boolean diagonal = false;
        if (Math.abs(posIni.getColumna() - posFin.getColumna()) == Math.abs(posIni.getFila() - posFin.getFila())) {
            diagonal = true;
        }
        return diagonal;
    }
    public int saltoHorizontal(Posicion posIni,Posicion posFin) {
        int cant = 0;
        if (esHorizontal(posIni,posFin)) {
            cant = Math.abs(posIni.getColumna() - posFin.getColumna());
        }
        return cant;
    }
    public int saltoVertical(Posicion posIni,Posicion posFin) {
        int cant = 0;
        if (esVertical(posIni,posFin)) {
            cant = Math.abs(posIni.getFila() - posFin.getFila());
        }
        return cant;
    }
}
