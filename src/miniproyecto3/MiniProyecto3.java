package miniproyecto3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

/*
 * @author juan.david.garces@correounivalle.edu.co
 *          No olvides poner tu correo
 */
public class MiniProyecto3 extends JFrame {
    private JLabel lTitulo, lTempgrid, lTempletras;
    private JButton bIniciar, bSeguir, bRandom, bCheck;
    private JPanel pNorth, pCenter, pSouth, pRecibeletras, pLetras, pIniciar, pTitulo, pSeguir;
    private JPanel pLong3, pLong4, pLong5, pLong6, pContlong3, pContlong4, pContlong5, pContlong6;
    
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
        pLong3= new JPanel();
        pLong4= new JPanel();
        pLong5= new JPanel();
        pLong6= new JPanel();
        pContlong3= new JPanel(new GridLayout(1,1));
        pContlong4= new JPanel(new GridLayout(1,1));
        pContlong5= new JPanel(new GridLayout(1,1));
        pContlong6= new JPanel(new GridLayout(1,1));
        
        //agregar componentes a los paneles
        pNorth.add(pIniciar);
        pNorth.add(pTitulo);
        pNorth.add(pSeguir);
        
        pCenter.add(pContlong3);
        pCenter.add(pContlong4);
        pCenter.add(pContlong5);
        pCenter.add(pContlong6);
        
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
        
        //se agrega el panel por separado para acomodarlo mejor
        pContlong3.add(pLong3);
        pContlong4.add(pLong4);
        pContlong5.add(pLong5);
        pContlong6.add(pLong6);
        
        //agregamos un borde a cada JPanel de Longitud
        pLong3.setBorder(new TitledBorder ("Longitud 3"));
        pLong4.setBorder(new TitledBorder ("Longitud 4"));
        pLong5.setBorder(new TitledBorder ("Longitud 5"));
        pLong6.setBorder(new TitledBorder ("Longitud 6")); 
        
        //se agrega componentes al frame
        setLayout(new BorderLayout());
        add(pNorth, BorderLayout.NORTH);
        add(pCenter, BorderLayout.CENTER);
        add(pSouth, BorderLayout.SOUTH);
        
    }
    
    public MiniProyecto3()
    {
        initComponents();
        setSize(1280,720);
        setVisible(true);
        setResizable(false);
        setTitle("FPOE - MiniProjecto3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    //clase de las filas (boceto porque no se como hacer el for)
    /*public class Filas extends JPanel{
        
        private JPanel pContieneletras;
        private JTextArea tCampo1, tCampo2, tCampo3, tCampo4, tCampo5, tCampo6;
        
        public void initComponents()
        {
            pContieneletras= new JPanel(new GridLayout(1,6));
            tCampo1= new JTextArea();
            tCampo2= new JTextArea();
            tCampo3= new JTextArea();
            tCampo4= new JTextArea();
            tCampo5= new JTextArea();
            tCampo6= new JTextArea();
            
            pContieneletras.add(tCampo1);
            pContieneletras.add(tCampo2);
            pContieneletras.add(tCampo3);
            pContieneletras.add(tCampo4);
            pContieneletras.add(tCampo5);
            pContieneletras.add(tCampo6);
            
            setLayout(new GridLayout());
        }
    }*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiniProyecto3 miO = new MiniProyecto3();
    }
    
}
