/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.prestamo;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.PrestamoControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IPrestamoDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Prestamo;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author juanguillenalbarracin
 */
public class VentanaCrearPrestamo extends javax.swing.JInternalFrame {

    private PrestamoControlador prestamoControlador;
    private IPrestamoDao prestamoDao;
    
    public VentanaCrearPrestamo(PrestamoControlador prestamoControlador,IPrestamoDao prestamoDao) {
        initComponents();
        this.prestamoControlador = prestamoControlador;
        this.prestamoDao = prestamoDao;
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBiblioteca = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigoPrestamo = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblLibro = new javax.swing.JLabel();
        btnGuardarLibro = new javax.swing.JButton();
        lblFechaPrestamo = new javax.swing.JLabel();
        lblFechaDevolucion = new javax.swing.JLabel();
        txtCodigoPrestamo1 = new javax.swing.JTextField();
        txtCodigoPrestamo2 = new javax.swing.JTextField();
        txtCodigoPrestamo3 = new javax.swing.JTextField();
        txtFecha1 = new javax.swing.JTextField();
        txtFecha2 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear Prestamo");

        lblBiblioteca.setText("Biblioteca");

        lblCodigo.setText("Codigo");

        lblUsuario.setText("Usuario");

        lblLibro.setText("Libro");

        btnGuardarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnGuardarLibro.setText("Guardar");
        btnGuardarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLibroActionPerformed(evt);
            }
        });

        lblFechaPrestamo.setText("Fecha Prestamo");

        lblFechaDevolucion.setText("Fecha Devolucion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCodigo)
                                .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblLibro))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardarLibro)
                                    .addComponent(txtCodigoPrestamo1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFechaPrestamo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoPrestamo3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblFechaDevolucion)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha1)
                    .addComponent(txtFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBiblioteca)
                    .addComponent(lblFechaPrestamo)
                    .addComponent(txtCodigoPrestamo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtCodigoPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLibro)
                    .addComponent(txtCodigoPrestamo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaDevolucion)
                    .addComponent(txtFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(btnGuardarLibro)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibroActionPerformed
        // Obtener los valores de los campos de texto
    String codigoStr = txtCodigoPrestamo.getText().trim();
    String bibliotecaStr = txtCodigoPrestamo1.getText().trim();
    String usuarioStr = txtCodigoPrestamo2.getText().trim();
    String libroStr = txtCodigoPrestamo3.getText().trim();
    String fechaPrestamoStr = txtFecha1.getText().trim();
    String fechaDevolucionStr = txtFecha1.getText().trim();

    // Validar que ningún campo esté vacío
    if (codigoStr.isEmpty() || bibliotecaStr.isEmpty() || usuarioStr.isEmpty() || libroStr.isEmpty() ||
        fechaPrestamoStr.isEmpty() || fechaDevolucionStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Convertir y validar datos
    try {
        int codigo = Integer.parseInt(codigoStr);
        int codigoBiblioteca = Integer.parseInt(bibliotecaStr);
        int codigoLibro = Integer.parseInt(libroStr);
        

        // Convertir las fechas
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaPrestamo = dateFormat.parse(fechaPrestamoStr);
        Date fechaDevolucion = dateFormat.parse(fechaDevolucionStr);

        // Verificar que la fecha de devolución no sea antes que la de préstamo
        if (fechaDevolucion.before(fechaPrestamo)) {
            JOptionPane.showMessageDialog(this, "La fecha de devolución no puede ser anterior a la fecha de préstamo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear el préstamo
        Prestamo prestamo = new Prestamo(codigo, fechaPrestamo, fechaDevolucion, codigoLibro, usuarioStr, codigoBiblioteca);
        prestamoControlador.createPrestamo(codigo, fechaPrestamo, fechaDevolucion, codigoLibro,usuarioStr, codigoBiblioteca);

        JOptionPane.showMessageDialog(this, "Préstamo guardado con éxito.");

        // Limpia los campos después de guardar
        txtCodigoPrestamo.setText("");
        txtCodigoPrestamo1.setText("");
        txtCodigoPrestamo2.setText("");
        txtCodigoPrestamo3.setText("");
        txtFecha1.setText("");
        txtFecha1.setText("");
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos en los campos de código.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese las fechas en el formato dd/MM/yyyy.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al guardar el préstamo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnGuardarLibroActionPerformed

    
    
    
    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);

        // Assuming these are JLabels and JButton
        

        lblCodigo.setText(mensajes.getString("lblCodigo"));
        lblLibro.setText(mensajes.getString("lblLibro"));
        lblBiblioteca.setText(mensajes.getString("lblBiblioteca"));
        lblUsuario.setText(mensajes.getString("lblUsuario"));
        btnGuardarLibro.setText(mensajes.getString("btnGuardarLibro"));
        lblFechaPrestamo.setText(mensajes.getString("lblFechaPrestamo"));
        lblFechaDevolucion.setText(mensajes.getString("lblFechaDevolucion"));

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarLibro;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFechaDevolucion;
    private javax.swing.JLabel lblFechaPrestamo;
    private javax.swing.JLabel lblLibro;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCodigoPrestamo;
    private javax.swing.JTextField txtCodigoPrestamo1;
    private javax.swing.JTextField txtCodigoPrestamo2;
    private javax.swing.JTextField txtCodigoPrestamo3;
    private javax.swing.JTextField txtFecha1;
    private javax.swing.JTextField txtFecha2;
    // End of variables declaration//GEN-END:variables
}
