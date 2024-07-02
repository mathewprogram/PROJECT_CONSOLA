package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class VentanaTableArchivosCsvObjeto extends javax.swing.JFrame {

    //Control para cabecera tabel
    String[][] body = {};
    String[] header = {"N1", "N2", "N3", "N4", "Promedio"};
    DefaultTableModel dtm = new DefaultTableModel(body, header);

    //Guardo lo que leo del archivo - en este caso tenemos una lista en la cual guardamos objetos.
    List<Nota> notas_al = new ArrayList<>();
    
    

    public VentanaTableArchivosCsvObjeto() {
        initComponents();
        personalizarVentana();
        personalizarTable();
        applyCustomRenderer();
    }
    
    public void personalizarTable() {
        tblPromedio.setModel(dtm);
        
        tblPromedio.getTableHeader().setBackground(Color.WHITE);
        tblPromedio.getTableHeader().setForeground(Color.BLACK);
        tblPromedio.getTableHeader().setFont(new java.awt.Font("Courier New", 0, 14));
        tblPromedio.getTableHeader().setBorder(new LineBorder(new Color(255, 162, 232)));
    }

    public void llenarListArchivoCsv() {
        //Lectura de un archivo 
        File f; //Convertir el archivo fisico en objeto
        FileReader fr; //Abrir una canaleta de comunicación(origen)
        BufferedReader br; //Leer
        String fila = ""; //aqui guardamos lo que el programa lee

        try {
            f = new File("data/notas.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            int i = 0;
            int row = 0;
            String[] p;
            while ((fila = br.readLine()) != null) {
                if (i != 0) {
                    p = fila.split(";");
                    Nota nota = new Nota(Integer.parseInt(p[0]),
                                         Integer.parseInt(p[1]),
                                         Integer.parseInt(p[2]),
                                         Integer.parseInt(p[3]));
                    notas_al.add(nota);
                    System.out.println(nota);
                }
                i++;
            }

        } catch (IOException e) {
            //System.out.println("Eror:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error", "404", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarDatosTable() {
        llenarListArchivoCsv();
        int i;
        double promedio, promedioClase = 0;
        String[] datosblanco = {"", "", "", "", ""};
        for (i = 0; i < notas_al.size(); i++) {
            Nota nota = notas_al.get(i);
            dtm.addRow(datosblanco);
            dtm.setValueAt(nota.getNota1(), i, 0);//dato, fila, colmna 4,0,0
            dtm.setValueAt(nota.getNota2(), i, 1);                  // 1,0,1
            dtm.setValueAt(nota.getNota3(), i, 2);                  // 4,0,2
            dtm.setValueAt(nota.getNota4(), i, 3);                  // 1,0,1

            promedio = nota.promedio();
            promedioClase += promedio;
            String promedios = String.format("%5.2f", promedio);

            dtm.setValueAt(promedios, i, 4);
        }
        promedioClase = promedioClase / dtm.getRowCount();
        dtm.addRow(datosblanco);
        dtm.setValueAt("Pro Clase", i , 3);
        String promedioClases = String.format("%5.2f", promedioClase);
        dtm.setValueAt(promedioClases, i, 4);
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
        tblPromedio = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnCharge = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPromedio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPromedio.setShowGrid(true);
        jScrollPane1.setViewportView(tblPromedio);

        lblTitulo.setBackground(new java.awt.Color(115, 125, 125));
        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Promedio de 4 notas descartando la menor");
        lblTitulo.setOpaque(true);

        btnCharge.setText("Charge");
        btnCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChargeActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCharge)
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCharge)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChargeActionPerformed
        limpiar();
        cargarDatosTable();
        btnCharge.setEnabled(false);
        btnClear.setEnabled(true);
    }//GEN-LAST:event_btnChargeActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        limpiar();
        btnCharge.setEnabled(true);
        btnClear.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed

    public void limpiar() {
        int numeroFilas = dtm.getRowCount();
        for (int j = 0; j < numeroFilas; j++) {
            dtm.removeRow(0);
        }
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed
    
    //Metodo para identificar la nota mas baja tacharla y poenrala en rojo
    private void applyCustomRenderer() {
        CustomRenderer renderer = new CustomRenderer();
        for (int i = 0; i < 4; i++) {
            tblPromedio.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }

    public class CustomRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Check if this is one of the grade columns and if value is not null
            if (column >= 0 && column <= 3 && value != null) {
                try {
                    int grade = Integer.parseInt(value.toString());
                    int n1 = Integer.parseInt(table.getValueAt(row, 0).toString());
                    int n2 = Integer.parseInt(table.getValueAt(row, 1).toString());
                    int n3 = Integer.parseInt(table.getValueAt(row, 2).toString());
                    int n4 = Integer.parseInt(table.getValueAt(row, 3).toString());

                    int menornota = Math.min(Math.min(n1, n2), Math.min(n3, n4));

                    // If this grade is the smallest, format it
                    if (grade == menornota) {
                        label.setText("<html><span style='color:red;'><strike>" + grade + "</strike></span></html>");
                    } else {
                        label.setText(String.valueOf(grade));
                    }
                } catch (NumberFormatException e) {
                    label.setText(String.valueOf(value));
                }
            }
            return label;
        }
    }
    //Metodos para identificar la nota mas baja tacharla y poenrala en rojo

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
            java.util.logging.Logger.getLogger(VentanaTableArchivosCsvObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTableArchivosCsvObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTableArchivosCsvObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTableArchivosCsvObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTableArchivosCsvObjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCharge;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblPromedio;
    // End of variables declaration//GEN-END:variables

}
