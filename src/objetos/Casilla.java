package objetos;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.util.Stack;
public class Casilla extends JButton{
    private String texto;
    private Color color;
    private int alto, ancho, x, y, dinero;
    private boolean seleccionado;
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
        seleccionado = false;
        
        setText(texto);
        setForeground(Color.WHITE);
        setFont(new Font("Segoe UI", 1, 24));        
        setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        setBackground(color);
        setBounds(x, y, ancho, alto);        
    }
    public Color getColor(){
        return color;
    }
    public int getDinero(){
        return dinero;
    }
    public boolean getSeleccionado(){
        return seleccionado;
    }   
    public void sumarDinero(int d){
        dinero += d;        
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
    private void restablecer(){
        setIcon(null);
        setText(texto);
        setFont(new Font("Segoe UI", 1, 24));
        setBackground(color);
        setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));        
    }
}
