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
public class VentanaEditarBiblioteca extends javax.swing.JInternalFrame {
    FondoVentana fondo = new FondoVentana();
    private BibliotecaControlador bibliotecaControlador;
    
    public VentanaEditarBiblioteca(BibliotecaControlador bibliotecaControlador) {
        this.setContentPane(fondo);
        initComponents();
        this.bibliotecaControlador = bibliotecaControlador;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        DatosBiblioteca = new javax.swing.JPanel();
        codigoBuscarBiblioteca = new javax.swing.JLabel();
        nombreBuscarBiblioteca = new javax.swing.JLabel();
        txtCodigoBiblioteca = new javax.swing.JTextField();
        txtNombreBiblioteca = new javax.swing.JTextField();
        btnBuscarBiblioteca = new javax.swing.JButton();
        DatosEditadosBiblioteca = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtCodigoEditar = new javax.swing.JTextField();
        txtNombreEditar = new javax.swing.JTextField();
        btnEditarBiblioteca = new javax.swing.JButton();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtDireccionEditar = new javax.swing.JTextField();
        txtTelefonoEditar = new javax.swing.JTextField();
        btnBuscarEditarBiblioteca = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar Biblioteca");

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Buscar una biblioteca");

        DatosBiblioteca.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar datos para buscar"));
        DatosBiblioteca.setToolTipText("");

        codigoBuscarBiblioteca.setText("Codigo");

        nombreBuscarBiblioteca.setText("Nombre");

        txtCodigoBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBibliotecaActionPerformed(evt);
            }
        });

        btnBuscarBiblioteca.setText("Guardar");

        javax.swing.GroupLayout DatosBibliotecaLayout = new javax.swing.GroupLayout(DatosBiblioteca);
        DatosBiblioteca.setLayout(DatosBibliotecaLayout);
        DatosBibliotecaLayout.setHorizontalGroup(
            DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosBibliotecaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreBuscarBiblioteca)
                    .addComponent(codigoBuscarBiblioteca))
                .addGap(18, 18, 18)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosBibliotecaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarBiblioteca)
                .addGap(140, 140, 140))
        );
        DatosBibliotecaLayout.setVerticalGroup(
            DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosBibliotecaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoBuscarBiblioteca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreBuscarBiblioteca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarBiblioteca)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DatosBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        DatosEditadosBiblioteca.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar datos para actualizar"));
        DatosEditadosBiblioteca.setToolTipText("Ingresar datos para actualizar");

        lblCodigo.setText("Codigo");

        lblNombre.setText("Nombre");

        txtCodigoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEditarActionPerformed(evt);
            }
        });

        txtNombreEditar.setEditable(false);

        btnEditarBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnEditarBiblioteca.setText("Guardar");
        btnEditarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarBibliotecaActionPerformed(evt);
            }
        });

        lblDireccion.setText("Direccion");

        lblTelefono.setText("Telefono");

        txtDireccionEditar.setEditable(false);

        txtTelefonoEditar.setEditable(false);

        btnBuscarEditarBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBuscarEditarBiblioteca.setText("Buscar");
        btnBuscarEditarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEditarBibliotecaActionPerformed(evt);
            }
        });

        btnCancelarEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosEditadosBibliotecaLayout = new javax.swing.GroupLayout(DatosEditadosBiblioteca);
        DatosEditadosBiblioteca.setLayout(DatosEditadosBibliotecaLayout);
        DatosEditadosBibliotecaLayout.setHorizontalGroup(
            DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosEditadosBibliotecaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono)
                    .addComponent(lblDireccion)
                    .addComponent(lblNombre)
                    .addComponent(lblCodigo))
                .addGap(48, 48, 48)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosEditadosBibliotecaLayout.createSequentialGroup()
                        .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(txtNombreEditar)
                            .addComponent(txtDireccionEditar)
                            .addComponent(txtTelefonoEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarEditarBiblioteca))
                    .addGroup(DatosEditadosBibliotecaLayout.createSequentialGroup()
                        .addComponent(btnEditarBiblioteca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarEditar)
                        .addGap(0, 171, Short.MAX_VALUE))))
        );
        DatosEditadosBibliotecaLayout.setVerticalGroup(
            DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosEditadosBibliotecaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEditarBiblioteca)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccionEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefonoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarBiblioteca)
                    .addComponent(btnCancelarEditar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosEditadosBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(361, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(376, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DatosEditadosBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(171, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );

        DatosEditadosBiblioteca.getAccessibleContext().setAccessibleName("Ingresar");
        DatosEditadosBiblioteca.getAccessibleContext().setAccessibleDescription("Ingresar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBibliotecaActionPerformed

    private void txtCodigoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEditarActionPerformed

    private void btnEditarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarBibliotecaActionPerformed
        try {
        int codigo = Integer.parseInt(txtCodigoEditar.getText().trim());
        String nombre = txtNombreEditar.getText().trim();
        String direccion = txtDireccionEditar.getText().trim();
        String telefono = txtTelefonoEditar.getText().trim();

        bibliotecaControlador.update(codigo, nombre, direccion, telefono);

        JOptionPane.showMessageDialog(this, "La información de la biblioteca ha sido actualizada.", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);

        limpiarDatos();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para el código.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar la biblioteca: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnEditarBibliotecaActionPerformed

    private void btnBuscarEditarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEditarBibliotecaActionPerformed
        try {
        int codigo = Integer.parseInt(txtCodigoEditar.getText().trim());
        Biblioteca biblioteca = bibliotecaControlador.read(codigo);
        if (biblioteca != null) {
            txtCodigoEditar.setEditable(false); // Previene la edición del código
            txtNombreEditar.setText(biblioteca.getNombre());
            txtDireccionEditar.setText(biblioteca.getDireccion());
            txtTelefonoEditar.setText(biblioteca.getTelefono());

            txtNombreEditar.setEditable(true);
            txtDireccionEditar.setEditable(true);
            txtTelefonoEditar.setEditable(true);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron datos para el código proporcionado.", "Búsqueda de Biblioteca", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al buscar la biblioteca: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
    }   
    }//GEN-LAST:event_btnBuscarEditarBibliotecaActionPerformed

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void limpiarDatos() {
        
        txtCodigoEditar.setEditable(true);
        txtNombreEditar.setEditable(false);
        txtDireccionEditar.setEditable(false);
        txtTelefonoEditar.setEditable(false);
        txtCodigoEditar.setText("");
        txtNombreEditar.setText("");
        txtDireccionEditar.setText("");
        txtTelefonoEditar.setText("");
    }
public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);

       
        lblCodigo.setText(mensajes.getString("lblCodigo"));
        lblNombre.setText(mensajes.getString("lblNombre"));
        lblDireccion.setText(mensajes.getString("lblDireccion"));
        lblTelefono.setText(mensajes.getString("lblTelefono"));
       

        btnBuscarBiblioteca.setText(mensajes.getString("btnBuscarBiblioteca"));
        
        btnBuscarEditarBiblioteca.setText(mensajes.getString("btnBuscarEditarBiblioteca"));
        btnEditarBiblioteca.setText(mensajes.getString("btnEditarBiblioteca"));
        btnCancelarEditar.setText(mensajes.getString("btnCancelarEditar"));
          
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosBiblioteca;
    private javax.swing.JPanel DatosEditadosBiblioteca;
    private javax.swing.JButton btnBuscarBiblioteca;
    private javax.swing.JButton btnBuscarEditarBiblioteca;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnEditarBiblioteca;
    private javax.swing.JLabel codigoBuscarBiblioteca;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel nombreBuscarBiblioteca;
    private javax.swing.JTextField txtCodigoBiblioteca;
    private javax.swing.JTextField txtCodigoEditar;
    private javax.swing.JTextField txtDireccionEditar;
    private javax.swing.JTextField txtNombreBiblioteca;
    private javax.swing.JTextField txtNombreEditar;
    private javax.swing.JTextField txtTelefonoEditar;
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
