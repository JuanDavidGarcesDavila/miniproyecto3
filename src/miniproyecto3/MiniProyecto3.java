package miniproyecto3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.GridLayout;

/**
 *
 * @author j5434
 */
public class MiniProyecto3 extends JFrame {
    private JLabel lTitulo;
    private JButton bIniciar, bSeguir, bRandom;
    private JPanel pNorth, pCenter, pSouth, pRecibeletras, pLetras;

    
    /**
     * Metodo para iniciar y construir la GUI
     */
    private void initComponents()
    {
        lTitulo= new JLabel("Juego de Palabras");
        bIniciar= new JButton();
        bSeguir= new JButton();
        bRandom= new JButton();
        pNorth= new JPanel(new FlowLayout());
        pCenter= new JPanel(new FlowLayout());
        pSouth= new JPanel(new FlowLayout());
        pRecibeletras= new JPanel();
        pLetras= new JPanel();
        
        //agregar componentes a los paneles
        pNorth.add(bIniciar);
        pNorth.add(lTitulo);
        pNorth.add(bSeguir);
        
        pSouth.add(pRecibeletras); 
        pSouth.add(pLetras); 
        pSouth.add(bRandom);
        
        //
        
        
        
        //se agrega componentes al frame
        setLayout(new BorderLayout());
        add(pNorth, BorderLayout.NORTH);
        add(pCenter, BorderLayout.CENTER);
        add(pSouth, BorderLayout.SOUTH);
        
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
