package InterfazGU;

import Logica.MetodosConexion;
import Logica.MetodosEnComun;
import javax.swing.ImageIcon;

public class Reportes extends javax.swing.JFrame {

    ImageIcon icono = new ImageIcon(getClass().getResource("/Imgvet/icon-interfaz32.png"));
    MetodosConexion mc = new MetodosConexion();
    MetodosEnComun mec = new MetodosEnComun();
    
    // Instancias para el patrón de diseño singleton
    private static InterfazPrincipal interfazPrincipal = null;
    
    public Reportes() {
        initComponents();
        this.setIconImage(icono.getImage());
        this.setTitle("Reportes - Servicio Activos");
        rellenarTablasReportes();
    }
    
    public void rellenarTablasReportes(){
        mc.vistaServiciosActivos(tblReporteSP);
        mc.vistaServiciosInactivos(tblReporteSR);
        mc.vitaRelacionDuenoMascota(tblReporteMascotas);
        mc.historialservicios(tblReporteMS);
    }
    
    private static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Reportes rp = new Reportes();
                rp.setVisible(true);
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
        panelServiciosA = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporteSP = new javax.swing.JTable();
        panelBotonesSP = new javax.swing.JPanel();
        btnVolverSP = new javax.swing.JButton();
        lblGranja = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnGenerarReporte = new javax.swing.JButton();
        panelServiciosI = new javax.swing.JPanel();
        panelBotonesSR = new javax.swing.JPanel();
        btnVolverSR = new javax.swing.JButton();
        lblGranja1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnGenerarReporte1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReporteSR = new javax.swing.JTable();
        panelDuenosMascotas = new javax.swing.JPanel();
        panelBotonesDM = new javax.swing.JPanel();
        BtnVolverDM = new javax.swing.JButton();
        lblGranja2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnGenerarReporte2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReporteMascotas = new javax.swing.JTable();
        panelModificaciones = new javax.swing.JPanel();
        panelBotonesMS = new javax.swing.JPanel();
        BtnVolverMS = new javax.swing.JButton();
        lblGranja3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnGenerarReporte3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblReporteMS = new javax.swing.JTable();

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
        lblTITULO.setText("Reporte: Servicios Pendientes");

        panelTab.setFocusable(false);
        panelTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelTabStateChanged(evt);
            }
        });

        tblReporteSP.setModel(new javax.swing.table.DefaultTableModel(
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
        tblReporteSP.setColumnSelectionAllowed(true);
        tblReporteSP.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblReporteSP);
        tblReporteSP.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        panelBotonesSP.setBackground(new java.awt.Color(0, 102, 255));
        panelBotonesSP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBotonesSP.setPreferredSize(new java.awt.Dimension(850, 115));

        btnVolverSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-volver.png"))); // NOI18N
        btnVolverSP.setText("Volver");
        btnVolverSP.setFocusable(false);
        btnVolverSP.setMaximumSize(new java.awt.Dimension(90, 23));
        btnVolverSP.setMinimumSize(new java.awt.Dimension(90, 23));
        btnVolverSP.setPreferredSize(new java.awt.Dimension(150, 23));
        btnVolverSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSPActionPerformed(evt);
            }
        });

        lblGranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-granja98.png"))); // NOI18N
        lblGranja.setPreferredSize(new java.awt.Dimension(96, 92));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnGenerarReporte.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-pdfazul24.png"))); // NOI18N
        btnGenerarReporte.setText("Guardar .PDF");
        btnGenerarReporte.setFocusable(false);
        btnGenerarReporte.setPreferredSize(new java.awt.Dimension(150, 23));
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesSPLayout = new javax.swing.GroupLayout(panelBotonesSP);
        panelBotonesSP.setLayout(panelBotonesSPLayout);
        panelBotonesSPLayout.setHorizontalGroup(
            panelBotonesSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBotonesSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotonesSPLayout.createSequentialGroup()
                    .addGap(338, 338, 338)
                    .addComponent(btnGenerarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );
        panelBotonesSPLayout.setVerticalGroup(
            panelBotonesSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesSPLayout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addComponent(btnVolverSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(panelBotonesSPLayout.createSequentialGroup()
                        .addComponent(lblGranja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
            .addGroup(panelBotonesSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotonesSPLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(btnGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelServiciosALayout = new javax.swing.GroupLayout(panelServiciosA);
        panelServiciosA.setLayout(panelServiciosALayout);
        panelServiciosALayout.setHorizontalGroup(
            panelServiciosALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
            .addComponent(panelBotonesSP, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        panelServiciosALayout.setVerticalGroup(
            panelServiciosALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServiciosALayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotonesSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTab.addTab("Servicios Pendientes", panelServiciosA);

        panelBotonesSR.setBackground(new java.awt.Color(204, 102, 0));
        panelBotonesSR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBotonesSR.setPreferredSize(new java.awt.Dimension(850, 115));

        btnVolverSR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-volver.png"))); // NOI18N
        btnVolverSR.setText("Volver");
        btnVolverSR.setFocusable(false);
        btnVolverSR.setMaximumSize(new java.awt.Dimension(90, 23));
        btnVolverSR.setMinimumSize(new java.awt.Dimension(90, 23));
        btnVolverSR.setPreferredSize(new java.awt.Dimension(150, 23));
        btnVolverSR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSRActionPerformed(evt);
            }
        });

        lblGranja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-granja98.png"))); // NOI18N
        lblGranja1.setPreferredSize(new java.awt.Dimension(96, 92));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnGenerarReporte1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGenerarReporte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-pdfnaranja24.png"))); // NOI18N
        btnGenerarReporte1.setText("Guardar .PDF");
        btnGenerarReporte1.setFocusable(false);
        btnGenerarReporte1.setPreferredSize(new java.awt.Dimension(150, 23));
        btnGenerarReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporte1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesSRLayout = new javax.swing.GroupLayout(panelBotonesSR);
        panelBotonesSR.setLayout(panelBotonesSRLayout);
        panelBotonesSRLayout.setHorizontalGroup(
            panelBotonesSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesSRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverSR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGranja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBotonesSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotonesSRLayout.createSequentialGroup()
                    .addGap(338, 338, 338)
                    .addComponent(btnGenerarReporte1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );
        panelBotonesSRLayout.setVerticalGroup(
            panelBotonesSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesSRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesSRLayout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addComponent(btnVolverSR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(panelBotonesSRLayout.createSequentialGroup()
                        .addComponent(lblGranja1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator2)
            .addGroup(panelBotonesSRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotonesSRLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(btnGenerarReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );

        tblReporteSR.setModel(new javax.swing.table.DefaultTableModel(
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
        tblReporteSR.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblReporteSR);

        javax.swing.GroupLayout panelServiciosILayout = new javax.swing.GroupLayout(panelServiciosI);
        panelServiciosI.setLayout(panelServiciosILayout);
        panelServiciosILayout.setHorizontalGroup(
            panelServiciosILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotonesSR, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        panelServiciosILayout.setVerticalGroup(
            panelServiciosILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServiciosILayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotonesSR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTab.addTab("Servicios Realizados", panelServiciosI);

        panelBotonesDM.setBackground(new java.awt.Color(0, 102, 102));
        panelBotonesDM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBotonesDM.setPreferredSize(new java.awt.Dimension(850, 115));

        BtnVolverDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-volver.png"))); // NOI18N
        BtnVolverDM.setText("Volver");
        BtnVolverDM.setFocusable(false);
        BtnVolverDM.setMaximumSize(new java.awt.Dimension(90, 23));
        BtnVolverDM.setMinimumSize(new java.awt.Dimension(90, 23));
        BtnVolverDM.setPreferredSize(new java.awt.Dimension(150, 23));
        BtnVolverDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverDMActionPerformed(evt);
            }
        });

        lblGranja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-granja98.png"))); // NOI18N
        lblGranja2.setPreferredSize(new java.awt.Dimension(96, 92));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnGenerarReporte2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGenerarReporte2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-pdfverde24.png"))); // NOI18N
        btnGenerarReporte2.setText("Guardar .PDF");
        btnGenerarReporte2.setFocusable(false);
        btnGenerarReporte2.setPreferredSize(new java.awt.Dimension(150, 23));
        btnGenerarReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporte2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesDMLayout = new javax.swing.GroupLayout(panelBotonesDM);
        panelBotonesDM.setLayout(panelBotonesDMLayout);
        panelBotonesDMLayout.setHorizontalGroup(
            panelBotonesDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesDMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnVolverDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGranja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBotonesDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotonesDMLayout.createSequentialGroup()
                    .addGap(338, 338, 338)
                    .addComponent(btnGenerarReporte2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );
        panelBotonesDMLayout.setVerticalGroup(
            panelBotonesDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesDMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesDMLayout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addComponent(BtnVolverDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(panelBotonesDMLayout.createSequentialGroup()
                        .addComponent(lblGranja2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator3)
            .addGroup(panelBotonesDMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotonesDMLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(btnGenerarReporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );

        tblReporteMascotas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblReporteMascotas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblReporteMascotas);

        javax.swing.GroupLayout panelDuenosMascotasLayout = new javax.swing.GroupLayout(panelDuenosMascotas);
        panelDuenosMascotas.setLayout(panelDuenosMascotasLayout);
        panelDuenosMascotasLayout.setHorizontalGroup(
            panelDuenosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotonesDM, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        panelDuenosMascotasLayout.setVerticalGroup(
            panelDuenosMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDuenosMascotasLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotonesDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTab.addTab("Datos Mascotas", panelDuenosMascotas);

        panelBotonesMS.setBackground(new java.awt.Color(102, 102, 102));
        panelBotonesMS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBotonesMS.setPreferredSize(new java.awt.Dimension(850, 115));

        BtnVolverMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-volver.png"))); // NOI18N
        BtnVolverMS.setText("Volver");
        BtnVolverMS.setFocusable(false);
        BtnVolverMS.setMaximumSize(new java.awt.Dimension(90, 23));
        BtnVolverMS.setMinimumSize(new java.awt.Dimension(90, 23));
        BtnVolverMS.setPreferredSize(new java.awt.Dimension(150, 23));
        BtnVolverMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverMSActionPerformed(evt);
            }
        });

        lblGranja3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-granja98.png"))); // NOI18N
        lblGranja3.setPreferredSize(new java.awt.Dimension(96, 92));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnGenerarReporte3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGenerarReporte3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgvet/icon-pdfgris24.png"))); // NOI18N
        btnGenerarReporte3.setText("Guardar .PDF");
        btnGenerarReporte3.setFocusable(false);
        btnGenerarReporte3.setPreferredSize(new java.awt.Dimension(150, 23));
        btnGenerarReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporte3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesMSLayout = new javax.swing.GroupLayout(panelBotonesMS);
        panelBotonesMS.setLayout(panelBotonesMSLayout);
        panelBotonesMSLayout.setHorizontalGroup(
            panelBotonesMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesMSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnVolverMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGranja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBotonesMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotonesMSLayout.createSequentialGroup()
                    .addGap(338, 338, 338)
                    .addComponent(btnGenerarReporte3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );
        panelBotonesMSLayout.setVerticalGroup(
            panelBotonesMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesMSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesMSLayout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addComponent(BtnVolverMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(panelBotonesMSLayout.createSequentialGroup()
                        .addComponent(lblGranja3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator4)
            .addGroup(panelBotonesMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotonesMSLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(btnGenerarReporte3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );

        tblReporteMS.setModel(new javax.swing.table.DefaultTableModel(
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
        tblReporteMS.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tblReporteMS);

        javax.swing.GroupLayout panelModificacionesLayout = new javax.swing.GroupLayout(panelModificaciones);
        panelModificaciones.setLayout(panelModificacionesLayout);
        panelModificacionesLayout.setHorizontalGroup(
            panelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotonesMS, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        panelModificacionesLayout.setVerticalGroup(
            panelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificacionesLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotonesMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTab.addTab("Modificaciones en los servicios", panelModificaciones);

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

        panelTab.getAccessibleContext().setAccessibleName("tbl");

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

    private void btnVolverSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSPActionPerformed
        if (interfazPrincipal == null){
            interfazPrincipal = new InterfazPrincipal();
        }
        mec.abrirFrameinterfazPrincipal(this, interfazPrincipal);
    }//GEN-LAST:event_btnVolverSPActionPerformed

    private void btnVolverSRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSRActionPerformed
        if (interfazPrincipal == null){
            interfazPrincipal = new InterfazPrincipal();
        }
        mec.abrirFrameinterfazPrincipal(this, interfazPrincipal);
    }//GEN-LAST:event_btnVolverSRActionPerformed
  
    private void panelTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelTabStateChanged
        int tab = panelTab.getSelectedIndex();

        switch (tab) {
            case 0: {
                this.setTitle("Reporte: Servicios Pendientes");
                break;
            }
            case 1: {
                this.setTitle("Reporte: Servicios Realizados");
                break;
            }
            case 2: {
                this.setTitle("Reporte: Datos Mascotas");
                break;
            }
            case 3: {
                this.setTitle("Reporte: Modificaciones en los servicios");
                break;
            }
            default: {
            }
        }
    }//GEN-LAST:event_panelTabStateChanged

    private void BtnVolverDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverDMActionPerformed
        if (interfazPrincipal == null){
            interfazPrincipal = new InterfazPrincipal();
        }
        mec.abrirFrameinterfazPrincipal(this, interfazPrincipal);
    }//GEN-LAST:event_BtnVolverDMActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        mec.generarPDF(panelTab.getSelectedIndex());
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void btnGenerarReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporte1ActionPerformed
        mec.generarPDF(panelTab.getSelectedIndex());
    }//GEN-LAST:event_btnGenerarReporte1ActionPerformed

    private void btnGenerarReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporte2ActionPerformed
        mec.generarPDF(panelTab.getSelectedIndex());
    }//GEN-LAST:event_btnGenerarReporte2ActionPerformed

    private void BtnVolverMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverMSActionPerformed
        if (interfazPrincipal == null){
            interfazPrincipal = new InterfazPrincipal();
        }
        mec.abrirFrameinterfazPrincipal(this, interfazPrincipal);
    }//GEN-LAST:event_BtnVolverMSActionPerformed

    private void btnGenerarReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporte3ActionPerformed
        mec.generarPDF(panelTab.getSelectedIndex());
    }//GEN-LAST:event_btnGenerarReporte3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVolverDM;
    private javax.swing.JButton BtnVolverMS;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnGenerarReporte1;
    private javax.swing.JButton btnGenerarReporte2;
    private javax.swing.JButton btnGenerarReporte3;
    private javax.swing.JButton btnVolverSP;
    private javax.swing.JButton btnVolverSR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblGranja;
    private javax.swing.JLabel lblGranja1;
    private javax.swing.JLabel lblGranja2;
    private javax.swing.JLabel lblGranja3;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JPanel panelBotonesDM;
    private javax.swing.JPanel panelBotonesMS;
    private javax.swing.JPanel panelBotonesSP;
    private javax.swing.JPanel panelBotonesSR;
    private javax.swing.JPanel panelDuenosMascotas;
    private javax.swing.JPanel panelModificaciones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelServiciosA;
    private javax.swing.JPanel panelServiciosI;
    private javax.swing.JTabbedPane panelTab;
    private javax.swing.JTable tblReporteMS;
    private javax.swing.JTable tblReporteMascotas;
    private javax.swing.JTable tblReporteSP;
    private javax.swing.JTable tblReporteSR;
    private javax.swing.JTextField txtIdDueño;
    private javax.swing.JTextField txtIdMascota;
    // End of variables declaration//GEN-END:variables
}

