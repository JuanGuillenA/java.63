/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.biblioteca;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.BibliotecaControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanguillenalbarracin
 */
public class VentanaListarBiblioteca extends javax.swing.JInternalFrame {

    private BibliotecaControlador bibliotecaControlador;
    
    public VentanaListarBiblioteca(BibliotecaControlador bibliotecaControlador) {
        initComponents();
        this.bibliotecaControlador = bibliotecaControlador;

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBibliotecas = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listar Biblioteca");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        tblBibliotecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBibliotecas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

    }//GEN-LAST:event_formInternalFrameActivated

    public void cargarDatos() throws IOException {
    List<Biblioteca> bibliotecas = bibliotecaControlador.list();
    
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Object> columnas = new ArrayList<Object>();
    
    // Definir las columnas de la tabla
    columnas.add("Código");
    columnas.add("Nombre");
    columnas.add("Dirección");
    columnas.add("Teléfono");
    // Agregar columnas para los códigos de los libros
    //for (int i = 1; i <= 5; i++) {
        //columnas.add("Código Libro " + i);
    //}
    
    for (Object columna : columnas) {
        modelo.addColumn(columna);
    }
    this.tblBibliotecas.setModel(modelo); 
    
    for (Biblioteca biblioteca : bibliotecas) {
        ArrayList<Object> informacion = new ArrayList<>();
        informacion.add(biblioteca.getCodigo());
        informacion.add(biblioteca.getNombre());
        informacion.add(biblioteca.getDireccion());
        informacion.add(biblioteca.getTelefono());
        
        // Agregar los códigos de los libros al ArrayList
        //int[] codigosLibros = biblioteca.getCodigosLibros();
        //for (int i = 0; i < 5; i++) {
          //  informacion.add(i < codigosLibros.length ? codigosLibros[i] : "N/A");
        //}
        
        // Convertir el ArrayList a un array y añadirlo al modelo de la tabla
        modelo.addRow(informacion.toArray());
    }
    
    tblBibliotecas.setModel(modelo);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBibliotecas;
    // End of variables declaration//GEN-END:variables
}
