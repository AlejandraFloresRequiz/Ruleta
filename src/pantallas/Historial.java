package pantallas;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
public class Historial extends JDialog {
    private DefaultTableModel modelo;
    private JTable tabla;
    private JButton aceptar;
    private JPanel panel, btnPanel;
    
    public Historial(JFrame padre, ArrayList<String[]> partidas) {
        super(padre, "HISTORIAL", true);
        iniciarComponentes(partidas);
        setLocationRelativeTo(padre);   
        setSize(300, 200);
    }
    private void iniciarComponentes(ArrayList<String[]> partidas) {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        modelo = new DefaultTableModel();
        modelo.addColumn("Nº");
        modelo.addColumn("APUESTA");
        modelo.addColumn("SALDO");
        modelo.addColumn("Nº GANADOR");
        modelo.addColumn("GANASTE");
        tabla = new JTable(modelo);
        
        for (String[] fila : partidas) {
             modelo.addRow(fila);
        }
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i = 0; i < tabla.getColumnCount(); i++){
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
        JScrollPane scrollPane = new JScrollPane(tabla);
        panel.add(scrollPane, BorderLayout.CENTER);

   
        aceptar = new JButton("Aceptar");
        btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnPanel.add(aceptar);
        panel.add(btnPanel, BorderLayout.SOUTH);

        this.add(panel);
    }
    public JButton getAceptar(){
        return aceptar;
    }
}
