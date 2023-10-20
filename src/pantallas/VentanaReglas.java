package pantallas;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
public class VentanaReglas extends JDialog{
    public VentanaReglas() {
        initComponents();
    }

    private void initComponents() {
        JButton jButton1 = new JButton("Aceptar");
        JScrollPane jScrollPane1 = new JScrollPane();
        JTextPane jTextPane1 = new JTextPane();
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();

        // Configura el texto con formato deseado
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
                                                
        
        // Establece el texto en el JTextPane
        jTextPane1.setText(textoConFormato);

         // Deshabilita la edición del JTextArea
        jTextPane1.setEditable(false);

        // Configura el estilo deseado (por ejemplo, negrita)
        StyleConstants.setBold(attributeSet, true);

        // Aplica el estilo al texto deseado
        jTextPane1.getStyledDocument().setCharacterAttributes(0, 37, attributeSet, false);

        jButton1.setText("Aceptar");

        jScrollPane1.setViewportView(jTextPane1);

        // Establece la orientación de la barra de desplazamiento vertical a la derecha
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Deja el ActionListener del botón vacío para que no realice ninguna acción
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

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new VentanaReglas().setVisible(true);
            }
        });
    }
}
