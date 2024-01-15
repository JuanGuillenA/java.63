/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.Usuario;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.UsuarioControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
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
    
    List<Usuario> usuarios = usuarioControlador.list();
     
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Object> columnas = new ArrayList<Object>();
    
    columnas.add("Identificacion");
    columnas.add("Nombre");
    columnas.add("Apellido");
    columnas.add("Telefono");
    columnas.add("Nombre Del Usuario");
    columnas.add("Correo");
   
    
    for (Object columna : columnas)
    {
        modelo.addColumn(columna);
    }
    this.tblUsuarios.setModel(modelo);
    
    ArrayList<Object[]> datos = new ArrayList<Object[]>();
    for (Usuario usuarioLista : usuarios)
    {
        Object[]informacion = new Object[]{usuarioLista.getIdentificacion(),usuarioLista.getNombre(),usuarioLista.getApellido(),usuarioLista.getTelefono(),usuarioLista.getNombreUsuario(), usuarioLista.getCorreo()};
        datos.add(informacion);
    }
    
    for(Object[]datoPersonal : datos)
    {
        modelo.addRow(datoPersonal);
    }
    tblUsuarios.setModel(modelo);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
