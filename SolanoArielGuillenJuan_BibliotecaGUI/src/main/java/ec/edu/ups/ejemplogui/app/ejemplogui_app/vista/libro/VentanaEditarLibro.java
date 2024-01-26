/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.libro;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.LibroControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.dao.LibroDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
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
public class VentanaEditarLibro extends javax.swing.JInternalFrame {
    FondoVentana fondo = new FondoVentana();
    private LibroControlador libroControlador;

    public VentanaEditarLibro(LibroControlador libroControlador) {
        this.setContentPane(fondo);
        initComponents();
        this.libroControlador = libroControlador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        DatosBiblioteca = new javax.swing.JPanel();
        codigoBuscarBiblioteca = new javax.swing.JLabel();
        nombreBuscarBiblioteca = new javax.swing.JLabel();
        txtCodigoBiblioteca = new javax.swing.JTextField();
        txtNombreBiblioteca = new javax.swing.JTextField();
        btnBuscarBiblioteca = new javax.swing.JButton();
        DatosEditadosBiblioteca = new javax.swing.JPanel();
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
        DatosLibro = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        txtCodigoLibro = new javax.swing.JTextField();
        txtTituloLibro = new javax.swing.JTextField();
        txtAutorLibro = new javax.swing.JTextField();
        txtAnioLibro = new javax.swing.JTextField();
        btnGuardarLibro = new javax.swing.JButton();
        lblDisponibilidad = new javax.swing.JLabel();
        txtDisponibilidadLibro = new javax.swing.JTextField();
        btnBuscarEditarLibro = new javax.swing.JButton();
        btnGuardarLibro1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar libros");
        setVisible(true);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Editar Biblioteca");

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("Buscar una biblioteca");

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

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DatosBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        DatosEditadosBiblioteca.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar datos para actualizar"));
        DatosEditadosBiblioteca.setToolTipText("Ingresar datos para actualizar");

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

        javax.swing.GroupLayout DatosEditadosBibliotecaLayout = new javax.swing.GroupLayout(DatosEditadosBiblioteca);
        DatosEditadosBiblioteca.setLayout(DatosEditadosBibliotecaLayout);
        DatosEditadosBibliotecaLayout.setHorizontalGroup(
            DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosEditadosBibliotecaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telefonoEditarBiblioteca)
                    .addComponent(direccionBuscarBiblioteca2)
                    .addComponent(nombreEditarBiblioteca)
                    .addComponent(codigoEditarBiblioteca))
                .addGap(18, 18, 18)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoEditarBiblioteca)
                    .addComponent(txtNombreEditarBiblioteca)
                    .addComponent(txtDireccionEditarBiblioteca)
                    .addComponent(txtTelefonoEditarBiblioteca)
                    .addGroup(DatosEditadosBibliotecaLayout.createSequentialGroup()
                        .addComponent(btnEditarBiblioteca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarEditar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarEditarBiblioteca))
        );
        DatosEditadosBibliotecaLayout.setVerticalGroup(
            DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosEditadosBibliotecaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEditarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoEditarBiblioteca)
                    .addComponent(btnBuscarEditarBiblioteca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEditarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreEditarBiblioteca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionBuscarBiblioteca2)
                    .addComponent(txtDireccionEditarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoEditarBiblioteca)
                    .addComponent(txtTelefonoEditarBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosEditadosBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarBiblioteca)
                    .addComponent(btnCancelarEditar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosEditadosBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                    .addContainerGap(196, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(212, Short.MAX_VALUE)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(DatosEditadosBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                    .addContainerGap(134, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(143, Short.MAX_VALUE)))
        );

        DatosLibro.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar datos"));

        lblCodigo.setText("Codigo");

        lblTitulo.setText("Titulo");

        lblAutor.setText("Autor");

        lblAnio.setText("Año");

        txtCodigoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLibroActionPerformed(evt);
            }
        });

        txtTituloLibro.setEditable(false);

        txtAutorLibro.setEditable(false);

        txtAnioLibro.setEditable(false);

        btnGuardarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnGuardarLibro.setText("Guardar");
        btnGuardarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLibroActionPerformed(evt);
            }
        });

        lblDisponibilidad.setText("Disponibilidad");

        txtDisponibilidadLibro.setEditable(false);

        btnBuscarEditarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBuscarEditarLibro.setText("Buscar");
        btnBuscarEditarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEditarLibroActionPerformed(evt);
            }
        });

        btnGuardarLibro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        btnGuardarLibro1.setText("Cancelar");
        btnGuardarLibro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLibro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosLibroLayout = new javax.swing.GroupLayout(DatosLibro);
        DatosLibro.setLayout(DatosLibroLayout);
        DatosLibroLayout.setHorizontalGroup(
            DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDisponibilidad)
                    .addComponent(lblAnio)
                    .addComponent(lblAutor)
                    .addComponent(lblTitulo)
                    .addComponent(lblCodigo))
                .addGap(21, 21, 21)
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosLibroLayout.createSequentialGroup()
                        .addComponent(btnGuardarLibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarLibro1))
                    .addGroup(DatosLibroLayout.createSequentialGroup()
                        .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTituloLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtCodigoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtAutorLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtAnioLibro)
                            .addComponent(txtDisponibilidadLibro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarEditarLibro)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        DatosLibroLayout.setVerticalGroup(
            DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLibroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEditarLibro))
                .addGap(9, 9, 9)
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAutor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnioLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnio))
                .addGap(4, 4, 4)
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisponibilidad)
                    .addComponent(txtDisponibilidadLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarLibro)
                    .addComponent(btnGuardarLibro1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 268, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 269, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(DatosLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(DatosLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBibliotecaActionPerformed

    private void txtCodigoEditarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEditarBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEditarBibliotecaActionPerformed

    private void btnEditarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarBibliotecaActionPerformed

    }//GEN-LAST:event_btnEditarBibliotecaActionPerformed

    private void btnBuscarEditarBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEditarBibliotecaActionPerformed

    }//GEN-LAST:event_btnBuscarEditarBibliotecaActionPerformed

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void txtCodigoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoLibroActionPerformed

    private void btnGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibroActionPerformed
       int codigo = Integer.parseInt(txtCodigoLibro.getText());

        String titulo = txtTituloLibro.getText();
        String autor = txtAutorLibro.getText();
        String año = txtAnioLibro.getText();
        String disponibilidad = txtDisponibilidadLibro.getText();
        boolean disponible;
        
        if (disponibilidad.equalsIgnoreCase("Disponible")) {
            disponible = true;
            
        }else {
            disponible = false;
        }
        Libro libro = new Libro(codigo, titulo, autor, año,disponible);
            
        
        libroControlador.update(codigo, titulo, autor, año,disponible);
        
            JOptionPane.showMessageDialog(this, "La información de la biblioteca ha sido actualizada.");
            
            limpiarDatos();

    }//GEN-LAST:event_btnGuardarLibroActionPerformed

    private void btnBuscarEditarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEditarLibroActionPerformed
        int codigo = Integer.parseInt(txtCodigoLibro.getText());
        Libro libro = libroControlador.read(codigo);
        if(libro != null) {
            txtCodigoLibro.setEditable(false);
            txtTituloLibro.setText(libro.getTitulo());
            txtAutorLibro.setText(libro.getAutor());
            String año = String.valueOf(libro.getAño());
            txtAnioLibro.setText(año);
            txtDisponibilidadLibro.setText(libro.isDisponible() ? "Disponible" : "No disponible");

            txtTituloLibro.setEditable(true);
            txtAutorLibro.setEditable(true);
            txtAnioLibro.setEditable(true);
            txtDisponibilidadLibro.setEditable(false); 

       
    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron datos...");
        }    
    }//GEN-LAST:event_btnBuscarEditarLibroActionPerformed

    private void btnGuardarLibro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibro1ActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnGuardarLibro1ActionPerformed
    private void limpiarDatos() {

        txtCodigoLibro.setEditable(true);
        txtTituloLibro.setEditable(false);
        txtAutorLibro.setEditable(false);
        txtAnioLibro.setEditable(false);
        txtDisponibilidadLibro.setEditable(false);

        txtCodigoLibro.setText("");
        txtTituloLibro.setText("");
        txtAutorLibro.setText("");
        txtAnioLibro.setText("");
        txtDisponibilidadLibro.setText("");
    }
public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);

       
        lblCodigo.setText(mensajes.getString("lblCodigo"));
       
        lblTitulo.setText(mensajes.getString("lblTitulo"));
        lblAutor.setText(mensajes.getString("lblAutor"));
        lblAnio.setText(mensajes.getString("lblAnio"));
        lblDisponibilidad.setText(mensajes.getString("lblDisponibilidad"));
        
        btnBuscarBiblioteca.setText(mensajes.getString("btnBuscarBiblioteca"));
        
        btnBuscarEditarBiblioteca.setText(mensajes.getString("btnBuscarEditarBiblioteca"));
        btnEditarBiblioteca.setText(mensajes.getString("btnEditarBiblioteca"));
        btnCancelarEditar.setText(mensajes.getString("btnCancelarEditar"));
        
        btnGuardarLibro.setText(mensajes.getString("btnGuardarLibro"));
       
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosBiblioteca;
    private javax.swing.JPanel DatosEditadosBiblioteca;
    private javax.swing.JPanel DatosLibro;
    private javax.swing.JButton btnBuscarBiblioteca;
    private javax.swing.JButton btnBuscarEditarBiblioteca;
    private javax.swing.JButton btnBuscarEditarLibro;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnEditarBiblioteca;
    private javax.swing.JButton btnGuardarLibro;
    private javax.swing.JButton btnGuardarLibro1;
    private javax.swing.JLabel codigoBuscarBiblioteca;
    private javax.swing.JLabel codigoEditarBiblioteca;
    private javax.swing.JLabel direccionBuscarBiblioteca2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDisponibilidad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel nombreBuscarBiblioteca;
    private javax.swing.JLabel nombreEditarBiblioteca;
    private javax.swing.JLabel telefonoEditarBiblioteca;
    private javax.swing.JTextField txtAnioLibro;
    private javax.swing.JTextField txtAutorLibro;
    private javax.swing.JTextField txtCodigoBiblioteca;
    private javax.swing.JTextField txtCodigoEditarBiblioteca;
    private javax.swing.JTextField txtCodigoLibro;
    private javax.swing.JTextField txtDireccionEditarBiblioteca;
    private javax.swing.JTextField txtDisponibilidadLibro;
    private javax.swing.JTextField txtNombreBiblioteca;
    private javax.swing.JTextField txtNombreEditarBiblioteca;
    private javax.swing.JTextField txtTelefonoEditarBiblioteca;
    private javax.swing.JTextField txtTituloLibro;
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
