package swing;

import java.awt.Container;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaImagen extends JFrame {
    //Variables de instancia
    Container container = getContentPane();
    
    BufferedImage imagen;
    JLabel lblImagen;
    String nombreFoto;
    
    
    public VentanaImagen(){
        personalizarVentana();
    }
    
    public void personalizarVentana(){
        this.setTitle("GUI SWING");
        this.setSize(400,300);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setFont(new java.awt.Font("Courier New", 2, 12));
    }
    
}
