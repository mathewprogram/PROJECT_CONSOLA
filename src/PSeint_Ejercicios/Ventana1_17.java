package PSeint_Ejercicios;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public final class Ventana1_17 extends javax.swing.JFrame {

    public Ventana1_17() {
        initComponents();
        personalizarVentana();
    }

    
    
    
    //Personalizar las caracteristicas de la ventana inicio
    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/icono.icns");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana
        
        this.setTitle("Convert");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }
    //Personalizar las caracteristicas de la ventana fin    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblCantiad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblB20 = new javax.swing.JLabel();
        lblB10 = new javax.swing.JLabel();
        lblB5 = new javax.swing.JLabel();
        lblB1 = new javax.swing.JLabel();
        txtCantidad20 = new javax.swing.JTextField();
        txtCantidad10 = new javax.swing.JTextField();
        txtCantidad5 = new javax.swing.JTextField();
        txtCantidad1 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 204, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Conversor de Billetes");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 43));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 400, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 203, 400, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 268, 400, 10));

        lblCantiad.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblCantiad.setText("Ingresar cantidad Euros a convertir: ");
        getContentPane().add(lblCantiad, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 61, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 92, 75, -1));

        lblB20.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        lblB20.setText("B: 20");
        getContentPane().add(lblB20, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 141, -1, -1));

        lblB10.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        lblB10.setText("B: 10");
        getContentPane().add(lblB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        lblB5.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        lblB5.setText("B: 5");
        getContentPane().add(lblB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 141, -1, -1));

        lblB1.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        lblB1.setText("B: 1");
        getContentPane().add(lblB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 141, -1, -1));

        txtCantidad20.setEditable(false);
        getContentPane().add(txtCantidad20, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 162, 60, -1));

        txtCantidad10.setEditable(false);
        getContentPane().add(txtCantidad10, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 162, 60, -1));

        txtCantidad5.setEditable(false);
        getContentPane().add(txtCantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 162, 60, -1));

        txtCantidad1.setEditable(false);
        getContentPane().add(txtCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 162, 60, -1));

        btnCalcular.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 225, -1, -1));

        btnNuevo.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 225, -1, -1));

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 225, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try{ //try and catch protect from possible errors
        String cantidads = txtCantidad.getText();
        int cantidadi = Integer.parseInt(cantidads);
        int b20, b10, b5, b1;
        int rest20, rest10, rest5, rest1;
        
        b20 = cantidadi / 20;
        rest20 = cantidadi % 20;
        
        b10 = rest20 / 10;
        rest10 = rest20 % 10;
        
        b5 = rest10 / 5;
        rest5 = rest10 % 5;
        
        b1 = rest5 / 1;
        rest1 = rest5 % 1;
        
        txtCantidad20.setText(b20 + "");
        txtCantidad10.setText(b10 + "");
        txtCantidad5.setText(b5 + "");
        txtCantidad1.setText(b1 + "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Entry", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtCantidad.setText("");
        txtCantidad20.setText("");
        txtCantidad10.setText("");
        txtCantidad5.setText("");
        txtCantidad1.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


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
            java.util.logging.Logger.getLogger(Ventana1_17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1_17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1_17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1_17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1_17().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblB1;
    private javax.swing.JLabel lblB10;
    private javax.swing.JLabel lblB20;
    private javax.swing.JLabel lblB5;
    private javax.swing.JLabel lblCantiad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidad1;
    private javax.swing.JTextField txtCantidad10;
    private javax.swing.JTextField txtCantidad20;
    private javax.swing.JTextField txtCantidad5;
    // End of variables declaration//GEN-END:variables
}
