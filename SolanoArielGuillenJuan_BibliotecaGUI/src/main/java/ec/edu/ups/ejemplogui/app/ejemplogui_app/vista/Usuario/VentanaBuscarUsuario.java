/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.Usuario;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.UsuarioControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author juanguillenalbarracin
 */
public class VentanaBuscarUsuario extends javax.swing.JInternalFrame {
    FondoVentana fondo = new FondoVentana();
    private UsuarioControlador usuarioControlador;
    
    public VentanaBuscarUsuario(UsuarioControlador usuarioControlador) {
        this.setContentPane(fondo);
        initComponents();
        this.usuarioControlador = usuarioControlador;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatosBiblioteca = new javax.swing.JPanel();
        lblIdentificacion = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtIdentificacionUsuario = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtApellidoUsuario = new javax.swing.JTextField();
        txtTelefonoUsuario = new javax.swing.JTextField();
        btnBuscarUsuario = new javax.swing.JButton();
        lblNombreDelUsuario = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtNombreDelUsuario = new javax.swing.JTextField();
        txtCorreoUsuario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar usuario");

        DatosBiblioteca.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar datos"));

        lblIdentificacion.setText("Identifiacion");

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblTelefono.setText("Telefono");

        txtIdentificacionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionUsuarioActionPerformed(evt);
            }
        });

        txtNombreUsuario.setEditable(false);
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });

        txtApellidoUsuario.setEditable(false);

        txtTelefonoUsuario.setEditable(false);

        btnBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        lblNombreDelUsuario.setText("Nombre de Usuario");

        lblCorreo.setText("Correo");

        txtNombreDelUsuario.setEditable(false);

        txtCorreoUsuario.setEditable(false);

        javax.swing.GroupLayout DatosBibliotecaLayout = new javax.swing.GroupLayout(DatosBiblioteca);
        DatosBiblioteca.setLayout(DatosBibliotecaLayout);
        DatosBibliotecaLayout.setHorizontalGroup(
            DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosBibliotecaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DatosBibliotecaLayout.createSequentialGroup()
                        .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefono)
                            .addComponent(lblNombreDelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreDelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DatosBibliotecaLayout.createSequentialGroup()
                        .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdentificacion)
                            .addComponent(lblApellido))
                        .addGap(66, 66, 66)
                        .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosBibliotecaLayout.createSequentialGroup()
                                .addComponent(txtIdentificacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DatosBibliotecaLayout.setVerticalGroup(
            DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosBibliotecaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdentificacion)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addGap(9, 9, 9)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(9, 9, 9)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreDelUsuario)
                    .addComponent(txtNombreDelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentificacionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionUsuarioActionPerformed

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
       String identificacion = txtIdentificacionUsuario.getText().trim();
    
    try {
        Usuario usuario = usuarioControlador.readUsuario(identificacion);
        if(usuario != null) {
            txtNombreUsuario.setText(usuario.getNombre());
            txtApellidoUsuario.setText(usuario.getApellido());
            txtTelefonoUsuario.setText(usuario.getTelefono());
            txtNombreDelUsuario.setText(usuario.getNombreUsuario());
            txtCorreoUsuario.setText(usuario.getCorreo());
        } else {
            JOptionPane.showMessageDialog(this, "Usuario con la identificación " + identificacion + " no encontrado.", "Usuario No Encontrado", JOptionPane.INFORMATION_MESSAGE);
            txtNombreUsuario.setText("");
            txtApellidoUsuario.setText("");
            txtTelefonoUsuario.setText("");
            txtNombreDelUsuario.setText("");
            txtCorreoUsuario.setText("");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese una identificación válida.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed
    
    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        
        lblNombre.setText(mensajes.getString("lblNombre"));
        lblTelefono.setText(mensajes.getString("lblTelefono"));
        lblIdentificacion.setText(mensajes.getString("lblIdentificacion"));
        lblApellido.setText(mensajes.getString("lblApellido"));
        lblNombreDelUsuario.setText(mensajes.getString("lblNombreDelUsuario"));
        lblCorreo.setText(mensajes.getString("lblCorreo"));

        btnBuscarUsuario.setText(mensajes.getString("btnBuscarUsuario"));
       
        
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosBiblioteca;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreDelUsuario;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellidoUsuario;
    private javax.swing.JTextField txtCorreoUsuario;
    private javax.swing.JTextField txtIdentificacionUsuario;
    private javax.swing.JTextField txtNombreDelUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTelefonoUsuario;
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
