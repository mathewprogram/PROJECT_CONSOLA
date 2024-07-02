package mariaDB;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaSalida extends JFrame {
    
    // VARIABLES DE INSTANCIA (ATRIBUTOS)
    
    Container contenedor = getContentPane();
    JTextArea txaContenido = new JTextArea();
    JScrollPane scrollpane = new JScrollPane();
    
    String titulo;
    
    // CONSTRUCTORES
    
    public VentanaSalida(String titulo) {
       this.titulo = titulo;
       personalizarVentana(); 
       personalizarTextArea();
       setVisible(true);
    }
    
    public void personalizarTextArea() {
        txaContenido.setBackground(Color.white);//Color de fondo
        txaContenido.setFont(new Font("Courier New", Font.BOLD, 14));//Fuente
        txaContenido.setForeground(Color.black);//Color de letra
        scrollpane.setViewportView(txaContenido);//Poner un scroll al textarea
        contenedor.add(scrollpane); //Poner el scrollpane(txaContenido) *******
    }
    
    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("/image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana
        
        this.setTitle(titulo);
        this.setSize(300, 185); //Poner un ancho y alto a la ventana //430 255 para el tablero
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
        setVisible(true); //Mostrar la ventana ***********
    }
    
    public JTextArea getTextArea() {
        return this.txaContenido;
    }    
    
    public static void main(String[] args) {
        VentanaSalida vs = new VentanaSalida("GUI SWING");
    }

}