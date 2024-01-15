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
        cargarComboBiblioteca(comboBoxBiblioteca);
        cargarComboUsuario(comboBoxUsuario);
        cargarComboLibro(comboBoxLibro);        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigoPrestamo = new javax.swing.JTextField();
        btnBuscarBiblioteca = new javax.swing.JButton();
        lblBiblioteca = new javax.swing.JLabel();
        comboBoxBiblioteca = new javax.swing.JComboBox<>();
        lblUsuario = new javax.swing.JLabel();
        comboBoxUsuario = new javax.swing.JComboBox<>();
        comboBoxLibro = new javax.swing.JComboBox<>();
        lblLibro = new javax.swing.JLabel();
        btnGuardarLibro = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblFechaPrestamo = new javax.swing.JLabel();
        lblFechaDevolucion = new javax.swing.JLabel();
        fechaIni = new com.toedter.calendar.JDateChooser();
        fechaDev = new com.toedter.calendar.JDateChooser();

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
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboBoxBiblioteca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(21, 21, 21))
                                    .addComponent(txtCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnBuscarBiblioteca))
                            .addComponent(comboBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaPrestamo)
                            .addComponent(lblFechaDevolucion))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechaDev, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(fechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(fechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBiblioteca)
                    .addComponent(comboBoxBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(comboBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaDevolucion)
                            .addComponent(fechaDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarLibro)
                    .addComponent(btnCancelar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBibliotecaActionPerformed
        int codigo = Integer.parseInt(txtCodigoPrestamo.getText());
        Prestamo prestamo =  prestamoControlador.read(codigo);
        if(prestamo!=null)
        {
            fechaDev.setDate(prestamo.getFechaDevolucion());
            fechaIni.setDate(prestamo.getFechaPrestamo());
            fechaDev.setEnabled(true);
            fechaIni.setEnabled(true);
            comboBoxBiblioteca.setEnabled(true);
            comboBoxUsuario.setEnabled(true);
            comboBoxLibro.setEnabled(true);
            cargarComboBiblioteca(comboBoxBiblioteca);
            cargarComboLibro(comboBoxUsuario);
            cargarComboUsuario(comboBoxLibro);
            txtCodigoPrestamo.setEditable(false);
        }else
        {
            JOptionPane.showMessageDialog(this, "No hay prestamo con tal fecha");
        }
    }//GEN-LAST:event_btnBuscarBibliotecaActionPerformed

    private void btnGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibroActionPerformed
        int codigoLibro = Integer.parseInt(comboBoxLibro.getSelectedItem().toString());
            String identificacion = comboBoxUsuario.getSelectedItem().toString(); 
            int codigoBiblioteca = Integer.parseInt(comboBoxBiblioteca.getSelectedItem().toString());
            int codigo = Integer.parseInt(txtCodigoPrestamo.getText());
            Libro libro = prestamoControlador.readLibro(codigo);
            Usuario usuario = prestamoControlador.readUsuario(identificacion);
            Biblioteca biblioteca = prestamoControlador.readBiblioteca(codigo);
            Date fechaPrestamo = fechaIni.getDate();
            Date fechaDevolucion = fechaDev.getDate();
            
            Prestamo prestamo = new Prestamo(codigo,fechaPrestamo,fechaDevolucion,biblioteca,usuario, libro);
            prestamoControlador.update( codigo,  fechaPrestamo,  fechaDevolucion, biblioteca,  usuario,  libro);
            JOptionPane.showMessageDialog(this, "Prestamo actualizado..."); 
            limpiarDatos();
    }//GEN-LAST:event_btnGuardarLibroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    private void limpiarDatos() {

        txtCodigoPrestamo.setEditable(true);
        comboBoxBiblioteca.setEditable(false);
        comboBoxUsuario.setEditable(false);
        comboBoxLibro.setEditable(false);
        txtCodigoPrestamo.setText("");
        comboBoxBiblioteca.setSelectedIndex(-1);
        comboBoxUsuario.setSelectedIndex(-1);
        comboBoxLibro.setSelectedIndex(-1);
    }
    
    private void cargarComboBiblioteca(JComboBox comboBox)
    {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        comboBox.setModel(combo);
        List<Biblioteca> bibliotecas = prestamoControlador.listBiblioteca();
        for(Biblioteca biblioteca : bibliotecas)
        {
            combo.addElement(biblioteca.getCodigo());
        }     
    }
    
    private void cargarComboUsuario(JComboBox comboBox)
    {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        comboBox.setModel(combo);
        List<Usuario> usuarios = prestamoControlador.listUsuario();
        for(Usuario usuario : usuarios)
        {
            combo.addElement(usuario.getIdentificacion());
        }     
    }
    private void cargarComboLibro(JComboBox comboBox)
    {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        comboBox.setModel(combo);
        List<Libro> libros = prestamoControlador.listLibro();
        for(Libro libro : libros)
        {
            combo.addElement(libro.getCodigo());
        }     
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
    private javax.swing.JComboBox<String> comboBoxBiblioteca;
    private javax.swing.JComboBox<String> comboBoxLibro;
    private javax.swing.JComboBox<String> comboBoxUsuario;
    private com.toedter.calendar.JDateChooser fechaDev;
    private com.toedter.calendar.JDateChooser fechaIni;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFechaDevolucion;
    private javax.swing.JLabel lblFechaPrestamo;
    private javax.swing.JLabel lblLibro;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCodigoPrestamo;
    // End of variables declaration//GEN-END:variables
}
