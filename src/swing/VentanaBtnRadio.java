
package swing;

 //@author mihaitamatei
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;


 
public class VentanaBtnRadio extends javax.swing.JFrame {

    
    ButtonGroup estilo = new ButtonGroup();
    EventosRadioButton erb = new EventosRadioButton();
    
    public VentanaBtnRadio() {
        initComponents();
        personalizarVentana();
        crearFecha();
        estilo.add(rdo0);
        estilo.add(rdo1);
        estilo.add(rdo2);
        estilo.add(rdo3);
        rdo0.addActionListener(erb);
        rdo1.addActionListener(erb);
        rdo2.addActionListener(erb);
        rdo3.addActionListener(erb);
        
    }
    
    //Manejador de eventos del componente radiobutton
    public class EventosRadioButton implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
         if(e.getSource() == rdo0){
             cambiarEstilo(0);
         }
         if(e.getSource() == rdo1){
             cambiarEstilo(1);
         }
         if(e.getSource() == rdo2){
             cambiarEstilo(2);
         }
         if(e.getSource() == rdo3){
             cambiarEstilo(3);
         }
         
        }
        
    }
    
    //Estilos del font de texto
    public void cambiarEstilo(int estilo){
        lblTexto.setFont(new java.awt.Font("Comic Sans MS", estilo, 18));
        this.repaint();
    }
    
    //Crear e implementar la fecha
    public void crearFecha(){
        DateFormat formatear = DateFormat.getDateInstance(DateFormat.FULL);
        Date fecha = new Date();
        String s = formatear.format(fecha);
        lblFecha.setText(s);
    }
    //Personalizar la ventana 
    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/icono.icns");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana
        
        this.setTitle("Dynamic Font Style");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton4 = new javax.swing.JRadioButton();
        lblTitulo = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        rdo0 = new javax.swing.JRadioButton();
        rdo1 = new javax.swing.JRadioButton();
        rdo2 = new javax.swing.JRadioButton();
        rdo3 = new javax.swing.JRadioButton();
        lblFecha = new javax.swing.JLabel();

        jRadioButton4.setText("jRadioButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Change the letter style dynamically");
        lblTitulo.setOpaque(true);

        lblTexto.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(155, 98, 38));
        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto.setText("\"Solo sé que no sé nada.\" Socrates");
        lblTexto.setToolTipText("");

        rdo0.setText("Plain");

        rdo1.setText("Bold");

        rdo2.setText("Italic");

        rdo3.setText("Bold Italic");

        lblFecha.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(102, 153, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rdo0)
                .addGap(18, 18, 18)
                .addComponent(rdo1)
                .addGap(18, 18, 18)
                .addComponent(rdo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdo3)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo0)
                    .addComponent(rdo1)
                    .addComponent(rdo2)
                    .addComponent(rdo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Main
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBtnRadio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdo0;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdo2;
    private javax.swing.JRadioButton rdo3;
    // End of variables declaration//GEN-END:variables
}
