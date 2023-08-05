package InterfazGU;

import Logica.MetodosConexion;
import Logica.MetodosEnComun;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CargarDatos extends javax.swing.JFrame {

    ImageIcon icono = new ImageIcon(getClass().getResource("/Imgvet/icon-interfaz32.png"));
    MetodosConexion mc = new MetodosConexion();
    MetodosEnComun mec = new MetodosEnComun();
    
    private static InterfazPrincipal interfazPrincipal = null;
    
    public CargarDatos() {
        initComponents();
        this.setIconImage(icono.getImage());
        
        
        getInstanciaInterfazPrincipal();
    }
    
    public void rellenarComboCargarDato(){
        mc.rellenarComboDueño(cmbDueño);
    }

    private static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CargarDatos cd = new CargarDatos();
                cd.setVisible(true);
            }
        });
    }
    
    // METODOS PARA GENERAR INSTANCIAS JFRAME
    private static InterfazPrincipal getInstanciaInterfazPrincipal(){
        return interfazPrincipal;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTITULO = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblGranja = new javax.swing.JLabel();
        PanelControles = new javax.swing.JPanel();
        lblNombreDueño = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtNombreDueño = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        cmbTelefono = new javax.swing.JComboBox<>();
        cmbCedula = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnPersona = new javax.swing.JButton();
        separadorVertical = new javax.swing.JSeparator();
        lblNombreM = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblDueñoM = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        cmbDueño = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnMascota = new javax.swing.JButton();
        lblMASCOTA = new javax.swing.JLabel();
        lblCLIENTE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar datos");
        setMinimumSize(new java.awt.Dimension(850, 533));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(859, 642));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(859, 642));

        lblTITULO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTITULO.setText("Cargar Datos");

        panelBotones.setBackground(new java.awt.Color(204, 204, 0));
        panelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBotones.setPreferredSize(new java.awt.Dimension(850, 115));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setFocusable(false);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(150, 23));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setFocusable(false);
        btnVolver.setMaximumSize(new java.awt.Dimension(90, 23));
        btnVolver.setMinimumSize(new java.awt.Dimension(90, 23));
        btnVolver.setPreferredSize(new java.awt.Dimension(150, 23));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblGranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-granja98.png"))); // NOI18N
        lblGranja.setPreferredSize(new java.awt.Dimension(96, 92));

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 603, Short.MAX_VALUE)
                .addComponent(lblGranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addComponent(lblGranja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(9, Short.MAX_VALUE))))
        );

        PanelControles.setPreferredSize(new java.awt.Dimension(440, 303));

        lblNombreDueño.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreDueño.setText("Nombre del dueño:");

        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTelefono.setText("Cel. del dueño:");

        lblCedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCedula.setText("Cedula:");

        txtNombreDueño.setBorder(null);
        txtNombreDueño.setNextFocusableComponent(cmbTelefono);
        txtNombreDueño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreDueñoKeyTyped(evt);
            }
        });

        txtTelefono.setBorder(null);
        txtTelefono.setNextFocusableComponent(cmbCedula);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtCedula.setBorder(null);
        txtCedula.setNextFocusableComponent(btnPersona);
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        cmbTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0412", "0416", "0424", "0414" }));
        cmbTelefono.setNextFocusableComponent(txtTelefono);

        cmbCedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        cmbCedula.setNextFocusableComponent(txtCedula);

        btnPersona.setBackground(new java.awt.Color(242, 242, 242));
        btnPersona.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-añadirpersona64.png"))); // NOI18N
        btnPersona.setText("Añadir Cliente");
        btnPersona.setBorder(null);
        btnPersona.setFocusable(false);
        btnPersona.setNextFocusableComponent(btnLimpiar);
        btnPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonaActionPerformed(evt);
            }
        });

        separadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblNombreM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreM.setText("Nombre:");

        lblRaza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRaza.setText("Especie:");

        lblColor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblColor.setText("Color:");

        lblDueñoM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDueñoM.setText("Dueño:");

        txtNombre.setBackground(new java.awt.Color(241, 241, 241));
        txtNombre.setBorder(null);
        txtNombre.setNextFocusableComponent(txtRaza);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtRaza.setBorder(null);
        txtRaza.setNextFocusableComponent(txtColor);
        txtRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazaKeyTyped(evt);
            }
        });

        txtColor.setBorder(null);
        txtColor.setNextFocusableComponent(cmbDueño);
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });

        cmbDueño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbDueño.setNextFocusableComponent(btnMascota);

        btnMascota.setBackground(new java.awt.Color(242, 242, 242));
        btnMascota.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-perro64.png"))); // NOI18N
        btnMascota.setText("Añadir Mascota");
        btnMascota.setBorder(null);
        btnMascota.setFocusable(false);
        btnMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotaActionPerformed(evt);
            }
        });

        lblMASCOTA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMASCOTA.setText("Mascota");

        lblCLIENTE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCLIENTE.setText("Cliente");

        javax.swing.GroupLayout PanelControlesLayout = new javax.swing.GroupLayout(PanelControles);
        PanelControles.setLayout(PanelControlesLayout);
        PanelControlesLayout.setHorizontalGroup(
            PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlesLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreDueño, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCedula, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCLIENTE)
                            .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelControlesLayout.createSequentialGroup()
                                    .addComponent(cmbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator5)
                                .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelControlesLayout.createSequentialGroup()
                                    .addComponent(cmbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(72, 72, 72)
                .addComponent(separadorVertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDueñoM, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRaza, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblColor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombreM, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMASCOTA)
                            .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator4)
                                .addComponent(jSeparator2)
                                .addComponent(txtRaza)
                                .addComponent(txtColor)
                                .addComponent(jSeparator1)
                                .addComponent(txtNombre)
                                .addComponent(cmbDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        PanelControlesLayout.setVerticalGroup(
            PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorVertical, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PanelControlesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addComponent(lblCLIENTE)
                        .addGap(50, 50, 50)
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreDueño)
                            .addGroup(PanelControlesLayout.createSequentialGroup()
                                .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelControlesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelControlesLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblTelefono)))
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula)
                            .addComponent(cmbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btnPersona))
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addComponent(lblMASCOTA)
                        .addGap(50, 50, 50)
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreM))
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRaza))
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColor))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDueñoM))
                        .addGap(50, 50, 50)
                        .addComponent(btnMascota)))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTITULO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelControles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTITULO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(PanelControles, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombreDueño.setText("");
        txtTelefono.setText("");
        txtCedula.setText("");

        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");

        cmbTelefono.setSelectedIndex(0);
        cmbCedula.setSelectedIndex(0);
        cmbDueño.setSelectedIndex(0);

        lblGranja.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonaActionPerformed
        String nombre = txtNombreDueño.getText();
        String telefono = cmbTelefono.getSelectedItem().toString() + "-" + txtTelefono.getText();
        String cedula = cmbCedula.getSelectedItem().toString() + txtCedula.getText();

        boolean bCedula = mec.verificarCaracteresEnCampos(txtCedula.getText()),
                bTelefono = mec.verificarCaracteresEnCampos(txtTelefono.getText());

        if (bCedula && bTelefono) {
            boolean a = !nombre.isEmpty() || !nombre.isBlank(),
                    b = !telefono.isEmpty() || !telefono.isBlank(),
                    c = !txtCedula.getText().isEmpty() || !txtCedula.getText().isBlank();

            if (a && b && c) {

                String mensaje = "Nombre: " + nombre + "\nTelefono: " + telefono + "\nCedula: " + cedula;

                if (JOptionPane.showConfirmDialog(null, mensaje, "Verifique los datos", JOptionPane.YES_NO_OPTION) == 0) {
                    if (mc.crearDueno(nombre, telefono, cedula)) {
                        rellenarComboCargarDato();
                        limpiarCamposDueno();
                        lblGranja.requestFocus();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "No pueden haber campos vacíos :(");
            }
        } else if (!bTelefono) {
            JOptionPane.showMessageDialog(null, "El telefono solo puede contener números!");
        } else if (!bCedula) {
            JOptionPane.showMessageDialog(null, "La cedula solo puede contener números!");
        }
    }//GEN-LAST:event_btnPersonaActionPerformed

    private void txtNombreDueñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreDueñoKeyTyped
        mec.liminteMaxCampo(txtNombreDueño, 45, evt);
    }//GEN-LAST:event_txtNombreDueñoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        mec.liminteMaxCampo(txtTelefono, 7, evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        mec.liminteMaxCampo(txtCedula, 8, evt);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void btnMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotaActionPerformed
        
        if (!cmbDueño.getSelectedItem().equals("-")) {
            
        String nombre = txtNombre.getText(),
                raza = txtRaza.getText(),
                color = txtColor.getText(),
                duenoString = getNombreDueño(cmbDueño),
                cedula = getCedula(cmbDueño);
            int dueno = mc.getID(cedula);

            boolean a = nombre.isEmpty() || nombre.isBlank(),
                    b = raza.isEmpty() || raza.isBlank(),
                    c = color.isEmpty() || color.isBlank();

            if (!a && !b && !c) {
                String mensaje = "Nombre: " + nombre + "\nEspecie: " + raza + "\nColor: " + color + "\nDueño: " + duenoString;

                if (JOptionPane.showConfirmDialog(null, mensaje, "Verifique los datos", JOptionPane.YES_NO_OPTION) == 0) {
                    if (mc.crearMascota(nombre, raza, color, dueno)) {
                        limpiarCamposMascota();
                        lblGranja.requestFocus();
                    }
                }
            } else if (a) {
                JOptionPane.showMessageDialog(null, "No tiene nombre la mascota!!!");

            } else if (b) {
                JOptionPane.showMessageDialog(null, "No tiene especie la mascota!!!");

            } else if (c) {
                JOptionPane.showMessageDialog(null, "No tiene color la mascota!!!");
            }

        } else if (cmbDueño.getSelectedItem().equals("-")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un dueño para la mascota!!!");
        }

    }//GEN-LAST:event_btnMascotaActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        mec.liminteMaxCampo(txtNombre, 45, evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazaKeyTyped
        mec.liminteMaxCampo(txtRaza, 45, evt);
    }//GEN-LAST:event_txtRazaKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        mec.liminteMaxCampo(txtColor, 45, evt);
    }//GEN-LAST:event_txtColorKeyTyped

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (interfazPrincipal == null){
            interfazPrincipal = new InterfazPrincipal();
        }
        mec.abrirFrameinterfazPrincipal(this, interfazPrincipal);
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelControles;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMascota;
    private javax.swing.JButton btnPersona;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCedula;
    private javax.swing.JComboBox<String> cmbDueño;
    private javax.swing.JComboBox<String> cmbTelefono;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblCLIENTE;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDueñoM;
    private javax.swing.JLabel lblGranja;
    private javax.swing.JLabel lblMASCOTA;
    private javax.swing.JLabel lblNombreDueño;
    private javax.swing.JLabel lblNombreM;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JSeparator separadorVertical;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDueño;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarCamposDueno() {
        txtNombreDueño.setText("");
        txtTelefono.setText("");
        txtCedula.setText("");

        cmbTelefono.setSelectedIndex(0);
        cmbCedula.setSelectedIndex(0);
    }
    
    private String getCedula(JComboBox<String> cmbDueño) {
        String[] cedula = cmbDueño.getSelectedItem().toString().split(", ");
        return cedula[1];
    }

    private String getNombreDueño(JComboBox<String> cmbDueño) {
        String[] nombre = cmbDueño.getSelectedItem().toString().split(",");
        return nombre[0];
    }

    private void limpiarCamposMascota() {
        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");

        cmbDueño.setSelectedIndex(0);
    }
}
