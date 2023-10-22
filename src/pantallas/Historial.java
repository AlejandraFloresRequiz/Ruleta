package pantallas;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Historial extends JDialog {
    private JTextField[] inputFields;
    private String[] partida;
    private DefaultTableModel modelo;
    private JTable tabla;
    private JButton aceptar;
    private JPanel panel, btnPanel; // Panel adicional para el botón
    
    public Historial(Frame parent, int numeroPartida, ArrayList<String[]> partidas) {
        super(parent, "Partida " + numeroPartida, true);
        iniciarComponentes(partidas);
        setSize(300, 150);
        setVisible(true);
    }
    
    public String[] getPartida() {
        return partida;
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
        
        JScrollPane scrollPane = new JScrollPane(tabla);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Creando el botón aceptar y añadiéndolo a un panel adicional
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
