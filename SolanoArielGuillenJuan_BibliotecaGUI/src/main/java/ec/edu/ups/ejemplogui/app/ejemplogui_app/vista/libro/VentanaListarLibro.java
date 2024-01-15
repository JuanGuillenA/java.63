/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.libro;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.LibroControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanguillenalbarracin
 */
public class VentanaListarLibro extends javax.swing.JInternalFrame {

    private LibroControlador libroControlador;
     
    
    public VentanaListarLibro(LibroControlador libroControlador) {
        initComponents();
        this.libroControlador = libroControlador;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listar libros");

        tblLibros.setAutoCreateRowSorter(true);
        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Autor", "Año", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarDatos() {
    
    List<Libro> libros = libroControlador.list();
     
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Object> columnas = new ArrayList<Object>();
    
    columnas.add("Codigo");
    columnas.add("Titulo");
    columnas.add("Autor");
    columnas.add("Anio");
    columnas.add("Disponibilidad");
    
    for (Object columna : columnas)
    {
        modelo.addColumn(columna);
    }
    this.tblLibros.setModel(modelo);
    
    ArrayList<Object[]> datos = new ArrayList<Object[]>();
    for (Libro libroListado : libros)
    {
        Object[]informacion = new Object[]{libroListado.getCodigo(),libroListado.getTitulo(),libroListado.getAutor(),libroListado.getAño(),libroListado.isDisponible()};
        datos.add(informacion);
    }
    
    for(Object[]datoPersonal : datos)
    {
        modelo.addRow(datoPersonal);
    }
    tblLibros.setModel(modelo);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLibros;
    // End of variables declaration//GEN-END:variables
}
