
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.libro;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.BibliotecaControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.LibroControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
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
public class VentanaCrearLibro extends javax.swing.JInternalFrame {
    FondoVentana fondo = new FondoVentana();
    private LibroControlador libroControlador;
    private BibliotecaControlador bibliotecaControlador;
    
    
    public VentanaCrearLibro( LibroControlador libroControlador, BibliotecaControlador bibliotecaControlador) {
       this.setContentPane(fondo);
        initComponents();
        this.libroControlador = libroControlador;
        this.bibliotecaControlador = bibliotecaControlador;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txtDisponibleLibro = new javax.swing.JTextField();
        lblBiblioteca = new javax.swing.JLabel();
        txtBiblioCodigo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear libro");

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

        btnGuardarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnGuardarLibro.setText("Guardar");
        btnGuardarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLibroActionPerformed(evt);
            }
        });

        lblDisponibilidad.setText("Disponibilidad");

        lblBiblioteca.setText("Biblioteca");

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
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTituloLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtCodigoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtAutorLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtAnioLibro)
                    .addComponent(txtDisponibleLibro))
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosLibroLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblBiblioteca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(txtBiblioCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosLibroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        DatosLibroLayout.setVerticalGroup(
            DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLibroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBiblioteca)
                    .addComponent(txtBiblioCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(DatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo)
                    .addComponent(btnGuardarLibro))
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
                    .addComponent(txtDisponibleLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DatosLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoLibroActionPerformed

    private void btnGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibroActionPerformed
        try {
            int codigo = Integer.parseInt(txtCodigoLibro.getText().trim());
            String titulo = txtTituloLibro.getText().trim();
            String autor = txtAutorLibro.getText().trim();
            String anio = txtAnioLibro.getText().trim();
            boolean disponible = Boolean.parseBoolean(txtDisponibleLibro.getText().trim()); 

            // Verificar si se ha ingresado un código de biblioteca y es un número válido
            if (!txtBiblioCodigo.getText().trim().isEmpty()) {
                int codigoBiblioteca;
                try {
                    codigoBiblioteca = Integer.parseInt(txtBiblioCodigo.getText().trim());
                } catch (NumberFormatException e) {
                    throw new Exception("El código de la biblioteca debe ser numérico.");
                }

                libroControlador.createLibro(codigo, titulo, autor, anio, disponible, codigoBiblioteca);
                JOptionPane.showMessageDialog(this, "Libro guardado y asociado a la biblioteca correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un código de biblioteca válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            txtCodigoLibro.setText("");
            txtTituloLibro.setText("");
            txtAutorLibro.setText("");
            txtAnioLibro.setText("");
            txtDisponibleLibro.setText("");
            txtBiblioCodigo.setText(""); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos para el código y el año.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "No se pudo acceder o crear el archivo de libros: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    
    }//GEN-LAST:event_btnGuardarLibroActionPerformed
        
   
    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);

       
        lblCodigo.setText(mensajes.getString("lblCodigo"));
        
        lblTitulo.setText(mensajes.getString("lblTitulo"));
        lblAutor.setText(mensajes.getString("lblAutor"));
        lblAnio.setText(mensajes.getString("lblAnio"));
        lblDisponibilidad.setText(mensajes.getString("lblDisponibilidad"));
        lblBiblioteca.setText(mensajes.getString("lblBiblioteca"));
        

       
        btnGuardarLibro.setText(mensajes.getString("btnGuardarLibro"));
        


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosLibro;
    private javax.swing.JButton btnGuardarLibro;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDisponibilidad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAnioLibro;
    private javax.swing.JTextField txtAutorLibro;
    private javax.swing.JTextField txtBiblioCodigo;
    private javax.swing.JTextField txtCodigoLibro;
    private javax.swing.JTextField txtDisponibleLibro;
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
