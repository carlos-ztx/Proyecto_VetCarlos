package InterfazGU;

import Logica.MetodosConexion;
import Logica.MetodosEnComun;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableRowSorter;

public class VerDatos extends javax.swing.JFrame {

    MetodosConexion mc = new MetodosConexion();
    ImageIcon icono = new ImageIcon(getClass().getResource("/Imgvet/icon-interfaz32.png"));
    MetodosEnComun mec = new MetodosEnComun();
    
    // Instancias para el patrón de diseño singleton
    private static InterfazPrincipal interfazPrincipal = null;
    
    public VerDatos() {
        initComponents();
        this.setIconImage(icono.getImage());
        this.setTitle("Ver Datos - Dueños");

    }

    public void rellenarCombosVerDatos(){
        mc.leerDueno(tblDueños);
        mc.leerMascota(tblMascotas);
    }
    
    private static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VerDatos vd = new VerDatos();
                vd.setVisible(true);
            }
        });
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIdDueño = new javax.swing.JTextField();
        txtIdMascota = new javax.swing.JTextField();
        panelPrincipal = new javax.swing.JPanel();
        lblTITULO = new javax.swing.JLabel();
        panelTab = new javax.swing.JTabbedPane();
        panelDueno = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDueños = new javax.swing.JTable();
        panelBotonesDueños = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnVolverDesdeDueno = new javax.swing.JButton();
        lblGranja = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnActualizarD = new javax.swing.JButton();
        btnEliminarD = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtNombreDueño = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        cmbTelefono = new javax.swing.JComboBox<>();
        cmbCedula = new javax.swing.JComboBox<>();
        panelMascotas = new javax.swing.JPanel();
        panelBotonesMascotas = new javax.swing.JPanel();
        btnLimpiarM = new javax.swing.JButton();
        btnVolverDesdeMascotas = new javax.swing.JButton();
        lblGranja1 = new javax.swing.JLabel();
        btnActualizarM = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreM = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        cmbNombreDueño = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(txtIdDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(txtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ver datos");
        setMinimumSize(new java.awt.Dimension(850, 533));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(859, 642));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(859, 642));

        lblTITULO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTITULO.setText("Ver datos");

        panelTab.setFocusable(false);
        panelTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelTabStateChanged(evt);
            }
        });

        tblDueños.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDueños.setColumnSelectionAllowed(true);
        tblDueños.getTableHeader().setReorderingAllowed(false);
        tblDueños.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDueñosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDueños);
        tblDueños.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        panelBotonesDueños.setBackground(new java.awt.Color(0, 102, 255));
        panelBotonesDueños.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBotonesDueños.setPreferredSize(new java.awt.Dimension(850, 115));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setFocusable(false);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(150, 23));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolverDesdeDueno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-volver.png"))); // NOI18N
        btnVolverDesdeDueno.setText("Volver");
        btnVolverDesdeDueno.setFocusable(false);
        btnVolverDesdeDueno.setMaximumSize(new java.awt.Dimension(90, 23));
        btnVolverDesdeDueno.setMinimumSize(new java.awt.Dimension(90, 23));
        btnVolverDesdeDueno.setPreferredSize(new java.awt.Dimension(150, 23));
        btnVolverDesdeDueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverDesdeDuenoActionPerformed(evt);
            }
        });

        lblGranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-granja98.png"))); // NOI18N
        lblGranja.setPreferredSize(new java.awt.Dimension(96, 92));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnActualizarD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnActualizarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-actualizar24.png"))); // NOI18N
        btnActualizarD.setText("Actualizar");
        btnActualizarD.setFocusable(false);
        btnActualizarD.setPreferredSize(new java.awt.Dimension(150, 23));
        btnActualizarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDActionPerformed(evt);
            }
        });

        btnEliminarD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEliminarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-eliminar24.png"))); // NOI18N
        btnEliminarD.setText("Eliminar");
        btnEliminarD.setFocusable(false);
        btnEliminarD.setPreferredSize(new java.awt.Dimension(150, 23));
        btnEliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesDueñosLayout = new javax.swing.GroupLayout(panelBotonesDueños);
        panelBotonesDueños.setLayout(panelBotonesDueñosLayout);
        panelBotonesDueñosLayout.setHorizontalGroup(
            panelBotonesDueñosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesDueñosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesDueñosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverDesdeDueno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnEliminarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonesDueñosLayout.setVerticalGroup(
            panelBotonesDueñosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesDueñosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesDueñosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesDueñosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolverDesdeDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBotonesDueñosLayout.createSequentialGroup()
                        .addComponent(lblGranja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(9, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesDueñosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBotonesDueñosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTelefono.setText("Telefono:");

        lblCedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCedula.setText("Cedula:");

        txtNombreDueño.setPreferredSize(new java.awt.Dimension(170, 25));
        txtNombreDueño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreDueñoKeyTyped(evt);
            }
        });

        txtTelefono.setPreferredSize(new java.awt.Dimension(170, 25));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtCedula.setPreferredSize(new java.awt.Dimension(170, 25));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        cmbTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0412", "0416", "0424", "0414" }));

        cmbCedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));

        javax.swing.GroupLayout panelDuenoLayout = new javax.swing.GroupLayout(panelDueno);
        panelDueno.setLayout(panelDuenoLayout);
        panelDuenoLayout.setHorizontalGroup(
            panelDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(panelBotonesDueños, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
            .addGroup(panelDuenoLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDuenoLayout.setVerticalGroup(
            panelDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDuenoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(panelDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelDuenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreDueño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(panelBotonesDueños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTab.addTab("Dueños", panelDueno);

        panelBotonesMascotas.setBackground(new java.awt.Color(0, 255, 51));
        panelBotonesMascotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBotonesMascotas.setPreferredSize(new java.awt.Dimension(850, 115));

        btnLimpiarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-limpiar.png"))); // NOI18N
        btnLimpiarM.setText("Limpiar");
        btnLimpiarM.setFocusable(false);
        btnLimpiarM.setPreferredSize(new java.awt.Dimension(150, 23));
        btnLimpiarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarMActionPerformed(evt);
            }
        });

        btnVolverDesdeMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-volver.png"))); // NOI18N
        btnVolverDesdeMascotas.setText("Volver");
        btnVolverDesdeMascotas.setFocusable(false);
        btnVolverDesdeMascotas.setMaximumSize(new java.awt.Dimension(90, 23));
        btnVolverDesdeMascotas.setMinimumSize(new java.awt.Dimension(90, 23));
        btnVolverDesdeMascotas.setPreferredSize(new java.awt.Dimension(150, 23));
        btnVolverDesdeMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverDesdeMascotasActionPerformed(evt);
            }
        });

        lblGranja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-granja98.png"))); // NOI18N
        lblGranja1.setPreferredSize(new java.awt.Dimension(96, 92));

        btnActualizarM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnActualizarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-actualizar24.png"))); // NOI18N
        btnActualizarM.setText("Actualizar");
        btnActualizarM.setFocusable(false);
        btnActualizarM.setPreferredSize(new java.awt.Dimension(150, 23));
        btnActualizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout panelBotonesMascotasLayout = new javax.swing.GroupLayout(panelBotonesMascotas);
        panelBotonesMascotas.setLayout(panelBotonesMascotasLayout);
        panelBotonesMascotasLayout.setHorizontalGroup(
            panelBotonesMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesMascotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverDesdeMascotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGranja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonesMascotasLayout.setVerticalGroup(
            panelBotonesMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesMascotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesMascotasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiarM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolverDesdeMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBotonesMascotasLayout.createSequentialGroup()
                        .addComponent(lblGranja1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(9, Short.MAX_VALUE))))
            .addComponent(jSeparator2)
            .addGroup(panelBotonesMascotasLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(btnActualizarM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMascotas.getTableHeader().setReorderingAllowed(false);
        tblMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMascotasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMascotas);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Especie:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Color:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Dueño:");

        txtNombreM.setPreferredSize(new java.awt.Dimension(170, 25));
        txtNombreM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMKeyTyped(evt);
            }
        });

        txtRaza.setPreferredSize(new java.awt.Dimension(170, 25));
        txtRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazaKeyTyped(evt);
            }
        });

        txtColor.setPreferredSize(new java.awt.Dimension(170, 25));
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });

        cmbNombreDueño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        javax.swing.GroupLayout panelMascotasLayout = new javax.swing.GroupLayout(panelMascotas);
        panelMascotas.setLayout(panelMascotasLayout);
        panelMascotasLayout.setHorizontalGroup(
            panelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotonesMascotas, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(panelMascotasLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(panelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMascotasLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMascotasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        panelMascotasLayout.setVerticalGroup(
            panelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMascotasLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombreM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotonesMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTab.addTab("Mascotas", panelMascotas);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTITULO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelTab)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTITULO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTab))
        );

        panelTab.getAccessibleContext().setAccessibleName("Dueños");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverDesdeDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverDesdeDuenoActionPerformed
        if (interfazPrincipal == null){
            interfazPrincipal = new InterfazPrincipal();
        }
        mec.abrirFrameinterfazPrincipal(this, interfazPrincipal);
    }//GEN-LAST:event_btnVolverDesdeDuenoActionPerformed

    private void btnVolverDesdeMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverDesdeMascotasActionPerformed
        if (interfazPrincipal == null){
            interfazPrincipal = new InterfazPrincipal();
        }
        mec.abrirFrameinterfazPrincipal(this, interfazPrincipal);
    }//GEN-LAST:event_btnVolverDesdeMascotasActionPerformed

    // TAB DUEÑOS
    private void tblDueñosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDueñosMouseClicked
        int nFila = tblDueños.getSelectedRow();

        String id = tblDueños.getValueAt(nFila, 0).toString(),
                nombre = tblDueños.getValueAt(nFila, 1).toString(),
                telefono = tblDueños.getValueAt(nFila, 2).toString(),
                cedula = tblDueños.getValueAt(nFila, 3).toString();

        txtIdDueño.setText(id);
        txtNombreDueño.setText(nombre);

        setCmbCedulaIndice(cedula, cmbCedula);
        setTxtCedulaNumero(cedula, txtCedula);

        setCmbTelefonoOperadora(telefono, cmbTelefono);
        setTxtTelefonoNumero(telefono, txtTelefono);
        
    }//GEN-LAST:event_tblDueñosMouseClicked

    private void btnActualizarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDActionPerformed
        String id = txtIdDueño.getText(),
                nombre = txtNombreDueño.getText(),
                telefono = cmbTelefono.getSelectedItem().toString() + "-" + txtTelefono.getText(),
                cedula = cmbCedula.getSelectedItem().toString() + txtCedula.getText();

        boolean a = id.isBlank() || id.isEmpty(),
                b = nombre.isBlank() || nombre.isEmpty(),
                c = txtTelefono.getText().isBlank() || txtTelefono.getText().isEmpty(),
                d = txtCedula.getText().isBlank() || txtCedula.getText().isEmpty();
        
        if (!a && !b && !c && !d) {

            boolean bTelefono = mec.verificarCaracteresEnCampos(txtTelefono.getText()),
                    bCedula = mec.verificarCaracteresEnCampos(txtCedula.getText());

            if (bTelefono && bCedula) {

                String mensaje = "Nombre: " + nombre + "\nTelefono: " + telefono + "\nCedula: " + cedula;
                if (JOptionPane.showConfirmDialog(null, mensaje, "Verifique los datos", JOptionPane.YES_NO_OPTION) == 0) {
                    if (mc.actualizarDueno(nombre, telefono, cedula, id)) {
                        mc.leerDueno(tblDueños);
                        limpiarCamposDueno();
                        lblGranja.requestFocus();
                    }
                }
            } else if (!bTelefono) {
                JOptionPane.showMessageDialog(null, "El telefono solo puede contener números!");
            } else if (!bCedula) {
                JOptionPane.showMessageDialog(null, "La cedula solo puede contener números!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacíos :(");
        }
    }//GEN-LAST:event_btnActualizarDActionPerformed
    private void txtNombreDueñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreDueñoKeyTyped
        mec.liminteMaxCampo(txtNombreDueño, 45, evt);
    }//GEN-LAST:event_txtNombreDueñoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        mec.liminteMaxCampo(txtTelefono, 7, evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        mec.liminteMaxCampo(txtCedula, 8, evt);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void btnEliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDActionPerformed
      
        try {
            int id = Integer.parseInt(txtIdDueño.getText());
            
            if (JOptionPane.showConfirmDialog(null, "Cuidado!\nSi elimina a un cliente se eliminaran todas las mascotas asociadas a este.", "Advertencia", JOptionPane.YES_NO_OPTION) == 0) {

                if (mc.eliminarDueno(id)) {
                    mc.leerDueno(tblDueños);
                    limpiarCamposDueno();
                    lblGranja.requestFocus();
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
    }//GEN-LAST:event_btnEliminarDActionPerformed
  
    // TAB MASCOTAS
    private void btnActualizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMActionPerformed

        String nombre = txtNombreM.getText(),
                raza = txtRaza.getText(),
                color = txtColor.getText(),
                cedula = getCedula(cmbNombreDueño);

        try {
            int id = Integer.parseInt(txtIdMascota.getText());
            int fk = mc.getID(cedula);

            if (cmbNombreDueño.getSelectedIndex() != 0) {

                boolean a = nombre.isBlank() || nombre.isEmpty(),
                        b = raza.isBlank() || raza.isEmpty(),
                        c = color.isBlank() || color.isEmpty(),
                        d = txtIdMascota.getText().isBlank() || txtIdMascota.getText().isEmpty();

                if (!a && !b && !c && !d) {
                    if (mc.actualizarMascota(nombre, raza, color, fk, id)) {
                        mc.leerMascota(tblMascotas);
                        limpiarCamposMascota();
                        lblGranja1.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No pueden haber campos vacíos :(");
                }
            } else if (cmbNombreDueño.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un dueño para la mascota!!!");
            }

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna mascota!!");
        }


    }//GEN-LAST:event_btnActualizarMActionPerformed

    private void tblMascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMascotasMouseClicked
        int nFila = tblMascotas.getSelectedRow();
        txtIdMascota.setText(tblMascotas.getValueAt(nFila, 0).toString());
        txtNombreM.setText(tblMascotas.getValueAt(nFila, 1).toString());
        txtRaza.setText(tblMascotas.getValueAt(nFila, 2).toString());
        txtColor.setText(tblMascotas.getValueAt(nFila, 3).toString());
        cmbNombreDueño.setSelectedItem(tblMascotas.getValueAt(nFila, 4).toString());
        
    }//GEN-LAST:event_tblMascotasMouseClicked

    private void txtNombreMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMKeyTyped
        mec.liminteMaxCampo(txtNombreM, 45, evt);
    }//GEN-LAST:event_txtNombreMKeyTyped

    private void txtRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazaKeyTyped
        mec.liminteMaxCampo(txtRaza, 45, evt);
    }//GEN-LAST:event_txtRazaKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        mec.liminteMaxCampo(txtColor, 45, evt);
    }//GEN-LAST:event_txtColorKeyTyped

    private void btnLimpiarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarMActionPerformed
        limpiarCamposMascota();
    }//GEN-LAST:event_btnLimpiarMActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCamposDueno();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void panelTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelTabStateChanged
        int tab = panelTab.getSelectedIndex();

        switch (tab) {
            case 0: {
                this.setTitle("Ver Datos - Dueños");
                lblGranja.requestFocus();
                break;
            }
            case 1: {
                this.setTitle("Ver Datos - Mascotas");
                mc.rellenarComboDueño(cmbNombreDueño);
                lblGranja.requestFocus();
                break;
            }
            default: {
            }
        }
    }//GEN-LAST:event_panelTabStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarD;
    private javax.swing.JButton btnActualizarM;
    private javax.swing.JButton btnEliminarD;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarM;
    private javax.swing.JButton btnVolverDesdeDueno;
    private javax.swing.JButton btnVolverDesdeMascotas;
    private javax.swing.JComboBox<String> cmbCedula;
    private javax.swing.JComboBox<String> cmbNombreDueño;
    private javax.swing.JComboBox<String> cmbTelefono;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblGranja;
    private javax.swing.JLabel lblGranja1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panelBotonesDueños;
    private javax.swing.JPanel panelBotonesMascotas;
    private javax.swing.JPanel panelDueno;
    private javax.swing.JPanel panelMascotas;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTabbedPane panelTab;
    private javax.swing.JTable tblDueños;
    private javax.swing.JTable tblMascotas;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtIdDueño;
    private javax.swing.JTextField txtIdMascota;
    private javax.swing.JTextField txtNombreDueño;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void setCmbCedulaIndice(String cedula, JComboBox<String> cmbCedula) {
        String operador = cedula.substring(0, 2);

        switch (operador) {
            case "V-":
                cmbCedula.setSelectedIndex(0);
                break;
            case "E-":
                cmbCedula.setSelectedIndex(1);
                break;
            default:
                throw new AssertionError();
        }
    }

    private void setTxtCedulaNumero(String cedula, JTextField txtCedula) {
        String movil = cedula.substring(2, cedula.length());
        txtCedula.setText(movil);
    }

    private void setCmbTelefonoOperadora(String telefono, JComboBox<String> cmbTelefono) {
        // 0412, 0416, 0424, 0414
        String operador = telefono.substring(0, 4);
        switch (operador) {
            case "0412":
                cmbTelefono.setSelectedItem(operador);
                break;
            case "0416":
                cmbTelefono.setSelectedItem(operador);
                break;
            case "0424":
                cmbTelefono.setSelectedItem(operador);
                break;
            case "0414":
                cmbTelefono.setSelectedItem(operador);
                break;
            default:
                throw new AssertionError();
        }
    }

    private void setTxtTelefonoNumero(String telefono, JTextField txtTelefono) {
        String numero = telefono.substring(5, telefono.length());
        txtTelefono.setText(numero);
    }

    private void limpiarCamposDueno() {
        txtIdDueño.setText("");
        txtNombreDueño.setText("");
        txtCedula.setText("");
        txtTelefono.setText("");

        cmbCedula.setSelectedIndex(0);
        cmbTelefono.setSelectedIndex(0);
        
        lblGranja.requestFocus();
    }

    private void limpiarCamposMascota() {
        txtIdMascota.setText("");
        txtNombreM.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        
        cmbNombreDueño.setSelectedIndex(0);
        
        lblGranja1.requestFocus();
    }
    
    private String getCedula(JComboBox<String> cmbNombreDueño) {
        String[] cedula = cmbNombreDueño.getSelectedItem().toString().split(", ");
        return cedula[1];
    }
}

