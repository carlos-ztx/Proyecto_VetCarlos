package InterfazGU;

import Logica.MetodosConexion;
import Logica.MetodosEnComun;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Servicio extends javax.swing.JFrame {
    
    //Variables globales
    ImageIcon icono = new ImageIcon(getClass().getResource("/Imgvet/icon-interfaz32.png"));
    MetodosConexion mc = new MetodosConexion();
    MetodosEnComun mec = new MetodosEnComun();
    
    // Instancias para el patrón de diseño singleton
    private static InterfazPrincipal interfazPrincipal = null;
    
    //Constructor
    public Servicio() {
        initComponents();
        this.setIconImage(icono.getImage());
        
        mc.rellenarComboMascota(cmbMascota);
        
        campoFecha.setMinSelectableDate(new Date());
        
        cmbSeleccionarServicio.setEnabled(false);
    }
    
    public void rellenarCombosServicio(){
        mc.rellenarComboSeleccionarServicio(cmbSeleccionarServicio);
    }
    
    private static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Servicio s = new Servicio();
                s.setVisible(true);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIdServicio = new javax.swing.JTextField();
        panelPrincipal = new javax.swing.JPanel();
        lblTITULO = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblGranja = new javax.swing.JLabel();
        PanelControles = new javax.swing.JPanel();
        lblMascotas = new javax.swing.JLabel();
        lblAlergias = new javax.swing.JLabel();
        lblServicio = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        cmbMascota = new javax.swing.JComboBox<>();
        cmbAlergias = new javax.swing.JComboBox<>();
        cmbServicios = new javax.swing.JComboBox<>();
        campoFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnProgramar = new javax.swing.JButton();
        paneOpcionesEditar = new javax.swing.JPanel();
        rbEditar = new javax.swing.JRadioButton();
        cmbSeleccionarServicio = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(txtIdServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(464, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(txtIdServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programar un servicio");
        setMinimumSize(new java.awt.Dimension(859, 642));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(859, 642));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(859, 642));

        lblTITULO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTITULO.setText("Servicio");

        panelBotones.setBackground(new java.awt.Color(153, 204, 0));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        lblMascotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMascotas.setText("Mascota:");

        lblAlergias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAlergias.setText("Alergias:");

        lblServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblServicio.setText("Servicio:");

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFecha.setText("Fecha:");

        lblObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblObservaciones.setText("Observaciones:");

        cmbMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        cmbAlergias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        cmbServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Consulta", "Peluqueria", "Cirugía" }));

        campoFecha.setDateFormatString("yyyy-MM-dd");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        txtObservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObservacionesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtObservaciones);

        btnProgramar.setBackground(new java.awt.Color(242, 242, 242));
        btnProgramar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnProgramar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-añadir64.png"))); // NOI18N
        btnProgramar.setText("Programar Servicio");
        btnProgramar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnProgramar.setFocusable(false);
        btnProgramar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramarActionPerformed(evt);
            }
        });

        paneOpcionesEditar.setBackground(new java.awt.Color(153, 204, 0));

        rbEditar.setBackground(new java.awt.Color(153, 204, 0));
        rbEditar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbEditar.setText("Editar servicio?");
        rbEditar.setFocusable(false);
        rbEditar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        rbEditar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbEditarItemStateChanged(evt);
            }
        });

        cmbSeleccionarServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbSeleccionarServicio.setFocusable(false);
        cmbSeleccionarServicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSeleccionarServicioItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout paneOpcionesEditarLayout = new javax.swing.GroupLayout(paneOpcionesEditar);
        paneOpcionesEditar.setLayout(paneOpcionesEditarLayout);
        paneOpcionesEditarLayout.setHorizontalGroup(
            paneOpcionesEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOpcionesEditarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSeleccionarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneOpcionesEditarLayout.setVerticalGroup(
            paneOpcionesEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOpcionesEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneOpcionesEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(paneOpcionesEditarLayout.createSequentialGroup()
                        .addComponent(cmbSeleccionarServicio)
                        .addGap(1, 1, 1))
                    .addComponent(rbEditar, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelControlesLayout = new javax.swing.GroupLayout(PanelControles);
        PanelControles.setLayout(PanelControlesLayout);
        PanelControlesLayout.setHorizontalGroup(
            PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlesLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProgramar, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFecha)
                            .addComponent(lblServicio)
                            .addComponent(lblAlergias)
                            .addComponent(lblObservaciones)
                            .addComponent(lblMascotas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbServicios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
            .addComponent(paneOpcionesEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelControlesLayout.setVerticalGroup(
            PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneOpcionesEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMascotas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlergias)
                    .addComponent(cmbAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServicio)
                    .addComponent(cmbServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnProgramar)
                .addGap(30, 30, 30))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(PanelControles, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
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
        limpiarCamposServicio();
        lblGranja.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (interfazPrincipal == null){
            interfazPrincipal = new InterfazPrincipal();
        }
        mec.abrirFrameinterfazPrincipal(this, interfazPrincipal);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnProgramarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramarActionPerformed
        if (rbEditar.isSelected() == true) {

            if (!txtIdServicio.getText().equals("")) {
                btnProgramarActualizarServicio();
            } else {
                JOptionPane.showMessageDialog(null, "Campo id vacío. Debe estar lleno!");
            }

        } else if (rbEditar.isSelected() == false) {

            if (txtIdServicio.getText().equals("")) {
                btnProgramarNuevoServicio();
            } else {
                JOptionPane.showMessageDialog(null, "Campo id lleno. Debe estar vacío!");
            }

        }
    }//GEN-LAST:event_btnProgramarActionPerformed

    private void txtObservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionesKeyTyped
        mec.liminteMaxCampo(txtObservaciones, 255, evt);
    }//GEN-LAST:event_txtObservacionesKeyTyped

    private void rbEditarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbEditarItemStateChanged
        if (rbEditar.isSelected()) {
            
            cmbSeleccionarServicio.setEnabled(true);
            rellenarCombosServicio();
            btnProgramar.setText("Actualizar registro");
            
        } else if (!rbEditar.isSelected()) {
            
            cmbSeleccionarServicio.setSelectedIndex(0);
            cmbSeleccionarServicio.setEnabled(false);
            btnProgramar.setText("Programar Servicio");
            txtIdServicio.setText("");
            
        }
    }//GEN-LAST:event_rbEditarItemStateChanged

    private void cmbSeleccionarServicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSeleccionarServicioItemStateChanged
        int getIndex = cmbSeleccionarServicio.getSelectedIndex();
        
        if(getIndex == 0){
            limpiarCamposServicio();
        } else if (getIndex > 0){
            int idServicio = getId(cmbSeleccionarServicio.getSelectedItem().toString());
            txtIdServicio.setText(Integer.toString(idServicio));
            
            mc.rellenarCamposTextoServicio(cmbAlergias, cmbServicios, txtObservaciones, campoFecha, cmbMascota, idServicio);
        }
        
    }//GEN-LAST:event_cmbSeleccionarServicioItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelControles;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProgramar;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JDateChooser campoFecha;
    private javax.swing.JComboBox<String> cmbAlergias;
    private javax.swing.JComboBox<String> cmbMascota;
    private javax.swing.JComboBox<String> cmbSeleccionarServicio;
    private javax.swing.JComboBox<String> cmbServicios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGranja;
    private javax.swing.JLabel lblMascotas;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblServicio;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JPanel paneOpcionesEditar;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelPrincipal;
    public javax.swing.JRadioButton rbEditar;
    private javax.swing.JTextField txtIdServicio;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables

    private void limpiarCamposServicio() {
        cmbMascota.setSelectedIndex(0);
        cmbAlergias.setSelectedIndex(0);
        cmbServicios.setSelectedIndex(0);
        
        campoFecha.setDate(null);
        
        txtObservaciones.setText("");
        txtIdServicio.setText("");
        
    }

    private int getId(String toString) {
        String[] id = toString.split(",");
        return Integer.parseInt(id[0]);
    }

    private String getFecha(JDateChooser campoFecha) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(campoFecha.getDate());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    private void btnProgramarNuevoServicio(){
        try {
            int fkMascota = getId(cmbMascota.getSelectedItem().toString());

            String alergia = cmbAlergias.getSelectedItem().toString(),
                    servicio = cmbServicios.getSelectedItem().toString(),
                    fecha = getFecha(campoFecha),
                    observaciones = txtObservaciones.getText();

            boolean a = cmbMascota.getSelectedIndex() != 0,
                    b = cmbAlergias.getSelectedIndex() != 0,
                    c = cmbServicios.getSelectedIndex() != 0,
                    d = fecha != null;

            if (a && b && c && d) {
                if (mc.crearServicio(servicio, alergia, fecha, observaciones, fkMascota)) {
                    JOptionPane.showMessageDialog(null, "Servicio programado con exito! :)");
                    limpiarCamposServicio();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Faltan campos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay campos vacíos!!!");
        }
    }

    private void btnProgramarActualizarServicio() {
        int fkMascota = getId(cmbMascota.getSelectedItem().toString());
        int id = Integer.parseInt(txtIdServicio.getText());
        
        String alergia = cmbAlergias.getSelectedItem().toString(),
                servicio = cmbServicios.getSelectedItem().toString(),
                fecha = getFecha(campoFecha),
                observaciones = txtObservaciones.getText();
        
        boolean a = cmbMascota.getSelectedIndex() != 0,
                b = cmbAlergias.getSelectedIndex() != 0,
                c = cmbServicios.getSelectedIndex() != 0,
                d = fecha != null;

        if (a && b && c && d) {
            if (mc.actualizarServicio(servicio, alergia, fecha, observaciones, fkMascota, id)) {
                JOptionPane.showMessageDialog(null, "Servicio actualizado con exito! :)");
                cmbSeleccionarServicio.setSelectedIndex(0);
                limpiarCamposServicio();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Faltan campos");
        }
        
    }
}
