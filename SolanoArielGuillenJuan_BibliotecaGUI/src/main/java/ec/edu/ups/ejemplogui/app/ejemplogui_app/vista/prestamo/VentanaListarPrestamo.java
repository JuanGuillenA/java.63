/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.prestamo;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.PrestamoControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Prestamo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanguillenalbarracin
 */
public class VentanaListarPrestamo extends javax.swing.JInternalFrame {

    private PrestamoControlador prestamoControlador;
    
    public VentanaListarPrestamo(PrestamoControlador prestamoControlador) {
        initComponents();
        this.prestamoControlador = prestamoControlador;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listar prestamo");

        tblPrestamos.setAutoCreateRowSorter(true);
        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Fecha Prestamo", "Fecha Devolucion", "Biblioteca", "Usuario", "Libro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPrestamos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarDatos() {
    
        List<Prestamo> prestamos = prestamoControlador.list();
     
        DefaultTableModel modelo = new DefaultTableModel();
        ArrayList<Object> columnas = new ArrayList<Object>();
    
        columnas.add("Codigo");
        columnas.add("Fecha Prestamo");
        columnas.add("Fecha Devolucion");
        columnas.add("Biblioteca");
        columnas.add("Usuario");
        columnas.add("Libro");


        for (Object columna : columnas)
        {
            modelo.addColumn(columna);
        }
        this.tblPrestamos.setModel(modelo);

        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        for (Prestamo prestamosList : prestamos)
        {
            Object[]informacion = new Object[]{prestamosList.getCodigo(),prestamosList.getFechaPrestamo(),prestamosList.getFechaDevolucion(),prestamosList.getBiblioteca(),prestamosList.getUsuario(),prestamosList.getLibro()};
            datos.add(informacion);
        }

        for(Object[]datoPersonal : datos)
        {
            modelo.addRow(datoPersonal);
        }
        tblPrestamos.setModel(modelo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPrestamos;
    // End of variables declaration//GEN-END:variables
}
