package objetos;

/**
 * @author Denis y Alejandra
 * @version 1
 */

import java.awt.Color;
//Herencia
public class CasillaNumero extends Casilla{
    private int numero;
    private Conjunto a, b, c;
    public CasillaNumero(String texto, Color color, int alto, int ancho, int x, int y, int n, Conjunto a, Conjunto b, Conjunto c){
        super(texto, color, alto, ancho, x, y);
        this.numero = n;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Conjunto tipo(){
        return numero % 2 == 0 ? Conjunto.PAR : Conjunto.IMPAR;
    }
    public Conjunto color(){
        return color.equals(Color.BLACK) ? Conjunto.NEGRO : Conjunto.ROJO;
    }
    public Conjunto getConjuntoA(){
        return a;
    }
    public Conjunto getConjuntoB(){
        return b;
    }
    public Conjunto getConjuntoC(){
        return c;
    } 
    @Override
    public String informacionCasilla(){
        return "Numero: " + numero + "\nTipo: " + tipo().toString() + "\n" + super.informacionCasilla();
    }        
}