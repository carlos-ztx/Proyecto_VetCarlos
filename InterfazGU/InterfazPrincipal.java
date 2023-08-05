package InterfazGU;

import Logica.MetodosConexion;
import Logica.MetodosEnComun;
import Login.LoginUsuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InterfazPrincipal extends javax.swing.JFrame {

    ImageIcon icono = new ImageIcon(getClass().getResource("/Imgvet/icon-interfaz32.png"));
    MetodosConexion mc = new MetodosConexion();
    MetodosEnComun mec = new MetodosEnComun();
    
    // Instancias para el patrón de diseño singleton
    private static CargarDatos cargarDatos = null;
    private static VerDatos verDatos = null;
    private static Servicio servicio = null;
    private static LoginUsuario loginUsuario = null;
    private static Reportes reportes = null;
    
    //Constructor
    public InterfazPrincipal() {
        initComponents();
        this.setIconImage(icono.getImage());
        setExtendedState(MAXIMIZED_HORIZ);
        setExtendedState(MAXIMIZED_VERT);

        actualizarTablaIP();
    }
    
    public void actualizarTablaIP(){
        mc.leerServicioA(tblServicios);
    }
    
    private static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterfazPrincipal ip = new InterfazPrincipal();
                ip.setVisible(true);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTITULO = new javax.swing.JLabel();
        PanelBotones = new javax.swing.JPanel();
        btnCargarDatos = new javax.swing.JButton();
        btnVerDatos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblGranja = new javax.swing.JLabel();
        btnServicio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();
        btnListo = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veterinaria Los Mata Perros");
        setMinimumSize(new java.awt.Dimension(859, 642));
        setSize(new java.awt.Dimension(0, 0));

        panelPrincipal.setMinimumSize(new java.awt.Dimension(859, 642));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(859, 642));
        panelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseClicked(evt);
            }
        });

        lblTITULO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTITULO.setText("Servicios pendientes");

        PanelBotones.setBackground(new java.awt.Color(153, 0, 51));
        PanelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelBotones.setPreferredSize(new java.awt.Dimension(850, 115));
        PanelBotones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelBotonesMouseClicked(evt);
            }
        });

        btnCargarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-cargardatos.png"))); // NOI18N
        btnCargarDatos.setText("Cargar Datos");
        btnCargarDatos.setFocusable(false);
        btnCargarDatos.setMaximumSize(new java.awt.Dimension(90, 23));
        btnCargarDatos.setMinimumSize(new java.awt.Dimension(90, 23));
        btnCargarDatos.setNextFocusableComponent(btnVerDatos);
        btnCargarDatos.setPreferredSize(new java.awt.Dimension(150, 23));
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });

        btnVerDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-verdatos.png"))); // NOI18N
        btnVerDatos.setText("Ver datos");
        btnVerDatos.setFocusable(false);
        btnVerDatos.setMaximumSize(new java.awt.Dimension(90, 23));
        btnVerDatos.setMinimumSize(new java.awt.Dimension(90, 23));
        btnVerDatos.setNextFocusableComponent(btnSalir);
        btnVerDatos.setPreferredSize(new java.awt.Dimension(150, 23));
        btnVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDatosActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.setMaximumSize(new java.awt.Dimension(90, 23));
        btnSalir.setMinimumSize(new java.awt.Dimension(90, 23));
        btnSalir.setNextFocusableComponent(btnServicio);
        btnSalir.setPreferredSize(new java.awt.Dimension(150, 23));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblGranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-granja98.png"))); // NOI18N
        lblGranja.setNextFocusableComponent(tblServicios);
        lblGranja.setPreferredSize(new java.awt.Dimension(96, 92));

        btnServicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-interfaz32.png"))); // NOI18N
        btnServicio.setText("Gestión de servicios");
        btnServicio.setFocusable(false);
        btnServicio.setNextFocusableComponent(lblGranja);
        btnServicio.setPreferredSize(new java.awt.Dimension(150, 23));
        btnServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicioActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(btnServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(lblGranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBotonesLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(PanelBotonesLayout.createSequentialGroup()
                        .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lblGranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "null", "null", "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblServicios.setColumnSelectionAllowed(true);
        tblServicios.setNextFocusableComponent(btnCargarDatos);
        tblServicios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblServicios);
        tblServicios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnListo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-actualizar24.png"))); // NOI18N
        btnListo.setText("Servicio listo");
        btnListo.setFocusable(false);
        btnListo.setNextFocusableComponent(lblGranja);
        btnListo.setPreferredSize(new java.awt.Dimension(150, 23));
        btnListo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListoMouseClicked(evt);
            }
        });

        btnReportes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-reportes24.png"))); // NOI18N
        btnReportes.setText("Ver reportes");
        btnReportes.setFocusable(false);
        btnReportes.setNextFocusableComponent(lblGranja);
        btnReportes.setPreferredSize(new java.awt.Dimension(150, 23));
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTITULO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTITULO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        //abrirCargarDatos();
        if (cargarDatos == null) {
            cargarDatos = new CargarDatos();
        }
        mec.abrirFrameCargarDatos(this, cargarDatos);
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatosActionPerformed
        if (verDatos == null) {
            verDatos = new VerDatos();
        }
        mec.abrirFrameVerDatos(this, verDatos);
    }//GEN-LAST:event_btnVerDatosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Está seguro de que desea salir? :)", "Advertencia", JOptionPane.YES_NO_OPTION) == 0) {
            if (loginUsuario == null) {
                loginUsuario = new LoginUsuario();
            }
            mec.abrirFrameLogin(this, loginUsuario);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicioActionPerformed
        if (servicio == null) {
            servicio = new Servicio();
        }
        mec.abrirFrameServicio(this, servicio);
    }//GEN-LAST:event_btnServicioActionPerformed

    private void panelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseClicked
        panelPrincipal.requestFocus();
    }//GEN-LAST:event_panelPrincipalMouseClicked

    private void PanelBotonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonesMouseClicked
        PanelBotones.requestFocus();
    }//GEN-LAST:event_PanelBotonesMouseClicked

    private void btnListoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListoMouseClicked
        try {
            int getRow = tblServicios.getSelectedRow();
            int id = Integer.parseInt(tblServicios.getValueAt(getRow, 0).toString());

            if (JOptionPane.showConfirmDialog(null, "Desea actualizar el estatus del servicio seleccionado??", "Confirmación", JOptionPane.YES_NO_OPTION) == 0) {
                if (mc.actualizarEstatusServicioI(id)) {
                    mc.leerServicioA(tblServicios);
                    lblGranja.requestFocus();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún servicio");
        }
        
    }//GEN-LAST:event_btnListoMouseClicked

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        if (reportes == null) {
            reportes = new Reportes();
        }
        mec.abrirFrameReporte(this, reportes);
                
    }//GEN-LAST:event_btnReportesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnListo;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnServicio;
    private javax.swing.JButton btnVerDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblGranja;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JPanel panelPrincipal;
    public javax.swing.JTable tblServicios;
    // End of variables declaration//GEN-END:variables

}
