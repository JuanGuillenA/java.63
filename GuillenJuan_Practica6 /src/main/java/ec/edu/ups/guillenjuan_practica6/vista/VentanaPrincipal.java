/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.guillenjuan_practica6.vista;

import ec.edu.ups.guillenjuan_practica6.controlador.FilesControlador;
import ec.edu.ups.guillenjuan_practica6.modelo.Files;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author juanguillenalbarracin
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Files modelo;
    private FilesControlador filesControlador;
    DefaultListModel modeloList = new DefaultListModel();
    
    public VentanaPrincipal() {
        initComponents();
        this.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
        modelo = new Files();
        filesControlador = new FilesControlador( modelo);
        listArchivos.setModel(modeloList);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRuta = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnListarDirectorios = new javax.swing.JButton();
        btnListarArcO = new javax.swing.JButton();
        btnListarDirO = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformacion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        listArchivos = new javax.swing.JList<>();
        btnMostrarInfo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        GestionarDirectorio = new javax.swing.JMenu();
        Crear = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        Renombrar = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTIONAR DIRECTORIOS");

        lblRuta.setText("Ruta");

        btnListarDirectorios.setText("Listar directorios");
        btnListarDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectoriosActionPerformed(evt);
            }
        });

        btnListarArcO.setText("Listar archivos ocultos");
        btnListarArcO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarArcOActionPerformed(evt);
            }
        });

        btnListarDirO.setText("Listar directorios ocultos");
        btnListarDirO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirOActionPerformed(evt);
            }
        });

        txtInformacion.setColumns(20);
        txtInformacion.setRows(5);
        jScrollPane2.setViewportView(txtInformacion);

        listArchivos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listArchivos);

        jScrollPane3.setViewportView(jScrollPane1);

        btnMostrarInfo.setText("Motrar Informacion");
        btnMostrarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInfoActionPerformed(evt);
            }
        });

        GestionarDirectorio.setText("Gestionar Directorio");

        Crear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.META_DOWN_MASK));
        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        GestionarDirectorio.add(Crear);

        Eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.META_DOWN_MASK));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        GestionarDirectorio.add(Eliminar);

        Renombrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.META_DOWN_MASK));
        Renombrar.setText("Renombrar");
        Renombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenombrarActionPerformed(evt);
            }
        });
        GestionarDirectorio.add(Renombrar);

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.META_DOWN_MASK));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        GestionarDirectorio.add(Salir);

        jMenuBar1.add(GestionarDirectorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(lblRuta)
                        .addGap(49, 49, 49)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnListarDirectorios)
                                .addGap(18, 18, 18)
                                .addComponent(btnListarArcO)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListarDirO)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnMostrarInfo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuta)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarDirectorios)
                    .addComponent(btnListarArcO)
                    .addComponent(btnListarDirO))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)))
                .addComponent(btnMostrarInfo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectoriosActionPerformed
        // Obtener la ruta del JTextField txtRuta
        String ruta = txtRuta.getText();

        // Llamar al método listarDirectorios del controlador
        List<String> directorios = filesControlador.listarDirectorios(ruta);

        modeloList.clear(); // Limpia el modelo de la lista

        if (directorios != null) {
            // Añadir cada elemento de la lista de directorios al modelo de la lista
            for (String directorio : directorios) {
             modeloList.addElement(directorio);
            }
        } else {
            // Manejar el caso en que la lista de directorios sea nula (por ejemplo, ruta inválida)
            modeloList.addElement("No se encontraron directorios o la ruta es inválida.");
        }
    
    }//GEN-LAST:event_btnListarDirectoriosActionPerformed

    private void btnMostrarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInfoActionPerformed
        String archivos =  listArchivos.getSelectedValue();
        File ruta = new File(archivos);
        String archivos2 = txtRuta.getText() + File.separator + listArchivos.getSelectedValue();
        File ruta2 = new File(archivos2);
        
        if (ruta.exists()) {
            txtInformacion.setText("INFORMACION"+ "\n");
            txtInformacion.append("Nombre:" + ruta.getName()+ "\n");
            txtInformacion.append("Ruta:" + ruta.getAbsolutePath()+ "\n");
            txtInformacion.append("Tamaño:" + ruta.length()+"bytes"+ "\n");
            txtInformacion.append("Permiso de lecturas:" + ruta.canRead() + "\n");
            txtInformacion.append("Permiso de escritura:" + ruta.canWrite() + "\n");
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            txtInformacion.append("Ultima modificacion" +fecha.format(ruta.lastModified())+ "\n");
        }else if(ruta2.exists()) {
            txtInformacion.setText("INFORMACION"+ "\n");
            txtInformacion.append("Nombre:" + ruta.getName()+ "\n");
            txtInformacion.append("Ruta:" + ruta.getAbsolutePath()+ "\n");
            txtInformacion.append("Tamaño:" + ruta.length()+ "\n");
            txtInformacion.append("Permiso de lecturas:" + ruta.canRead() + "\n");
            txtInformacion.append("Permiso de escritura:" + ruta.canWrite() + "\n");
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            txtInformacion.append("Ultima modificacion" +fecha.format(ruta.lastModified())+ "\n");
        } else {
            // Si el archivo no existe, limpiar el área de texto y mostrar un mensaje
            txtInformacion.setText("");
            txtInformacion.append("El archivo o directorio no existe.");
        }
    }//GEN-LAST:event_btnMostrarInfoActionPerformed

    private void btnListarArcOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarArcOActionPerformed
        // Obtener la ruta del JTextField txtRuta
        String ruta = txtRuta.getText();

        // Llamar al método listarDirectorios del controlador
        List<String> archivosOcultos = filesControlador.listarArchivosOcultos(ruta);

        modeloList.clear(); // Limpia el modelo de la lista

        if (archivosOcultos != null) {
            // Añadir cada elemento de la lista de directorios al modelo de la lista
            for (String directorio : archivosOcultos) {
             modeloList.addElement(directorio);
            }
        } else {
            // Manejar el caso en que la lista de directorios sea nula (por ejemplo, ruta inválida)
            modeloList.addElement("No se encontraron directorios o la ruta es inválida.");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnListarArcOActionPerformed

    private void btnListarDirOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirOActionPerformed
        // Obtener la ruta del JTextField txtRuta
        String ruta = txtRuta.getText();

        // Llamar al método listarDirectorios del controlador
        List<String> archivosOcultos = filesControlador.listarArchivosOcultos(ruta);

        modeloList.clear(); // Limpia el modelo de la lista

        if (archivosOcultos != null) {
            // Añadir cada elemento de la lista de directorios al modelo de la lista
            for (String directorio : archivosOcultos) {
             modeloList.addElement(directorio);
            }
        } else {
            // Manejar el caso en que la lista de directorios sea nula (por ejemplo, ruta inválida)
            modeloList.addElement("No se encontraron directorios o la ruta es inválida.");
        }
    }//GEN-LAST:event_btnListarDirOActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
       try {
        // Obtener el nombre del archivo mediante JOptionPane
        String nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo:");
        if (nombreArchivo == null || nombreArchivo.trim().isEmpty()) {
            System.out.println("No se proporcionó un nombre de archivo válido.");
            return;
        }

        // Crear una instancia de FilesControlador
        FilesControlador filesControlador = new FilesControlador(modelo);

        // Llamar al método del controlador para crear el directorio y el archivo
        boolean resultado = filesControlador.crearDirectorioYArchivo(nombreArchivo);

        if (resultado) {
            JOptionPane.showMessageDialog(null, "Archivo creado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo crear el archivo.");
        }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e.getMessage());
        }

    }//GEN-LAST:event_CrearActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        try {
            // Obtener la ruta del elemento seleccionado en el JList
            String seleccionado = listArchivos.getSelectedValue().toString();

            // Confirmación del usuario
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar " + seleccionado + "?",  "Confirmar eliminación", 
                JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                // Crear una instancia de tu controlador
                FilesControlador filesControlador = new FilesControlador(modelo);

                // Llamar al método del controlador para eliminar recursivamente
                boolean resultado = filesControlador.eliminar(seleccionado);

                // Manejar el resultado
                if (resultado) {
                    JOptionPane.showMessageDialog(null, "Eliminado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar.");
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún elemento.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e.getMessage());
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void RenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenombrarActionPerformed
        
            String rutaActual = listArchivos.getSelectedValue().toString();
            if (rutaActual != null && !rutaActual.trim().isEmpty()) {
                // Obtener el nuevo nombre mediante JOptionPane
                String nuevoNombre = JOptionPane.showInputDialog("Ingresa el nuevo nombre: ");
        
                if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
                        // Crear una instancia de tu controlador
                    FilesControlador filesControlador = new FilesControlador(modelo);
                    // Llamar al método del controlador para renombrar
                    boolean resultado = filesControlador.renombrar(rutaActual, nuevoNombre);

                    // Manejar el resultado
                    if (resultado) {
                        JOptionPane.showMessageDialog(null, "Directorio renombrado exitosamente");
                        // Aquí debes actualizar tu JList o interfaz para reflejar el cambio
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al renombrar el directorio");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún elemento para renombrar.");
            }
        
    }//GEN-LAST:event_RenombrarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Crear;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenu GestionarDirectorio;
    private javax.swing.JMenuItem Renombrar;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton btnListarArcO;
    private javax.swing.JButton btnListarDirO;
    private javax.swing.JButton btnListarDirectorios;
    private javax.swing.JButton btnMostrarInfo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JList<String> listArchivos;
    private javax.swing.JTextArea txtInformacion;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
