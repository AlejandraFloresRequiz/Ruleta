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
public class Principal extends JFrame{
    private JButton btnTerminar, btnLimpiar, btnPlay, btnHistorial;
    private JLabel apuesta, saldo, ruleta;
    private JTextField cajaApuesta, cajaSaldo;
    private JPanel panel;
    public Principal(Inicio padre){
        iniciarComponentes();
        this.setSize(850, 650);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("RULETA");
        this.setLocationRelativeTo(padre);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);        
    } 
    private void iniciarComponentes(){        
        this.setLayout(null);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 834, 611);
        panel.setBackground(new Color(0,153,51));

        btnTerminar = new JButton("Terminar");        
        btnTerminar.setBackground(new Color(10, 232, 243));
        btnTerminar.setFont(new Font("Segoe UI", 1, 18));
        btnTerminar.setBounds(25, 25, 130, 40);
        btnTerminar.setBorderPainted(false);
        panel.add(btnTerminar);        
                
        apuesta = new JLabel("Apuesta: ");
        apuesta.setHorizontalAlignment(SwingConstants.CENTER);
        apuesta.setHorizontalTextPosition(SwingConstants.CENTER);        
        apuesta.setForeground(Color.BLACK);
        apuesta.setFont(new Font("Segoe UI", 1, 20));
        apuesta.setBounds(200, 30, 200, 70);        
        panel.add(apuesta);         
        
        cajaApuesta = new JTextField("$ 0000");
        cajaApuesta.setEditable(false); 
        cajaApuesta.setAlignmentX(CENTER_ALIGNMENT); 
        cajaApuesta.setAlignmentY(CENTER_ALIGNMENT);
        cajaApuesta.setForeground(Color.BLACK);
        cajaApuesta.setFont(new Font("Segoe UI", 1, 20));
        cajaApuesta.setBounds(350, 50, 100, 30);                 
        panel.add(cajaApuesta); 

        saldo = new JLabel("Saldo: ");
        saldo.setHorizontalAlignment(SwingConstants.CENTER);
        saldo.setHorizontalTextPosition(SwingConstants.CENTER);        
        saldo.setForeground(Color.BLACK);
        saldo.setFont(new Font("Segoe UI", 1, 20));
        saldo.setBounds(500, 30, 200, 70);        
        panel.add(saldo);         
        
        cajaSaldo = new JTextField("$ 0000");
        cajaSaldo.setEditable(false); 
        cajaSaldo.setAlignmentX(CENTER_ALIGNMENT); 
        cajaSaldo.setAlignmentY(CENTER_ALIGNMENT);
        cajaSaldo.setForeground(Color.BLACK);
        cajaSaldo.setFont(new Font("Segoe UI", 1, 20));
        cajaSaldo.setBounds(636, 50, 100, 30);                 
        panel.add(cajaSaldo);

        ruleta = new JLabel();
        ruleta.setBounds(50, 170, 288, 288);        
        ruleta.setIcon(new ImageIcon(getClass().getResource("/imagenes/ruleta.gif")));    
        panel.add(ruleta);
        
        btnPlay = new JButton("Play");        
        btnPlay.setBackground(new Color(10, 232, 243));
        btnPlay.setFont(new Font("Segoe UI", 1, 18));
        btnPlay.setBounds(110, 450, 80, 40);
        btnPlay.setBorderPainted(false);
        panel.add(btnPlay);      
                
        btnHistorial = new JButton("Historial");        
        btnHistorial.setBackground(new Color(10, 232, 243));
        btnHistorial.setFont(new Font("Segoe UI", 1, 18));
        btnHistorial.setBounds(310, 550, 120, 40);
        btnHistorial.setBorderPainted(false);
        panel.add(btnHistorial);   
        
        btnLimpiar = new JButton("Limpiar");        
        btnLimpiar.setBackground(new Color(10, 232, 243));
        btnLimpiar.setFont(new Font("Segoe UI", 1, 18));
        btnLimpiar.setBounds(610, 550, 120, 40);
        btnLimpiar.setBorderPainted(false);
        panel.add(btnLimpiar);          
              
        JLabel a = new JLabel();
        a.setBounds(200, 450, 50, 50);        
        a.setIcon(new ImageIcon(getClass().getResource("/imagenes/5.png")));    
        panel.add(a);        

        this.getContentPane().add(panel);
    } 

} 