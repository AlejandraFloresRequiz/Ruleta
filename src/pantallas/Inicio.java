package pantallas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
public class Inicio extends JFrame{
    private JButton btnIniciar, btnVerReglas, salir;
    private JLabel fondo, bienvenido;
    private JPanel panel;
    public Inicio(){
        iniciarComponentes();
        this.setSize(716, 512);
        this.setVisible(true);
        this.setResizable(true);
        this.setTitle("RULETA");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);        
    } 
    private void iniciarComponentes(){        
        this.setLayout(null);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 700, 473);

        bienvenido = new JLabel("Bienvenido...");
        bienvenido.setForeground(new Color(102, 255, 102));
        bienvenido.setHorizontalAlignment(SwingConstants.CENTER);
        bienvenido.setHorizontalTextPosition(SwingConstants.CENTER);        
        bienvenido.setForeground(new Color(102,255,102));
        bienvenido.setFont(new Font("Segoe UI", 1, 40));
        bienvenido.setBounds(380, 20, 330, 70);        
        panel.add(bienvenido);        
        
        btnIniciar = new JButton("Iniciar juego");        
        btnIniciar.setFont(new Font("Segoe UI", 1, 18));
        btnIniciar.setBounds(290, 180, 140, 50);
        panel.add(btnIniciar);
        
        btnVerReglas = new JButton("Ver reglas del juego");
        btnVerReglas.setFont(new Font("Segoe UI", 1, 18));
        btnVerReglas.setBounds(250, 290, 210, 50);
        panel.add(btnVerReglas);
        
        salir = new JButton("Salir");
        salir.setFont(new Font("Segoe UI", 1, 12)); 
        salir.setBounds(600, 420, 80, 30);
        panel.add(salir);        
       
        fondo = new JLabel();
        fondo.setBounds(0, 0, 700, 473);
        fondo.setIcon(new ImageIcon(getClass().getResource("/imagenes/inicio.jpg")));    
        panel.add(fondo);
        
        this.getContentPane().add(panel);
    } 
    public JButton getBtnIniciar(){
        return btnIniciar;
    }
    public JButton getBtnVerReglas(){
        return btnVerReglas;
    }
    public JButton getSalir(){
        return salir;
    }
} 

