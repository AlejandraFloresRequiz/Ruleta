package objetos;

import java.awt.Color;
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
    public Conjunto esPar(){
        return numero % 2 == 0 ? Conjunto.PAR : Conjunto.IMPAR;
    }
    public Conjunto color(){
        return super.getColor().equals(Color.BLACK) ? Conjunto.NEGRO : Conjunto.ROJO;
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
}
