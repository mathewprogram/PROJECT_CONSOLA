package agenda;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class VentanaAgenda extends javax.swing.JFrame {

    //Base de datos
    List<Persona> personas_al = new ArrayList<>();
    
    public VentanaAgenda() {
        initComponents();
        personalizarVentana();
        cargarBaseDatos();
        txtIndice.setText("0");
        pintarInfoPersonas(0);
        btnDerecha.requestFocusInWindow();
    }
    
    //Cargar base de datos inicio
    public void cargarBaseDatos(){
        personas_al.add(new Persona("0000000A", "Mihai", "Matei","Calle Democracia 10", "611622633","10/01/2000"));
        personas_al.add(new Persona("1111111B", "Lavinia", "Filip","Calle Democracia 12", "622633644","11/02/1998"));
        personas_al.add(new Persona("2222222C", "Alina", "Lelia","Avenida Luz 1", "633644655","11/08/1988"));
        personas_al.add(new Persona("3333333D", "Anca", "Vera","Carretera 122", "666677688","17/07/1995"));
        personas_al.add(new Persona("4444444E", "Paul", "Mori","Plaza Vega 67", "699600611","03/09/1979"));
        personas_al.add(new Persona("5555555F", "Alexa", "Godo","Calle Libertad 2", "622644677","13/09/1983"));
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
        personas_al.add(new Persona());
    }//Cargar base de datos fin
    
    //Personalizar Ventana inicio
    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/icono.icns");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana
        
        this.setTitle("Agenda");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }//Personalizar Ventana fin
    
    //Metodo para imprimir la info de las personas incio
    public void pintarInfoPersonas(int indice){
        Persona persona = personas_al.get(indice);
        txtDni.setText(persona.getDni());
        txtNombre.setText(persona.getNombre());
        txtPaterno.setText(persona.getPaterno());
        txtDireccion.setText(persona.getDireccion());
        txtTelefono.setText(persona.getTelefono());
        txtNacimiento.setText(persona.getNacimiento());
    }//Metodo para imprimir la info de las personas fin

    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        sprd1 = new javax.swing.JSeparator();
        sprd2 = new javax.swing.JSeparator();
        lblDni = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtNacimiento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnIzquierda = new javax.swing.JButton();
        btnDerecha = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        txtIndice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(540, 380));
        setSize(new java.awt.Dimension(540, 380));

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
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnFinal.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnFinal.setText("Final");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        btnInicio.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        txtIndice.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        txtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sprd1)
            .addComponent(sprd2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDireccion)
                                    .addComponent(lblTelefono))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIzquierda)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDerecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFinal)
                                .addGap(18, 18, 18)
                                .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGuardar))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
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
                .addComponent(sprd2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnIzquierda)
                        .addComponent(btnDerecha))
                    .addComponent(btnFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIndice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnGuardar))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        txtIndice.setText("0");
        pintarInfoPersonas(0);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
            pintarInfoPersonas(personas_al.size()-1);
            txtIndice.setText(personas_al.size()-1 + "");        
    }//GEN-LAST:event_btnFinalActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        String indices = txtIndice.getText();
        
        int indicei = Integer.parseInt(indices);
        if(indicei > 0){
            indicei--;
            txtIndice.setText(String.valueOf(indicei));
            pintarInfoPersonas(indicei);
        }
      
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        txtIndice.setVisible(true);
        String indices = txtIndice.getText();
        
        int indicei = Integer.parseInt(indices);
        if(indicei < personas_al.size()-1){
            indicei++;
            txtIndice.setText(String.valueOf(indicei));
            pintarInfoPersonas(indicei);
        }
      
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);
        
        String dni = txtDni.getText();
        String nombre = txtDni.getText();
        String paterno = txtPaterno.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String nacimiento = txtNacimiento.getText();
        
        Persona persona = new Persona(dni,nombre,paterno,direccion,telefono,nacimiento);
        personas_al.set(indicei, persona);
        
        JOptionPane.showMessageDialog(null, "Stored correctly", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        /*
        Persona persona = new Persona(indicei);
        personas.setDni(dni);
        personas.setNombre(nombre);
        personas.setPaterno(paterno);
        personas.setDireccion(direccion);
        personas.setTelefono(telefono);
        personas.setNacimiento(nacimiento);
        */
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);
        
        personas_al.remove(indicei);
        if(indicei >= personas_al.size()){
            indicei = personas_al.size()-1;
        }
        txtIndice.setText(indicei +"");
        
        if(!personas_al.isEmpty()){
            pintarInfoPersonas(indicei);
        }else{
            txtDni.setText("");
            txtNombre.setText("");
            txtPaterno.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            txtNacimiento.setText("");
        }
        
        JOptionPane.showMessageDialog(null, "Deleted sucessfully", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnResetActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
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
