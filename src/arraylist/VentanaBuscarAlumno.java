package arraylist;

import java.awt.Image;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
//import javax.swing.JTextField;

public class VentanaBuscarAlumno extends javax.swing.JFrame {

    //Base datos
    List<Alumno> alumnos_al = new ArrayList<>();
    DefaultListModel<String> modelListId = new DefaultListModel<>();
    DefaultListModel<String> modelListNombre = new DefaultListModel<>();
    DefaultListModel<String> modelListNombreCbo = new DefaultListModel<>();
    
    ButtonGroup edad = new ButtonGroup();
    
    //Personalizar Ventana inicio
    public VentanaBuscarAlumno() {
        initComponents();
        personalizarVentana();
        anadirPorDefecto();
        llenarComboBox();
        lstAsignaturasId.setModel(modelListId);
        lstAsignaturasNombre.setModel(modelListNombre);
        lstAsignaturasCbo.setModel(modelListNombreCbo);
        edad.add(rdoMenor);
        edad.add(rdoMayor);
    }//Personalizar Ventana fin
    
    //Llenar ComboBox inicio
    public void llenarComboBox(){
        if(alumnos_al.size() > 0){
            for(Alumno alumno : alumnos_al){
                cboMostrar.setSelectedIndex(-1);
                cboMostrar.addItem(alumno.getIdAlumno());
            }
        }else{
            JOptionPane.showMessageDialog(null,"Lista Alumnos Vacia", "404", JOptionPane.ERROR_MESSAGE);
        }       
    }//Llenar ComboBox fin
    
    //Aniadir Alumnos
    public void anadirPorDefecto() {
        List<String> asignaturas1_al = new ArrayList<>();
        asignaturas1_al.add("Física");
        asignaturas1_al.add("Química");
        asignaturas1_al.add("Inglés");
        asignaturas1_al.add("Arte");
        Alumno alumno1 = new Alumno("A1", "Luis", "Roncal", 15, asignaturas1_al);

        Alumno alumno2 = new Alumno("A2", "Luis", "Lescano", 18, asignaturas1_al);
        Alumno alumno3 = new Alumno("A3", "Miguel", "Alva", 16, new ArrayList<>(Arrays.asList("Religión","Matemática","Física","Química")));
        Alumno alumno4 = new Alumno("A4", "Maria", "Ales", 12, new ArrayList<>(Arrays.asList("Literatura","Matemática","Física","Arte")));
        Alumno alumno5 = new Alumno("A5", "Paul", "Bresca", 21, new ArrayList<>(Arrays.asList("Arte","Matemática","Física","Química")));
        Alumno alumno6 = new Alumno("A6", "Andrew", "Gutierrez", 19, new ArrayList<>(Arrays.asList("Psicología","Matemática","Economía","Química")));
        Alumno alumno7 = new Alumno("A7", "Valeria", "Perez", 18, new ArrayList<>(Arrays.asList("Informática","Matemática","Física","Química")));
        Alumno alumno8 = new Alumno("A8", "Iker", "Morales", 14, new ArrayList<>(Arrays.asList("Ciencias","Matemática","Arte","Química")));
        Alumno alumno9 = new Alumno("A9", "Santiago", "Mateo", 13, new ArrayList<>(Arrays.asList("Inglés","Matemática","Física","Química")));
        Alumno alumno10 = new Alumno("A10", "Julieta", "Benvolio", 12, new ArrayList<>(Arrays.asList("Sociología","Matemática","Ciencias","Arte")));
        Alumno alumno11 = new Alumno("A11", "Romeo", "Mercucio", 21, new ArrayList<>(Arrays.asList("Economía","Matemática","Inglés","Química")));
        Alumno alumno12 = new Alumno("A12", "Blanco", "Negro", 14, new ArrayList<>(Arrays.asList("Arte","Matemática","Física","Química")));
        Alumno alumno13 = new Alumno("A13", "Moreno", "Alpes", 19, new ArrayList<>(Arrays.asList("Economía","Matemática","Inglés","Química")));
        Alumno alumno14 = new Alumno("A14", "Gregoria", "Alvarez", 15, new ArrayList<>(Arrays.asList("Economía","Matemática","Inglés","Química")));
        Alumno alumno15 = new Alumno("A15", "Alba", "Morae", 19, new ArrayList<>(Arrays.asList("Arte","Matemática","Inglés","Química")));
        Alumno alumno16 = new Alumno("A16", "Veronica", "Gonzalo", 18, new ArrayList<>(Arrays.asList("Economía","Matemática","Inglés","Química")));
        Alumno alumno17 = new Alumno("A17", "Alfa", "Leao", 17, new ArrayList<>(Arrays.asList("Religión","Matemática","Inglés","Química")));
        Alumno alumno18 = new Alumno("A18", "Rafael", "Bonavida", 16, new ArrayList<>(Arrays.asList("Economía","Matemática","Inglés","Química")));
        Alumno alumno19 = new Alumno("A19", "Migue", "Mateo", 11, new ArrayList<>(Arrays.asList("Economía","Informática","Inglés","Religión")));
        Alumno alumno20 = new Alumno("A20", "Mora", "Vera", 13, new ArrayList<>(Arrays.asList("Arte","Filosofía","Inglés","Química")));
        Alumno alumno21 = new Alumno("A21", "Alexa", "Preda", 11, new ArrayList<>(Arrays.asList("Economía","Arte","Inglés","Química")));
        
        alumnos_al.add(alumno1);
        alumnos_al.add(alumno2);
        alumnos_al.add(alumno3);
        alumnos_al.add(alumno4);
        alumnos_al.add(alumno5);
        alumnos_al.add(alumno6);
        alumnos_al.add(alumno7);
        alumnos_al.add(alumno8);
        alumnos_al.add(alumno9);
        alumnos_al.add(alumno10);
        alumnos_al.add(alumno11);
        alumnos_al.add(alumno12);
        alumnos_al.add(alumno13);
        alumnos_al.add(alumno14);
        alumnos_al.add(alumno15);
        alumnos_al.add(alumno16);
        alumnos_al.add(alumno17);
        alumnos_al.add(alumno18);
        alumnos_al.add(alumno19);
        alumnos_al.add(alumno20);
        alumnos_al.add(alumno21);
    }//Aniadir Alumnos fin
    
    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/icono.icns");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana
        
        this.setTitle("Search");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla 
    }    
    
    //Metodo para imprimir la info de las personas incio
    public void pintarInfoAlumnos(int indice){
        alumnos_al.get(indice);
        txtIdNav.setText(indice + "");
        /*txtNombre.setText(alumnos_al.
        txtPaterno.setText(persona.getPaterno());
        txtDireccion.setText(persona.getDireccion());
        txtTelefono.setText(persona.getTelefono());
        txtNacimiento.setText(persona.getNacimiento());*/
    }//Metodo para imprimir la info de las personas fin
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        cmdBuscarNombre = new javax.swing.JButton();
        rdoMenor = new javax.swing.JRadioButton();
        jtpVacio = new javax.swing.JTabbedPane();
        lblBuscar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMostrar = new javax.swing.JTextArea();
        txtBuscarNombre = new javax.swing.JTextField();
        lblBuscarNombre = new javax.swing.JLabel();
        cmdNuevoNombre = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAsignaturasNombre = new javax.swing.JList<>();
        lblAsignaturas = new javax.swing.JLabel();
        lblListado = new javax.swing.JLabel();
        jpAPELLIDO = new javax.swing.JPanel();
        lblAsignatura = new javax.swing.JLabel();
        txtAsignatura = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaAlumnos = new javax.swing.JTextArea();
        btnBuscarAlumnos = new javax.swing.JButton();
        btnNuevoAlumnos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cboMostrar = new javax.swing.JComboBox<>();
        txtIdAlumnoCbo = new javax.swing.JTextField();
        lblComboBox = new javax.swing.JLabel();
        txtEdadAlumnoCbo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreAlumnoCbo = new javax.swing.JTextField();
        txtApellidoAlumnoCbo = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstAsignaturasCbo = new javax.swing.JList<>();
        btnNuevoComboBox = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jpID = new javax.swing.JPanel();
        lblIdAlumno = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        btnBuscarId = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTodo = new javax.swing.JTextField();
        btnNuevoId = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstAsignaturasId = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        idAlumno = new javax.swing.JLabel();
        lblNombreNav = new javax.swing.JLabel();
        lblApellidoNav = new javax.swing.JLabel();
        lblEdadNav = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstAsignaturasNav = new javax.swing.JList<>();
        txtIdNav = new javax.swing.JTextField();
        txtNombreNav = new javax.swing.JTextField();
        txtApellidoNav = new javax.swing.JTextField();
        txtEdadNav = new javax.swing.JTextField();
        btnInicioNav = new javax.swing.JButton();
        btnIzquierdaNav = new javax.swing.JButton();
        btnDerechaNav = new javax.swing.JButton();
        btnResetNav = new javax.swing.JButton();
        btnGuardarNav = new javax.swing.JButton();
        btnFinalNav = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rdoMayor = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaMostrarEdades = new javax.swing.JTextArea();
        btnNuevoEdadRdo = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        cmdBuscarNombre.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        cmdBuscarNombre.setText("Buscar");
        cmdBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarNombreActionPerformed(evt);
            }
        });

        rdoMenor.setText("Menor");
        rdoMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMenorActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 480));
        setSize(new java.awt.Dimension(450, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtpVacio.setToolTipText("");

        txaMostrar.setEditable(false);
        txaMostrar.setColumns(20);
        txaMostrar.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        txaMostrar.setRows(5);
        txaMostrar.setToolTipText("");
        txaMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txaMostrar);

        txtBuscarNombre.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        txtBuscarNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNombreActionPerformed(evt);
            }
        });

        lblBuscarNombre.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblBuscarNombre.setText("Buscar por Nombre:");

        cmdNuevoNombre.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        cmdNuevoNombre.setText("Nuevo");
        cmdNuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoNombreActionPerformed(evt);
            }
        });

        lstAsignaturasNombre.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        jScrollPane2.setViewportView(lstAsignaturasNombre);

        lblAsignaturas.setText("Asignaturas");

        lblListado.setText("Listado");

        javax.swing.GroupLayout lblBuscarLayout = new javax.swing.GroupLayout(lblBuscar);
        lblBuscar.setLayout(lblBuscarLayout);
        lblBuscarLayout.setHorizontalGroup(
            lblBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblBuscarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(lblBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblBuscarLayout.createSequentialGroup()
                        .addComponent(lblListado)
                        .addGap(167, 167, 167)
                        .addComponent(lblAsignaturas)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblBuscarLayout.createSequentialGroup()
                        .addGroup(lblBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBuscarNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(lblBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBuscarNombre)
                            .addComponent(cmdNuevoNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        lblBuscarLayout.setVerticalGroup(
            lblBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblBuscarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(lblBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lblBuscarLayout.createSequentialGroup()
                        .addComponent(lblBuscarNombre)
                        .addGap(31, 31, 31))
                    .addGroup(lblBuscarLayout.createSequentialGroup()
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdNuevoNombre)))
                .addGap(18, 18, 18)
                .addGroup(lblBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsignaturas)
                    .addComponent(lblListado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jtpVacio.addTab("Nombre", lblBuscar);

        lblAsignatura.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblAsignatura.setText("Ingresar asignatura: ");

        txtAsignatura.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        txtAsignatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsignaturaActionPerformed(evt);
            }
        });

        txaAlumnos.setEditable(false);
        txaAlumnos.setColumns(20);
        txaAlumnos.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        txaAlumnos.setRows(5);
        jScrollPane4.setViewportView(txaAlumnos);

        btnBuscarAlumnos.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnBuscarAlumnos.setText("Buscar");
        btnBuscarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlumnosActionPerformed(evt);
            }
        });

        btnNuevoAlumnos.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnNuevoAlumnos.setText("Nuevo");
        btnNuevoAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAPELLIDOLayout = new javax.swing.GroupLayout(jpAPELLIDO);
        jpAPELLIDO.setLayout(jpAPELLIDOLayout);
        jpAPELLIDOLayout.setHorizontalGroup(
            jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAPELLIDOLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsignatura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAsignatura)
                    .addComponent(btnNuevoAlumnos))
                .addGap(48, 48, 48))
        );
        jpAPELLIDOLayout.setVerticalGroup(
            jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsignatura)
                    .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                        .addComponent(btnBuscarAlumnos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevoAlumnos))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jtpVacio.addTab("Alumnos x Asignatura", jpAPELLIDO);

        cboMostrar.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        cboMostrar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMostrarItemStateChanged(evt);
            }
        });

        txtIdAlumnoCbo.setEditable(false);
        txtIdAlumnoCbo.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        txtIdAlumnoCbo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblComboBox.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblComboBox.setText("Elige un Id (Ejemplo A1): ");

        txtEdadAlumnoCbo.setEditable(false);
        txtEdadAlumnoCbo.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        txtEdadAlumnoCbo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("ID");

        jLabel2.setText("Edad");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        txtNombreAlumnoCbo.setEditable(false);
        txtNombreAlumnoCbo.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        txtNombreAlumnoCbo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtApellidoAlumnoCbo.setEditable(false);
        txtApellidoAlumnoCbo.setFont(new java.awt.Font("Courier New", 1, 13)); // NOI18N
        txtApellidoAlumnoCbo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jScrollPane5.setViewportView(lstAsignaturasCbo);

        btnNuevoComboBox.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnNuevoComboBox.setText("Nuevo");
        btnNuevoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Asignaturas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblComboBox)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(74, 74, 74)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtEdadAlumnoCbo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jLabel4))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2)
                                            .addGap(11, 11, 11))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel3))
                                .addComponent(txtIdAlumnoCbo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreAlumnoCbo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidoAlumnoCbo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnNuevoComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel5))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevoComboBox)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdAlumnoCbo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdadAlumnoCbo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreAlumnoCbo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoAlumnoCbo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jtpVacio.addTab("Id ComboBox", jPanel1);

        lblIdAlumno.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        lblIdAlumno.setText("Ingresar IdAlumno (Ejemplo: A1): ");

        txtIdAlumno.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        txtIdAlumno.setForeground(new java.awt.Color(0, 0, 255));
        txtIdAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAlumnoActionPerformed(evt);
            }
        });

        btnBuscarId.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnBuscarId.setText("Buscar");
        btnBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtApellido.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 255));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEdad.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 255));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtTodo.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N

        btnNuevoId.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnNuevoId.setText("Nuevo");
        btnNuevoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoIdActionPerformed(evt);
            }
        });

        lstAsignaturasId.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jScrollPane3.setViewportView(lstAsignaturasId);

        jLabel6.setText("Nombre");

        jLabel7.setText("Apellido");

        jLabel8.setText("Edad");

        jLabel9.setText("Toda la Biblioteca");

        jLabel10.setText("Asignaturas");

        javax.swing.GroupLayout jpIDLayout = new javax.swing.GroupLayout(jpID);
        jpID.setLayout(jpIDLayout);
        jpIDLayout.setHorizontalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIDLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpIDLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(68, 68, 68))
                            .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpIDLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel6)
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabel7)
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel8))
                                .addGroup(jpIDLayout.createSequentialGroup()
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)))
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jpIDLayout.createSequentialGroup()
                                    .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNuevoId)))
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jpIDLayout.setVerticalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIDLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdAlumno)
                    .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNuevoId))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jtpVacio.addTab("Id", jpID);

        idAlumno.setText("Id Alumno");

        lblNombreNav.setText("Nombre");

        lblApellidoNav.setText("Apellido");

        lblEdadNav.setText("Edad");

        jLabel14.setText("Asignaturas");

        jScrollPane7.setViewportView(lstAsignaturasNav);

        btnInicioNav.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnInicioNav.setText("Inicio");
        btnInicioNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioNavActionPerformed(evt);
            }
        });

        btnIzquierdaNav.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnIzquierdaNav.setText("<<");
        btnIzquierdaNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaNavActionPerformed(evt);
            }
        });

        btnDerechaNav.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDerechaNav.setText(">>");
        btnDerechaNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaNavActionPerformed(evt);
            }
        });

        btnResetNav.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnResetNav.setText("Reset");
        btnResetNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetNavActionPerformed(evt);
            }
        });

        btnGuardarNav.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnGuardarNav.setText("Guardar");
        btnGuardarNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNavActionPerformed(evt);
            }
        });

        btnFinalNav.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnFinalNav.setText("Final");
        btnFinalNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalNavActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnResetNav, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnInicioNav)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIzquierdaNav)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnDerechaNav)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFinalNav))
                            .addComponent(btnGuardarNav)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idAlumno)
                            .addComponent(lblNombreNav)
                            .addComponent(lblApellidoNav)
                            .addComponent(lblEdadNav))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreNav, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoNav, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdNav, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdadNav, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel14))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idAlumno)
                        .addComponent(txtIdNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombreNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreNav))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApellidoNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblApellidoNav))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEdadNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEdadNav)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnIzquierdaNav)
                        .addComponent(btnDerechaNav))
                    .addComponent(btnFinalNav, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInicioNav, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetNav)
                    .addComponent(btnGuardarNav))
                .addGap(97, 97, 97))
        );

        jtpVacio.addTab("Navegar x Alumno", jPanel3);

        rdoMayor.setText("Mayor");
        rdoMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMayorActionPerformed(evt);
            }
        });

        txaMostrarEdades.setEditable(false);
        txaMostrarEdades.setColumns(20);
        txaMostrarEdades.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        txaMostrarEdades.setRows(5);
        jScrollPane6.setViewportView(txaMostrarEdades);

        btnNuevoEdadRdo.setText("Nuevo");
        btnNuevoEdadRdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEdadRdoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnNuevoEdadRdo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(rdoMayor)))
                .addGap(93, 93, 93))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(rdoMayor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevoEdadRdo)
                .addContainerGap())
        );

        jtpVacio.addTab("Edad Radio Button", jPanel2);

        jtpVacio.setSelectedIndex(4);

        getContentPane().add(jtpVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 450, 440));

        lblTitulo.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 153, 153));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BUSCAR");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnNuevoEdadRdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEdadRdoActionPerformed
        txaMostrarEdades.setText("");
        btnNuevoEdadRdo.setEnabled(false);
        edad.clearSelection();
    }//GEN-LAST:event_btnNuevoEdadRdoActionPerformed

    private void rdoMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMayorActionPerformed
        txaMostrarEdades.setText("");
        for(Alumno a: alumnos_al){
            if(a.getEdad()>=18){
                txaMostrarEdades.append(a.cuerpo());
            }
        }
        btnNuevoEdadRdo.setEnabled(true);
    }//GEN-LAST:event_rdoMayorActionPerformed

    private void rdoMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMenorActionPerformed
        txaMostrarEdades.setText("");
        for(Alumno a: alumnos_al){
            if(a.getEdad()<18){
                txaMostrarEdades.append(a.cuerpo());
            }
        }
        btnNuevoEdadRdo.setEnabled(true);
    }//GEN-LAST:event_rdoMenorActionPerformed

    private void btnNuevoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoComboBoxActionPerformed
        cboMostrar.setSelectedIndex(-1);
        txtIdAlumnoCbo.setText("");
        txtEdadAlumnoCbo.setText("");
        txtNombreAlumnoCbo.setText("");
        txtApellidoAlumnoCbo.setText("");
        modelListNombreCbo.clear();
        btnNuevoComboBox.setEnabled(false);
    }//GEN-LAST:event_btnNuevoComboBoxActionPerformed

    private void cboMostrarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMostrarItemStateChanged
        txtIdAlumnoCbo.setText("");
        txtEdadAlumnoCbo.setText("");
        txtNombreAlumnoCbo.setText("");
        txtApellidoAlumnoCbo.setText("");
        modelListNombreCbo.clear();

        if(evt.getStateChange() == ItemEvent.SELECTED){
            String idAlumno = (String)cboMostrar.getSelectedItem();

            boolean flag = false;
            for(Alumno alumno : alumnos_al){
                if(alumno.getIdAlumno().equalsIgnoreCase(idAlumno)){
                    txtIdAlumnoCbo.setText(alumno.getIdAlumno());
                    txtEdadAlumnoCbo.setText(alumno.getEdad()+"");
                    txtNombreAlumnoCbo.setText(alumno.getNombre());
                    txtApellidoAlumnoCbo.setText(alumno.getApellido());
                    modelListNombreCbo.clear();
                    for(String asignatura : alumno.getAsignaturas_al()){
                        modelListNombreCbo.addElement(asignatura);
                    }
                    flag = true;
                    break;
                }
            }

            if(!flag){
                JOptionPane.showMessageDialog(null, "Alumno no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                txtIdAlumnoCbo.setText("");
                txtEdadAlumnoCbo.setText("");
                txtNombreAlumnoCbo.setText("");
                txtApellidoAlumnoCbo.setText("");
                modelListNombreCbo.clear();
            }
        }
        btnNuevoComboBox.setEnabled(true);
        cboMostrar.requestFocusInWindow(); //Esta linea establece el focus en la cajita deseada
    }//GEN-LAST:event_cboMostrarItemStateChanged

    //Codigos para controlar la Pestaña Alumnos x Asignatura inicio
    private void btnNuevoAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAlumnosActionPerformed
        txaAlumnos.setText("");
        txtAsignatura.setText("");
        btnBuscarAlumnos.setEnabled(true);
    }//GEN-LAST:event_btnNuevoAlumnosActionPerformed

    private void btnBuscarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlumnosActionPerformed
        txaAlumnos.setText("");
        String asignatura = txtAsignatura.getText().toLowerCase().trim();
        boolean encontrado = false;
        for(Alumno a: alumnos_al){
            List<String> asignaturas_al = a.getAsignaturas_al();
            for(String asig: asignaturas_al){
                if(asig.toLowerCase().equals(asignatura)){
                    if(!encontrado){
                        txaAlumnos.append(Alumno.cabecera());
                        txaAlumnos.append(Alumno.subrayadoCabecera());
                        encontrado = true;
                    }
                    txaAlumnos.append(a.cuerpo());
                    break;
                }
            }
        }
        if(!encontrado)
        {JOptionPane.showMessageDialog(null, "Ningun Alumno", "404", JOptionPane.ERROR_MESSAGE);
        }
        btnBuscarAlumnos.setEnabled(true);
    }//GEN-LAST:event_btnBuscarAlumnosActionPerformed

    private void txtAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsignaturaActionPerformed
        txaAlumnos.setText("");
        String asignatura = txtAsignatura.getText().toLowerCase().trim();
        boolean encontrado = false;
        for(Alumno a: alumnos_al){
            List<String> asignaturas_al = a.getAsignaturas_al();
            for(String asig: asignaturas_al){
                if(asig.toLowerCase().equals(asignatura)){
                    if(!encontrado){
                        txaAlumnos.append(Alumno.cabecera());
                        txaAlumnos.append(Alumno.subrayadoCabecera());
                        encontrado = true;
                    }
                    txaAlumnos.append(a.cuerpo());
                    break;
                }
            }
        }
        if(!encontrado)
        {JOptionPane.showMessageDialog(null, "Ningun Alumno", "404", JOptionPane.ERROR_MESSAGE);
        }
        btnBuscarAlumnos.setEnabled(false);
    }//GEN-LAST:event_txtAsignaturaActionPerformed
//Codigos para controlar la Pestaña Alumnos x Asignatura fin

//Codigos para controlar la Pestaña Nombre fin
    private void cmdNuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoNombreActionPerformed
        txtBuscarNombre.setText("");
        txaMostrar.setText("");
        cmdBuscarNombre.setEnabled(true);
        modelListNombre.clear();
        cmdBuscarNombre.setEnabled(true);
    }//GEN-LAST:event_cmdNuevoNombreActionPerformed

    private void cmdBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarNombreActionPerformed
        txaMostrar.setText("");
        String nombre = txtBuscarNombre.getText();
        List<Alumno> alumnosaux_al = obtenerListaNombres(nombre);
        if(alumnosaux_al.size() > 0){
            txaMostrar.append(Alumno.cabecera());
            txaMostrar.append(Alumno.subrayadoCabecera());
            for(Alumno a: alumnosaux_al){
                //txaMostrar.append(a.toString() + "\n");
                txaMostrar.append(a.cuerpo());
                List<String> asignaturas_al = a.getAsignaturas_al();
                for (String asi : asignaturas_al){
                    modelListNombre.addElement(asi);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado", "404", JOptionPane.ERROR_MESSAGE);
        }
        cmdBuscarNombre.setEnabled(false);
    }//GEN-LAST:event_cmdBuscarNombreActionPerformed

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
        txaMostrar.setText("");
        String nombre = txtBuscarNombre.getText();
        List<Alumno> alumnosaux_al = obtenerListaNombres(nombre);
        if(alumnosaux_al.size() > 0){
            txaMostrar.append(Alumno.cabecera());
            txaMostrar.append(Alumno.subrayadoCabecera());
            for(Alumno a: alumnosaux_al){
                //txaMostrar.append(a.toString() + "\n");
                txaMostrar.append(a.cuerpo());
                List<String> asignaturas_al = a.getAsignaturas_al();
                for (String asi : asignaturas_al){
                    modelListNombre.addElement(asi);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado", "Error 404 not found", JOptionPane.ERROR_MESSAGE);
        }
        cmdBuscarNombre.setEnabled(false);
    }//GEN-LAST:event_txtBuscarNombreActionPerformed
    //Codigos para controlar la Pestaña Nombre fin
    
    ////Codigos para controlar la Pestaña Id inicio
    private void btnNuevoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoIdActionPerformed
        txtIdAlumno.setText("");
        txtTodo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        modelListId.clear();
        btnBuscarId.setEnabled(true);
    }//GEN-LAST:event_btnNuevoIdActionPerformed

    private void btnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdActionPerformed
        txtTodo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        modelListId.clear();
        String idAlumno = txtIdAlumno.getText().toLowerCase().trim();
        boolean encontro = false;
        if(alumnos_al.size()>0){
            for (Alumno a : alumnos_al) {
                if (a.getIdAlumno().toLowerCase().equals(idAlumno)) {
                    encontro = true;
                    txtTodo.setText(a.toString());
                    txtNombre.setText(a.getNombre());
                    txtApellido.setText(a.getApellido());
                    txtEdad.setText(a.getEdad()+"");
                    List<String> asignaturas_al=a.getAsignaturas_al();
                    for(String asig: asignaturas_al){
                        modelListId.addElement(asig);
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Lista Alumnos Vacia", "404", JOptionPane.ERROR_MESSAGE);
        }
        if(!encontro)JOptionPane.showMessageDialog(null, "Alumno no existe", "404", JOptionPane.ERROR_MESSAGE);
        btnBuscarId.setEnabled(false);
    }//GEN-LAST:event_btnBuscarIdActionPerformed

    private void txtIdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAlumnoActionPerformed
        txtTodo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        modelListId.clear();
        String idAlumno = txtIdAlumno.getText().toLowerCase().trim();
        boolean encontro = false;
        if(alumnos_al.size()>0){
            for (Alumno a : alumnos_al) {
                if (a.getIdAlumno().toLowerCase().equals(idAlumno)) {
                    encontro = true;
                    txtTodo.setText(a.toString());
                    txtNombre.setText(a.getNombre());
                    txtApellido.setText(a.getApellido());
                    txtEdad.setText(a.getEdad()+"");
                    List<String> asignaturas_al=a.getAsignaturas_al();
                    for(String asig: asignaturas_al){
                        modelListId.addElement(asig);
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Lista Alumnos Vacia", "404", JOptionPane.ERROR_MESSAGE);
        }
        if(!encontro)JOptionPane.showMessageDialog(null, "Alumno no existe", "404", JOptionPane.ERROR_MESSAGE);
        btnBuscarId.setEnabled(false);
    }//GEN-LAST:event_txtIdAlumnoActionPerformed
    //Codigos para controlar la Pestaña Id fin
    
    //Codigos para controlar la Pestaña Navigar x Alumno inicio
    private void btnInicioNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioNavActionPerformed
        txtIdNav.setText("0");
        
    }//GEN-LAST:event_btnInicioNavActionPerformed

    private void btnIzquierdaNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaNavActionPerformed
        String indices = txtIdNav.getText();

        int indicei = Integer.parseInt(indices);
        if(indicei > 0){
            indicei--;
            txtIdNav.setText(String.valueOf(indicei));
            
        }

    }//GEN-LAST:event_btnIzquierdaNavActionPerformed

    private void btnDerechaNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaNavActionPerformed
        txtIdNav.setVisible(true);
        String indices = txtIdNav.getText();

        int indicei = Integer.parseInt(indices);
        if(indicei < alumnos_al.size()-1){
            indicei++;
            txtIdNav.setText(String.valueOf(indicei));
            
        }

    }//GEN-LAST:event_btnDerechaNavActionPerformed

    private void btnResetNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetNavActionPerformed
        
        JOptionPane.showMessageDialog(null, "Deleted sucessfully", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnResetNavActionPerformed

    private void btnGuardarNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNavActionPerformed
        
        JOptionPane.showMessageDialog(null, "Stored correctly", "Info", JOptionPane.INFORMATION_MESSAGE);

        
    }//GEN-LAST:event_btnGuardarNavActionPerformed

    private void btnFinalNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalNavActionPerformed
        pintarInfoAlumnos(alumnos_al.size()-1);
        txtIdNav.setText(alumnos_al.size()-1 + "");
    }//GEN-LAST:event_btnFinalNavActionPerformed
    ////Codigos para controlar la Pestaña Navigar x Alumno Fin
    
    
    
    //Obtener alumnos indiferentemente como escribimos el nombre(MAYUSCULA, MINUSCULA o LaSdOs inicio
    public List<Alumno> obtenerListaNombres(String nombre){
        List<Alumno> alumnosaux_al = new ArrayList<>();
        for(Alumno a: alumnos_al){
            if(a.getNombre().toLowerCase().equals(nombre.toLowerCase())){
                alumnosaux_al.add(a); 
            }
        }
        return alumnosaux_al;
    }//Obtener alumnos indiferentemente como escribimos el nombre(MAYUSCULA, MINUSCULA o LaSdOs fin
   
    
    //Main inicio
    public static void main(String args[]) {
        
        try {
            // Cambiar el Look and Feel
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        // Aquí inicia tu ventana principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBuscarAlumno().setVisible(true);
            }
        });
        
    } //Main fin
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarAlumnos;
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnDerechaNav;
    private javax.swing.JButton btnFinalNav;
    private javax.swing.JButton btnGuardarNav;
    private javax.swing.JButton btnInicioNav;
    private javax.swing.JButton btnIzquierdaNav;
    private javax.swing.JButton btnNuevoAlumnos;
    private javax.swing.JButton btnNuevoComboBox;
    private javax.swing.JButton btnNuevoEdadRdo;
    private javax.swing.JButton btnNuevoId;
    private javax.swing.JButton btnResetNav;
    private javax.swing.JComboBox<String> cboMostrar;
    private javax.swing.JButton cmdBuscarNombre;
    private javax.swing.JButton cmdNuevoNombre;
    private javax.swing.JLabel idAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpAPELLIDO;
    private javax.swing.JPanel jpID;
    private javax.swing.JTabbedPane jtpVacio;
    private javax.swing.JLabel lblApellidoNav;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblAsignaturas;
    private javax.swing.JPanel lblBuscar;
    private javax.swing.JLabel lblBuscarNombre;
    private javax.swing.JLabel lblComboBox;
    private javax.swing.JLabel lblEdadNav;
    private javax.swing.JLabel lblIdAlumno;
    private javax.swing.JLabel lblListado;
    private javax.swing.JLabel lblNombreNav;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstAsignaturasCbo;
    private javax.swing.JList<String> lstAsignaturasId;
    private javax.swing.JList<String> lstAsignaturasNav;
    private javax.swing.JList<String> lstAsignaturasNombre;
    private javax.swing.JRadioButton rdoMayor;
    private javax.swing.JRadioButton rdoMenor;
    private javax.swing.JTextArea txaAlumnos;
    private javax.swing.JTextArea txaMostrar;
    private javax.swing.JTextArea txaMostrarEdades;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoAlumnoCbo;
    private javax.swing.JTextField txtApellidoNav;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdadAlumnoCbo;
    private javax.swing.JTextField txtEdadNav;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtIdAlumnoCbo;
    private javax.swing.JTextField txtIdNav;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreAlumnoCbo;
    private javax.swing.JTextField txtNombreNav;
    private javax.swing.JTextField txtTodo;
    // End of variables declaration//GEN-END:variables
}