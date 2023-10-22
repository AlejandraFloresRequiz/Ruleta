
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Color;
import java.security.SecureRandom;
import javax.swing.ImageIcon;
import objetos.Ficha;
import objetos.Casilla;
import objetos.CasillaNumero;
import objetos.CasillaEspecial;
import objetos.Conjunto;
import pantallas.Inicio;
import pantallas.Principal;
public class Juego{
    private int saldo, perdida, apuesta, jugadasGanadas, jugadasPerdidas;
    private Ficha fichaActual;
    private Inicio inicio;
    private Principal principal;
    private ImageIcon icono;
    private SecureRandom sr;
    public Juego(Inicio inicio){
        this.inicio = inicio;
        sr = new SecureRandom();
        saldo = 100 + sr.nextInt(81) * 5;
        perdida = apuesta = jugadasGanadas = jugadasPerdidas = 0;
        fichaActual = null;
        icono = new ImageIcon(getClass().getResource("/imagenes/fichas.png"));
        agregarEventosInicio();
    } 
    private void agregarEventosInicio(){
        inicio.getBtnIniciar().addActionListener((ActionEvent e) -> {
            inicio.dispose();
            principal = new Principal(inicio);
            principal.actulizarSaldo(saldo);
            agregarEventosPrincipal();
            principal.setVisible(true);
            });
        inicio.getBtnVerReglas().addActionListener((ActionEvent e) -> {
            
                
            });
        inicio.getSalir().addActionListener((ActionEvent e) -> {
            System.exit(0);                
            });
    }
    private void agregarEventosPrincipal(){
        principal.getBtnLimpiar().addActionListener((ActionEvent e) -> {
            if(apuesta > 0){
                ArrayList<Casilla> casillas = principal.getCasillas();
                int sumaSaldo = 0;
                for(Casilla c : casillas){
                    sumaSaldo += c.getDinero();
                    c.restablecer();
                }
                saldo += sumaSaldo;
                apuesta = 0;
                principal.actulizarApuesta(apuesta);
                principal.actulizarSaldo(saldo);
            }                
            });
        principal.getBtnHistorial().addActionListener((ActionEvent e) -> {
            
                
            });
        principal.getBtnTerminar().addActionListener((ActionEvent e) -> {
            if(apuesta == 0){
                String m = "Terminaste con un saldo de: " + saldo;
                JOptionPane.showMessageDialog(principal, "<html><font size='5'>"+ m + "</font></html>", "Gracias por jugar :)", 1, icono);
                principal.dispose();
                inicio.setVisible(true);
                //restablecerTodo
            }else{
                JOptionPane.showMessageDialog(principal, "<html><font size='5'>Retira tus fichas del tablero</font></html>", "Antes de retirarte", 1, icono); 
            }              
            });
        principal.getBtnPlay().addActionListener((ActionEvent e) -> {
            if(apuesta > 0){
                principal.bloquearBotones();  
                principal.girarRuleta();
                Timer timer = new Timer(5000, event -> {
                    principal.pararRuleta();
                    principal.desbloquearBotones(); 
                    obtenerResultados(principal.getCasillas()); 
                }); 
                timer.setRepeats(false);  
                timer.start();
            }else{ 
                JOptionPane.showMessageDialog(principal, "<html><font size='5'>No hay dinero en apuesta</font></html>", ":(", 1, icono); 
            }  
                            
        });
            
        for (Casilla c : principal.getCasillas()) {
            c.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (SwingUtilities.isLeftMouseButton(e)) {
                        if(fichaActual != null){
                            apuesta += fichaActual.getValor();
                            saldo -= fichaActual.getValor();                                                          
                            c.agregarFicha(fichaActual);
                            principal.actulizarApuesta(apuesta);
                            principal.actulizarSaldo(saldo);
                            fichaActual = null;
                        }
                    } else if (SwingUtilities.isRightMouseButton(e)) {
                        Ficha aux = c.quitarFicha();
                        if(aux != null){
                            apuesta -= aux.getValor();
                            saldo += aux.getValor();
                            principal.actulizarSaldo(saldo);
                            principal.actulizarApuesta(apuesta);                                          
                        }
                    }
                }
            });
        }
        principal.getFicha5().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(saldo >= 5){
                   fichaActual = principal.getFicha5();
               }else{
                   JOptionPane.showMessageDialog(principal, "<html><font size='5'>Saldo insuficiente</font></html>", ":(", 1, icono);
               }
            }
        });
        principal.getFicha10().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(saldo >= 10){
                   fichaActual = principal.getFicha10();
               }else{
                   JOptionPane.showMessageDialog(principal, "<html><font size='5'>Saldo insuficiente</font></html>", ":(", 1, icono);
               }
            }
        });      
        principal.getFicha15().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(saldo >= 15){
                   fichaActual = principal.getFicha15();
               }else{
                   JOptionPane.showMessageDialog(principal, "<html><font size='5'>Saldo insuficiente</font></html>", ":(", 1, icono);
               }
            }
        });  
        principal.getFicha25().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(saldo >= 25){
                   fichaActual = principal.getFicha25();
               }else{
                   JOptionPane.showMessageDialog(principal, "<html><font size='5'>Saldo insuficiente</font></html>", ":(", 1, icono);
               }
            }
        }); 
        principal.getFicha50().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(saldo >= 50){
                   fichaActual = principal.getFicha50();
               }else{
                   JOptionPane.showMessageDialog(principal, "<html><font size='5'>Saldo insuficiente</font></html>", ":(", 1, icono);
               }
            }
        }); 
        principal.getFicha75().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(saldo >= 75){
                   fichaActual = principal.getFicha75();
               }else{
                   JOptionPane.showMessageDialog(principal, "<html><font size='5'>Saldo insuficiente</font></html>", ":(", 1, icono);
               }
            }
        }); 
    }
    private void obtenerResultados(ArrayList<Casilla> casillas){
        Casilla[] numeros = new Casilla[38];
        CasillaEspecial[] conjuntos = new CasillaEspecial[12];
        int i = 0, j = 0;
        for(Casilla c : casillas){
            if(c instanceof CasillaNumero){
                CasillaNumero n = (CasillaNumero)c;
                numeros[i] = n;
                i++;
            }else{
                CasillaEspecial e = (CasillaEspecial)c;
                if(e.getConjunto().equals(Conjunto.CERO) || e.getConjunto().equals(Conjunto.DOBLE_CERO)){
                    numeros[i] = e;
                    i++;
                }else{
                    conjuntos[j] = e;
                    j++;
                }
            }
        }        
        int indiceAleatorio = sr.nextInt(38);
        Casilla ganador = numeros[indiceAleatorio]; 
        JLabel label = new JLabel(ganador.getText(), SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 80));
        label.setForeground(Color.WHITE);
        label.setBackground(ganador.getColor());
        label.setOpaque(true); 
        JOptionPane.showMessageDialog(principal, label, "Nº", 1, null);
        int ganancia = 0;
        if(ganador instanceof CasillaNumero){
            CasillaNumero n = (CasillaNumero)ganador;
            ganancia += (n.getDinero() * 35) + n.getDinero();
            for(int k = 0; k < conjuntos.length; k++){
                if(conjuntos[k].getDinero() > 0){
                    Conjunto x = conjuntos[k].getConjunto();
                    if(n.color().equals(x) || n.tipo().equals(x) || n.getConjuntoC().equals(x)){
                        ganancia += conjuntos[k].getDinero() * 2;
                    }else if(n.getConjuntoA().equals(x) || n.getConjuntoB().equals(x)){
                        ganancia += (conjuntos[k].getDinero() * 2) + conjuntos[k].getDinero();
                    }
                }
            }
        }else{
            CasillaEspecial g = (CasillaEspecial)ganador;
            ganancia += (g.getDinero() * 35) + g.getDinero();
        }
        if(ganancia > 0){
            JLabel label2 = new JLabel("Ganaste: " + ganancia, SwingConstants.CENTER);
            label2.setFont(new Font("Arial", Font.BOLD, 50));
            //label2.setForeground(Color.GREEN);
            //label2.setBackground(Color.WHITE);
            label2.setOpaque(true); 
            JOptionPane.showMessageDialog(principal, label2, ":)", 1, null);            
        }else{
            JLabel label2 = new JLabel("Perdiste", SwingConstants.CENTER);
            label2.setFont(new Font("Arial", Font.BOLD, 50));
            //label2.setForeground(Color.RED);
            //label2.setBackground(Color.WHITE);
            label2.setOpaque(true); 
            JOptionPane.showMessageDialog(principal, label2, ":(", 1, null);               
        }
        for(Casilla c : casillas){
            c.restablecer();
        }
        saldo += ganancia;
        apuesta = 0;
        fichaActual = null;
        principal.actulizarApuesta(apuesta);
        principal.actulizarSaldo(saldo);
    }
}
