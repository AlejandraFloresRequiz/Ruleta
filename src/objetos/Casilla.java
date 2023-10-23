package objetos;

/**
 * @author Denis y Alejandra
 * @version 1
 */

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.util.Stack;
public class Casilla extends JButton implements FuncionesCasilla{
    // Encapsulamiento
    protected String texto;
    protected Color color;
    private int alto, ancho, x, y;
    protected int dinero;
    private Stack<Ficha> fichas;
    public Casilla(String texto, Color color, int alto, int ancho, int x, int y){
        this.texto = texto;
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
        this.x = x;
        this.y = y;
        fichas = new Stack();
        dinero = 0;
        
        setText(texto);
        setForeground(Color.WHITE);
        setFont(new Font("Segoe UI", 1, 24));        
        setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        setBackground(color);
        setBounds(x, y, ancho, alto);        
    }  
    public int getDinero(){
        return dinero;
    }
    public String getTexto(){
        return texto;
    }
    public Color getColor(){
        return color;
    }
    public void agregarFicha(Ficha f){
        dinero += f.getValor();
        fichas.add(f);
        actualizarCasilla();
    } 
    public Ficha quitarFicha(){
        if(!fichas.isEmpty()){
            Ficha f = fichas.pop();
            dinero -= f.getValor();
            actualizarCasilla();
            return f;
        }else{
            return null;
        }
    }
    private void actualizarCasilla(){
        if(!fichas.isEmpty()){
            setText(null);
            setIcon(fichas.peek().getImagen2());
        }else{
            restablecer();
        }        
    }
    public void restablecer(){
        setIcon(null);
        setText(texto);
        setFont(new Font("Segoe UI", 1, 24));
        setBackground(color);
        setBorder(BorderFactory.createLineBorder(Color.WHITE, 2)); 
        fichas.clear();
        dinero = 0;
    }
    public String informacionCasilla(){
        String c = color.equals(Color.BLACK) ? "Negro" : color.equals(new Color(204, 0, 0)) ? "Rojo" : "Celeste";
        return "Color: " + c + "\nDinero: " + dinero;
    }
}