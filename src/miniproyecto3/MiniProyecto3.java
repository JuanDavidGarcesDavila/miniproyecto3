package miniproyecto3;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.GridLayout;

/**
 *
 * @author j5434
 */
public class MiniProyecto3 extends JFrame {
    private JLabel ltitulo;
    private JButton biniciar, bseguir, brandom;
    private JPanel pnorth, pcenter, psouth;

    
    /**
     * Metodo para iniciar y construir la GUI
     */
    private void initComponents()
    {
        
    }
    
    public MiniProyecto3()
    {
        initComponents();
        setSize(680,720);
        setVisible(true);
        setResizable(false);
        setTitle("FPOE - MiniProjecto3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiniProyecto3 miO = new MiniProyecto3();
    }
    
}
