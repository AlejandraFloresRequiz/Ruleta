package objetos;

/**
 * @author Denis y Alejandra
 * @version 1
 */

import java.awt.Color;
// Herencia
public class CasillaEspecial extends Casilla{
    private Conjunto conjunto;
    public CasillaEspecial(String texto, Color color, int alto, int ancho, int x, int y ,Conjunto conjunto){
        super(texto, color, alto, ancho, x, y);
        this.conjunto = conjunto;
    }
    public Conjunto getConjunto(){
        return conjunto;
    }
    @Override
    public String informacionCasilla(){
        return "Texto: " + texto + "\nConjunto: " + conjunto.toString() + "\n" + super.informacionCasilla();
    }
}
