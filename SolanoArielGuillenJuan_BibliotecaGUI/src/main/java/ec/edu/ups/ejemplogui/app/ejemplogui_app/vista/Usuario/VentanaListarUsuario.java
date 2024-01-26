/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.Usuario;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.UsuarioControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanguillenalbarracin
 */
public class VentanaListarUsuario extends javax.swing.JInternalFrame {

    private UsuarioControlador usuarioControlador;
    
    public VentanaListarUsuario(UsuarioControlador usuarioControlador) {
        initComponents();
        this.usuarioControlador = usuarioControlador;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listar usuarios");

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiacion", "Nombre", "Apellido", "Telefono", "Nombre de Usuario", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   public void cargarDatos() {
    try {
        // Obtener la lista de usuarios
        List<Usuario> usuarios = usuarioControlador.listUsuarios();
        
        // Preparar el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tblUsuarios.getModel();
        modelo.setRowCount(0); // Limpiar la tabla
        
        // Definir las columnas si aún no están establecidas
        if (modelo.getColumnCount() == 0) {
            modelo.addColumn("Identificación");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Nombre de Usuario");
            modelo.addColumn("Correo");
        }

        // Rellenar el modelo con los datos de los usuarios
        for (Usuario usuario : usuarios) {
            Object[] fila = new Object[]{
                usuario.getIdentificacion(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getTelefono(),
                usuario.getNombreUsuario(),
                usuario.getCorreo()
            };
            modelo.addRow(fila);
        }

        // Asignar el modelo actualizado a la tabla
        tblUsuarios.setModel(modelo);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado al cargar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
