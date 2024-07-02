package swing;

import java.awt.Image;
import javax.swing.ImageIcon;

public class VentanaDesplazamientoArrayNombres extends javax.swing.JFrame {
    
    String[] nombres = {"Luis", "Miguel","Mihai","Carlos","Maria","Lavinia","Vanessa","Luisa","Alexandra","Paula","Anca","Iulia"};

    public VentanaDesplazamientoArrayNombres() {
        initComponents();
        personalizarVentana();
        txtNombre.setText(nombres[0]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdDerecha = new javax.swing.JButton();
        txtIndice = new javax.swing.JTextField();
        cmdIzquierda = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnInicio = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();
        btnAleatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdDerecha.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdDerecha.setText(">>");
        cmdDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDerechaActionPerformed(evt);
            }
        });

        txtIndice.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtIndice.setForeground(new java.awt.Color(255, 0, 51));
        txtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIndice.setText("0");

        cmdIzquierda.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdIzquierda.setText("<<");
        cmdIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIzquierdaActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BOTON DESPLAZAMIENTO IZQUIERDA-DERECHA");
        lblTitulo.setOpaque(true);

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnFinal.setText("Final");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        btnAleatorio.setText("Aleatorio");
        btnAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAleatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(cmdIzquierda)
                    .addGap(46, 46, 46)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(cmdDerecha)
                    .addContainerGap(66, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio)
                    .addComponent(btnFinal)
                    .addComponent(btnAleatorio))
                .addGap(74, 74, 74))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdIzquierda)
                        .addComponent(cmdDerecha))
                    .addContainerGap(132, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDerechaActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);
        if(indicei < nombres.length-1){
            indicei++;
            txtIndice.setText(indicei+"");
            txtNombre.setText(nombres[indicei]);
        }
    }//GEN-LAST:event_cmdDerechaActionPerformed

    private void cmdIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIzquierdaActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);
        if(indicei > 0){
        indicei--;
        txtIndice.setText(indicei+"");
        txtNombre.setText(nombres[indicei]);
        }
          
        
    }//GEN-LAST:event_cmdIzquierdaActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        txtIndice.setText("0");
        txtNombre.setText(nombres[0]);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        txtIndice.setText((nombres.length-1) + "");
        txtNombre.setText((nombres[nombres.length -1]) + "");
    }//GEN-LAST:event_btnFinalActionPerformed

    private void btnAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatorioActionPerformed
        int aleatorio = (int)(Math.random() * nombres.length);
        txtIndice.setText(aleatorio + "");
        txtNombre.setText(nombres[aleatorio]);
    }//GEN-LAST:event_btnAleatorioActionPerformed
    
    //Personalizar Ventana
    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/icono.icns");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana
        
        this.setTitle("Search");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }    
    //Acaba la personalizacion
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDesplazamientoArrayNombres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAleatorio;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton cmdDerecha;
    private javax.swing.JButton cmdIzquierda;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
