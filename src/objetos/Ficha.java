package objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Ficha extends JLabel{
    private ImageIcon imagen1, imagen2;
    private int valor;
    public Ficha(int x, int y, ImageIcon imagen1, ImageIcon imagen2, int valor) {
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.valor = valor;
        setIcon(imagen1);
        setBounds(x, y, 70, 70);
        setVisible(true);
    } 
    public  ImageIcon getImagen2() {
        return imagen2;
    } 
    public  int getValor() {
        return valor;
    }     
}
