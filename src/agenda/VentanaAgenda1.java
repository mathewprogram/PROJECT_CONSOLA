
package agenda;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class VentanaAgenda1 extends javax.swing.JFrame {
        
    //Base de datos inicio
    List<Persona1> personas_al = new ArrayList<>();
    //Base de datos fin
    
    public VentanaAgenda1() {
        initComponents();
        personalizarVentana();
        cargarBaseDatos();
        txtIndice.setText("0");
        pintarInfoPersonas1(0);
        pintarLabel(personas_al.get(0).getFoto()+"");
        btnDerecha.requestFocusInWindow();
    }

    //Cargar base de datos inicio
    public void cargarBaseDatos(){
        personas_al.add(new Persona1("0000000A", "Hugo", "Matei","Calle Democracia 10", "611622633","02/04/2012","0"));
        personas_al.add(new Persona1("1111111B", "Alexandra", "Mureșan","Calle Democracia 12", "622633644","11/02/1994","1"));
        personas_al.add(new Persona1("2222222C", "Anca", "Labarta","Avenida Luz 1", "633644655","01/12/1987","2"));
        personas_al.add(new Persona1("3333333D", "Jaime", "Castel","Carretera 122", "666677688","17/07/1993","3"));
        personas_al.add(new Persona1("X5470422-X", "Lavinia", "Matei","Calle Maestro Barbieri 1", "609164121","23/12/1983","4"));
        personas_al.add(new Persona1("5555555F", "Iris", "Matei","Calle Libertad 19", "622644678","13/09/2018","5"));
        personas_al.add(new Persona1("6666666G", "Raveca", "Hîngan","Intrarea Violeterlo 3", "622643677","20/12/1963","6"));
        personas_al.add(new Persona1("7777777H", "Angel", "Teso","Calle Angela Merino 21", "622642677","08/12/19867","7"));
        personas_al.add(new Persona1("8888888I", "Rosi", "Teso","Calle Emperador 77", "612644677","03/10/1967","8"));
        personas_al.add(new Persona1("Y4457813-J", "Mathew", "Program","Calle Maestro Barbieri 1", "625942928","17/01/1991","9"));
    }
    //Cargar base de datos fin
    
    //Metodo cargar imagen inicio
    public void pintarLabel(String nombreFoto) {
        try {
            BufferedImage imagenOriginal = ImageIO.read(new File("image/" + nombreFoto + ".png"));
            Image imagenEscala = imagenOriginal.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(imagenEscala);
            lblFoto.setIcon(icon);
        } catch (IOException ex) {
            lblFoto.setIcon(null);
            lblFoto.setText("ERROR: IMAGEN NO EXISTE");
        }
    }      
    //Metodo cargar imagen fin
    
     //Metodo para imprimir la info de las personas incio
    public void pintarInfoPersonas1(int indice){
        Persona1 persona = personas_al.get(indice);
        txtDni.setText(persona.getDni());
        txtNombre.setText(persona.getNombre());
        txtPaterno.setText(persona.getPaterno());
        txtDireccion.setText(persona.getDireccion());
        txtTelefono.setText(persona.getTelefono());
        txtNacimiento.setText(persona.getNacimiento());
    }
    //Metodo para imprimir la info de las personas fin
    
    //Personalizar Ventana inicio
    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/icono.icns");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana
        
        this.setTitle("Agenda");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }//Personalizar Ventana fin
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDireccion = new javax.swing.JTextField();
        btnInicio = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        txtIndice = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtNacimiento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnIzquierda = new javax.swing.JButton();
        btnDerecha = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        sprd1 = new javax.swing.JSeparator();
        sprd2 = new javax.swing.JSeparator();
        lblDni = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        btnFinal = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInicio.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        txtIndice.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        txtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnIzquierda.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnIzquierda.setText("<<");
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });

        btnDerecha.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDerecha.setText(">>");
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnReset.setText("Exit");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("||| Agenda Electronica |||");
        lblTitulo.setOpaque(true);

        lblDni.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblDni.setForeground(new java.awt.Color(0, 0, 0));
        lblDni.setText("Dni");

        lblNombre.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre");

        lblNacimiento.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        lblNacimiento.setText("Fecha Nacimiento");

        lblApellido.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 0, 0));
        lblApellido.setText("Apellido");

        lblDireccion.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("Dirección");

        lblTelefono.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("Teléfono");

        btnFinal.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnFinal.setText("Final");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sprd1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sprd2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblApellido)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNombre)
                                    .addGap(34, 34, 34)
                                    .addComponent(txtNombre))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblDni)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNacimiento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDireccion)
                                        .addComponent(lblTelefono))
                                    .addGap(67, 67, 67)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(btnInicio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnIzquierda)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDerecha))
                                .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnFinal)
                            .addGap(18, 18, 18)
                            .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sprd1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDireccion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblDni))
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTelefono)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblNombre)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNacimiento))
                        .addGap(43, 43, 43)
                        .addComponent(sprd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnIzquierda)
                                .addComponent(btnDerecha))
                            .addComponent(btnFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIndice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset))
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        txtIndice.setText("0");
        pintarInfoPersonas1(0);
        pintarLabel(personas_al.get(0).getFoto());
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        String indices = txtIndice.getText();

        int indicei = Integer.parseInt(indices);
        if(indicei > 0){
            indicei--;
            txtIndice.setText(String.valueOf(indicei));
            pintarInfoPersonas1(indicei);
            pintarLabel(personas_al.get(indicei).getFoto()+"");
        }

    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        txtIndice.setVisible(true);
        String indices = txtIndice.getText();

        int indicei = Integer.parseInt(indices);
        if(indicei < personas_al.size()-1){
            indicei++;
            txtIndice.setText(String.valueOf(indicei));
            pintarInfoPersonas1(indicei);
            pintarLabel(personas_al.get(indicei).getFoto()+"");
        }

    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        dispose();
        System.exit(0);
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        pintarInfoPersonas1(personas_al.size()-1);
        txtIndice.setText(personas_al.size()-1 + "");
        pintarLabel(personas_al.get(personas_al.size()-1).getFoto());
    }//GEN-LAST:event_btnFinalActionPerformed


    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAgenda1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgenda1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgenda1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgenda1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgenda1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator sprd1;
    private javax.swing.JSeparator sprd2;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
