package Login;

import Persistencia.conexion;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginBasedeDatos {

    private final ImageIcon loginVerde;
    private final ImageIcon loginRojo;
    private final ImageIcon lunaOff;
    private final ImageIcon lunaOn;
    
    public LoginBasedeDatos() {
        this.lunaOn = new ImageIcon(getClass().getResource("/Img/icon-on.png"));
        this.lunaOff = new ImageIcon(getClass().getResource("/Img/icon-off.png"));
        this.loginRojo = new ImageIcon(getClass().getResource("/Img/icon-loginrojo.png"));
        this.loginVerde = new ImageIcon(getClass().getResource("/Img/icon-loginverde.png"));
    }

    public void cambiarIconoLogin(JButton btnLogin, JTextField txtUser) {
        if (verificarNombreDeUsuario(txtUser)) {
            btnLogin.setIcon(loginVerde);
        } else {
            btnLogin.setIcon(loginRojo);
        }
    }
    
    public boolean iniciarSesion(JTextField txtUser, JTextField txtPass) {

        boolean a = verificarNombreDeUsuario(txtUser);

        int id = 0;
        
            if (a) {
                id = obtenerIdDelUsuario(txtUser);
                if (id > 0) {
                    return verificarClaveyUsuario(txtUser, txtPass, id);
                } else if (id == 0) {
                    return false;
                }
            } else {
                return false;
            }
        return false;
    }

    private int obtenerIdDelUsuario(JTextField txtUser) {
        String user = txtUser.getText();
        int id = 0;

        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            CallableStatement cs = con.prepareCall("{CALL obtenerIdDelUsuario(?)}");
            cs.setString(1, user);
            ResultSet rs = cs.executeQuery();

            if (rs.next()) {
                id = rs.getInt(1);
                if (id != 0) {
                    con.close();
                    cs.close();
                    rs.close();
                    return id;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return 0;
    }

    private boolean verificarClaveyUsuario(JTextField txtUser, JTextField txtPass, int id) {
        String user = txtUser.getText(),
                pass = txtPass.getText();
        boolean a = false,
                b = false;

        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            CallableStatement cs = con.prepareCall("{CALL verificarUsuarioyContrasena(?)}");
            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                a = rs.getString(1).equals(user);
                b = rs.getString(2).equals(pass);
            }

            if (a && b) {
                con.close();
                cs.close();
                rs.close();
                return true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return false;
    }
    
    public boolean verificarNombreDeUsuario(JTextField txtUser) {
        String user = txtUser.getText();
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            CallableStatement cs = con.prepareCall("{CALL verificarNombreDeUsuario(?)}");
            cs.setString(1, user);
            ResultSet rs = cs.executeQuery();

            if (rs.next()) {
                boolean ver = rs.getString(1).equals(user);
                if (ver) {
                    con.close();
                    cs.close();
                    rs.close();
                    return true;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return false;

    }

    public boolean verificarCorreo(String correo) {
        conexion conx = new conexion();
        Connection con = conx.conectar();

        try {
            CallableStatement cs = con.prepareCall("{CALL verificarCorreo(?)}");
            cs.setString(1, correo);
            ResultSet rs = cs.executeQuery();

            if(rs.next()){
                if (rs.getString(1).equals(correo)) {
                con.close();
                cs.close();
                rs.close();
                return true;
            }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return false;
    }

    String recuperarClave(String correo, JTextField txtClaveRecuperada) {
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();
            
            CallableStatement cs = con.prepareCall("{CALL recuperarClave(?)}");
            cs.setString(1, correo);
            ResultSet rs = cs.executeQuery();
            
            if(rs.next()){
                
                String clave = rs.getString(1);
                
                con.close();
                cs.close();
                rs.close();
                
                return clave;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return "No hay clave.";
    }
    
}
