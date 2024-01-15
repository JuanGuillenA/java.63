/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.biblioteca;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.BibliotecaControlador;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author juanguillenalbarracin
 */
public class VentanaCrearBiblioteca extends javax.swing.JInternalFrame {
    FondoVentana fondo = new FondoVentana();
    private BibliotecaControlador bibliotecaControlador;
    
    public VentanaCrearBiblioteca(BibliotecaControlador bibliotecaControlador) {
        this.setContentPane(fondo);
        initComponents();
        this.bibliotecaControlador = bibliotecaControlador;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatosBiblioteca1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtCodigoBiblioteca = new javax.swing.JTextField();
        txtNombreBiblioteca = new javax.swing.JTextField();
        txtDireccionBiblioteca = new javax.swing.JTextField();
        txtTelefonoBiblioteca = new javax.swing.JTextField();
        btnGuardarBiblioteca = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear nueva Biblioteca");
        addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                formCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        DatosBiblioteca1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar datos"));

        lblCodigo.setText("Codigo");

        lblNombre.setText("Nombre");

        lblDireccion.setText("Direccion");

        lblTelefono.setText("Telefono");

        txtCodigoBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBibliotecaActionPerformed(evt);
            }
        });

        btnGuardarBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnGuardarBiblioteca.setText("Guardar");
        btnGuardarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBibliotecaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosBiblioteca1Layout = new javax.swing.GroupLayout(DatosBiblioteca1);
        DatosBiblioteca1.setLayout(DatosBiblioteca1Layout);
        DatosBiblioteca1Layout.setHorizontalGroup(
            DatosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosBiblioteca1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(DatosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DatosBiblioteca1Layout.createSequentialGroup()
                        .addComponent(lblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosBiblioteca1Layout.createSequentialGroup()
                        .addComponent(btnGuardarBiblioteca)
                        .addGap(16, 16, 16))
                    .addGroup(DatosBiblioteca1Layout.createSequentialGroup()
                        .addGroup(DatosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre)
                            .addComponent(lblDireccion)
                            .addComponent(lblCodigo))
                        .addGroup(DatosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosBiblioteca1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtDireccionBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosBiblioteca1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DatosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreBiblioteca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoBiblioteca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        DatosBiblioteca1Layout.setVerticalGroup(
            DatosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosBiblioteca1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(DatosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addGap(9, 9, 9)
                .addGroup(DatosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarBiblioteca)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(DatosBiblioteca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosBiblioteca1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBibliotecaActionPerformed

    private void formCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_formCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formCaretPositionChanged

    private void btnGuardarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBibliotecaActionPerformed
        int codigo = Integer.parseInt(txtCodigoBiblioteca.getText());
        String nombre = txtNombreBiblioteca.getText();
        String direccion = txtDireccionBiblioteca.getText();
        String telefono = txtTelefonoBiblioteca.getText();
        
        bibliotecaControlador.create(codigo,nombre,direccion,telefono);
        JOptionPane.showMessageDialog(this, "Se han guarado los datos...");
        
        txtCodigoBiblioteca.setText("");
        txtNombreBiblioteca.setText("");
        txtDireccionBiblioteca.setText("");
        txtTelefonoBiblioteca.setText("");

    }//GEN-LAST:event_btnGuardarBibliotecaActionPerformed
public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);

        lblCodigo.setText(mensajes.getString("lblCodigo"));
        lblNombre.setText(mensajes.getString("lblNombre"));
        lblDireccion.setText(mensajes.getString("lblDireccion"));
        lblTelefono.setText(mensajes.getString("lblTelefono"));
        
        btnGuardarBiblioteca.setText(mensajes.getString("btnGuardarBiblioteca"));
          
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosBiblioteca1;
    private javax.swing.JButton btnGuardarBiblioteca;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtCodigoBiblioteca;
    private javax.swing.JTextField txtDireccionBiblioteca;
    private javax.swing.JTextField txtNombreBiblioteca;
    private javax.swing.JTextField txtTelefonoBiblioteca;
    // End of variables declaration//GEN-END:variables
class FondoVentana extends JPanel      
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon (getClass().getResource("/imagenes/Fondo.jpeg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            super.paint(g); 
        }
    }
}
