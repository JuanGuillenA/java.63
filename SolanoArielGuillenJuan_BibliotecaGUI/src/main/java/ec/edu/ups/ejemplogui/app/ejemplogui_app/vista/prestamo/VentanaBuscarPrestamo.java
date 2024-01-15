/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.prestamo;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.PrestamoControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Prestamo;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author juanguillenalbarracin
 */
public class VentanaBuscarPrestamo extends javax.swing.JInternalFrame {

    private PrestamoControlador prestamoControlador;
    public VentanaBuscarPrestamo(PrestamoControlador prestamoControlador) {
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
        txtBiblioteca = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblLibro = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtLibro = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar prestamo ");

        lblCodigo.setText("Codigo");

        btnBuscarBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBuscarBiblioteca.setText("Buscar");
        btnBuscarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBibliotecaActionPerformed(evt);
            }
        });

        lblBiblioteca.setText("Biblioteca");

        txtBiblioteca.setEditable(false);

        lblUsuario.setText("Usuario");

        lblLibro.setText("Libro");

        txtUsuario.setEditable(false);

        txtLibro.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBiblioteca)
                    .addComponent(lblCodigo)
                    .addComponent(lblUsuario)
                    .addComponent(lblLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtBiblioteca, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoPrestamo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarBiblioteca)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarBiblioteca)
                    .addComponent(lblCodigo))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBiblioteca)
                    .addComponent(txtBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLibro)
                    .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBibliotecaActionPerformed
        int codigo = Integer.parseInt(txtCodigoPrestamo.getText());
        Prestamo prestamo = prestamoControlador.read(codigo);
        if(prestamo != null) {
        txtBiblioteca.setText(prestamo.getBiblioteca().getNombre());
        txtUsuario.setText(prestamo.getUsuario().getNombre());
        txtLibro.setText(prestamo.getLibro().getTitulo());
    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron datos...");
        }  
    }//GEN-LAST:event_btnBuscarBibliotecaActionPerformed

    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);

        // Assuming these are JLabels and JButton
        

        lblCodigo.setText(mensajes.getString("lblCodigo"));
        lblLibro.setText(mensajes.getString("lblLibro"));
        lblBiblioteca.setText(mensajes.getString("lblBiblioteca"));
        lblUsuario.setText(mensajes.getString("lblUsuario"));
        btnBuscarBiblioteca.setText(mensajes.getString("btnBuscarBiblioteca"));

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBiblioteca;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblLibro;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtBiblioteca;
    private javax.swing.JTextField txtCodigoPrestamo;
    private javax.swing.JTextField txtLibro;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
