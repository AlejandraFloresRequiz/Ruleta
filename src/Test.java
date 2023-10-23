/**
 * @author Denis y Alejandra
 * @version 1
 */

import java.util.*;
import java.awt.Color;
import objetos.Casilla;
import objetos.CasillaEspecial;
import objetos.CasillaNumero;
import objetos.Conjunto;
public class Test{
    // Garantia
    public static void main(String[] args){
        ArrayList<Casilla> casillas = new ArrayList();
        casillas.add(new CasillaNumero("34", new Color(204, 0, 0), 40, 40, 790, 260, 34, Conjunto.FILA_1, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("35", Color.BLACK, 40, 40, 790, 220, 35, Conjunto.FILA_2, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("36", new Color(204, 0, 0), 40, 40, 790, 180, 36, Conjunto.FILA_3, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaEspecial("00", new Color(102,153,255), 60, 40, 310, 180, Conjunto.DOBLE_CERO));
        casillas.add(new CasillaEspecial("0", new Color(102,153,255), 60, 40, 310, 240, Conjunto.CERO));
        casillas.add(new CasillaEspecial("1st 12", new Color(102,153,255), 40, 160, 350, 300, Conjunto.PRIMEROS_DOCE));
        casillas.add(new CasillaEspecial("2nd 12", new Color(102,153,255), 40, 160, 510, 300, Conjunto.SEGUNDOS_DOCE));
        casillas.add(new CasillaEspecial("3rd 12", new Color(102,153,255), 40, 160, 670, 300, Conjunto.TERCEROS_DOCE));
        for(Casilla c : casillas){
            if(c instanceof CasillaNumero){
                CasillaNumero ca = (CasillaNumero)c;
                System.out.println(ca.informacionCasilla());
            }else{
                CasillaEspecial ce = (CasillaEspecial)c;
                System.out.println(ce.informacionCasilla());                
            }
        }
     } 
}
