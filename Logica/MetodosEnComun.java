package Logica;

import InterfazGU.CargarDatos;
import InterfazGU.InterfazPrincipal;
import InterfazGU.Reportes;
import InterfazGU.Servicio;
import InterfazGU.VerDatos;
import Login.LoginUsuario;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MetodosEnComun {
    
    MetodosConexion mc = new MetodosConexion();
    
    // Configurar Frames cada vez que se abre la instancia
    public void abrirFrameinterfazPrincipal(CargarDatos aThis, InterfazPrincipal interfazPrincipal) {
        interfazPrincipal.setSize(aThis.getSize());
        interfazPrincipal.setLocationRelativeTo(aThis);
        interfazPrincipal.setVisible(true);
        interfazPrincipal.actualizarTablaIP();
        aThis.dispose();
    }
    
    public void abrirFrameinterfazPrincipal(Servicio aThis, InterfazPrincipal interfazPrincipal) {
        interfazPrincipal.setSize(aThis.getSize());
        interfazPrincipal.setLocationRelativeTo(aThis);
        interfazPrincipal.setVisible(true);
        interfazPrincipal.actualizarTablaIP();
        aThis.dispose();
    }
    
    public void abrirFrameinterfazPrincipal(VerDatos aThis, InterfazPrincipal interfazPrincipal) {
        interfazPrincipal.setSize(aThis.getSize());
        interfazPrincipal.setLocationRelativeTo(aThis);
        interfazPrincipal.setVisible(true);
        interfazPrincipal.actualizarTablaIP();
        aThis.dispose();
    }
    
    public void abrirFrameinterfazPrincipal(Reportes aThis, InterfazPrincipal interfazPrincipal) {
        interfazPrincipal.setSize(aThis.getSize());
        interfazPrincipal.setLocationRelativeTo(aThis);
        interfazPrincipal.setVisible(true);
        interfazPrincipal.actualizarTablaIP();
        aThis.dispose();
    }

    public void abrirFrameCargarDatos(InterfazPrincipal aThis, CargarDatos cargarDatos) {
        cargarDatos.setSize(aThis.getSize());
        cargarDatos.setLocationRelativeTo(aThis);
        cargarDatos.setVisible(true);
        cargarDatos.rellenarComboCargarDato();
        aThis.dispose();
    }

    public void abrirFrameVerDatos(InterfazPrincipal aThis, VerDatos verDatos) {
        verDatos.setSize(aThis.getSize());
        verDatos.setLocationRelativeTo(aThis);
        verDatos.setVisible(true);
        verDatos.rellenarCombosVerDatos();
        aThis.dispose();
    }
    
    public void abrirFrameServicio(InterfazPrincipal aThis, Servicio servicio) {
        servicio.setSize(aThis.getSize());
        servicio.setLocationRelativeTo(aThis);
        servicio.setVisible(true);
        servicio.rellenarCombosServicio();
        aThis.dispose();
    }
    
    public void abrirFrameReporte(InterfazPrincipal aThis, Reportes reporte) {
        reporte.setSize(aThis.getSize());
        reporte.setLocationRelativeTo(aThis);
        reporte.setVisible(true);
        reporte.rellenarTablasReportes();
        aThis.dispose();
    }

    public void abrirFrameLogin(InterfazPrincipal aThis, LoginUsuario loginUsuario) {
        if (!loginUsuario.isShowing()) {
            loginUsuario.setLocationRelativeTo(null);
        }
        loginUsuario.setVisible(true);
        aThis.dispose();
    }

    // CAMPOS DE TEXTO (metodos)
    public boolean verificarCaracteresEnCampos(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) < 48 || palabra.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }

    public void liminteMaxCampo(JTextField txtField, int i, KeyEvent evt) {
        if (txtField.getText().length() >= i) {
            evt.consume();
        }
    }

    public void liminteMaxCampo(JTextArea txtArea, int i, KeyEvent evt) {
        if (txtArea.getText().length() >= i) {
            evt.consume();
        }
    }

    // GENERAR REPORTES
    
    public void generarPDF(int selectedIndex) {
        switch (selectedIndex) {
            case 0: // REPORTE SERVICIOS ACTIVOS (PENDIENTES)
                try {
                String fecha = fechaActual(),
                        nombre = "Servicios-Pendientes (" + fecha + ").pdf",
                        sql = "SELECT * FROM vista_serviciosa";

                String[] nombreColumnas = new String[8];

                nombreColumnas[0] = "ID";
                nombreColumnas[1] = "Nombre";
                nombreColumnas[2] = "Servicio";
                nombreColumnas[3] = "Alergia";
                nombreColumnas[4] = "Pautado para";
                nombreColumnas[5] = "Observaciones";
                nombreColumnas[6] = "Dueño";
                nombreColumnas[7] = "Tlf contacto";

                mc.rellenarPDF(nombre, nombreColumnas, sql, nombreColumnas.length);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al obtener la fecha");
            }
            break;
            case 1: // REPORTE SERVICIOS INACTIVOS (REALIZADOS)
                try {
                String fecha = fechaActual(),
                        nombre = "Servicios-Realizados (" + fecha + ").pdf",
                        sql = "SELECT * FROM vista_serviciosi";

                String[] nombreColumnas = new String[8];

                nombreColumnas[0] = "ID";
                nombreColumnas[1] = "Nombre";
                nombreColumnas[2] = "Servicio";
                nombreColumnas[3] = "Alergia";
                nombreColumnas[4] = "Pautado para";
                nombreColumnas[5] = "Observaciones";
                nombreColumnas[6] = "Dueño";
                nombreColumnas[7] = "Tlf contacto";

                mc.rellenarPDF(nombre, nombreColumnas, sql, nombreColumnas.length);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al obtener la fecha");
            }

                break;
            case 2: // REPORTE MASCOTAS Y SUS DUEÑOS
                try {
                String fecha = fechaActual(),
                        nombre = "Datos-Mascotas (" + fecha + ").pdf",
                        sql = "SELECT * FROM vista_serviciosi";

                String[] nombreColumnas = new String[6];

                nombreColumnas[0] = "Cedula";
                nombreColumnas[1] = "Dueño";
                nombreColumnas[2] = "Telefono";
                nombreColumnas[3] = "Nombre mascota";
                nombreColumnas[4] = "Especie";
                nombreColumnas[5] = "Color";

                mc.rellenarPDF(nombre, nombreColumnas, sql, nombreColumnas.length);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al obtener la fecha");
            }

                break;
            case 3: // REPORTE MODIFICACIONES EN LOS SERVICIOS
                try {
                String fecha = fechaActual(),
                        nombre = "Modificacion-Servicios (" + fecha + ").pdf",
                        sql = "CALL leerHistorialServicio()";

                String[] nombreColumnas = new String[7];

                nombreColumnas[0] = "Motivo";
                nombreColumnas[1] = "Alergia";
                nombreColumnas[2] = "Programada para";
                nombreColumnas[3] = "Observaciones";
                nombreColumnas[4] = "Estatus";
                nombreColumnas[5] = "Servicio";
                nombreColumnas[6] = "Fecha modificacion";
                
                mc.rellenarPDF(nombre, nombreColumnas, sql, nombreColumnas.length);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al obtener la fecha");
            }

                break;
            default:
                throw new AssertionError();
        }
    }

    private String fechaActual() {
        LocalDate date = LocalDate.now();
        
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        return date.format(formatoFecha);
    }


}
