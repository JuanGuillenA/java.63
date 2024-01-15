/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.prestamo;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.PrestamoControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
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
public class VentanaCrearPrestamo extends javax.swing.JInternalFrame {

    private PrestamoControlador prestamoControlador;
    
    public VentanaCrearPrestamo(PrestamoControlador prestamoControlador) {
        initComponents();
        this.prestamoControlador = prestamoControlador;
        cargarComboBiblioteca(comboBoxBiblioteca);
        cargarComboUsuario(comboBoxUsuario);
        cargarComboLibro(comboBoxLibro);
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBiblioteca = new javax.swing.JLabel();
        comboBoxBiblioteca = new javax.swing.JComboBox<>();
        lblCodigo = new javax.swing.JLabel();
        txtCodigoPrestamo = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        comboBoxUsuario = new javax.swing.JComboBox<>();
        lblLibro = new javax.swing.JLabel();
        comboBoxLibro = new javax.swing.JComboBox<>();
        btnGuardarLibro = new javax.swing.JButton();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        fechaDevolucion = new com.toedter.calendar.JDateChooser();
        lblFechaPrestamo = new javax.swing.JLabel();
        lblFechaDevolucion = new javax.swing.JLabel();

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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBoxLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxBiblioteca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodigoPrestamo))
                            .addComponent(btnGuardarLibro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFechaPrestamo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblFechaDevolucion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(fechaDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBiblioteca)
                            .addComponent(comboBoxBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaPrestamo)))
                    .addComponent(fechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLibro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFechaDevolucion))
                    .addComponent(fechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnGuardarLibro)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibroActionPerformed
        int codigo = Integer.parseInt(comboBoxLibro.getSelectedItem().toString());
        String identificacion = comboBoxUsuario.getSelectedItem().toString();  
        int codigoBiblioteca = Integer.parseInt(comboBoxBiblioteca.getSelectedItem().toString());

        Biblioteca biblioteca = prestamoControlador.readBiblioteca(codigo);
        Libro libro = prestamoControlador.readLibro(codigo);
        Usuario usuario = prestamoControlador.readUsuario(identificacion);
        Date fechaPrestamo = fechaInicio.getDate();
        Date fechaDevolucion1 = fechaDevolucion.getDate();
        int codigoPrestamo = Integer.parseInt(txtCodigoPrestamo.getText());
           
        prestamoControlador.create(codigo,fechaPrestamo, fechaDevolucion1,biblioteca, usuario, libro);
        JOptionPane.showMessageDialog(this, "Prestamo realizado...");
        
        txtCodigoPrestamo.setText("");
        comboBoxBiblioteca.setSelectedIndex(-1);
        comboBoxUsuario.setSelectedIndex(-1);
        comboBoxLibro.setSelectedIndex(-1);
    }//GEN-LAST:event_btnGuardarLibroActionPerformed

    
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

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarLibro;
    private javax.swing.JComboBox<String> comboBoxBiblioteca;
    private javax.swing.JComboBox<String> comboBoxLibro;
    private javax.swing.JComboBox<String> comboBoxUsuario;
    private com.toedter.calendar.JDateChooser fechaDevolucion;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFechaDevolucion;
    private javax.swing.JLabel lblFechaPrestamo;
    private javax.swing.JLabel lblLibro;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCodigoPrestamo;
    // End of variables declaration//GEN-END:variables
}
