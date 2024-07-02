package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class VentanaTableArchivosCsv extends javax.swing.JFrame {

    //Control para cabecera tabel
    String[][] body = {};
    String[] header = {"N1", "N2", "N3", "N4", "Promedio"};
    DefaultTableModel dtm = new DefaultTableModel(body, header);

    //Guardo lo que leo del archivo - esto nos sirve cuando sabemos que cantidad de lineas almacenamos. 
    int[] n1 = new int[10];
    int[] n2 = new int[10];
    int[] n3 = new int[10];
    int[] n4 = new int[10];

    public VentanaTableArchivosCsv() {
        initComponents();
        personalizarVentana();

        tblPromedio.getTableHeader().setBackground(Color.WHITE);
        tblPromedio.getTableHeader().setForeground(Color.BLACK);
        tblPromedio.getTableHeader().setFont(new java.awt.Font("Courier New", 0, 14));
        tblPromedio.getTableHeader().setBorder(new LineBorder(new Color(255, 162, 232)));

        tblPromedio.setModel(dtm);
        applyCustomRenderer();
    }

    public void leerArchivoCsv() {
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
            while ((fila = br.readLine()) != null) {
                if (i != 0) {
                    String[] p = fila.split(";");
                    n1[row] = Integer.parseInt(p[0]);
                    n2[row] = Integer.parseInt(p[1]);
                    n3[row] = Integer.parseInt(p[2]);
                    n4[row] = Integer.parseInt(p[3]);
                    row++;
                    /*String[] p = fila.split(";");           //Eliminamos ";" que separa los numeros y guardamos la variable en el vector "p"
                                                        for (int j = 0; j < p.length; j++) {    //Recoremos el "p" y imprimimos lo que contiene
                                                            System.out.print(p[j] + " ");       //la impresion sale en una fila con un espacio entre los numeros
                                                            if(j == 3){                         //Quieremos que los numeros salgan en grupos de 4 para cada alumno
                                                                System.out.println();           //Despues de un grupo de 4 numeros cambia de linea
                                                            }
                                                        }*/
                }
                i++;
            }
            //La impresion cambia de dirrecion: va por columna las notas del A1-A6 y los alumnos for filas
            System.out.printf("%7s %2s %2s %2s %2s %2s %2s %2s %2s %2s", "A1", "A2", "A3", "A4", "A5", "A6", "A7","A8","A9","A10");
            System.out.println("");
            System.out.println("N1: " + Arrays.toString(n1));
            System.out.println("N2: " + Arrays.toString(n2));
            System.out.println("N3: " + Arrays.toString(n3));
            System.out.println("N4: " + Arrays.toString(n4));

        } catch (IOException e) {
            //System.out.println("Eror:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error", "404", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarDatosTable() {
        leerArchivoCsv();

        double promedio, promedioClase = 0;
        String[] datosblanco = {"", "", "", "", ""};
        for (int i = 0; i < n1.length; i++) {
            dtm.addRow(datosblanco);
            dtm.setValueAt(n1[i], i, 0);
            dtm.setValueAt(n2[i], i, 1);
            dtm.setValueAt(n3[i], i, 2);
            dtm.setValueAt(n4[i], i, 3);

            int menornota = n1[i];
            if (n2[i] < menornota) {
                menornota = n2[i];
            }
            if (n3[i] < menornota) {
                menornota = n3[i];
            }
            if (n4[i] < menornota) {
                menornota = n4[i];
            }
            promedio = (n1[i] + n2[i] + n3[i] + n4[i] - menornota) / 3.0;
            promedioClase = promedioClase + promedio;
            String promedios = String.format("%5.2f", promedio);

            dtm.setValueAt(promedios, i, 4);
        }
        promedioClase = promedioClase / dtm.getRowCount();
        dtm.addRow(datosblanco);
        dtm.setValueAt("Pro Clase", 10, 3);
        String promedioClases = String.format("%5.2f", promedioClase);
        dtm.setValueAt(promedioClases, 10, 4);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
            java.util.logging.Logger.getLogger(VentanaTableArchivosCsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTableArchivosCsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTableArchivosCsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTableArchivosCsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTableArchivosCsv().setVisible(true);
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
