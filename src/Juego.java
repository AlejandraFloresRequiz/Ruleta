
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import objetos.Ficha;
import objetos.Casilla;
import pantallas.Inicio;
import pantallas.Principal;
public class Juego{
    private int saldo, perdida, apuesta, jugadasGanadas, jugadasPerdidas;
    private Ficha fichaActual;
    private Inicio inicio;
    private Principal principal;
    public Juego(Inicio inicio){
        this.inicio = inicio;
        saldo = 300;
        perdida = apuesta = jugadasGanadas = jugadasPerdidas = 0;
        fichaActual = null;
        agregarEventosInicio();
    } 
    private void agregarEventosInicio(){
        inicio.getBtnIniciar().addActionListener((ActionEvent e) -> {
            inicio.dispose();
            principal = new Principal(inicio);
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
            
                
            });
        principal.getBtnHistorial().addActionListener((ActionEvent e) -> {
            
                
            });
        principal.getBtnTerminar().addActionListener((ActionEvent e) -> {
            
                
            });
        principal.getBtnPlay().addActionListener((ActionEvent e) -> {
            
                
            });
            
        for (Casilla c : principal.getCasillas()) {
            c.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (SwingUtilities.isLeftMouseButton(e)) {
                        if(fichaActual != null){
                            apuesta += fichaActual.getValor();
                            c.agregarFicha(fichaActual);
                            principal.actulizarApuesta(apuesta);
                            fichaActual = null;
                        }
                    } else if (SwingUtilities.isRightMouseButton(e)) {
                        Ficha aux = c.quitarFicha();
                        if(aux != null){
                            apuesta -= aux.getValor();
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
                   JOptionPane.showMessageDialog(principal, "Saldo insuficiente");
               }
            }
        });
        principal.getFicha10().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(saldo >= 10){
                   fichaActual = principal.getFicha10();
               }else{
                   JOptionPane.showMessageDialog(principal, "Saldo insuficiente");
                }
            }
        });      
        principal.getFicha15().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(saldo >= 15){
                   fichaActual = principal.getFicha15();
               }else{
                   JOptionPane.showMessageDialog(principal, "Saldo insuficiente");
                }
            }
        });  
        principal.getFicha25().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(saldo >= 25){
                   fichaActual = principal.getFicha25();
               }else{
                   JOptionPane.showMessageDialog(principal, "Saldo insuficiente");
                }
            }
        }); 
        principal.getFicha50().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(saldo >= 50){
                   fichaActual = principal.getFicha50();
               }else{
                   JOptionPane.showMessageDialog(principal, "Saldo insuficiente");
                }
            }
        }); 
        principal.getFicha75().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(saldo >= 75){
                   fichaActual = principal.getFicha75();
               }else{
                   JOptionPane.showMessageDialog(principal, "Saldo insuficiente");
                }
            }
        }); 
    }
    
}
