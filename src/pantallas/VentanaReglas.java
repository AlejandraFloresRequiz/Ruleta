package pantallas;

/**
 * @author Denis y Alejandra
 * @version 2
 */

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
public class VentanaReglas extends JDialog{
    private JButton jButton1;   
    public VentanaReglas(JFrame padre) {
        super(padre, "REGLAS", true);
        initComponents();
        setLocationRelativeTo(padre);   
    }
    private void initComponents() {
        jButton1 = new JButton("Aceptar");
        JScrollPane jScrollPane1 = new JScrollPane();
        JTextPane jTextPane1 = new JTextPane();
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();

        String textoConFormato = "                                     REGLAS  DEL  JUEGO                             "
                             +"\n"
                             +"\n1. Apuesta a un solo número (Straight-up bet)"     
                             +"\n Fórmula: Ganancia total = (A x 35) + A"
                             +"\n Número asociado: 35"
                             +"\n"
                             +"\n 2. Apuesta a docena o columna (Dozen bet o Column bet)"
                             +"\n Fórmula: Ganancia total = (A x 2) + A"
                             +"\n Número asociado: 2"
                             +"\n"
                             +"\n 3. Apuesta a color (Red/Black bet)" 
                             +"\n Fórmula: Ganancia total = (A x 1) + A"
                             +"\n Número asociado: 1"
                             +"\n"
                             +"\n 4. Apuesta a par o impar (Even/Odd bet)"
                             +"\n Fórmula: Ganancia total = (A x 1) + A"
                             +"\n Número asociado: 1"
                             +"\n"
                             +"\n 5. Apuesta a números bajos o altos (Low/High bet)"
                             +"\n Fórmula: Ganancia total = (A x 1) + A"
                             +"\n Número asociado: 1";
                                                
        
        jTextPane1.setText(textoConFormato);

        jTextPane1.setEditable(false);

        StyleConstants.setBold(attributeSet, true);

        jTextPane1.getStyledDocument().setCharacterAttributes(0, 37, attributeSet, false);


        jTextPane1.setCaretPosition(0);

        jButton1.setText("Aceptar");
      
        jScrollPane1.setViewportView(jTextPane1);

        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        jButton1.addActionListener(e -> {});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(44, 44, 44)))
                .addContainerGap()
           )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(44, 44, 44)
            )
        );
        pack();
    }
    public JButton getAcetar(){
        return jButton1;
    }
}
