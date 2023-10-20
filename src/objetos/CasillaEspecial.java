package objetos;

import java.awt.Color;
public class CasillaEspecial extends Casilla{
    private Conjunto conjunto;
    public CasillaEspecial(String texto, Color color, int alto, int ancho, int x, int y ,Conjunto conjunto){
        super(texto, color, alto, ancho, x, y);
        this.conjunto = conjunto;
    }
    public Conjunto getConjunto(){
        return conjunto;
    }
}
