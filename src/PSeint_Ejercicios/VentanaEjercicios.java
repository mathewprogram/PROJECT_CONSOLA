package PSeint_Ejercicios;

import java.awt.Image;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public final class VentanaEjercicios extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();
    DefaultListModel dlmc = new DefaultListModel();
    DefaultListModel dlmm = new DefaultListModel();
    
    ButtonGroup extension = new ButtonGroup();
    
   
    
    //Variable de instancia
    private double firstNumber = 0;
    private double secondNumber = 0;
    private double thirdNumber = 0;
    private double fourthNumber = 0;
    private boolean firstNumberEntered = false;
    private int step = 1;
    
    
    public VentanaEjercicios() {
        initComponents();
        personalizarVentana();
        txtAyB.requestFocusInWindow();
        lstFactorial.setModel(dlm);
        lstResultadosConv.setModel(dlmc);
        lstMultiplicar.setModel(dlmm);
        
        extension.add(rdoAcres);        
        extension.add(rdoHectareas);
        txtResultadosNumerosOrdenados.setVisible(false);
        
        
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
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAyB = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtAyB = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNumerosX = new javax.swing.JLabel();
        txtNumerosX = new javax.swing.JTextField();
        btnCalcularX = new javax.swing.JButton();
        txtResultadosX = new javax.swing.JTextField();
        btnResetX = new javax.swing.JButton();
        btnExitX = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lblComparingX = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cboCategoria = new javax.swing.JComboBox<>();
        txtSueldo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblSueldo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtSueldoAumento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        btnCalcularCat = new javax.swing.JButton();
        btnExitCat = new javax.swing.JButton();
        btnNuevoCat = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtFactorial = new javax.swing.JTextField();
        lblMensaje = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstFactorial = new javax.swing.JList<>();
        jSeparator10 = new javax.swing.JSeparator();
        btnCalcularFact = new javax.swing.JButton();
        btnResetFact = new javax.swing.JButton();
        btnExitFact = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblAcres = new javax.swing.JLabel();
        txtHectareas = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        lblHectareas = new javax.swing.JLabel();
        txtAcres = new javax.swing.JTextField();
        btnCalcularHec = new javax.swing.JButton();
        btnResetHec = new javax.swing.JButton();
        btnExitHec = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        rdoHectareas = new javax.swing.JRadioButton();
        rdoAcres = new javax.swing.JRadioButton();
        txtSwitch = new javax.swing.JTextField();
        btnExitAcHec = new javax.swing.JButton();
        lblToConv = new javax.swing.JLabel();
        txtAcresConv = new javax.swing.JTextField();
        btnNuevoAcHec = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        lblAcresConv = new javax.swing.JLabel();
        lblAoH = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        lblResultado = new javax.swing.JLabel();
        lblElegido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblNumerosOrdenados = new javax.swing.JLabel();
        txtNumerosOrdenados = new javax.swing.JTextField();
        btnCalcularOrdenados = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        txtResultadosOrdenados = new javax.swing.JTextField();
        btnResetOrdenados = new javax.swing.JButton();
        btnExitOrdenados = new javax.swing.JButton();
        lblOrdenados = new javax.swing.JLabel();
        txtResultadosNumerosOrdenados = new javax.swing.JTextField();
        lblComparingOrdenados = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblCantitadConv = new javax.swing.JLabel();
        txtConvert = new javax.swing.JTextField();
        sep1 = new javax.swing.JSeparator();
        sep2 = new javax.swing.JSeparator();
        btnCalcularConv = new javax.swing.JButton();
        btnNuevoConv = new javax.swing.JButton();
        btnExitConv = new javax.swing.JButton();
        sep3 = new javax.swing.JSeparator();
        lblAccionConv = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstResultadosConv = new javax.swing.JList<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblNumerosMultiplicar = new javax.swing.JLabel();
        txtNumerosMultiplicar = new javax.swing.JTextField();
        btnCalcularMultiplicar = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstMultiplicar = new javax.swing.JList<>();
        btnResetMultiplicar = new javax.swing.JButton();
        btnExitMultiplicar = new javax.swing.JButton();
        jSeparator21 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblNumerosNota = new javax.swing.JLabel();
        btnCalcularNota = new javax.swing.JButton();
        txtNumerosNota = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        lblNotaPromedio = new javax.swing.JLabel();
        txtNotaPromedio = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        btnResetNota = new javax.swing.JButton();
        btnExitNota = new javax.swing.JButton();
        jSeparator24 = new javax.swing.JSeparator();
        lblNota2 = new javax.swing.JLabel();
        lblNota1 = new javax.swing.JLabel();
        lblNota4 = new javax.swing.JLabel();
        lblNota3 = new javax.swing.JLabel();
        lblNotasElegidas = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtCategoria2_18 = new javax.swing.JTextField();
        txtSueldoAumento2_18 = new javax.swing.JTextField();
        lbl2_18 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        btnCalcularCat2_18 = new javax.swing.JButton();
        btnExitCat2_18 = new javax.swing.JButton();
        cboCategoria2_18 = new javax.swing.JComboBox<>();
        btnNuevoCat2_18 = new javax.swing.JButton();
        txtSueldo2_18 = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        lblSueldo1 = new javax.swing.JLabel();
        lblAnios = new javax.swing.JLabel();
        lblAnios2_18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPromedio = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 204, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PSe Int");
        lblTitulo.setOpaque(true);

        jTabbedPane4.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        lblAyB.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        lblAyB.setText("Ingrese numero 1:");

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnCalcular.setText("Next");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        txtAyB.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        txtAyB.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtResultados.setEditable(false);
        txtResultados.setColumns(3);
        txtResultados.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtResultados.setRows(2);
        txtResultados.setTabSize(3);
        txtResultados.setText("\n");
        txtResultados.setWrapStyleWord(true);
        txtResultados.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(txtResultados);
        txtResultados.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setBackground(new java.awt.Color(115, 125, 125));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Comparar dos numeros ");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnNuevo)
                                .addGap(40, 40, 40)
                                .addComponent(btnSalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btnCalcular))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAyB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAyB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAyB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAyB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnNuevo))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane4.addTab("Ejemplo2_12", jPanel1);

        lblNumerosX.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNumerosX.setText("Ingrese numero 1: ");

        txtNumerosX.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtNumerosX.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalcularX.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCalcularX.setText("Next");
        btnCalcularX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularXActionPerformed(evt);
            }
        });

        txtResultadosX.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtResultadosX.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnResetX.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnResetX.setText("Reset");
        btnResetX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetXActionPerformed(evt);
            }
        });

        btnExitX.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExitX.setText("Exit");
        btnExitX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitXActionPerformed(evt);
            }
        });

        lblComparingX.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblComparingX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComparingX.setText(" ");

        jLabel7.setBackground(new java.awt.Color(115, 125, 125));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Comparar tres numeros");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnResetX)
                                .addGap(53, 53, 53)
                                .addComponent(btnExitX))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNumerosX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumerosX, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcularX))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(txtResultadosX, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
            .addComponent(lblComparingX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumerosX)
                    .addComponent(txtNumerosX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcularX))
                .addGap(20, 20, 20)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblComparingX)
                .addGap(18, 18, 18)
                .addComponent(txtResultadosX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExitX)
                    .addComponent(btnResetX))
                .addGap(39, 39, 39)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane4.addTab("Ejemplo2_14", jPanel2);

        cboCategoria.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4" }));
        cboCategoria.setToolTipText("");
        cboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCategoriaItemStateChanged(evt);
            }
        });

        txtSueldo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtSueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblSueldo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblSueldo.setText("Ingresar sueldo:");

        lblCategoria.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblCategoria.setText("Seleccionar Categoria");

        txtCategoria.setEditable(false);
        txtCategoria.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSueldoAumento.setEditable(false);
        txtSueldoAumento.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sueldo con Aumento");

        btnCalcularCat.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCalcularCat.setText("Calcular");
        btnCalcularCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCatActionPerformed(evt);
            }
        });

        btnExitCat.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExitCat.setText("Exit");
        btnExitCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitCatActionPerformed(evt);
            }
        });

        btnNuevoCat.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnNuevoCat.setText("Nuevo");
        btnNuevoCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCatActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(115, 125, 125));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Incrementar sueldo");
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategoria)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblSueldo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator25)
            .addComponent(jSeparator7)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCalcularCat)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoCat)
                        .addGap(18, 18, 18)
                        .addComponent(btnExitCat)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addComponent(txtSueldoAumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSueldo)
                    .addComponent(lblCategoria))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtSueldoAumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularCat)
                    .addComponent(btnExitCat)
                    .addComponent(btnNuevoCat))
                .addGap(52, 52, 52)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedPane4.addTab("Ejemplo2_8", jPanel3);

        jLabel2.setBackground(new java.awt.Color(115, 125, 125));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Factorial de Numero");
        jLabel2.setOpaque(true);

        lblNumero.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNumero.setText("Ingresar Numero Entero Positivo");

        txtNumero.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFactorial.setEditable(false);
        txtFactorial.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtFactorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblMensaje.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("Mensjae");

        lstFactorial.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lstFactorial.setForeground(new java.awt.Color(214, 25, 98));
        lstFactorial.setEnabled(false);
        jScrollPane2.setViewportView(lstFactorial);

        btnCalcularFact.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCalcularFact.setText("Calcular");
        btnCalcularFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularFactActionPerformed(evt);
            }
        });

        btnResetFact.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnResetFact.setText("Reset");
        btnResetFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetFactActionPerformed(evt);
            }
        });

        btnExitFact.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExitFact.setText("Exit");
        btnExitFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitFactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator9)
                    .addComponent(jSeparator10)
                    .addComponent(jSeparator8)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFactorial, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(btnCalcularFact)
                                .addGap(18, 18, 18)
                                .addComponent(btnResetFact)
                                .addGap(18, 18, 18)
                                .addComponent(btnExitFact))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(lblNumero))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 180, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetFact)
                    .addComponent(btnExitFact)
                    .addComponent(btnCalcularFact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane4.addTab("Ejemplo3_20", jPanel4);

        lblAcres.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblAcres.setText("Ingrese Cantidad en acres a convertir:");

        txtHectareas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtHectareas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblHectareas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblHectareas.setText("Cantidad en hectáreas:");

        txtAcres.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtAcres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalcularHec.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCalcularHec.setText("Calcular");
        btnCalcularHec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularHecActionPerformed(evt);
            }
        });

        btnResetHec.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnResetHec.setText("Reset");
        btnResetHec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetHecActionPerformed(evt);
            }
        });

        btnExitHec.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExitHec.setText("Exit");
        btnExitHec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitHecActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(115, 125, 125));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Convertir de Acres a Hectáreas");
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator11)
            .addComponent(jSeparator12)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnCalcularHec)
                        .addGap(34, 34, 34)
                        .addComponent(btnResetHec)
                        .addGap(41, 41, 41)
                        .addComponent(btnExitHec))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblAcres))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(txtAcres, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lblHectareas))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(txtHectareas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblAcres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAcres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblHectareas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHectareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularHec)
                    .addComponent(btnResetHec)
                    .addComponent(btnExitHec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane4.addTab("Ejemplo1_11", jPanel5);

        rdoHectareas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        rdoHectareas.setForeground(new java.awt.Color(0, 0, 153));
        rdoHectareas.setText("Hectáreas");
        rdoHectareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoHectareasActionPerformed(evt);
            }
        });

        rdoAcres.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        rdoAcres.setForeground(new java.awt.Color(0, 0, 153));
        rdoAcres.setText("Acres");
        rdoAcres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAcresActionPerformed(evt);
            }
        });

        txtSwitch.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtSwitch.setForeground(new java.awt.Color(255, 0, 51));
        txtSwitch.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnExitAcHec.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExitAcHec.setText("Exit");
        btnExitAcHec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitAcHecActionPerformed(evt);
            }
        });

        lblToConv.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblToConv.setForeground(new java.awt.Color(0, 0, 153));
        lblToConv.setText("Elije la unidad que deseas Convertir:");

        txtAcresConv.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtAcresConv.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnNuevoAcHec.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnNuevoAcHec.setText("Nuevo");
        btnNuevoAcHec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAcHecActionPerformed(evt);
            }
        });

        lblAcresConv.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblAcresConv.setForeground(new java.awt.Color(0, 0, 0));
        lblAcresConv.setText("Ingrese Cantidad a Convertir:");

        lblAoH.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblAoH.setForeground(new java.awt.Color(51, 153, 0));
        lblAoH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblResultado.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(51, 153, 0));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText(" ");

        lblElegido.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblElegido.setForeground(new java.awt.Color(51, 153, 0));
        lblElegido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElegido.setText(" ");

        jLabel5.setBackground(new java.awt.Color(115, 125, 125));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Convertir Acres <-> Hectáreas");
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator16)
            .addComponent(jSeparator14)
            .addComponent(lblAoH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator13)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(btnNuevoAcHec)
                        .addGap(30, 30, 30)
                        .addComponent(btnExitAcHec)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(lblElegido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblAcresConv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAcresConv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblToConv)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(rdoAcres)
                                .addGap(48, 48, 48)
                                .addComponent(rdoHectareas)))))
                .addContainerGap(148, Short.MAX_VALUE))
            .addComponent(lblResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAcresConv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAcresConv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblToConv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoAcres)
                    .addComponent(rdoHectareas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAoH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblElegido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExitAcHec)
                    .addComponent(btnNuevoAcHec))
                .addGap(18, 18, 18)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane4.addTab("Ejemplo1_11(radio)", jPanel6);

        jLabel8.setBackground(new java.awt.Color(115, 125, 125));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Verificar si numeros ingresados estan ordenados en forma creciente");
        jLabel8.setOpaque(true);

        lblNumerosOrdenados.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNumerosOrdenados.setText("Ingrese numero 1: ");

        txtNumerosOrdenados.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtNumerosOrdenados.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalcularOrdenados.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCalcularOrdenados.setText("Next");
        btnCalcularOrdenados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularOrdenadosActionPerformed(evt);
            }
        });

        txtResultadosOrdenados.setEditable(false);
        txtResultadosOrdenados.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtResultadosOrdenados.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnResetOrdenados.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnResetOrdenados.setText("Reset");
        btnResetOrdenados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetOrdenadosActionPerformed(evt);
            }
        });

        btnExitOrdenados.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExitOrdenados.setText("Exit");
        btnExitOrdenados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitOrdenadosActionPerformed(evt);
            }
        });

        lblOrdenados.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblOrdenados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrdenados.setText(" ");

        txtResultadosNumerosOrdenados.setEditable(false);
        txtResultadosNumerosOrdenados.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtResultadosNumerosOrdenados.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblComparingOrdenados.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblComparingOrdenados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComparingOrdenados.setText(" ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator17)
            .addComponent(jSeparator18)
            .addComponent(jSeparator19)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultadosNumerosOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadosOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addComponent(lblOrdenados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblComparingOrdenados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btnResetOrdenados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnExitOrdenados)
                .addGap(206, 206, 206))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lblNumerosOrdenados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcularOrdenados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumerosOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumerosOrdenados)
                    .addComponent(txtNumerosOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcularOrdenados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblComparingOrdenados)
                .addGap(18, 18, 18)
                .addComponent(txtResultadosOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblOrdenados)
                .addGap(18, 18, 18)
                .addComponent(txtResultadosNumerosOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExitOrdenados)
                    .addComponent(btnResetOrdenados))
                .addGap(18, 18, 18)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Ejemplo2_15", jPanel7);

        jLabel10.setBackground(new java.awt.Color(115, 125, 125));
        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fraccionar Cantidad en Billetes 50, 20, 10, 5, 1");
        jLabel10.setOpaque(true);

        lblCantitadConv.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblCantitadConv.setText("Ingrese cantidad a convertir:");

        txtConvert.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtConvert.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalcularConv.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCalcularConv.setText("Convertir");
        btnCalcularConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularConvActionPerformed(evt);
            }
        });

        btnNuevoConv.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnNuevoConv.setText("Nuevo");
        btnNuevoConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoConvActionPerformed(evt);
            }
        });

        btnExitConv.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExitConv.setText("Exit");
        btnExitConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitConvActionPerformed(evt);
            }
        });

        lblAccionConv.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblAccionConv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lstResultadosConv.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jScrollPane4.setViewportView(lstResultadosConv);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sep1)
            .addComponent(sep2)
            .addComponent(sep3)
            .addComponent(lblAccionConv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNuevoConv)
                .addGap(29, 29, 29)
                .addComponent(btnExitConv)
                .addGap(226, 226, 226))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(lblCantitadConv)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcularConv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantitadConv)
                    .addComponent(txtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcularConv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccionConv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExitConv)
                    .addComponent(btnNuevoConv))
                .addGap(41, 41, 41)
                .addComponent(sep3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Ejemplo1_17", jPanel9);

        jLabel9.setBackground(new java.awt.Color(115, 125, 125));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tabla Multiplicar");
        jLabel9.setOpaque(true);

        lblNumerosMultiplicar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNumerosMultiplicar.setText("Ingrese numero que desea multiplicar: ");

        txtNumerosMultiplicar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtNumerosMultiplicar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalcularMultiplicar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCalcularMultiplicar.setText("Calcular");
        btnCalcularMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMultiplicarActionPerformed(evt);
            }
        });

        lstMultiplicar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(lstMultiplicar);

        btnResetMultiplicar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnResetMultiplicar.setText("Reset");
        btnResetMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetMultiplicarActionPerformed(evt);
            }
        });

        btnExitMultiplicar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExitMultiplicar.setText("Exit");
        btnExitMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitMultiplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator21)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator20)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 134, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(btnResetMultiplicar)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(btnCalcularMultiplicar))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNumerosMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExitMultiplicar))
                                    .addComponent(lblNumerosMultiplicar))
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197))))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNumerosMultiplicar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumerosMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularMultiplicar)
                    .addComponent(btnResetMultiplicar)
                    .addComponent(btnExitMultiplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Ejemplo3_12", jPanel8);

        jLabel11.setBackground(new java.awt.Color(115, 125, 125));
        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Excluir la nota menor y sacar el promedio ");
        jLabel11.setOpaque(true);

        lblNumerosNota.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNumerosNota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumerosNota.setText("Ingrese Nota 1: ");

        btnCalcularNota.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCalcularNota.setText("Next");
        btnCalcularNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularNotaActionPerformed(evt);
            }
        });

        txtNumerosNota.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtNumerosNota.setForeground(new java.awt.Color(102, 153, 0));
        txtNumerosNota.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblNotaPromedio.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNotaPromedio.setText("El promedio es:");

        txtNotaPromedio.setEditable(false);
        txtNotaPromedio.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtNotaPromedio.setForeground(new java.awt.Color(102, 153, 0));
        txtNotaPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnResetNota.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnResetNota.setText("Reset");
        btnResetNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetNotaActionPerformed(evt);
            }
        });

        btnExitNota.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExitNota.setText("Exit");
        btnExitNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitNotaActionPerformed(evt);
            }
        });

        lblNota2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNota2.setForeground(new java.awt.Color(102, 153, 0));
        lblNota2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNota2.setText(" ");

        lblNota1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNota1.setForeground(new java.awt.Color(102, 153, 0));
        lblNota1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNota1.setText(" ");

        lblNota4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNota4.setForeground(new java.awt.Color(102, 153, 0));
        lblNota4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNota4.setText(" ");

        lblNota3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNota3.setForeground(new java.awt.Color(102, 153, 0));
        lblNota3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNota3.setText(" ");

        lblNotasElegidas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblNotasElegidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator23)
            .addComponent(jSeparator24)
            .addComponent(jSeparator22)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNota4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNota3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNota2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNotaPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotaPromedio))
                .addGap(0, 184, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnResetNota)
                .addGap(107, 107, 107)
                .addComponent(btnExitNota)
                .addGap(184, 184, 184))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lblNumerosNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalcularNota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumerosNota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblNotasElegidas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumerosNota)
                    .addComponent(txtNumerosNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcularNota)
                .addGap(27, 27, 27)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblNotasElegidas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNota1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNota2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNota3))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblNotaPromedio)
                        .addGap(18, 18, 18)
                        .addComponent(txtNotaPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNota4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetNota)
                    .addComponent(btnExitNota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedPane4.addTab("Ejemplo3_16", jPanel10);

        txtCategoria2_18.setEditable(false);
        txtCategoria2_18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtCategoria2_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSueldoAumento2_18.setEditable(false);
        txtSueldoAumento2_18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtSueldoAumento2_18.setForeground(new java.awt.Color(0, 153, 0));
        txtSueldoAumento2_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl2_18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbl2_18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2_18.setText("Sueldo con Aumento");

        btnCalcularCat2_18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCalcularCat2_18.setText("Calcular");
        btnCalcularCat2_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCat2_18ActionPerformed(evt);
            }
        });

        btnExitCat2_18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExitCat2_18.setText("Exit");
        btnExitCat2_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitCat2_18ActionPerformed(evt);
            }
        });

        cboCategoria2_18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cboCategoria2_18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "20-30", "15-20", "10-15", "0-10" }));
        cboCategoria2_18.setToolTipText("");
        cboCategoria2_18.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCategoria2_18ItemStateChanged(evt);
            }
        });

        btnNuevoCat2_18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnNuevoCat2_18.setText("Nuevo");
        btnNuevoCat2_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCat2_18ActionPerformed(evt);
            }
        });

        txtSueldo2_18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtSueldo2_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblSueldo1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblSueldo1.setText("Ingresar sueldo:");

        lblAnios.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblAnios.setText("Años Trabajados ");

        lblAnios2_18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblAnios2_18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnios2_18.setText(" ");

        jLabel12.setBackground(new java.awt.Color(115, 125, 125));
        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Actualizar sueldo en base a los años trabajados");
        jLabel12.setOpaque(true);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator28)
            .addComponent(jSeparator27)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(btnNuevoCat2_18)
                .addGap(18, 18, 18)
                .addComponent(btnExitCat2_18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator26)
                .addContainerGap())
            .addComponent(lblAnios2_18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSueldoAumento2_18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lbl2_18)))
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAnios)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(cboCategoria2_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSueldo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSueldo2_18, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(txtCategoria2_18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(btnCalcularCat2_18)
                                .addGap(33, 33, 33)))
                        .addGap(120, 120, 120))))
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSueldo1)
                    .addComponent(lblAnios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboCategoria2_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldo2_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularCat2_18)
                    .addComponent(txtCategoria2_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblAnios2_18)
                .addGap(14, 14, 14)
                .addComponent(lbl2_18)
                .addGap(18, 18, 18)
                .addComponent(txtSueldoAumento2_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExitCat2_18)
                    .addComponent(btnNuevoCat2_18))
                .addGap(32, 32, 32)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Ejemplo2_18", jPanel11);

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
        jScrollPane5.setViewportView(tblPromedio);

        jLabel13.setBackground(new java.awt.Color(115, 125, 125));
        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Actualizar sueldo en base a los años trabajados");
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("EjemploTable", jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //--------------------------------  -------------------------------------------------------------------
    
    //Inicio Ejemplo2_12
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        try{
            String inputs = txtAyB.getText();
            double inputd = Double.parseDouble(inputs);
            txtAyB.requestFocusInWindow();
            if(!firstNumberEntered){
                firstNumber = inputd;
                firstNumberEntered = true;
                txtAyB.setText("");
                lblAyB.setText("Ingrese numero 2:");
                btnCalcular.setText("Calcular");
            } else {
                
                double secondNumber = inputd;
                
                firstNumberEntered = false;
                
                
                if(firstNumber != secondNumber){
                    if(firstNumber > secondNumber){
                        txtResultados.setText("     The results are:" + "\n" +  
                                              "El numero mayor es " + firstNumber + "\n" + 
                                              "El numero menor es " + secondNumber);
                    }else{
                        txtResultados.setText("     The results are:" + "\n" + 
                                              "El numero mayor es " + secondNumber + "\n" + 
                                              "El numero menor es " + firstNumber);
                    }
                }else{
                    txtResultados.setText("\n" + "   Both numbers are equal");
                }
                txtAyB.setText("");
                btnCalcular.setEnabled(false);
            }
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
                txtAyB.setText("");
                }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtAyB.setText("");
        btnCalcular.setEnabled(true);
        btnCalcular.setText("Next");
        lblAyB.setText("Ingrese numero 1");
        txtResultados.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
    //Fin Ejemplo2_12
    
    //---------------------------------------------------------------------------------------------------
   
    //Inicio Ejemplo2_14
    private void btnCalcularXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularXActionPerformed
        //Controlar posibles errores
        try{
            //Recuperar el texto ingresado por teclado y convertirlo a int, poner el focus en la casilla entrada
            String inputs = txtNumerosX.getText();
            double inputi = Double.parseDouble(inputs);
            txtNumerosX.requestFocusInWindow();
            //---------------------------------------------------------------------------------------------------
            
            //Casos para los diferentes inputs en la misma casilla de entrada
            switch(step){
                case 1: 
                    firstNumber = inputi;
                    txtNumerosX.setText("");
                    lblNumerosX.setText("Ingrese numero 2: ");
                    step++;
                    break;
                
                case 2:
                    secondNumber = inputi;
                    txtNumerosX.setText("");
                    lblNumerosX.setText("Ingrese numero 3: ");
                    step++;
                    break;
                
                case 3: 
                    thirdNumber = inputi;
                    txtNumerosX.setText("");
                    lblNumerosX.setText("                  ");
                    lblComparingX.setText("Comparing numbers...");
                    step = 1;
                
                btnCalcularX.setEnabled(false);    
            //---------------------------------------------------------------------------------------------------        
                    
            //Formula
            if(firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == firstNumber){
                    txtResultadosX.setText("Numbers are equal.");    
                }else if(firstNumber >= secondNumber && firstNumber >= thirdNumber){
                txtResultadosX.setText("Number " + firstNumber + " is bigger");
                }else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
                txtResultadosX.setText("Number " + secondNumber + " is bigger");
                }else{
                txtResultadosX.setText("Number " + thirdNumber + " is bigger");
                }
            
            //---------------------------------------------------------------------------------------------------        
            }
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
                txtResultadosX.setText("");
                }
    //---------------------------------------------------------------------------------------------------
            //Desabilitar boton Next hasta pulsar Nuevo
            
    }//GEN-LAST:event_btnCalcularXActionPerformed

    private void btnResetXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetXActionPerformed
        lblNumerosX.setText("Ingrese numero 1: ");
        txtResultadosX.setText("");
        btnCalcularX.setEnabled(true);
    }//GEN-LAST:event_btnResetXActionPerformed

    private void btnExitXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitXActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnExitXActionPerformed
    //Fin Ejercicio2_14
    
    //---------------------------------------------------------------------------------------------------
    
    //Inicio Ejercicio2_8
    private void btnCalcularCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCatActionPerformed
        try{
        String sueldos = txtSueldo.getText();
        double sueldod = Double.parseDouble(sueldos);
        
        String porcentajes = txtCategoria.getText();
        porcentajes = porcentajes.substring(0,porcentajes.length()-1);
        System.out.println(porcentajes);
        int porcentajei = Integer.parseInt(porcentajes);
        
        double sueldoAumento = sueldod * (1 + (porcentajei / 100.0));
        txtSueldoAumento.setText(sueldoAumento + "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Entry", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCalcularCatActionPerformed

    private void btnNuevoCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCatActionPerformed
        txtCategoria.setText("");
        txtSueldo.setText("");
        txtSueldoAumento.setText("");
        cboCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_btnNuevoCatActionPerformed

    private void btnExitCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCatActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnExitCatActionPerformed

    private void cboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCategoriaItemStateChanged
        
        String items = (String)cboCategoria.getSelectedItem();
        if(!items.equals("Seleccionar")){
            int itemi = Integer.parseInt(items);
            switch(itemi){
            case 1: txtCategoria.setText("15%");break;
            case 2: txtCategoria.setText("10%");break;
            case 3: txtCategoria.setText("8%");break;
            case 4: txtCategoria.setText("5%");break;
                }
        }else{
             txtCategoria.setText("");
            }
    }//GEN-LAST:event_cboCategoriaItemStateChanged
    //Fin Ejercicio2_8
    
    //---------------------------------------------------------------------------------------------------
    
    //Inicio Ejercicio3_20
    private void btnCalcularFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularFactActionPerformed
        dlm.clear();
        String nfs = txtNumero.getText();
        String patron = "[0-9]+";
        boolean correct = nfs.matches(patron);
        int f = 1;
        if(correct){
            long nfi = Long.parseLong(nfs);
            if(nfi!=0){
               for(int i=1; i<=nfi; i++){
                         f = f * i;
                         dlm.addElement(f);
                   }
                 lblMensaje.setText("Factorial Distino Cero");
                 txtFactorial.setText(f + "");
            }else{
                f=1;
                lblMensaje.setText("Factorial Cero");
                txtFactorial.setText(f + "");
                }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un numero positivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCalcularFactActionPerformed

    private void btnResetFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetFactActionPerformed
        txtNumero.setText("");
        txtFactorial.setText("");
        dlm.clear();
    }//GEN-LAST:event_btnResetFactActionPerformed

    private void btnExitFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitFactActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnExitFactActionPerformed
    //Fin Ejercicio3_20
    
    //---------------------------------------------------------------------------------------------------
    
    //Inicio Ejercicio1_11
    private void btnCalcularHecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularHecActionPerformed
        String as = txtAcres.getText();
        double ai = Double.parseDouble(as);
        
        double res = ai * 4047/10000;
        txtHectareas.setText(res + "");
        
    }//GEN-LAST:event_btnCalcularHecActionPerformed

    private void btnResetHecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetHecActionPerformed
        txtAcres.setText("");
        txtHectareas.setText("");
    }//GEN-LAST:event_btnResetHecActionPerformed

    private void btnExitHecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitHecActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnExitHecActionPerformed
    //Fin Ejercicio1_11
    
    //---------------------------------------------------------------------------------------------------
    
    //Inicio Ejercicio1_11 radio
    private void rdoHectareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoHectareasActionPerformed
        //Captar errores y ingresos por teclado no permitidos
        try{
        //Activar el boton Nuevo y cambiar el estado del lbl a la unidad elegida
        btnNuevoAcHec.setEnabled(true);
        lblAoH.setText("A elegido Hectareas");
        //------------------------------------------------------------------------
        
        //Obtener el numero ingresado por teclado y convertirlo de string a double
        String ahcs = txtAcresConv.getText();
        double ahcd = Double.parseDouble(ahcs);
        //------------------------------------------------------------------------
        
        //Mostrar en un label que a elegido y en que lo convierte
        lblElegido.setText(ahcd + " Hectáreas son");
        lblResultado.setText("Acres");
        //------------------------------------------------------------------------
        
        //Formula para el calculo
        double res = ahcd * 10000/4047;
        txtSwitch.setText(res + "");
        //------------------------------------------------------------------------ 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero real", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //------------------------------------------------------------------------
    }//GEN-LAST:event_rdoHectareasActionPerformed

    private void rdoAcresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAcresActionPerformed
        //Captar errores y ingresos por teclado no permitidos
        try{
        //Activar el boton Nuevo y cambiar el estado del lbl a la unidad elegida
        btnNuevoAcHec.setEnabled(true);
        lblAoH.setText("A elegido Acres");
        //------------------------------------------------------------------------
        
        //Obtener el numero ingresado por teclado y convertirlo de string a double
        String hacs = txtAcresConv.getText();
        double hacd = Double.parseDouble(hacs);
        //------------------------------------------------------------------------
        
        //Mostrar en un label que a elegido y en que lo convierte
        lblElegido.setText(hacd + " Acres son");
        lblResultado.setText("Hectáreas");
        //------------------------------------------------------------------------
        
        //Formula para el calculo
        double res = hacd * 4047/10000;
        txtSwitch.setText(res + "");
        //------------------------------------------------------------------------
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero real", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //------------------------------------------------------------------------
    }//GEN-LAST:event_rdoAcresActionPerformed

    private void btnExitAcHecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitAcHecActionPerformed
        dispose();
        System.exit(0);
        
    }//GEN-LAST:event_btnExitAcHecActionPerformed

    private void btnNuevoAcHecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAcHecActionPerformed
        txtAcresConv.setText("");
        txtSwitch.setText("");
        lblAoH.setText("");
        lblElegido.setText("");
        lblResultado.setText("");
        extension.clearSelection();
        btnNuevoAcHec.setEnabled(false);
    }//GEN-LAST:event_btnNuevoAcHecActionPerformed
    //Fin Ejercicio1_11 radio
    
    //---------------------------------------------------------------------------------------------------
    
    //Inicio Ejercicio1_17
    private void btnNuevoConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoConvActionPerformed
        btnCalcularConv.setEnabled(true);
        txtConvert.setText("");
        dlmc.clear();
        btnNuevoConv.setEnabled(false);
        lblAccionConv.setText("");
    }//GEN-LAST:event_btnNuevoConvActionPerformed

    private void btnExitConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitConvActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnExitConvActionPerformed
    //Fin Ejercicio1_17 
    
    //---------------------------------------------------------------------------------------------------
    
    //Inicio Ejercicio2_15
    // Método para formatear el array como una cadena de números separados por comas
    private String formatArrayAsString(double[] numbers) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numbers.length; i++) {
        sb.append((int)numbers[i]);
        if (i < numbers.length - 1) {
            sb.append(", ");
        }
    }
    return sb.toString();
    }
    //---------------------------------------------------------------------------------------------------

    private void btnCalcularOrdenadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularOrdenadosActionPerformed
        /*Configuramos que el sistema nos permita ingresar cuatro numeros seguidos 
        en la casilla entrada modificando el label en funcion del numero a introducir
        tambien configuramos el try and catch para un posible error
        (recuerda que tambien lo puedes hacer con patron)
        Tambien colectamos la entrada de la casilla y la convertimos a un double 
        y utilizamos el metodo para convertir a int*/
        
        try{
            String ords = txtNumerosOrdenados.getText();
            int ordi = Integer.parseInt(ords);
            txtNumerosOrdenados.requestFocusInWindow();
            
            
            switch(step){
                case 1:
                    firstNumber = ordi;
                    txtNumerosOrdenados.setText("");
                    lblNumerosOrdenados.setText("Ingrese numero 2: ");
                    step++;
                    break;
                    
                case 2:
                    secondNumber = ordi;
                    txtNumerosOrdenados.setText("");
                    lblNumerosOrdenados.setText("Ingrese numero 3: ");
                    step++;
                    break;
                    
                case 3:
                    thirdNumber = ordi;
                    txtNumerosOrdenados.setText("");
                    lblNumerosOrdenados.setText("Ingrese numero 4: ");
                    step++;
                    break;
                    
                case 4:
                    fourthNumber = ordi;
                    txtNumerosOrdenados.setText("");
                    lblNumerosOrdenados.setText("                  ");
                    lblComparingOrdenados.setText("Evaluando...");
                    step = 1;
                    
            double[] numbers = {firstNumber, secondNumber, thirdNumber, fourthNumber};
                       
            
            if(numbers[0] < numbers[1]  && numbers[1] < numbers[2]  && numbers[2] < numbers[3]){
                txtResultadosOrdenados.setText("Numeros ordenados en forma creciente.");
                
            }else{
                Arrays.sort(numbers);
                txtResultadosNumerosOrdenados.setVisible(true);
                txtResultadosOrdenados.setText("Numeros no ordenados en forma creciente.");
                lblOrdenados.setText("Los numeros ordenados son: ");
                txtResultadosNumerosOrdenados.setText(formatArrayAsString(numbers));
                }
            btnCalcularOrdenados.setEnabled(false);
            break;
            }      
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid entry", "Error", JOptionPane.ERROR_MESSAGE);
        }
        btnResetOrdenados.setEnabled(true);
        //------------------------------------------------------------------------
    }//GEN-LAST:event_btnCalcularOrdenadosActionPerformed

    private void btnResetOrdenadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetOrdenadosActionPerformed
        btnCalcularOrdenados.setEnabled(true);
        btnResetOrdenados.setEnabled(false);
        txtNumerosOrdenados.setText(""); // Borrar el texto de entrada actual
        txtResultadosOrdenados.setText("");
        lblComparingOrdenados.setText("");
        txtResultadosNumerosOrdenados.setText("");
        txtResultadosNumerosOrdenados.setVisible(false);
        lblOrdenados.setText("");
        lblNumerosOrdenados.setText("Ingrese numero 1: ");
        
        step = 1;
        
    }//GEN-LAST:event_btnResetOrdenadosActionPerformed

    private void btnExitOrdenadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitOrdenadosActionPerformed
        System.exit(0);
        dispose();
    }//GEN-LAST:event_btnExitOrdenadosActionPerformed
    //Fin Ejercicio2_15 
    
    //---------------------------------------------------------------------------------------------------
    
    //Inicio Ejercicio3_12
    private void btnCalcularMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMultiplicarActionPerformed
        /*try and set for errors
        get the input and convert it to int
        process and possible variables
        establish the output and the way buttons behave 
        */
        
        try{
        
        String mults = txtNumerosMultiplicar.getText();
        int multi = Integer.parseInt(mults);
        
        dlmm.clear();
        
        for(int i = 1; i<=10; i++){
            String operation = i + " x " + multi + " = " + (i * multi);
            dlmm.addElement(" " + i + " x " + multi + " = " + i * multi + " ");
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter an integer number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        btnCalcularMultiplicar.setEnabled(false);
        btnResetMultiplicar.setEnabled(true);
    }//GEN-LAST:event_btnCalcularMultiplicarActionPerformed

    private void btnResetMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetMultiplicarActionPerformed
        btnResetMultiplicar.setEnabled(false);
        btnCalcularMultiplicar.setEnabled(true);
        txtNumerosMultiplicar.setText("");
        dlmm.clear();
    }//GEN-LAST:event_btnResetMultiplicarActionPerformed

    private void btnExitMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitMultiplicarActionPerformed
        System.exit(0);
        dispose();
    }//GEN-LAST:event_btnExitMultiplicarActionPerformed
        //Fin Ejercicio3_12 
    
        //---------------------------------------------------------------------------------------------------
    
        //Accion para el boton Convertir de Ejercicio1_17 inicio
    private void btnCalcularConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularConvActionPerformed
        //Habilitar boton Nuevo
        btnNuevoConv.setEnabled(true);
        //------------------------------------------------------------------------

        //Controlar posibles errores por ingreso de valores incorrectos
        try{
            //Recuperar el numero ingresado por teclado y convertirlo de string a int
            String cants = txtConvert.getText();
            int canti = Integer.parseInt(cants);
            //------------------------------------------------------------------------

            //Variables necesarias para el proceso
            int b50, b20, b10, b5, b1, rest50, rest20, rest10, rest5;
            //------------------------------------------------------------------------

            //Mostrar un mensaje en en lbl
            lblAccionConv.setText("Convirtiendo " + canti + " ...");

            //Proceso

            b50 = canti / 50;
            rest50 = canti %50;

            b20 = rest50 / 20;
            rest20 = rest50 % 20;

            b10 = rest20 / 10;
            rest10 = rest20 % 10;

            b5 = rest10 / 5;
            rest5 = rest10 % 5;

            b1 = rest5 / 1;

            //------------------------------------------------------------------------

            //Enviar el resultado al listado
            dlmc.addElement(" B50: " + b50);
            dlmc.addElement(" B20: " + b20);
            dlmc.addElement(" B10: " + b10);
            dlmc.addElement(" B5:  " + b5);
            dlmc.addElement(" B1:  " + b1);
            //------------------------------------------------------------------------

            //Bloquar boton Convertir hasta presionar Nuevo
            btnCalcularConv.setEnabled(false);
            //------------------------------------------------------------------------

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter an integer number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //------------------------------------------------------------------------
    }//GEN-LAST:event_btnCalcularConvActionPerformed
    //Accion para el boton Convertir de Ejercicio1_17 Fin    
    
    //---------------------------------------------------------------------------------------------------
    
    //Ejercicio3_16 Inicio
    private void btnCalcularNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularNotaActionPerformed
        /*Prevenir posibles errores try and catch
        Obtener numero de la casilla de ingreso e convertirlo a int
        Proceso para sacar el promedio de las notas y excluir la menor
        Funcion para desabilitar y habilitar botones
        */
        try{
        String notas = txtNumerosNota.getText();
        String patron = "(10|[0-9](?:[.,][0-9]{1,2})?)";
        
        if(!notas.matches(patron)){ 
            JOptionPane.showMessageDialog(null, "Please enter a score between 0-10", "Information", JOptionPane.INFORMATION_MESSAGE);
            txtNumerosNota.setText("");
            txtNumerosNota.requestFocusInWindow();
            return;
        }
        
        notas = notas.replace(",", ".");
        double notai = Double.parseDouble(notas);
        txtNumerosNota.requestFocusInWindow();
        
           
            switch(step){
                case 1:
                    firstNumber = notai;
                    txtNumerosNota.setText("");
                    lblNumerosNota.setText("Ingrese Nota 2: ");
                    step++;
                    break;
                    
                case 2:
                    secondNumber = notai;
                    txtNumerosNota.setText("");
                    lblNumerosNota.setText("Ingrese Nota 3: ");
                    step++;
                    break;
                    
                case 3:
                    thirdNumber = notai;
                    txtNumerosNota.setText("");
                    lblNumerosNota.setText("Ingrese Nota 4: ");
                    btnCalcularNota.setText("Calcular");
                    step++;
                    break;
                    
                case 4:
                    fourthNumber = notai;
                    txtNumerosNota.setText("");
                    lblNumerosOrdenados.setText("                  ");
                    step = 1;
                    
            double[] numbers = {firstNumber, secondNumber, thirdNumber, fourthNumber};
            
            
            double menorNota = numbers[0];
            for(int i = 1; i < numbers.length; i++){
                if(numbers[i] < menorNota){
                    menorNota = numbers[i];
                }
            }
            
            double sum = 0;
            for(double number : numbers){
                sum += number;
            }
            double promedio = (sum - menorNota)/3;
            
            lblNota1.setText("<html>Nota 1:   " + formatNota(firstNumber, firstNumber == menorNota) + "</html>");
            lblNota2.setText("<html>Nota 2:   " + formatNota(secondNumber, secondNumber == menorNota) + "</html>");
            lblNota3.setText("<html>Nota 3:   " + formatNota(thirdNumber, thirdNumber == menorNota) + "</html>");
            lblNota4.setText("<html>Nota 4:   " + formatNota(fourthNumber, fourthNumber == menorNota) + "</html>");
            
            txtNotaPromedio.setText(formatPromedio(promedio));
            lblNotasElegidas.setText("Notas ingresadas: ");
            lblNumerosNota.setVisible(false);
            btnCalcularNota.setEnabled(false);
            btnResetNota.setEnabled(true);
            btnCalcularNota.setVisible(false);
            txtNumerosNota.setVisible(false);
            btnResetNota.requestFocusInWindow();
            break;
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter a valid score", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCalcularNotaActionPerformed

    //Metodo para formatear la nota segun sea entera o decimal, otro metodo para redondear el promedio y cambiar de color la nota a exlcuir y tacharla
    private String formatNota(double nota, boolean isMenor){
            String formattedNota;
        
            if (Math.floor(nota) == nota) {
            // If nota is a whole number, format without decimal places
                formattedNota = String.format("%.0f", nota);
            } else if (Math.abs(nota * 10 % 1) < 0.000001) { // Tolerancia de 10^-6
            // Si nota tiene un decimal, formatear con un decimal
                formattedNota = String.format("%.1f", nota);
            } else {
            // Otherwise, format with two decimal places
                formattedNota = String.format("%.2f", nota).replaceAll("\\.0*$", "");
            }
            
            if(isMenor){
                return "<span style='color:red;'><strike>" + formattedNota + "</strike></span>"; 
            }else{
                return formattedNota;
            }
            
        }
    private String formatPromedio(double media) {
            double roundedPromedio = Math.round(media * 10.0) / 10.0; //Redondear la media a un solo decimal
        
        
            if (Math.abs(roundedPromedio - (int) roundedPromedio) < 0.000001){ //Verificar si la parte decimal es cero
                return String.format("%.0f", roundedPromedio); //Si la parte decimal es cero, formatear como número entero
            }else{
                return String.format("%.1f", roundedPromedio); //Si la parte decimal no es cero, formatear con un decimal
            }
        }
    //------------------------------------------------------------------------
    
    
    private void btnResetNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetNotaActionPerformed
            btnCalcularNota.setVisible(true);
            txtNumerosNota.setVisible(true);
            lblNumerosNota.setVisible(true);
            lblNota1.setText("");
            lblNota2.setText("");
            lblNota3.setText("");
            lblNota4.setText("");
            lblNumerosNota.setText("Ingrese Nota 1: ");
            txtNotaPromedio.setText("");
            btnCalcularNota.setEnabled(true);
            btnResetNota.setEnabled(false);
            txtNumerosNota.requestFocusInWindow();
            step = 1;
    }//GEN-LAST:event_btnResetNotaActionPerformed

    private void btnExitNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitNotaActionPerformed
        System.exit(0);
        dispose();
    }//GEN-LAST:event_btnExitNotaActionPerformed
    //Ejercicio3_16 Fin
    
    //---------------------------------------------------------------------------------------------------
    
    //Ejercicio2_18 Inicio
    private void btnCalcularCat2_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCat2_18ActionPerformed
        try{
        String sueldos = txtSueldo2_18.getText();
        double sueldod = Double.parseDouble(sueldos);
        
        String categoria = txtCategoria2_18.getText().trim();
        
        double sueldoAumento;
        
        if(categoria.endsWith("€")){
            int cantidad = Integer.parseInt(categoria.replace("€", "").trim());
            sueldoAumento = sueldod + cantidad;    
        }else if(categoria.endsWith("%")){
            categoria = categoria.substring(0, categoria.length() -1).trim(); //Eliminar el ultimo carácter(%) y convertir a entero
            int categoriai = Integer.parseInt(categoria);
            sueldoAumento = sueldod * (1 + (categoriai / 100.0));
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione Años Trabajados.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        txtSueldoAumento2_18.setText(String.format("%.2f €", sueldoAumento));
        
        String aniosTrabajados = "";
        switch (categoria) {
            case "15":
                aniosTrabajados = "20-30 años";
                break;
            case "12":
                aniosTrabajados = "15-20 años";
                break;
            case "10":
                aniosTrabajados = "10-15 años";
                break;
            case "15€":
                aniosTrabajados = "0-10 años";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Categoría no reconocida para calcular los años trabajados.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
        
        lblAnios2_18.setText("Ha trabajado entre: " + aniosTrabajados + ".");
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid Entry", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnCalcularCat2_18ActionPerformed

    private void btnExitCat2_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCat2_18ActionPerformed
        System.exit(0);
        dispose();
    }//GEN-LAST:event_btnExitCat2_18ActionPerformed

    private void cboCategoria2_18ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCategoria2_18ItemStateChanged
            String items = (String)cboCategoria2_18.getSelectedItem();
            
            if(!items.equals("Seleccionar")){
            switch(items){
                case "20-30":
                    txtCategoria2_18.setText("15%");
                    break;
                case "15-20":
                    txtCategoria2_18.setText("12%");
                    break;
                case "10-15":
                    txtCategoria2_18.setText("10%");
                    break;
                case "0-10":
                    txtCategoria2_18.setText("15€");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Categoría no existe.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }else{
             txtCategoria2_18.setText("");
            }
    }//GEN-LAST:event_cboCategoria2_18ItemStateChanged

    private void btnNuevoCat2_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCat2_18ActionPerformed
        txtCategoria2_18.setText("");
        txtSueldo2_18.setText("");
        txtSueldoAumento2_18.setText("");
        lblAnios2_18.setText("");
        cboCategoria2_18.setSelectedIndex(0);
    }//GEN-LAST:event_btnNuevoCat2_18ActionPerformed
    //Ejercicio2_18 Fin
    
    //---------------------------------------------------------------------------------------------------
    
    //Main Inicio
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
            java.util.logging.Logger.getLogger(VentanaEjercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEjercicios().setVisible(true);
            }
        });
    }
    //Main Fin

    //---------------------------------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcularCat;
    private javax.swing.JButton btnCalcularCat2_18;
    private javax.swing.JButton btnCalcularConv;
    private javax.swing.JButton btnCalcularFact;
    private javax.swing.JButton btnCalcularHec;
    private javax.swing.JButton btnCalcularMultiplicar;
    private javax.swing.JButton btnCalcularNota;
    private javax.swing.JButton btnCalcularOrdenados;
    private javax.swing.JButton btnCalcularX;
    private javax.swing.JButton btnExitAcHec;
    private javax.swing.JButton btnExitCat;
    private javax.swing.JButton btnExitCat2_18;
    private javax.swing.JButton btnExitConv;
    private javax.swing.JButton btnExitFact;
    private javax.swing.JButton btnExitHec;
    private javax.swing.JButton btnExitMultiplicar;
    private javax.swing.JButton btnExitNota;
    private javax.swing.JButton btnExitOrdenados;
    private javax.swing.JButton btnExitX;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoAcHec;
    private javax.swing.JButton btnNuevoCat;
    private javax.swing.JButton btnNuevoCat2_18;
    private javax.swing.JButton btnNuevoConv;
    private javax.swing.JButton btnResetFact;
    private javax.swing.JButton btnResetHec;
    private javax.swing.JButton btnResetMultiplicar;
    private javax.swing.JButton btnResetNota;
    private javax.swing.JButton btnResetOrdenados;
    private javax.swing.JButton btnResetX;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboCategoria2_18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel lbl2_18;
    private javax.swing.JLabel lblAccionConv;
    private javax.swing.JLabel lblAcres;
    private javax.swing.JLabel lblAcresConv;
    private javax.swing.JLabel lblAnios;
    private javax.swing.JLabel lblAnios2_18;
    private javax.swing.JLabel lblAoH;
    private javax.swing.JLabel lblAyB;
    private javax.swing.JLabel lblCantitadConv;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblComparingOrdenados;
    private javax.swing.JLabel lblComparingX;
    private javax.swing.JLabel lblElegido;
    private javax.swing.JLabel lblHectareas;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblNota3;
    private javax.swing.JLabel lblNota4;
    private javax.swing.JLabel lblNotaPromedio;
    private javax.swing.JLabel lblNotasElegidas;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumerosMultiplicar;
    private javax.swing.JLabel lblNumerosNota;
    private javax.swing.JLabel lblNumerosOrdenados;
    private javax.swing.JLabel lblNumerosX;
    private javax.swing.JLabel lblOrdenados;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblSueldo1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblToConv;
    private javax.swing.JList<String> lstFactorial;
    private javax.swing.JList<String> lstMultiplicar;
    private javax.swing.JList<String> lstResultadosConv;
    private javax.swing.JRadioButton rdoAcres;
    private javax.swing.JRadioButton rdoHectareas;
    private javax.swing.JSeparator sep1;
    private javax.swing.JSeparator sep2;
    private javax.swing.JSeparator sep3;
    private javax.swing.JTable tblPromedio;
    private javax.swing.JTextField txtAcres;
    private javax.swing.JTextField txtAcresConv;
    private javax.swing.JTextField txtAyB;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCategoria2_18;
    private javax.swing.JTextField txtConvert;
    private javax.swing.JTextField txtFactorial;
    private javax.swing.JTextField txtHectareas;
    private javax.swing.JTextField txtNotaPromedio;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumerosMultiplicar;
    private javax.swing.JTextField txtNumerosNota;
    private javax.swing.JTextField txtNumerosOrdenados;
    private javax.swing.JTextField txtNumerosX;
    private javax.swing.JTextArea txtResultados;
    private javax.swing.JTextField txtResultadosNumerosOrdenados;
    private javax.swing.JTextField txtResultadosOrdenados;
    private javax.swing.JTextField txtResultadosX;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtSueldo2_18;
    private javax.swing.JTextField txtSueldoAumento;
    private javax.swing.JTextField txtSueldoAumento2_18;
    private javax.swing.JTextField txtSwitch;
    // End of variables declaration//GEN-END:variables
}
