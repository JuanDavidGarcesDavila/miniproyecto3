package miniproyecto3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.GridLayout;

/**
 *
 * @author j5434
 */
public class MiniProyecto3 extends JFrame {
    private JLabel lTitulo, lTempgrid, lTempletras;
    private JButton bIniciar, bSeguir, bRandom, bCheck;
    private JPanel pNorth, pCenter, pSouth, pRecibeletras, pLetras, pIniciar, pTitulo, pSeguir;

    
    /**
     * Metodo para iniciar y construir la GUI
     */
    private void initComponents()
    {
        lTitulo= new JLabel("Juego de Palabras");
        bIniciar= new JButton();
        bSeguir= new JButton();
        bRandom= new JButton();
        pNorth= new JPanel(new GridLayout(1,3));
        pCenter= new JPanel(new FlowLayout());
        pSouth= new JPanel(new FlowLayout());
        pRecibeletras= new JPanel();
        pLetras= new JPanel();
        bCheck= new JButton();
        lTempgrid= new JLabel("aquí van a haber filas");
        lTempletras= new JLabel("aquí van a haber letras random");
        pIniciar= new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
        pTitulo= new JPanel(new FlowLayout(FlowLayout.CENTER,30,30));
        pSeguir= new JPanel(new FlowLayout(FlowLayout.RIGHT,10,10));
        
        //agregar componentes a los paneles
        pNorth.add(pIniciar);
        pNorth.add(pTitulo);
        pNorth.add(pSeguir);
        
        pSouth.add(pRecibeletras); 
        pSouth.add(pLetras); 
        pSouth.add(bRandom);
        
        pRecibeletras.add(lTempgrid);
        pRecibeletras.add(bCheck);
        
        pLetras.add(lTempletras);
        
        pIniciar.add(bIniciar);
        pTitulo.add(lTitulo);
        pSeguir.add(bSeguir);
        
        //se editan los botones para darle una mejor vista
        bIniciar.setIcon(new ImageIcon("src\\miniproyecto3\\startbutton.png"));
        bIniciar.setBackground(Color.WHITE);
        bSeguir.setIcon(new ImageIcon("src\\miniproyecto3\\followbutton.png"));
        bSeguir.setBackground(Color.WHITE);
        bRandom.setIcon(new ImageIcon("src\\miniproyecto3\\randombutton.png"));
        bRandom.setBackground(Color.WHITE);
        bCheck.setIcon(new ImageIcon("src\\miniproyecto3\\checkbutton.png"));
        bCheck.setBackground(Color.WHITE);
        
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
