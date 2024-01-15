/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.biblioteca;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.BibliotecaControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.dao.BibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
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
public class VentanaEliminarBiblioteca extends javax.swing.JInternalFrame {
    FondoVentana fondo = new FondoVentana();
    private BibliotecaControlador bibliotecaControlador;

    public VentanaEliminarBiblioteca(BibliotecaControlador bibliotecaControlador) {
        this.setContentPane(fondo);
        initComponents();
        this.bibliotecaControlador = bibliotecaControlador;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatosEditadosBiblioteca1 = new javax.swing.JPanel();
        codigoEditarBiblioteca = new javax.swing.JLabel();
        nombreEditarBiblioteca = new javax.swing.JLabel();
        txtCodigoEditarBiblioteca = new javax.swing.JTextField();
        txtNombreEditarBiblioteca = new javax.swing.JTextField();
        btnEditarBiblioteca = new javax.swing.JButton();
        direccionBuscarBiblioteca2 = new javax.swing.JLabel();
        telefonoEditarBiblioteca = new javax.swing.JLabel();
        txtDireccionEditarBiblioteca = new javax.swing.JTextField();
        txtTelefonoEditarBiblioteca = new javax.swing.JTextField();
        btnBuscarEditarBiblioteca = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();
        DatosEliminarBiblioteca = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtCodigoEliminarBiblioteca = new javax.swing.JTextField();
        txtNombreEliminarBiblioteca = new javax.swing.JTextField();
        btnEliminarBiblioteca = new javax.swing.JButton();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtDireccionEliminarBiblioteca = new javax.swing.JTextField();
        txtTelefonoEliminarBiblioteca = new javax.swing.JTextField();
        btnBuscarEliminarBiblioteca = new javax.swing.JButton();
        btnCancelarBiblioteca = new javax.swing.JButton();

        DatosEditadosBiblioteca1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar datos para actualizar"));
        DatosEditadosBiblioteca1.setToolTipText("Ingresar datos para actualizar");

        codigoEditarBiblioteca.setText("Codigo");

        nombreEditarBiblioteca.setText("Nombre");

        txtCodigoEditarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEditarBibliotecaActionPerformed(evt);
            }
        });

        txtNombreEditarBiblioteca.setEditable(false);

        btnEditarBiblioteca.setText("Guardar");
        btnEditarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarBibliotecaActionPerformed(evt);
            }
        });

        direccionBuscarBiblioteca2.setText("Direccion");

        telefonoEditarBiblioteca.setText("Telefono");

        txtDireccionEditarBiblioteca.setEditable(false);

        txtTelefonoEditarBiblioteca.setEditable(false);

        btnBuscarEditarBiblioteca.setText("Buscar");
        btnBuscarEditarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEditarBibliotecaActionPerformed(evt);
            }
        });

        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosEditadosBiblioteca1Layout = new javax.swing.GroupLayout(DatosEditadosBiblioteca1);
        DatosEditadosBiblioteca1.setLayout(DatosEditadosBiblioteca1Layout);
        DatosEditadosBiblioteca1Layout.setHorizontalGroup(
            DatosEditadosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosEditadosBiblioteca1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(DatosEditadosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telefonoEditarBiblioteca)
                    .addComponent(direccionBuscarBiblioteca2)
                    .addComponent(nombreEditarBiblioteca)
                    .addComponent(codigoEditarBiblioteca))
                .addGap(18, 18, 18)
                .addGroup(DatosEditadosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoEditarBiblioteca)
                    .addComponent(txtNombreEditarBiblioteca)
                    .addComponent(txtDireccionEditarBiblioteca)
                    .addComponent(txtTelefonoEditarBiblioteca)
                    .addGroup(DatosEditadosBiblioteca1Layout.createSequentialGroup()
                        .addComponent(btnEditarBiblioteca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarEditar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnBuscarEditarBiblioteca))
        );
        DatosEditadosBiblioteca1Layout.setVerticalGroup(
            DatosEditadosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosEditadosBiblioteca1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(DatosEditadosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEditarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoEditarBiblioteca)
                    .addComponent(btnBuscarEditarBiblioteca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosEditadosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEditarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreEditarBiblioteca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosEditadosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionBuscarBiblioteca2)
                    .addComponent(txtDireccionEditarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosEditadosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoEditarBiblioteca)
                    .addComponent(txtTelefonoEditarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosEditadosBiblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarBiblioteca)
                    .addComponent(btnCancelarEditar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminar Datos de Biblioteca");

        DatosEliminarBiblioteca.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar datos para actualizar"));
        DatosEliminarBiblioteca.setToolTipText("Ingresar datos para actualizar");

        lblCodigo.setText("Codigo");

        lblNombre.setText("Nombre");

        txtCodigoEliminarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEliminarBibliotecaActionPerformed(evt);
            }
        });

        txtNombreEliminarBiblioteca.setEditable(false);

        btnEliminarBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Basura.png"))); // NOI18N
        btnEliminarBiblioteca.setText("Eliminar");
        btnEliminarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBibliotecaActionPerformed(evt);
            }
        });

        lblDireccion.setText("Direccion");

        lblTelefono.setText("Telefono");

        txtDireccionEliminarBiblioteca.setEditable(false);

        txtTelefonoEliminarBiblioteca.setEditable(false);

        btnBuscarEliminarBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBuscarEliminarBiblioteca.setText("Buscar");
        btnBuscarEliminarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEliminarBibliotecaActionPerformed(evt);
            }
        });

        btnCancelarBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        btnCancelarBiblioteca.setText("Cancelar");
        btnCancelarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBibliotecaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosEliminarBibliotecaLayout = new javax.swing.GroupLayout(DatosEliminarBiblioteca);
        DatosEliminarBiblioteca.setLayout(DatosEliminarBibliotecaLayout);
        DatosEliminarBibliotecaLayout.setHorizontalGroup(
            DatosEliminarBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosEliminarBibliotecaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(DatosEliminarBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefono)
                    .addComponent(lblDireccion)
                    .addComponent(lblNombre)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(DatosEliminarBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoEliminarBiblioteca)
                    .addComponent(txtNombreEliminarBiblioteca)
                    .addComponent(txtDireccionEliminarBiblioteca)
                    .addComponent(txtTelefonoEliminarBiblioteca)
                    .addGroup(DatosEliminarBibliotecaLayout.createSequentialGroup()
                        .addComponent(btnEliminarBiblioteca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarBiblioteca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarEliminarBiblioteca))
        );
        DatosEliminarBibliotecaLayout.setVerticalGroup(
            DatosEliminarBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosEliminarBibliotecaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(DatosEliminarBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEliminarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo)
                    .addComponent(btnBuscarEliminarBiblioteca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosEliminarBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEliminarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosEliminarBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccionEliminarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosEliminarBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefonoEliminarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosEliminarBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarBiblioteca)
                    .addComponent(btnCancelarBiblioteca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosEliminarBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosEliminarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void btnBuscarEditarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEditarBibliotecaActionPerformed

    }//GEN-LAST:event_btnBuscarEditarBibliotecaActionPerformed

    private void btnEditarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarBibliotecaActionPerformed

    }//GEN-LAST:event_btnEditarBibliotecaActionPerformed

    private void txtCodigoEditarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEditarBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEditarBibliotecaActionPerformed

    private void txtCodigoEliminarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEliminarBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEliminarBibliotecaActionPerformed

    private void btnEliminarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBibliotecaActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Seguro que quiere eliminar?");
        if (respuesta == JOptionPane.YES_OPTION) {
            int codigo = Integer.parseInt(txtCodigoEliminarBiblioteca.getText());

            Biblioteca bibliotecaExistente = bibliotecaControlador.read(codigo);

            if (bibliotecaExistente != null) {
                bibliotecaControlador.delete(codigo);

                JOptionPane.showMessageDialog(this, "La información de la biblioteca ha sido eliminada.");

                limpiarDatos();

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró una biblioteca con el código proporcionado.");
        }
    }
        
    }//GEN-LAST:event_btnEliminarBibliotecaActionPerformed

    private void btnBuscarEliminarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEliminarBibliotecaActionPerformed
        int codigo = Integer.parseInt(txtCodigoEliminarBiblioteca.getText());
        Biblioteca biblioteca = bibliotecaControlador.read(codigo);
        if(biblioteca != null) {
            txtCodigoEliminarBiblioteca.setEditable(false);
            txtNombreEliminarBiblioteca.setText(biblioteca.getNombre());
            txtDireccionEliminarBiblioteca.setText(biblioteca.getDireccion());
            txtTelefonoEliminarBiblioteca.setText(biblioteca.getTelefono());
            txtNombreEliminarBiblioteca.setEditable(true);
            txtDireccionEliminarBiblioteca.setEditable(true);
            txtTelefonoEliminarBiblioteca.setEditable(true);

        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron datos...");
        }
    }//GEN-LAST:event_btnBuscarEliminarBibliotecaActionPerformed

    private void btnCancelarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBibliotecaActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnCancelarBibliotecaActionPerformed

    private void limpiarDatos() {
        txtCodigoEliminarBiblioteca.setEditable(true);
        txtNombreEliminarBiblioteca.setEditable(false);
        txtDireccionEliminarBiblioteca.setEditable(false);
        txtTelefonoEliminarBiblioteca.setEditable(false);
        txtNombreEliminarBiblioteca.setText("");
        txtDireccionEliminarBiblioteca.setText("");
        txtTelefonoEliminarBiblioteca.setText("");
    }
public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);

        lblCodigo.setText(mensajes.getString("lblCodigo"));
        lblNombre.setText(mensajes.getString("lblNombre"));
        lblDireccion.setText(mensajes.getString("lblDireccion"));
        lblTelefono.setText(mensajes.getString("lblTelefono"));
        
        
        btnBuscarEditarBiblioteca.setText(mensajes.getString("btnBuscarEditarBiblioteca"));
        btnEditarBiblioteca.setText(mensajes.getString("btnEditarBiblioteca"));
        btnCancelarEditar.setText(mensajes.getString("btnCancelarEditar"));
        btnBuscarEliminarBiblioteca.setText(mensajes.getString("btnBuscarEliminarBiblioteca"));
        btnEliminarBiblioteca.setText(mensajes.getString("btnEliminarBiblioteca"));
        btnCancelarBiblioteca.setText(mensajes.getString("btnCancelarBiblioteca"));
       

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosEditadosBiblioteca1;
    private javax.swing.JPanel DatosEliminarBiblioteca;
    private javax.swing.JButton btnBuscarEditarBiblioteca;
    private javax.swing.JButton btnBuscarEliminarBiblioteca;
    private javax.swing.JButton btnCancelarBiblioteca;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnEditarBiblioteca;
    private javax.swing.JButton btnEliminarBiblioteca;
    private javax.swing.JLabel codigoEditarBiblioteca;
    private javax.swing.JLabel direccionBuscarBiblioteca2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel nombreEditarBiblioteca;
    private javax.swing.JLabel telefonoEditarBiblioteca;
    private javax.swing.JTextField txtCodigoEditarBiblioteca;
    private javax.swing.JTextField txtCodigoEliminarBiblioteca;
    private javax.swing.JTextField txtDireccionEditarBiblioteca;
    private javax.swing.JTextField txtDireccionEliminarBiblioteca;
    private javax.swing.JTextField txtNombreEditarBiblioteca;
    private javax.swing.JTextField txtNombreEliminarBiblioteca;
    private javax.swing.JTextField txtTelefonoEditarBiblioteca;
    private javax.swing.JTextField txtTelefonoEliminarBiblioteca;
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
