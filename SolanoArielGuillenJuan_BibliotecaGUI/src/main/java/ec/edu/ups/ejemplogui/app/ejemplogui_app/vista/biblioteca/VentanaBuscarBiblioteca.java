/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.biblioteca;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.BibliotecaControlador;
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
public class VentanaBuscarBiblioteca extends javax.swing.JInternalFrame {
    FondoVentana fondo = new FondoVentana();
    private BibliotecaControlador bibliotecaControlador;

    public VentanaBuscarBiblioteca(BibliotecaControlador bibliotecaControlador) {
        this.setContentPane(fondo);
        initComponents();

        this.bibliotecaControlador = bibliotecaControlador;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatosBiblioteca = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtNombreBiblioteca = new javax.swing.JTextField();
        btnBuscarBiblioteca = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtCodigoBiblioteca = new javax.swing.JTextField();
        txtTelefonoBiblioteca = new javax.swing.JTextField();
        txtDireccionBiblioteca = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar una biblioteca");

        DatosBiblioteca.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar datos para buscar"));
        DatosBiblioteca.setToolTipText("");

        lblCodigo.setText("Codigo");

        txtNombreBiblioteca.setEditable(false);
        txtNombreBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBibliotecaActionPerformed(evt);
            }
        });

        btnBuscarBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnBuscarBiblioteca.setText("Buscar");
        btnBuscarBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBibliotecaActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        txtCodigoBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBibliotecaActionPerformed(evt);
            }
        });

        txtTelefonoBiblioteca.setEditable(false);
        txtTelefonoBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoBibliotecaActionPerformed(evt);
            }
        });

        txtDireccionBiblioteca.setEditable(false);
        txtDireccionBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionBibliotecaActionPerformed(evt);
            }
        });

        lblDireccion.setText("Direccion");

        lblTelefono.setText("Telefono");

        javax.swing.GroupLayout DatosBibliotecaLayout = new javax.swing.GroupLayout(DatosBiblioteca);
        DatosBiblioteca.setLayout(DatosBibliotecaLayout);
        DatosBibliotecaLayout.setHorizontalGroup(
            DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosBibliotecaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosBibliotecaLayout.createSequentialGroup()
                        .addComponent(lblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(DatosBibliotecaLayout.createSequentialGroup()
                            .addComponent(lblNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNombreBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(DatosBibliotecaLayout.createSequentialGroup()
                            .addComponent(lblDireccion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDireccionBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DatosBibliotecaLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnBuscarBiblioteca)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DatosBibliotecaLayout.setVerticalGroup(
            DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosBibliotecaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(btnBuscarBiblioteca)
                    .addComponent(txtCodigoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombreBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addContainerGap(81, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DatosBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        DatosBiblioteca.getAccessibleContext().setAccessibleName("Datos de busqueda");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBibliotecaActionPerformed

    private void btnBuscarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBibliotecaActionPerformed
        try {
    int codigo = Integer.parseInt(txtCodigoBiblioteca.getText().trim());
    Biblioteca biblioteca = bibliotecaControlador.read(codigo);
    
    // Verifica si se encontró la biblioteca
    if (biblioteca != null) {
        // Si se encuentra, muestra sus detalles en los campos de texto.
        txtNombreBiblioteca.setText(biblioteca.getNombre());
        txtDireccionBiblioteca.setText(biblioteca.getDireccion());
        txtTelefonoBiblioteca.setText(biblioteca.getTelefono());
    } else {
        // Si no se encuentra, muestra un mensaje y limpia los campos.
        JOptionPane.showMessageDialog(this, "No se encontraron datos para el código proporcionado.", "Búsqueda de Biblioteca", JOptionPane.INFORMATION_MESSAGE);
        txtNombreBiblioteca.setText("");
        txtDireccionBiblioteca.setText("");
        txtTelefonoBiblioteca.setText("");
    }
} catch (NumberFormatException e) {
    // Maneja el error de formato en el código ingresado.
    JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
    txtCodigoBiblioteca.requestFocus(); // Devuelve el foco al campo del código.
} catch (IOException e) {
    // Maneja errores de IO, por ejemplo, problemas al acceder al archivo de datos.
    JOptionPane.showMessageDialog(this, "Error al buscar la biblioteca: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_btnBuscarBibliotecaActionPerformed

    private void txtCodigoBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBibliotecaActionPerformed

    private void txtTelefonoBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoBibliotecaActionPerformed

    private void txtDireccionBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionBibliotecaActionPerformed
    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);

        lblCodigo.setText(mensajes.getString("lblCodigo"));
        lblNombre.setText(mensajes.getString("lblNombre"));
        lblDireccion.setText(mensajes.getString("lblDireccion"));
        lblTelefono.setText(mensajes.getString("lblTelefono"));
       

        btnBuscarBiblioteca.setText(mensajes.getString("btnBuscarBiblioteca"));
   
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosBiblioteca;
    private javax.swing.JButton btnBuscarBiblioteca;
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
