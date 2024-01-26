/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.prestamo;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.PrestamoControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Prestamo;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanguillenalbarracin
 */
public class VentanaListarPrestamo extends javax.swing.JInternalFrame {

    private PrestamoControlador prestamoControlador;
    private Biblioteca biblioteca;
    private Libro libro;
    private Usuario usuario;
    
    
    public VentanaListarPrestamo(PrestamoControlador prestamoControlador) {
        initComponents();
        this.prestamoControlador = prestamoControlador;
        cargarDatos();
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarDatos() {
    // Obtener la lista de préstamos desde el controlador
    List<Prestamo> prestamos = prestamoControlador.listPrestamos();
    
    // Crear el modelo de la tabla y definir las columnas
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Código");
    modelo.addColumn("Fecha de Préstamo");
    modelo.addColumn("Fecha de Devolución");
    modelo.addColumn("Código Biblioteca");
    modelo.addColumn("Código Usuario");
    modelo.addColumn("Código Libro");
    modelo.addColumn("Disponibilidad");
    
    // Formateador de fechas
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    // Rellenar el modelo con los datos de los préstamos
    for (Prestamo prestamo : prestamos) {
        Object[] fila = new Object[7];
        fila[0] = prestamo.getCodigo();
        fila[1] = dateFormat.format(prestamo.getFechaPrestamo());
        fila[2] = dateFormat.format(prestamo.getFechaDevolucion());
        fila[3] = prestamo.getCodigoBiblioteca();
        fila[4] = prestamo.getCodigoUsuario();
        fila[5] = prestamo.getCodigoLibro();
        fila[6] = prestamo.isDisponible() ? "Sí" : "No";
        modelo.addRow(fila);
    }
    
    // Asignar el modelo al JTable
    tblPrestamos.setModel(modelo);
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPrestamos;
    // End of variables declaration//GEN-END:variables
}
