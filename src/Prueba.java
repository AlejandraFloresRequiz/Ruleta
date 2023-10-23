/**
 * @author Denis y Alejandra
 * @version 2
 */

import pantallas.Inicio;
import javax.swing.UIManager;
public class Prueba{
    public static void main(String... args){
        try {
            UIManager.setLookAndFeel(new com.jtattoo.plaf.aluminium.AluminiumLookAndFeel());      
            Inicio i = new Inicio();
            Juego j = new Juego(i);
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
}
        
