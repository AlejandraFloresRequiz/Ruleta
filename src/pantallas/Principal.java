package pantallas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.util.ArrayList;
import objetos.Casilla;
import objetos.CasillaNumero;
import objetos.CasillaEspecial;
import objetos.Conjunto;
import objetos.Ficha;
public class Principal extends JFrame{
    private JButton btnTerminar, btnLimpiar, btnPlay, btnHistorial;
    private Ficha f5, f10, f15, f25, f50, f75;
    private ArrayList<Casilla> casillas;
    private JLabel apuesta, saldo, ruleta;
    private JTextField cajaApuesta, cajaSaldo;
    private JPanel panel;
    public Principal(Inicio padre){
        crearCasillas();
        iniciarComponentes();
        this.setSize(930, 650);
        this.setVisible(false);
        this.setResizable(false);
        this.setTitle("RULETA");
        this.setLocationRelativeTo(padre);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);        
    } 
    private void crearCasillas(){
        casillas = new ArrayList();
        casillas.add(new CasillaNumero("1", new Color(204, 0, 0), 40, 40, 350, 260, 1, Conjunto.FILA_1, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("2", Color.BLACK, 40, 40, 350, 220, 2, Conjunto.FILA_2, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("3", new Color(204, 0, 0), 40, 40, 350, 180, 3, Conjunto.FILA_3, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("4", Color.BLACK, 40, 40, 390, 260, 4, Conjunto.FILA_1, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("5", new Color(204, 0, 0), 40, 40, 390, 220, 5, Conjunto.FILA_2, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("6", Color.BLACK, 40, 40, 390, 180, 6, Conjunto.FILA_3, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("7", new Color(204, 0, 0), 40, 40, 430, 260, 4, Conjunto.FILA_1, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("8", Color.BLACK, 40, 40, 430, 220, 5, Conjunto.FILA_2, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("9", new Color(204, 0, 0), 40, 40, 430, 180, 6, Conjunto.FILA_3, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("10", Color.BLACK, 40, 40, 470, 260, 10, Conjunto.FILA_1, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("11", Color.BLACK, 40, 40, 470, 220, 11, Conjunto.FILA_2, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("12", new Color(204, 0, 0), 40, 40, 470, 180, 12, Conjunto.FILA_3, Conjunto.PRIMEROS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("13", Color.BLACK, 40, 40, 510, 260, 13, Conjunto.FILA_1, Conjunto.SEGUNDOS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("14", new Color(204, 0, 0), 40, 40, 510, 220, 14, Conjunto.FILA_2, Conjunto.SEGUNDOS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("15", Color.BLACK, 40, 40, 510, 180, 15, Conjunto.FILA_3, Conjunto.SEGUNDOS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("16", new Color(204, 0, 0), 40, 40, 550, 260, 16, Conjunto.FILA_1, Conjunto.SEGUNDOS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("17", Color.BLACK, 40, 40, 550, 220, 17, Conjunto.FILA_2, Conjunto.SEGUNDOS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("18", new Color(204, 0, 0), 40, 40, 550, 180, 18, Conjunto.FILA_3, Conjunto.SEGUNDOS_DOCE, Conjunto.BAJO));
        casillas.add(new CasillaNumero("19", new Color(204, 0, 0), 40, 40, 590, 260, 19, Conjunto.FILA_1, Conjunto.SEGUNDOS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("20", Color.BLACK, 40, 40, 590, 220, 20, Conjunto.FILA_2, Conjunto.SEGUNDOS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("21", new Color(204, 0, 0), 40, 40, 590, 180, 21, Conjunto.FILA_3, Conjunto.SEGUNDOS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("22", Color.BLACK, 40, 40, 630, 260, 22, Conjunto.FILA_1, Conjunto.SEGUNDOS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("23", new Color(204, 0, 0), 40, 40, 630, 220, 23, Conjunto.FILA_2, Conjunto.SEGUNDOS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("24", Color.BLACK, 40, 40, 630, 180, 24, Conjunto.FILA_3, Conjunto.SEGUNDOS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("25", new Color(204, 0, 0), 40, 40, 670, 260, 25, Conjunto.FILA_1, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("26", Color.BLACK, 40, 40, 670, 220, 26, Conjunto.FILA_2, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("27", new Color(204, 0, 0), 40, 40, 670, 180, 27, Conjunto.FILA_3, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("28", Color.BLACK, 40, 40, 710, 260, 28, Conjunto.FILA_1, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("29", Color.BLACK, 40, 40, 710, 220, 29, Conjunto.FILA_2, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("30", new Color(204, 0, 0), 40, 40, 710, 180, 30, Conjunto.FILA_3, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("31", Color.BLACK, 40, 40, 750, 260, 31, Conjunto.FILA_1, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("32", new Color(204, 0, 0), 40, 40, 750, 220, 32, Conjunto.FILA_2, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("33", Color.BLACK, 40, 40, 750, 180, 33, Conjunto.FILA_3, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("34", new Color(204, 0, 0), 40, 40, 790, 260, 34, Conjunto.FILA_1, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("35", Color.BLACK, 40, 40, 790, 220, 35, Conjunto.FILA_2, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaNumero("36", new Color(204, 0, 0), 40, 40, 790, 180, 36, Conjunto.FILA_3, Conjunto.TERCEROS_DOCE, Conjunto.ALTO));
        casillas.add(new CasillaEspecial("00", new Color(102,153,255), 60, 40, 310, 180, Conjunto.DOBLE_CERO));
        casillas.add(new CasillaEspecial("0", new Color(102,153,255), 60, 40, 310, 240, Conjunto.CERO));
        casillas.add(new CasillaEspecial("1st 12", new Color(102,153,255), 40, 160, 350, 300, Conjunto.PRIMEROS_DOCE));
        casillas.add(new CasillaEspecial("2nd 12", new Color(102,153,255), 40, 160, 510, 300, Conjunto.SEGUNDOS_DOCE));
        casillas.add(new CasillaEspecial("3rd 12", new Color(102,153,255), 40, 160, 670, 300, Conjunto.TERCEROS_DOCE));
        casillas.add(new CasillaEspecial("2to1", new Color(102,153,255), 40, 60, 830, 260, Conjunto.FILA_1));
        casillas.add(new CasillaEspecial("2to1", new Color(102,153,255), 40, 60, 830, 220, Conjunto.FILA_2));
        casillas.add(new CasillaEspecial("2to1", new Color(102,153,255), 40, 60, 830, 180, Conjunto.FILA_3));
        casillas.add(new CasillaEspecial("1-18", new Color(102,153,255), 40, 80, 350, 340, Conjunto.BAJO));
        casillas.add(new CasillaEspecial("EVEN", new Color(102,153,255), 40, 80, 430, 340, Conjunto.PAR));
        casillas.add(new CasillaEspecial("", new Color(204, 0, 0), 40, 80, 510, 340, Conjunto.ROJO));
        casillas.add(new CasillaEspecial("", Color.BLACK, 40, 80, 590, 340, Conjunto.NEGRO));
        casillas.add(new CasillaEspecial("ODD", new Color(102,153,255), 40, 80, 670, 340, Conjunto.IMPAR));
        casillas.add(new CasillaEspecial("19-36", new Color(102,153,255), 40, 80, 750, 340, Conjunto.ALTO));  
    }
    private void iniciarComponentes(){        
        this.setLayout(null);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 914, 611);
        panel.setBackground(new Color(0,153,51));

        btnTerminar = new JButton("Terminar");        
        //btnTerminar.setBackground(new Color(10, 232, 243));
        btnTerminar.setFont(new Font("Segoe UI", 1, 18));
        btnTerminar.setBounds(25, 25, 130, 40);
        btnTerminar.setBorderPainted(false);
        panel.add(btnTerminar);        
                
        apuesta = new JLabel("Apuesta: ");
        apuesta.setHorizontalAlignment(SwingConstants.CENTER);
        apuesta.setHorizontalTextPosition(SwingConstants.CENTER);        
        apuesta.setForeground(Color.BLACK);
        apuesta.setFont(new Font("Segoe UI", 1, 20));
        apuesta.setBounds(300, 30, 200, 70);        
        panel.add(apuesta);         
        
        cajaApuesta = new JTextField("$0000");
        cajaApuesta.setEditable(false); 
        cajaApuesta.setHorizontalAlignment(JTextField.CENTER);
        cajaApuesta.setForeground(Color.BLACK);
        cajaApuesta.setFont(new Font("Segoe UI", 1, 20));
        cajaApuesta.setBounds(450, 50, 100, 30);                 
        panel.add(cajaApuesta); 

        saldo = new JLabel("Saldo: ");
        saldo.setHorizontalAlignment(SwingConstants.CENTER);
        saldo.setHorizontalTextPosition(SwingConstants.CENTER);        
        saldo.setForeground(Color.BLACK);
        saldo.setFont(new Font("Segoe UI", 1, 20));
        saldo.setBounds(600, 30, 200, 70);        
        panel.add(saldo);         
        
        cajaSaldo = new JTextField("$0000");
        cajaSaldo.setEditable(false); 
        cajaSaldo.setHorizontalAlignment(JTextField.CENTER);
        cajaSaldo.setForeground(Color.BLACK);
        cajaSaldo.setFont(new Font("Segoe UI", 1, 20));
        cajaSaldo.setBounds(736, 50, 100, 30);                 
        panel.add(cajaSaldo);

        ruleta = new JLabel();
        ruleta.setBounds(50, 140, 288, 288);        
        ruleta.setIcon(new ImageIcon(getClass().getResource("/imagenes/ruletaQuieta.png")));   
        panel.add(ruleta);
        
        btnPlay = new JButton("Play");        
        //btnPlay.setBackground(new Color(10, 232, 243));
        btnPlay.setFont(new Font("Segoe UI", 1, 18));
        btnPlay.setBounds(110, 420, 80, 40);
        btnPlay.setBorderPainted(false);
        panel.add(btnPlay);      
                
        btnHistorial = new JButton("Historial");        
        //btnHistorial.setBackground(new Color(10, 232, 243));
        btnHistorial.setFont(new Font("Segoe UI", 1, 18));
        btnHistorial.setBounds(400, 540, 120, 40);
        btnHistorial.setBorderPainted(false);
        panel.add(btnHistorial);   
        
        btnLimpiar = new JButton("Limpiar");        
        //btnLimpiar.setBackground(new Color(10, 232, 243)); 
        btnLimpiar.setFont(new Font("Segoe UI", 1, 18));
        btnLimpiar.setBounds(700, 540, 120, 40);
        btnLimpiar.setBorderPainted(false);
        panel.add(btnLimpiar);          
        
        ImageIcon g5 = new ImageIcon(getClass().getResource("imagenes/5x.png"));
        ImageIcon s5 = new ImageIcon(getClass().getResource("imagenes/5s.png"));        
        f5 = new Ficha(320, 430, g5, s5, 5);
        panel.add(f5);   
        
        ImageIcon g10 = new ImageIcon(getClass().getResource("imagenes/10x.png"));
        ImageIcon s10 = new ImageIcon(getClass().getResource("imagenes/10s.png"));        
        f10 = new Ficha(420, 430, g10, s10, 10);
        panel.add(f10);               

        ImageIcon g15 = new ImageIcon(getClass().getResource("imagenes/15x.png"));
        ImageIcon s15 = new ImageIcon(getClass().getResource("imagenes/15s.png"));        
        f15 = new Ficha(520, 430, g15, s15, 15);
        panel.add(f15); 

        ImageIcon g25 = new ImageIcon(getClass().getResource("imagenes/25x.png"));
        ImageIcon s25 = new ImageIcon(getClass().getResource("imagenes/25s.png"));        
        f25 = new Ficha(620, 430, g25, s25, 25);
        panel.add(f25); 
        
        ImageIcon g50 = new ImageIcon(getClass().getResource("imagenes/50x.png"));
        ImageIcon s50 = new ImageIcon(getClass().getResource("imagenes/50s.png"));        
        f50 = new Ficha(720, 430, g50, s50, 50);
        panel.add(f50);        

        ImageIcon g75 = new ImageIcon(getClass().getResource("imagenes/75x.png"));
        ImageIcon s75 = new ImageIcon(getClass().getResource("imagenes/75s.png"));        
        f75 = new Ficha(820, 430, g75, s75, 75);
        panel.add(f75);    

        for(Casilla c : casillas){
            panel.add(c);
        }
        
        this.getContentPane().add(panel);
    } 
    public void bloquearBotones(){
        for(Casilla c : casillas){
            c.setEnabled(false);
        }
        btnTerminar.setEnabled(false);
        btnLimpiar.setEnabled(false);
        btnPlay.setEnabled(false);
        btnHistorial.setEnabled(false);
    }
    public void desbloquearBotones(){
        for(Casilla c : casillas){
            c.setEnabled(true);
        }
        btnTerminar.setEnabled(true);
        btnLimpiar.setEnabled(true);
        btnPlay.setEnabled(true);
        btnHistorial.setEnabled(true);
    }
    public void actulizarApuesta(int a){
        cajaApuesta.setText("$" + String.valueOf(a));
    }
    public void actulizarSaldo(int a){
        cajaSaldo.setText("$" + String.valueOf(a));
    }
    public void girarRuleta(){
        ruleta.setIcon(new ImageIcon(getClass().getResource("/imagenes/ruleta.gif")));
    }
    public void pararRuleta(){
        ruleta.setIcon(new ImageIcon(getClass().getResource("/imagenes/ruletaQuieta.png")));
    }
    public JButton getBtnTerminar(){
        return btnTerminar;
    }
    public JButton getBtnLimpiar(){
        return btnLimpiar;
    }
    public JButton getBtnPlay(){
        return btnPlay;
    }
    public JButton getBtnHistorial(){
        return btnHistorial;
    }    
    public ArrayList<Casilla> getCasillas(){
        return casillas;
    }    
    public Ficha getFicha5(){
        return f5;
    }
    public Ficha getFicha10(){
        return f10;
    }
    public Ficha getFicha15(){
        return f15;
    }
    public Ficha getFicha25(){
        return f25;
    }
    public Ficha getFicha50(){
        return f50;
    }
    public Ficha getFicha75(){
        return f75;
    }
} 
