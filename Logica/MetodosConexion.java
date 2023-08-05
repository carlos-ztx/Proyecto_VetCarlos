package Logica;

import Persistencia.conexion;
import com.toedter.calendar.JDateChooser;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MetodosConexion {

    // METODOS (DUEÑOS)
    public boolean crearDueno(String nombre, String telefono, String cedula) {
        try {
            conexion conx = new conexion();
            CallableStatement cs;
            try (Connection con = conx.conectar()) {
                cs = con.prepareCall("{CALL crearDueno(?, ?, ?)}");
                cs.setString(1, nombre);
                cs.setString(2, telefono);
                cs.setString(3, cedula);
                cs.executeUpdate();
            }
            cs.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public void leerDueno(JTable tblDueños) {
        try {
            conexion conx = new conexion();
            CallableStatement cs;
            ResultSet rs;
            try (Connection con = conx.conectar()) {
                cs = con.prepareCall("CALL leerDueno()");
                rs = cs.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) tblDueños.getModel();
                modelo.setRowCount(0);
                modelo.setColumnCount(0);
                modelo.addColumn("ID");
                modelo.addColumn("Nombre");
                modelo.addColumn("Telefono");
                modelo.addColumn("Cedula");
                if (rs.next()) {
                    Object[] datosRegistro = new Object[4];
                    do {
                        datosRegistro[0] = rs.getInt(1);
                        datosRegistro[1] = rs.getString(2);
                        datosRegistro[2] = rs.getString(3);
                        datosRegistro[3] = rs.getString(4);
                        modelo.addRow(datosRegistro);
                    } while (rs.next());
                }   tblDueños.setModel(modelo);
            }
            cs.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean actualizarDueno(String nombre, String telefono, String cedula, String id) {
        try {
            conexion conx = new conexion();
            CallableStatement cs;
            try (Connection con = conx.conectar()) {
                cs = con.prepareCall("{CALL actualizarDueno(?, ?, ?, ?)}");
                cs.setString(1, nombre);
                cs.setString(2, telefono);
                cs.setString(3, cedula);
                cs.setInt(4, Integer.parseInt(id));
                cs.executeUpdate();
            }
            cs.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminarDueno(int id) {
        try {
            conexion conx = new conexion();
            CallableStatement cs;
            try (Connection con = conx.conectar()) {
                cs = con.prepareCall("{CALL eliminarDueno(?)}");
                cs.setInt(1, id);
                cs.executeUpdate();
            }
            cs.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    // METODOS (MASCOTAS)
    public boolean crearMascota(String nombre, String raza, String color, int dueno) {
        try {
            conexion conx = new conexion();
            CallableStatement cs;
            try (Connection con = conx.conectar()) {
                cs = con.prepareCall("{CALL crearMascota(?, ?, ?, ?)}");
                cs.setString(1, nombre);
                cs.setString(2, raza);
                cs.setString(3, color);
                cs.setInt(4, dueno);
                cs.executeUpdate();
            }
            cs.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    public void leerMascota(JTable tblMascotas) {
        try {
            conexion conx = new conexion();
            CallableStatement cs;
            ResultSet rs;
            try (Connection con = conx.conectar()) {
                cs = con.prepareCall("CALL leerMascota()");
                rs = cs.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) tblMascotas.getModel();
                modelo.setRowCount(0);
                modelo.setColumnCount(0);
                modelo.addColumn("ID");
                modelo.addColumn("Nombre");
                modelo.addColumn("Especie");
                modelo.addColumn("Color");
                modelo.addColumn("Dueño");
                if (rs.next()) {
                    Object[] datosRegistro = new Object[5];
                    do {
                        datosRegistro[0] = rs.getInt(1);
                        datosRegistro[1] = rs.getString(2);
                        datosRegistro[2] = rs.getString(3);
                        datosRegistro[3] = rs.getString(4);
                        datosRegistro[4] = rs.getString(5);
                        modelo.addRow(datosRegistro);
                    } while (rs.next());
                }   tblMascotas.setModel(modelo);
            }
            cs.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean actualizarMascota(String nombre, String raza, String color, int fk, int id) {
        try {
            conexion conx = new conexion();
            CallableStatement cs;
            try (Connection con = conx.conectar()) {
                cs = con.prepareCall("{CALL actualizarMascota(?, ?, ?, ?, ?)}");
                cs.setString(1, nombre);
                cs.setString(2, raza);
                cs.setString(3, color);
                cs.setInt(4, fk);
                cs.setInt(5, id);
                cs.executeUpdate();
            }
            cs.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    // METODOS (SERVICIOS)
    public boolean crearServicio(String servicio, String alergia, String fecha, String observaciones, int fkMascota) {
        try {
            conexion conx = new conexion();
            CallableStatement cs;
            try (Connection con = conx.conectar()) {
                cs = con.prepareCall("{CALL crearServicio(?, ?, ?, ?, ?)}");
                cs.setString(1, servicio);
                cs.setString(2, alergia);
                cs.setString(3, fecha);
                cs.setString(4, observaciones);
                cs.setInt(5, fkMascota);
                cs.executeUpdate();
            }
            cs.close();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public void leerServicioA(JTable tblServicios) {

        try {
            conexion conx = new conexion();
            CallableStatement ps;
            ResultSet rs;
            try (Connection con = conx.conectar()) {
                DefaultTableModel modelo = (DefaultTableModel) tblServicios.getModel();
                modelo.setRowCount(0);
                modelo.setColumnCount(0);
                modelo.addColumn("ID");
                modelo.addColumn("Mascota");
                modelo.addColumn("Servicio");
                modelo.addColumn("Alergia");
                modelo.addColumn("Pautado para:");
                modelo.addColumn("Obeservaciones");
                modelo.addColumn("Dueño");
                modelo.addColumn("Tlf contacto:");
                ps = con.prepareCall("CALL leerServicioA");
                rs = ps.executeQuery();
                if (rs.next()) {
                    Object[] datosFila = new Object[8];
                    do {
                        datosFila[0] = rs.getInt(1);
                        datosFila[1] = rs.getString(2);
                        datosFila[2] = rs.getString(3);
                        datosFila[3] = rs.getString(4);
                        datosFila[4] = rs.getDate(5);
                        datosFila[5] = rs.getString(6);
                        datosFila[6] = rs.getString(7);
                        datosFila[7] = rs.getString(8);
                        modelo.addRow(datosFila);
                    } while (rs.next());
                }   tblServicios.setModel(modelo);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean actualizarServicio(String servicio, String alergia, String fecha, String observaciones, int fkMascota, int id) {
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            CallableStatement cs = con.prepareCall("{CALL actualizarServicio(?, ?, ?, ?, ?, ?)}");
            cs.setString(1, servicio);
            cs.setString(2, alergia);
            cs.setString(3, fecha);
            cs.setString(4, observaciones);
            cs.setInt(5, fkMascota);
            cs.setInt(6, id);

            cs.executeUpdate();
            con.close();
            cs.close();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean actualizarEstatusServicioI(int id) {
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            CallableStatement cs = con.prepareCall("{CALL actualizarEstatusServicioI(?)}");
            cs.setInt(1, id);
            cs.executeUpdate();

            con.close();
            cs.close();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public void rellenarCamposTextoServicio(JComboBox<String> cmbAlergias, JComboBox<String> cmbServicios, JTextArea txtObservaciones, JDateChooser campoFecha, JComboBox<String> cmbMascota, int idServicio) {
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            PreparedStatement ps = con.prepareStatement("SELECT alergia, tipo_servicio, observaciones, fecha_programada, fk_id_mascota FROM servicio WHERE id_servicio = ?");
            ps.setInt(1, idServicio);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                do {
                    cmbAlergias.setSelectedItem(rs.getString(1));
                    cmbServicios.setSelectedItem(rs.getString(2));
                    txtObservaciones.setText(rs.getString(3));
                    campoFecha.setDate(rs.getDate(4));
                    cmbMascota.setSelectedItem(setCmbMascota(rs.getInt(5)));
                } while (rs.next());
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private String setCmbMascota(int aInt) {
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();
            PreparedStatement ps = con.prepareStatement("SELECT id_mascota, nombre FROM mascotas WHERE id_mascota = ?");
            ps.setInt(1, aInt);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String a, b;
                do {
                    a = rs.getString(1);
                    b = rs.getString(2);
                    return a + ", Nombre: " + b;
                } while (rs.next());
            }
            con.close();
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        return null;
    }

    // METODOS (REPORTES)
    public void vistaServiciosActivos(JTable tblReporteSP) {
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            DefaultTableModel modelo = (DefaultTableModel) tblReporteSP.getModel();
            modelo.setRowCount(0);
            modelo.setColumnCount(0);
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Servicio");
            modelo.addColumn("Alergia");
            modelo.addColumn("Pautado para");
            modelo.addColumn("Observaciones");
            modelo.addColumn("Dueño");
            modelo.addColumn("Tlf contacto");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM vista_serviciosa");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Object[] datosFila = new Object[8];
                do {
                    datosFila[0] = rs.getInt(1);
                    datosFila[1] = rs.getString(2);
                    datosFila[2] = rs.getString(3);
                    datosFila[3] = rs.getString(4);
                    datosFila[4] = rs.getDate(5);
                    datosFila[5] = rs.getString(6);
                    datosFila[6] = rs.getString(7);
                    datosFila[7] = rs.getString(8);
                    modelo.addRow(datosFila);
                } while (rs.next());
            }
            tblReporteSP.setModel(modelo);

            con.close();
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void vistaServiciosInactivos(JTable tblReporteSR) {
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            DefaultTableModel modelo = (DefaultTableModel) tblReporteSR.getModel();
            modelo.setRowCount(0);
            modelo.setColumnCount(0);
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Servicio");
            modelo.addColumn("Alergia");
            modelo.addColumn("Realizado el");
            modelo.addColumn("Observaciones");
            modelo.addColumn("Dueño");
            modelo.addColumn("Tlf contacto");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM vista_serviciosi");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Object[] datosFila = new Object[8];
                do {
                    datosFila[0] = rs.getInt(1);
                    datosFila[1] = rs.getString(2);
                    datosFila[2] = rs.getString(3);
                    datosFila[3] = rs.getString(4);
                    datosFila[4] = rs.getDate(5);
                    datosFila[5] = rs.getString(6);
                    datosFila[6] = rs.getString(7);
                    datosFila[7] = rs.getString(8);
                    modelo.addRow(datosFila);
                } while (rs.next());
            }
            tblReporteSR.setModel(modelo);

            con.close();
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void vitaRelacionDuenoMascota(JTable tblReporteMascotas) {
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            DefaultTableModel modelo = (DefaultTableModel) tblReporteMascotas.getModel();
            modelo.setRowCount(0);
            modelo.setColumnCount(0);
            modelo.addColumn("Cedula");
            modelo.addColumn("Dueño");
            modelo.addColumn("Telefono");
            modelo.addColumn("Nombre mascota");
            modelo.addColumn("Especie");
            modelo.addColumn("Color");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM rl_duenos_mascotas");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Object[] datosFila = new Object[6];
                do {
                    datosFila[0] = rs.getString(1);
                    datosFila[1] = rs.getString(2);
                    datosFila[2] = rs.getString(3);
                    datosFila[3] = rs.getString(4);
                    datosFila[4] = rs.getString(5);
                    datosFila[5] = rs.getString(6);
                    modelo.addRow(datosFila);
                } while (rs.next());
            }
            tblReporteMascotas.setModel(modelo);

            con.close();
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void historialservicios(JTable tblReporteMS) {
         try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            DefaultTableModel modelo = (DefaultTableModel) tblReporteMS.getModel();
            modelo.setRowCount(0);
            modelo.setColumnCount(0);
            modelo.addColumn("Motivo");
            modelo.addColumn("Alergia");
            modelo.addColumn("Programada para");
            modelo.addColumn("Observaciones");
            modelo.addColumn("Estatus");
            modelo.addColumn("Servicio");
            modelo.addColumn("Fecha modificacion");

            CallableStatement ps = con.prepareCall("CALL leerHistorialServicio()");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Object[] datosFila = new Object[7];
                do {
                    datosFila[0] = rs.getString(1);
                    datosFila[1] = rs.getString(2);
                    datosFila[2] = rs.getString(3);
                    datosFila[3] = rs.getString(4);
                    datosFila[4] = rs.getString(5);
                    datosFila[5] = rs.getString(6);
                    datosFila[6] = rs.getString(7);
                    modelo.addRow(datosFila);
                } while (rs.next());
            }
            tblReporteMS.setModel(modelo);

            con.close();
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Rellenar JCombos
    // En SERVICIOS 
    public void rellenarComboMascota(JComboBox<String> cmbMascota) {
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();
            PreparedStatement ps = con.prepareStatement("CALL rellenarComboMascotas()");
            ResultSet rs = ps.executeQuery();

            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cmbMascota.getModel();
            modelo.removeAllElements();
            modelo.addElement("-");

            if (rs.next()) {
                String a, b;
                do {
                    a = rs.getString(1);
                    b = rs.getString(2);
                    modelo.addElement(a + ", Nombre: " + b);
                } while (rs.next());
            }
            cmbMascota.setModel(modelo);
            con.close();
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void rellenarComboSeleccionarServicio(JComboBox<String> cmbSeleccionarServicio) {
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            CallableStatement ps = (CallableStatement) con.prepareCall("CALL rellenarComboServicios()");
            ResultSet rs = ps.executeQuery();

            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cmbSeleccionarServicio.getModel();
            modelo.removeAllElements();
            modelo.addElement("-");
            if (rs.next()) {
                do {
                    String a, b, c;
                    a = rs.getString(1);
                    b = rs.getString(2);
                    c = rs.getString(3);
                    modelo.addElement(a + ", " + b + ", " + c);
                } while (rs.next());
            }
            cmbSeleccionarServicio.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    // en VER DATOS - MASCOTAS y CARGAR DATOS - MASCOTAS
    public void rellenarComboDueño(JComboBox<String> cmbDueño) {
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            CallableStatement ps = (CallableStatement) con.prepareCall("CALL rellenarComboDueño()");
            ResultSet rs = ps.executeQuery();

            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cmbDueño.getModel();
            modelo.removeAllElements();
            modelo.addElement("-");
            if (rs.next()) {
                do {
                    String a, b, c;
                    a = rs.getString(1);
                    b = rs.getString(2);
                    modelo.addElement(a + ", " + b);
                } while (rs.next());
            }
            cmbDueño.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Metodos miscelaneos
    public int getID(String cedula) {
        int id = -1;
        try {
            conexion conx = new conexion();
            Connection con = conx.conectar();

            CallableStatement cs = con.prepareCall("{CALL getDuenoID(?)}");
            cs.setString(1, cedula);
            ResultSet rs = cs.executeQuery();

            if (rs.next()) {
                do {
                    id = rs.getInt(1);
                } while (rs.next());
            }
            return id;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Es aqui?" + e);
            return id;
        }
    }

    void rellenarPDF(String nombre, String[] nombreColumnas, String sql, int tamaño) {
        try {
            Document pdf = new Document();
            
            String guardarEn = System.getProperty("user.home");
            PdfWriter.getInstance(pdf, new FileOutputStream(guardarEn + "/Desktop/" + nombre));
            pdf.open();
            PdfPTable tablapdf = new PdfPTable(tamaño);
            
            for(int i = 0; i < tamaño; i++){
                tablapdf.addCell(nombreColumnas[i]);
            }
            
            try {
                conexion conx = new conexion();
                Connection con = conx.conectar();

                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    do {
                        for (int i = 0; i < tamaño; i++) {
                            tablapdf.addCell(rs.getString(i + 1));
                        }
                    } while (rs.next());
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            pdf.add(tablapdf);
            pdf.close();
            JOptionPane.showMessageDialog(null, "El reporte \"" + nombre + "\" se ha creado con exito", "Reporte listo", JOptionPane.INFORMATION_MESSAGE);
        } catch (DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }  
}
