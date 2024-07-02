package PSeint_Ejercicios;

import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class Ventana3_12 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();

    public Ventana3_12() {
        initComponents();
        personalizarVentana();
        lstTablaResultados.setModel(dlm);
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

        lblTitulo = new javax.swing.JLabel();
        lblK = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtK = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTablaResultados = new javax.swing.JList<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 204, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Conversor de Billetes");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 43));

        lblK.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblK.setText("Ingresar valor a multiplicar: ");
        getContentPane().add(lblK, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, -1));

        txtK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtK, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 70, -1));

        jScrollPane1.setViewportView(lstTablaResultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 170, 200));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 400, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 400, 10));

        btnCalcular.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        btnNuevo.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Establecer los comando de los botones inicio
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            dlm.clear();
            String ks = txtK.getText();
            int ki = Integer.parseInt(ks);

            for (int i = 1; i <= 10; i++) {//Lo he cambiado, en vez de multiplicxarlo por la cantidad ingresada, lo hace hasta 10, como una tabla de multiplicacion
                //System.out.println(i + " x " + ki + " = " + (i*ki));   
                String texto = i + " x " + ki + " = " + (i * ki);
                dlm.addElement(texto);
            }
        } catch (NumberFormatException e) {//NumberFormatException e es especifico, Exception e es general - capta todos los errores
            JOptionPane.showMessageDialog(null, "Invalid Entry", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        dlm.clear();
        txtK.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    //Establecer los comando de los botones fin 

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
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3_12().setVisible(true);
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
    private javax.swing.JLabel lblK;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstTablaResultados;
    private javax.swing.JTextField txtK;
    // End of variables declaration//GEN-END:variables
}
