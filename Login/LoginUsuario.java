package Login;

import InterfazGU.InterfazPrincipal;
import InterfazGU.Servicio;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginUsuario extends javax.swing.JFrame {

    Color foreColor = new java.awt.Color(200, 200, 200);

    private static InterfazPrincipal interfazPrincipal = null;

    public LoginUsuario() {

        initComponents();
        configuracionInterfaz();

    }

    private static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginUsuario lu = new LoginUsuario();
                lu.setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTabularPrincipal = new javax.swing.JTabbedPane();
        panelIniciondeSesion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        panelRecuperar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtRecuperarCorreo = new javax.swing.JTextField();
        comboCorreo1 = new javax.swing.JComboBox<>();
        btnRecuperar = new javax.swing.JButton();
        txtClaveRecuperada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setResizable(false);

        panelTabularPrincipal.setFocusable(false);
        panelTabularPrincipal.setPreferredSize(new java.awt.Dimension(333, 352));
        panelTabularPrincipal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelTabularPrincipalStateChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon-user.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon-password.png"))); // NOI18N

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon-loginrojo.png"))); // NOI18N

        txtPass.setText("jPasswordField1");

        javax.swing.GroupLayout panelIniciondeSesionLayout = new javax.swing.GroupLayout(panelIniciondeSesion);
        panelIniciondeSesion.setLayout(panelIniciondeSesionLayout);
        panelIniciondeSesionLayout.setHorizontalGroup(
            panelIniciondeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniciondeSesionLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(panelIniciondeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelIniciondeSesionLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIniciondeSesionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIniciondeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin))))
                .addGap(96, 96, 96))
        );
        panelIniciondeSesionLayout.setVerticalGroup(
            panelIniciondeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniciondeSesionLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panelIniciondeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIniciondeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addComponent(btnLogin)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        panelTabularPrincipal.addTab("Iniciar sesión", panelIniciondeSesion);

        panelRecuperar.setFocusable(false);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon-correo.png"))); // NOI18N

        txtRecuperarCorreo.setText("jTextField3");

        comboCorreo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com" }));

        btnRecuperar.setText("Recuperar contraseña");

        txtClaveRecuperada.setEditable(false);
        txtClaveRecuperada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtClaveRecuperadaMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Ingrese su correo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("para recuperar su contraseña");

        javax.swing.GroupLayout panelRecuperarLayout = new javax.swing.GroupLayout(panelRecuperar);
        panelRecuperar.setLayout(panelRecuperarLayout);
        panelRecuperarLayout.setHorizontalGroup(
            panelRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecuperarLayout.createSequentialGroup()
                .addGroup(panelRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRecuperarLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(txtClaveRecuperada, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRecuperarLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel6))
                    .addGroup(panelRecuperarLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7)))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRecuperarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRecuperarLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRecuperarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(comboCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRecuperarLayout.createSequentialGroup()
                        .addComponent(btnRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        panelRecuperarLayout.setVerticalGroup(
            panelRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecuperarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(panelRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboCorreo1)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRecuperarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(txtClaveRecuperada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        panelTabularPrincipal.addTab("Recuperar contraseña", panelRecuperar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTabularPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTabularPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelTabularPrincipalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelTabularPrincipalStateChanged
        int x = panelTabularPrincipal.getSelectedIndex();

        if (x == 0) {
            this.setTitle("Inicio de sesión");
            panelIniciondeSesion.requestFocus();
        } else if (x == 1) {
            this.setTitle("Recuperar contraseña");
            panelRecuperar.setSize(417, 237);
            jLabel6.requestFocus();
            panelRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    panelRecuperar.requestFocus();
                    setCampoLleno(txtRecuperarCorreo, txtRecuperarCorreo.getText(), "correo");
                }
            });
            panelRecuperar.requestFocus();
        }
    }//GEN-LAST:event_panelTabularPrincipalStateChanged

    private void txtClaveRecuperadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClaveRecuperadaMouseClicked
        txtClaveRecuperada.setText("");
    }//GEN-LAST:event_txtClaveRecuperadaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JComboBox<String> comboCorreo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panelIniciondeSesion;
    private javax.swing.JPanel panelRecuperar;
    private javax.swing.JTabbedPane panelTabularPrincipal;
    private javax.swing.JTextField txtClaveRecuperada;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtRecuperarCorreo;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    // METODOS DE LA INTERFAZ
    private void configuracionInterfaz() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imgvet/icon-interfaz32.png"));
        this.setIconImage(icon.getImage());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio de sesión");

        panelIniciondeSesion.setSize(417, 237);
        panelIniciondeSesion.requestFocus();
        panelIniciondeSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelIniciondeSesion.requestFocus();
                setCampoLleno(txtUser, txtUser.getText(), "usuario");
                setCampoLleno(txtPass, txtPass.getText(), "contraseña");
            }
        });

        comboCorreo1.setFocusable(false);

        setCampoGeneral(txtUser, "Ingrese el nombre de usuario.", "usuario", true, true, false);
        setCampoGeneral(txtPass, "Ingrese la contraseña.", "contraseña", false, false, false);
        configuracionBtnLogin();

        setCampoGeneral(txtRecuperarCorreo, "Ingrese su correo.", "correo", false, true, false);
        configuracionBtnRecupear();

    }

    // TAB 0
    private void configuracionBtnLogin() {
        btnLogin.setFocusable(false);
        btnLogin.setToolTipText("Clic para iniciar sesión.");
        btnLogin.setText("Login");
        btnLogin.setForeground(new java.awt.Color(102, 102, 102));
        btnLogin.setFont(new java.awt.Font("Meiryo", 1, 14));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickBtnLogin();
            }
        });

    }

    private void clickBtnLogin() {

        boolean aVacio = txtUser.getText().equals("usuario");
        boolean bVacio = txtPass.getText().equals("contraseña");

        if (!aVacio && !bVacio) {

            LoginBasedeDatos lbd = new LoginBasedeDatos();

            boolean a = lbd.iniciarSesion(txtUser, txtPass);

            if (a) {
                panelIniciondeSesion.requestFocus();
                JOptionPane.showMessageDialog(null, "Bienvenid@ " + txtUser.getText() + "! :)");
                InterfazPrincipal ip = new InterfazPrincipal();
                ip.setVisible(true);
                ip.setLocationRelativeTo(null);
                this.dispose();
            } else if (!a) {
                panelIniciondeSesion.requestFocus();
                JOptionPane.showMessageDialog(null, "Usuario y contraseña no coinciden! :(");
            }

        } else if (aVacio || bVacio) {
            panelIniciondeSesion.requestFocus();
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacíos! :(");
        }

    }

    // TAB 1
    private void configuracionBtnRecupear() {
        btnRecuperar.setFocusable(false);
        btnRecuperar.setToolTipText("Clic para recuperar su clave.");
        btnRecuperar.setText("Recuperar contraseña");
        btnRecuperar.setForeground(new java.awt.Color(102, 102, 102));
        btnRecuperar.setFont(new java.awt.Font("Meiryo", 1, 14));
        btnRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clicBtnRecuperar();
            }
        });
    }

    private void clicBtnRecuperar() {
        String correo = txtRecuperarCorreo.getText() + comboCorreo1.getSelectedItem();

        boolean a = correo.equals("@hotmail.com") || correo.equals("@gmail.com");

        if ((!correo.equals("correo@gmail.com") && !correo.equals("correo@hotmail.com")) && !a) {

            LoginBasedeDatos lbd = new LoginBasedeDatos();
            boolean b = lbd.verificarCorreo(correo);

            if (b) {

                String clave = lbd.recuperarClave(correo, txtClaveRecuperada);
                txtClaveRecuperada.setText(clave);
                panelRecuperar.requestFocus();

            } else if (!b) {

                jLabel6.requestFocus();
                JOptionPane.showMessageDialog(null, "Correo no registrado :(");

            }

        } else {

            jLabel6.requestFocus();
            JOptionPane.showMessageDialog(null, "No ha introducido un correo :(");
        }
    }

    // MODIFICAR CAMPOS DE TEXTO
    private void setCampoGeneral(JTextField txtField, String toolTipText, String setPalabra, boolean user, boolean tamLetra, boolean registroUser) {

        setCampoBasico(txtField, toolTipText, setPalabra, tamLetra);

        txtField.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                setCampoTipeado(txtField, txtField.getText(), e);
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {

                //Si el seleccionado es txtUser
                if (user) {
                    LoginBasedeDatos lbd = new LoginBasedeDatos();
                    lbd.cambiarIconoLogin(btnLogin, txtField);
                }

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    setMetodoEnter();
                }
            }
        });
        txtField.addFocusListener(new java.awt.event.FocusAdapter() {

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                setCampoLleno(txtField, txtField.getText(), setPalabra);
            }

            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                setCampoVacio(txtField, setPalabra);
                setSelectionString(txtField);
            }
        });
    }

    private void setCampoBasico(JTextField txtField, String toolTipText, String setPalabra, boolean tamLetra) {
        // Si el campo es campo de texto
        if (tamLetra) {
            txtField.setFont(new java.awt.Font("Meiryo", 0, 14));
        } else { // Si el campo es de password
            txtField.setFont(new java.awt.Font("Meiryo", 0, 6));
        }

        txtField.setBackground(new java.awt.Color(232, 232, 232));
        txtField.setForeground(new java.awt.Color(200, 200, 200));
        txtField.setToolTipText(toolTipText);
        txtField.setText(setPalabra);

    }

    private void setSelectionString(JTextField txtField) {
        txtField.setSelectionStart(0);
        txtField.setSelectionEnd(txtField.getText().length());
    }

    private void setCampoVacio(JTextField txtField, String palabra) {

        boolean foreground = txtField.getForeground().equals(foreColor);

        if (txtField.getText().equals(palabra) && foreground) {
            txtField.setText("");
            txtField.setForeground(new java.awt.Color(0, 0, 0));
        }

    }

    private void setCampoLleno(JTextField txtField, String getPalabra, String setPalabra) {

        if (!txtField.isFocusOwner() && getPalabra.equals("")) {
            txtField.setText(setPalabra);
            txtField.setForeground(new java.awt.Color(200, 200, 200));
        }

    }

    private void setCampoTipeado(javax.swing.JTextField txtField, String obtenerTexto, KeyEvent e) {
        int key = e.getKeyChar();
        boolean espacio = key == 32;
        int caretPosicion = txtField.getCaretPosition();

        if (obtenerTexto.length() >= 50 || espacio) {
            e.consume();
        }

        if (txtField.getForeground().equals(foreColor)) {
            txtField.setForeground(new java.awt.Color(0, 0, 0));
        }

        if (txtField.getText().contains(" ")) {
            txtField.setText(obtenerTexto.replaceAll(" ", ""));
        }

        if (caretPosicion >= 50) {
            txtField.setText(obtenerTexto.substring(0, 50));
        }

    }

    private void setMetodoEnter() {
        int tabInt = panelTabularPrincipal.getSelectedIndex();

        switch (tabInt) {
            case 0:
                clickBtnLogin();
                break;
            case 1:
                clicBtnRecuperar();
                break;
            default:
                break;
        }
    }

}
