/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.prestamo;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.PrestamoControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Prestamo;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.io.IOException;
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
public class VentanaEditarPrestamo extends javax.swing.JInternalFrame {

    private PrestamoControlador prestamoControlador;
    public VentanaEditarPrestamo(PrestamoControlador prestamoControlador) {
        initComponents();
        this.prestamoControlador = prestamoControlador;
               
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigoPrestamo = new javax.swing.JTextField();
        btnBuscarBiblioteca = new javax.swing.JButton();
        lblBiblioteca = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblLibro = new javax.swing.JLabel();
        btnGuardarLibro = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblFechaPrestamo = new javax.swing.JLabel();
        lblFechaDevolucion = new javax.swing.JLabel();
        txtFechaPrestamo = new javax.swing.JTextField();
        txtFechaDevolucion = new javax.swing.JTextField();
        txtCodigoPrestamo1 = new javax.swing.JTextField();
        txtCodigoPrestamo2 = new javax.swing.JTextField();
        txtCodigoPrestamo3 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar prestamo");

        lblCodigo.setText("Codigo");

        btnBuscarBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBuscarBiblioteca.setText("Buscar");
        btnBuscarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBibliotecaActionPerformed(evt);
            }
        });

        lblBiblioteca.setText("Biblioteca");

        lblUsuario.setText("Usuario");

        lblLibro.setText("Libro");

        btnGuardarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnGuardarLibro.setText("Guardar");
        btnGuardarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLibroActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblFechaPrestamo.setText("Fecha prestamo");

        lblFechaDevolucion.setText("Fecha devolucion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarLibro)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblBiblioteca)
                            .addComponent(lblUsuario)
                            .addComponent(lblLibro))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarBiblioteca))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoPrestamo1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoPrestamo3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFechaPrestamo)
                                .addGap(22, 22, 22)
                                .addComponent(txtFechaPrestamo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFechaDevolucion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarBiblioteca)
                    .addComponent(lblFechaPrestamo)
                    .addComponent(txtFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBiblioteca)
                    .addComponent(txtCodigoPrestamo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(txtCodigoPrestamo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaDevolucion)
                            .addComponent(txtFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLibro)
                    .addComponent(txtCodigoPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarLibro)
                    .addComponent(btnCancelar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBibliotecaActionPerformed
        try {
    int codigo = Integer.parseInt(txtCodigoPrestamo.getText().trim());
    Prestamo prestamo = prestamoControlador.readPrestamo(codigo);
    if (prestamo != null) {
        // Convertir las fechas a String
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        // Formatear y mostrar las fechas
        txtFechaPrestamo.setText(dateFormat.format(prestamo.getFechaPrestamo()));
        txtFechaDevolucion.setText(dateFormat.format(prestamo.getFechaDevolucion()));

        // Mostrar los códigos y el usuario
        txtCodigoPrestamo1.setText(String.valueOf(prestamo.getCodigoBiblioteca()));
        txtCodigoPrestamo2.setText(prestamo.getCodigoUsuario());
        txtCodigoPrestamo3.setText(String.valueOf(prestamo.getCodigoLibro()));

        // Deshabilitar la edición del código de préstamo para evitar cambios en el identificador único.
        txtCodigoPrestamo.setEditable(false); 
    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron datos para el código proporcionado.", "Búsqueda de Préstamo", JOptionPane.INFORMATION_MESSAGE);
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_btnBuscarBibliotecaActionPerformed

    private void btnGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibroActionPerformed
        try {
    int codigo = Integer.parseInt(txtCodigoPrestamo.getText().trim());
    
    String fechaPrestamoStr = txtFechaPrestamo.getText().trim();
    String fechaDevolucionStr = txtFechaDevolucion.getText().trim();
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    dateFormat.setLenient(false); // Esto hace que el análisis de fechas sea estricto
    
    Date fechaPrestamo = dateFormat.parse(fechaPrestamoStr);
    Date fechaDevolucion = dateFormat.parse(fechaDevolucionStr);
    
    int codigoBiblioteca = Integer.parseInt(txtCodigoPrestamo1.getText().trim());
    String codigoUsuario = txtCodigoPrestamo2.getText().trim();
    int codigoLibro = Integer.parseInt(txtCodigoPrestamo3.getText().trim());

    Prestamo prestamo = new Prestamo(codigo, fechaPrestamo, fechaDevolucion, codigoLibro, codigoUsuario, codigoBiblioteca);
    
    prestamoControlador.updatePrestamo(codigo, fechaPrestamo, fechaDevolucion, codigoLibro, codigoUsuario, codigoBiblioteca);

    JOptionPane.showMessageDialog(this, "El préstamo ha sido actualizado.", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
    limpiarDatos();
} catch (ParseException e) {
    JOptionPane.showMessageDialog(this, "Por favor, ingrese las fechas en el formato 'dd/MM/yyyy'.", "Error de Formato de Fecha", JOptionPane.ERROR_MESSAGE);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos para los códigos.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_btnGuardarLibroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    private void limpiarDatos() {

        txtCodigoPrestamo.setEditable(true);
        txtCodigoPrestamo1.setEditable(false);
        txtCodigoPrestamo2.setEditable(false);
        txtCodigoPrestamo3.setEditable(false);
        txtFechaPrestamo.setEditable(false);
        txtFechaDevolucion.setEditable(false);
        
        txtCodigoPrestamo.setText("");
        txtCodigoPrestamo.setText("");
        txtCodigoPrestamo1.setText("");
        txtCodigoPrestamo2.setText("");
        txtCodigoPrestamo3.setText("");
        txtFechaPrestamo.setText("");
        txtFechaDevolucion.setText("");
    }
    
    
    
    
    
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
        btnBuscarBiblioteca.setText(mensajes.getString("btnBuscarBiblioteca"));
        btnCancelar.setText(mensajes.getString("btnCancelar"));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBiblioteca;
    private javax.swing.JButton btnCancelar;
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
    private javax.swing.JTextField txtFechaDevolucion;
    private javax.swing.JTextField txtFechaPrestamo;
    // End of variables declaration//GEN-END:variables
}
