package miniproyecto3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.border.TitledBorder;

/*
 * @author juan.david.garces@correounivalle.edu.co
 *          No olvides poner tu correo
 */
public class MiniProyecto3 extends JFrame {
    final String imgPath = "src\\img\\";
    private JLabel lTitulo, lTempgrid, lTempletras;
    private JButton bIniciar, bSeguir, bRandom, bCheck;
    private JPanel pNorth, pCenter, pSouth, pRecibeletras, pLetras, pIniciar, pTitulo, pSeguir;
    private JPanel pLong3, pLong4, pLong5, pLong6;
    
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
        
        
        
        //agregamos un borde a cada JPanel de Longitud
        pLong3.setBorder(new TitledBorder ("Longitud 3"));
        pLong3.add(new Filas(3));
        pLong4.setBorder(new TitledBorder ("Longitud 4"));
        pLong4.add(new Filas(4));
        pLong5.setBorder(new TitledBorder ("Longitud 5"));
        pLong5.add(new Filas(5));
        pLong6.setBorder(new TitledBorder ("Longitud 6")); 
        pLong6.add(new Filas(6));
        
        
        //agregar componentes a los paneles
        pNorth.add(pIniciar);
        pNorth.add(pTitulo);
        pNorth.add(pSeguir);
        
        pCenter.add(pLong3);
        pCenter.add(pLong4);
        pCenter.add(pLong5);
        pCenter.add(pLong6);
        
        pSouth.add(pRecibeletras); 
        pSouth.add(pLetras); 
        pSouth.add(bRandom);
        
        pRecibeletras.add(new Filas(6));
        pRecibeletras.add(bCheck);
        
        pLetras.add(lTempletras);
        
        pIniciar.add(bIniciar);
        pTitulo.add(lTitulo);
        pSeguir.add(bSeguir);
        
        //se editan los botones para darle una mejor vista
        bIniciar.setIcon(new ImageIcon(imgPath +"startbutton.png"));
        bIniciar.setBackground(Color.WHITE);
        bSeguir.setIcon(new ImageIcon(imgPath +"followbutton.png"));
        bSeguir.setBackground(Color.WHITE);
        bRandom.setIcon(new ImageIcon(imgPath +"randombutton.png"));
        bRandom.setBackground(Color.WHITE);
        bCheck.setIcon(new ImageIcon(imgPath +"checkbutton.png"));
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
        setSize(1280,720);
        setVisible(true);
        setResizable(false);
        setTitle("FPOE - MiniProjecto3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    //clase de las filas (boceto porque no se como hacer el for)
    public class Filas extends JPanel{
        
        private JPanel pContieneletras;
        private ArrayList<JTextArea> areas;
        private int numeroColumnas; //Numero de columnas
        
         
        
        public void initComponents()
        {
            areas = new ArrayList<>();
            
            setLayout(new GridLayout(1,numeroColumnas,10,0));
            
            for(int i = 0; i<numeroColumnas;i++)
            {
                JTextArea area = new JTextArea("   ");
                //area.setBorder();
                //area.setPr....Size
                
                areas.add(area);
                add(areas.get(areas.size() - 1));  
            }
        }
        
        Filas(int numero)
        {
           numeroColumnas = numero; 
           initComponents();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiniProyecto3 miO = new MiniProyecto3();
    }
    
}
