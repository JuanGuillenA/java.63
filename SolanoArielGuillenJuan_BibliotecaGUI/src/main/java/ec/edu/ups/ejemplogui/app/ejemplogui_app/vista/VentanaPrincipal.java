/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.vista;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.BibliotecaControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.LibroControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.PrestamoControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador.UsuarioControlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.dao.BibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.dao.LibroDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.dao.PrestamoDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.dao.UsuarioDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IBibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.ILibroDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IPrestamoDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IUsuarioDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.Usuario.VentanaBuscarUsuario;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.Usuario.VentanaCrearUsuario;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.Usuario.VentanaEditarUsuario;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.Usuario.VentanaEliminarUsuario;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.Usuario.VentanaListarUsuario;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.biblioteca.VentanaBuscarBiblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.biblioteca.VentanaCrearBiblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.biblioteca.VentanaEditarBiblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.biblioteca.VentanaEliminarBiblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.biblioteca.VentanaListarBiblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.libro.VentanaBuscarLibro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.libro.VentanaCrearLibro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.libro.VentanaEditarLibro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.libro.VentanaEliminarLibro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.libro.VentanaListarLibro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.prestamo.VentanaBuscarPrestamo;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.prestamo.VentanaCrearPrestamo;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.prestamo.VentanaEditarPrestamo;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.prestamo.VentanaEliminarPrestamo;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.vista.prestamo.VentanaListarPrestamo;

import java.awt.Component;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanguillenalbarracin
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaCrearBiblioteca ventanaCrearBiblioteca;
    private IBibliotecaDao bibliotecaDao;
    private BibliotecaControlador bibliotecaControlador;
    private VentanaBuscarBiblioteca ventanaBuscarBiblioteca;
    private VentanaEditarBiblioteca ventanaEditarBiblioteca;
    private VentanaEliminarBiblioteca ventanaEliminarBiblioteca;
    private VentanaListarBiblioteca ventanaListarBiblioteca;
    private ILibroDao libroDao;
    private LibroControlador libroControlador;
    private VentanaCrearLibro ventanaCrearLibro;
    private VentanaEditarLibro ventanaEditarLibro;
    private VentanaEliminarLibro ventanaEliminarLibro;
    private VentanaListarLibro ventanaListarLibro;
    private IUsuarioDao usuarioDao;
    private UsuarioControlador usuarioControlador;
    private VentanaCrearUsuario ventanaCrearUsuario;
    private VentanaBuscarUsuario ventanaBuscarUsuario;
    private VentanaEditarUsuario ventanaEditarUsuario;
    private VentanaEliminarUsuario ventanaEliminarUsuario;
    private VentanaListarUsuario ventanaListarUsuario;
    private IPrestamoDao prestamoDao;
    private PrestamoControlador prestamoControlador;
    private VentanaCrearPrestamo ventanaCrearPrestamo;
    private VentanaBuscarPrestamo ventanaBuscarPrestamo;
    private VentanaEditarPrestamo ventanaEditarPrestamo;
    private VentanaEliminarPrestamo ventanaEliminarPrestamo;
    private VentanaListarPrestamo ventanaListarPrestamo;
    private VentanaBuscarLibro ventanaBuscarLibro;
    private Locale locale;

    public VentanaPrincipal() {
        initComponents();
        this.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
        
        bibliotecaDao = new BibliotecaDao();
        bibliotecaControlador = new BibliotecaControlador(bibliotecaDao, libroDao);
        libroDao = new LibroDao();
        libroControlador = new LibroControlador(libroDao,bibliotecaDao);
        usuarioDao = new UsuarioDao();
        usuarioControlador = new UsuarioControlador(usuarioDao);
        prestamoDao = new PrestamoDao();
        prestamoControlador = new PrestamoControlador(prestamoDao);
        locale=Locale.getDefault();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        MenuBiblioteca = new javax.swing.JMenu();
        crearBibliotecaMenuItem = new javax.swing.JMenuItem();
        editarBibliotecaMenu = new javax.swing.JMenuItem();
        eliminarBibliotecaMenu = new javax.swing.JMenuItem();
        listarBibliotecaMenu = new javax.swing.JMenuItem();
        buscarBibliotecaMenuItem = new javax.swing.JMenuItem();
        MenuLibro = new javax.swing.JMenu();
        crearLibroMenu = new javax.swing.JMenuItem();
        editarLibroMenu = new javax.swing.JMenuItem();
        eliminarLibroMenu = new javax.swing.JMenuItem();
        listarLibroMenu = new javax.swing.JMenuItem();
        buscarLibroMenu = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenu();
        crearUsuarioMenu = new javax.swing.JMenuItem();
        buscarUsuarioMenu = new javax.swing.JMenuItem();
        listarUsuarioMenu = new javax.swing.JMenuItem();
        editarUsuarioMenu = new javax.swing.JMenuItem();
        eliminarUsuarioMenu = new javax.swing.JMenuItem();
        MenuPrestamo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Espaniol = new javax.swing.JMenuItem();
        ingles = new javax.swing.JMenuItem();
        frances = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuBiblioteca.setMnemonic('f');
        MenuBiblioteca.setText("Biblioteca");

        crearBibliotecaMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        crearBibliotecaMenuItem.setMnemonic('o');
        crearBibliotecaMenuItem.setText("Crear");
        crearBibliotecaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBibliotecaMenuItemActionPerformed(evt);
            }
        });
        MenuBiblioteca.add(crearBibliotecaMenuItem);

        editarBibliotecaMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        editarBibliotecaMenu.setMnemonic('s');
        editarBibliotecaMenu.setText("Editar");
        editarBibliotecaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBibliotecaMenuActionPerformed(evt);
            }
        });
        MenuBiblioteca.add(editarBibliotecaMenu);

        eliminarBibliotecaMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        eliminarBibliotecaMenu.setMnemonic('a');
        eliminarBibliotecaMenu.setText("Eliminar");
        eliminarBibliotecaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBibliotecaMenuActionPerformed(evt);
            }
        });
        MenuBiblioteca.add(eliminarBibliotecaMenu);

        listarBibliotecaMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        listarBibliotecaMenu.setMnemonic('x');
        listarBibliotecaMenu.setText("Listar");
        listarBibliotecaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarBibliotecaMenuActionPerformed(evt);
            }
        });
        MenuBiblioteca.add(listarBibliotecaMenu);

        buscarBibliotecaMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        buscarBibliotecaMenuItem.setText("Buscar");
        buscarBibliotecaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBibliotecaMenuItemActionPerformed(evt);
            }
        });
        MenuBiblioteca.add(buscarBibliotecaMenuItem);

        menuBar.add(MenuBiblioteca);

        MenuLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unl.png"))); // NOI18N
        MenuLibro.setMnemonic('e');
        MenuLibro.setText("Libro");

        crearLibroMenu.setMnemonic('t');
        crearLibroMenu.setText("Crear");
        crearLibroMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearLibroMenuActionPerformed(evt);
            }
        });
        MenuLibro.add(crearLibroMenu);

        editarLibroMenu.setMnemonic('y');
        editarLibroMenu.setText("Editar");
        editarLibroMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarLibroMenuActionPerformed(evt);
            }
        });
        MenuLibro.add(editarLibroMenu);

        eliminarLibroMenu.setMnemonic('p');
        eliminarLibroMenu.setText("Eliminar");
        eliminarLibroMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarLibroMenuActionPerformed(evt);
            }
        });
        MenuLibro.add(eliminarLibroMenu);

        listarLibroMenu.setMnemonic('d');
        listarLibroMenu.setText("Listar");
        listarLibroMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarLibroMenuActionPerformed(evt);
            }
        });
        MenuLibro.add(listarLibroMenu);

        buscarLibroMenu.setText("Buscar");
        buscarLibroMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLibroMenuActionPerformed(evt);
            }
        });
        MenuLibro.add(buscarLibroMenu);

        menuBar.add(MenuLibro);

        MenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        MenuUsuario.setMnemonic('h');
        MenuUsuario.setText("Usuario");

        crearUsuarioMenu.setMnemonic('c');
        crearUsuarioMenu.setText("Crear");
        crearUsuarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioMenuActionPerformed(evt);
            }
        });
        MenuUsuario.add(crearUsuarioMenu);

        buscarUsuarioMenu.setMnemonic('a');
        buscarUsuarioMenu.setText("Buscar");
        buscarUsuarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUsuarioMenuActionPerformed(evt);
            }
        });
        MenuUsuario.add(buscarUsuarioMenu);

        listarUsuarioMenu.setText("Listar");
        listarUsuarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarUsuarioMenuActionPerformed(evt);
            }
        });
        MenuUsuario.add(listarUsuarioMenu);

        editarUsuarioMenu.setText("Editar");
        editarUsuarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioMenuActionPerformed(evt);
            }
        });
        MenuUsuario.add(editarUsuarioMenu);

        eliminarUsuarioMenu.setText("Eliminar");
        eliminarUsuarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioMenuActionPerformed(evt);
            }
        });
        MenuUsuario.add(eliminarUsuarioMenu);

        menuBar.add(MenuUsuario);

        MenuPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libros.png"))); // NOI18N
        MenuPrestamo.setText("Prestamo");

        jMenuItem1.setText("Crear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuPrestamo.add(jMenuItem1);

        jMenuItem2.setText("Editar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuPrestamo.add(jMenuItem2);

        jMenuItem3.setText("Buscar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuPrestamo.add(jMenuItem3);

        jMenuItem4.setText("Eliminar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        MenuPrestamo.add(jMenuItem4);

        jMenuItem5.setText("Listar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        MenuPrestamo.add(jMenuItem5);

        menuBar.add(MenuPrestamo);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajuste.png"))); // NOI18N
        jMenu1.setText("Opciones");

        Espaniol.setText("Español");
        Espaniol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspaniolActionPerformed(evt);
            }
        });
        jMenu1.add(Espaniol);

        ingles.setText("Ingles");
        ingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesActionPerformed(evt);
            }
        });
        jMenu1.add(ingles);

        frances.setText("Frances");
        frances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                francesActionPerformed(evt);
            }
        });
        jMenu1.add(frances);

        salir.setText("Salir");
        jMenu1.add(salir);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBibliotecaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBibliotecaMenuItemActionPerformed
        if (ventanaCrearBiblioteca == null) {
            ventanaCrearBiblioteca = new VentanaCrearBiblioteca(bibliotecaControlador);
            ventanaCrearBiblioteca.cambiarIdioma(locale);

        }
        if(!ventanaCrearBiblioteca.isVisible()){
            ventanaCrearBiblioteca.setVisible(true);
            desktopPane.add(ventanaCrearBiblioteca);
        }
        
        
    }//GEN-LAST:event_crearBibliotecaMenuItemActionPerformed

    private void buscarBibliotecaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBibliotecaMenuItemActionPerformed
        if(ventanaBuscarBiblioteca == null){
           ventanaBuscarBiblioteca = new VentanaBuscarBiblioteca(bibliotecaControlador); 
           ventanaBuscarBiblioteca.cambiarIdioma(locale);
        }
        
        if(!ventanaBuscarBiblioteca.isVisible()){
            ventanaBuscarBiblioteca.setVisible(true);
            desktopPane.add(ventanaBuscarBiblioteca);
        }
    }//GEN-LAST:event_buscarBibliotecaMenuItemActionPerformed

    private void editarBibliotecaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBibliotecaMenuActionPerformed
       if(ventanaEditarBiblioteca == null){
          ventanaEditarBiblioteca = new VentanaEditarBiblioteca(bibliotecaControlador); 
          ventanaEditarBiblioteca.cambiarIdioma(locale);

        }
        
        if(!ventanaEditarBiblioteca.isVisible()){
            ventanaEditarBiblioteca.setVisible(true);
            desktopPane.add(ventanaEditarBiblioteca);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_editarBibliotecaMenuActionPerformed

    private void eliminarBibliotecaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBibliotecaMenuActionPerformed
        if(ventanaEliminarBiblioteca == null){
           ventanaEliminarBiblioteca = new VentanaEliminarBiblioteca(bibliotecaControlador);
           ventanaEliminarBiblioteca.cambiarIdioma(locale);

        }
        
        if(!ventanaEliminarBiblioteca.isVisible()){
            ventanaEliminarBiblioteca.setVisible(true);
            desktopPane.add(ventanaEliminarBiblioteca);
        }
    }//GEN-LAST:event_eliminarBibliotecaMenuActionPerformed

    private void listarBibliotecaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarBibliotecaMenuActionPerformed
        if(ventanaListarBiblioteca == null){
           ventanaListarBiblioteca = new VentanaListarBiblioteca(bibliotecaControlador); 

        }
        
        if(!ventanaListarBiblioteca.isVisible()){
            ventanaListarBiblioteca.setVisible(true);
            try {
                ventanaListarBiblioteca.cargarDatos();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            desktopPane.add(ventanaListarBiblioteca);
        }
    }//GEN-LAST:event_listarBibliotecaMenuActionPerformed

    private void crearLibroMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearLibroMenuActionPerformed
        if (ventanaCrearLibro == null) {
            ventanaCrearLibro = new VentanaCrearLibro( libroControlador,bibliotecaControlador);
            ventanaCrearLibro.cambiarIdioma(locale);

        }
        if(!ventanaCrearLibro.isVisible()){
            ventanaCrearLibro.setVisible(true);
            desktopPane.add(ventanaCrearLibro);
        }
    }//GEN-LAST:event_crearLibroMenuActionPerformed

    
    private void buscarLibroMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLibroMenuActionPerformed
        if (ventanaBuscarLibro == null) {
            ventanaBuscarLibro = new VentanaBuscarLibro(libroControlador);
            ventanaBuscarLibro.cambiarIdioma(locale);

        }
        if( !ventanaBuscarLibro.isVisible()){
            ventanaBuscarLibro.setVisible(true);
            desktopPane.add(ventanaBuscarLibro);
        }
    }//GEN-LAST:event_buscarLibroMenuActionPerformed

    private void eliminarLibroMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarLibroMenuActionPerformed
        if (ventanaEliminarLibro == null) {
            ventanaEliminarLibro = new VentanaEliminarLibro(libroControlador);
            ventanaEliminarLibro.cambiarIdioma(locale);

        }
        if(!ventanaEliminarLibro.isVisible()){
            ventanaEliminarLibro.setVisible(true);
            desktopPane.add(ventanaEliminarLibro);
        }
    }//GEN-LAST:event_eliminarLibroMenuActionPerformed

    private void listarLibroMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarLibroMenuActionPerformed
        if (ventanaListarLibro == null) {
            ventanaListarLibro = new VentanaListarLibro(libroControlador);
        }
        if(!ventanaListarLibro.isVisible()){
            ventanaListarLibro.setVisible(true);
            ventanaListarLibro.cargarDatos();
            desktopPane.add(ventanaListarLibro);
        }
    }//GEN-LAST:event_listarLibroMenuActionPerformed

    private void editarLibroMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarLibroMenuActionPerformed
        if (ventanaEditarLibro == null) {
            ventanaEditarLibro = new VentanaEditarLibro(libroControlador);
            ventanaEditarLibro.cambiarIdioma(locale);

        }
        if(ventanaEditarLibro.isVisible()){
            ventanaEditarLibro.setVisible(true);
            desktopPane.add(ventanaEditarLibro);
        }
    }//GEN-LAST:event_editarLibroMenuActionPerformed

    private void crearUsuarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioMenuActionPerformed
        if (ventanaCrearUsuario == null) {
            ventanaCrearUsuario = new VentanaCrearUsuario(usuarioControlador);

        }
        if(!ventanaCrearUsuario.isVisible()){
            ventanaCrearUsuario.setVisible(true);
            desktopPane.add(ventanaCrearUsuario);
        }
        ventanaCrearUsuario.cambiarIdioma(locale);

    }//GEN-LAST:event_crearUsuarioMenuActionPerformed

    private void buscarUsuarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUsuarioMenuActionPerformed
        if (ventanaBuscarUsuario == null) {
            ventanaBuscarUsuario = new VentanaBuscarUsuario(usuarioControlador);
            ventanaBuscarUsuario.cambiarIdioma(locale);

        }
        if(!ventanaBuscarUsuario.isVisible()){
            ventanaBuscarUsuario.setVisible(true);
            desktopPane.add(ventanaBuscarUsuario);
        }
    }//GEN-LAST:event_buscarUsuarioMenuActionPerformed

    private void editarUsuarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioMenuActionPerformed
        if (ventanaEditarUsuario == null) {
            ventanaEditarUsuario = new VentanaEditarUsuario(usuarioControlador);
            ventanaEditarUsuario.cambiarIdioma(locale);

        }
        if(!ventanaEditarUsuario.isVisible()){
            ventanaEditarUsuario.setVisible(true);
            desktopPane.add(ventanaEditarUsuario);
        }
        
    }//GEN-LAST:event_editarUsuarioMenuActionPerformed

    private void eliminarUsuarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioMenuActionPerformed
        if (ventanaEliminarUsuario == null) {
            ventanaEliminarUsuario = new VentanaEliminarUsuario(usuarioControlador);
            ventanaEliminarUsuario.cambiarIdioma(locale);

        }
        if(!ventanaEliminarUsuario.isVisible()){
            ventanaEliminarUsuario.setVisible(true);
            desktopPane.add(ventanaEliminarUsuario);
        }
    }//GEN-LAST:event_eliminarUsuarioMenuActionPerformed

    private void listarUsuarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarUsuarioMenuActionPerformed
        if (ventanaListarUsuario == null) {
            ventanaListarUsuario = new VentanaListarUsuario(usuarioControlador);

        }
        if(!ventanaListarUsuario.isVisible()){
            ventanaListarUsuario.setVisible(true);
            ventanaListarUsuario.cargarDatos();
            desktopPane.add(ventanaListarUsuario);
        }
    }//GEN-LAST:event_listarUsuarioMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (ventanaCrearPrestamo == null) {
            ventanaCrearPrestamo = new VentanaCrearPrestamo(prestamoControlador, prestamoDao);
            ventanaCrearPrestamo.cambiarIdioma(locale);

        }
        if(!ventanaCrearPrestamo.isVisible()){
            ventanaCrearPrestamo.setVisible(true);
            desktopPane.add(ventanaCrearPrestamo);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (ventanaBuscarPrestamo == null) {
            ventanaBuscarPrestamo = new VentanaBuscarPrestamo(prestamoControlador);
            ventanaBuscarPrestamo.cambiarIdioma(locale);

        }
        if(!ventanaBuscarPrestamo.isVisible()){
            ventanaBuscarPrestamo.setVisible(true);
            desktopPane.add(ventanaBuscarPrestamo);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (ventanaEditarPrestamo == null) {
            ventanaEditarPrestamo = new VentanaEditarPrestamo(prestamoControlador);
            ventanaEditarPrestamo.cambiarIdioma(locale);

        }
        if(!ventanaEditarPrestamo.isVisible()){
            ventanaEditarPrestamo.setVisible(true);
            desktopPane.add(ventanaEditarPrestamo);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (ventanaEliminarPrestamo == null) {
            ventanaEliminarPrestamo = new VentanaEliminarPrestamo(prestamoControlador);
            ventanaEliminarPrestamo.cambiarIdioma(locale);

        }
        if(!ventanaEliminarPrestamo.isVisible()){
            ventanaEliminarPrestamo.setVisible(true);
            desktopPane.add(ventanaEliminarPrestamo);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if (ventanaListarPrestamo == null) {
            ventanaListarPrestamo = new VentanaListarPrestamo(prestamoControlador);
        }
        if(!ventanaListarPrestamo.isVisible()){
            ventanaListarPrestamo.setVisible(true);
            ventanaListarPrestamo.cargarDatos();

            desktopPane.add(ventanaListarPrestamo);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void EspaniolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspaniolActionPerformed
        locale = new Locale("es","EC");
        cambiarIdioma(locale);
    }//GEN-LAST:event_EspaniolActionPerformed

    private void inglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesActionPerformed
        locale = new Locale("en","US");
        cambiarIdioma(locale);
    }//GEN-LAST:event_inglesActionPerformed

    private void francesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_francesActionPerformed
        locale = new Locale("fr","FR");
        cambiarIdioma(locale);
    }//GEN-LAST:event_francesActionPerformed
    
    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        MenuBiblioteca.setText(mensajes.getString("MenuBiblioteca"));
        MenuLibro.setText(mensajes.getString("MenuLibro"));
        MenuUsuario.setText(mensajes.getString("MenuUsuario"));
        MenuPrestamo.setText(mensajes.getString("MenuPrestamo"));

        crearBibliotecaMenuItem.setText(mensajes.getString("crearBibliotecaMenuItem"));
        editarBibliotecaMenu.setText(mensajes.getString("editarBibliotecaMenu"));
        eliminarBibliotecaMenu.setText(mensajes.getString("eliminarBibliotecaMenu"));
        listarBibliotecaMenu.setText(mensajes.getString("listarBibliotecaMenu"));
        buscarBibliotecaMenuItem.setText(mensajes.getString("buscarBibliotecaMenuItem"));

        crearLibroMenu.setText(mensajes.getString("crearLibroMenu"));
        eliminarLibroMenu.setText(mensajes.getString("eliminarLibroMenu"));
        listarLibroMenu.setText(mensajes.getString("listarLibroMenu"));
        buscarLibroMenu.setText(mensajes.getString("buscarLibroMenu"));

        crearUsuarioMenu.setText(mensajes.getString("crearUsuarioMenu"));
        editarUsuarioMenu.setText(mensajes.getString("editarUsuarioMenu"));
        eliminarUsuarioMenu.setText(mensajes.getString("eliminarUsuarioMenu"));
        listarUsuarioMenu.setText(mensajes.getString("listarUsuarioMenu"));
        buscarUsuarioMenu.setText(mensajes.getString("buscarUsuarioMenu"));

        jMenuItem1.setText(mensajes.getString("jMenuItem1"));
        jMenuItem2.setText(mensajes.getString("jMenuItem2"));
        jMenuItem3.setText(mensajes.getString("jMenuItem3"));
        jMenuItem4.setText(mensajes.getString("jMenuItem4"));
        jMenuItem5.setText(mensajes.getString("jMenuItem5"));

       
       
        if(ventanaCrearBiblioteca != null){
           ventanaCrearBiblioteca.cambiarIdioma(locale);
        }
        if(ventanaBuscarBiblioteca != null){
           ventanaBuscarBiblioteca.cambiarIdioma(locale);
        }   
        if(ventanaEditarBiblioteca != null){
           ventanaEditarBiblioteca.cambiarIdioma(locale);
        }
        if(ventanaEliminarBiblioteca != null){
           ventanaEliminarBiblioteca.cambiarIdioma(locale);
        }
        if(ventanaBuscarLibro != null){
            ventanaBuscarLibro.cambiarIdioma(locale);
        }
        if(ventanaCrearLibro != null){
           ventanaCrearLibro.cambiarIdioma(locale);
        }
        if(ventanaEditarLibro != null){
           ventanaEditarLibro.cambiarIdioma(locale);
        }
        if(ventanaEliminarLibro != null){
           ventanaEliminarLibro.cambiarIdioma(locale);
        }
        if(ventanaEditarUsuario != null){
           ventanaEditarUsuario.cambiarIdioma(locale);
        }
        if(ventanaBuscarUsuario != null){
           ventanaBuscarUsuario.cambiarIdioma(locale);
        }
        if(ventanaCrearUsuario != null){
           ventanaCrearUsuario.cambiarIdioma(locale);
        }
        if(ventanaEliminarUsuario != null){
           ventanaEliminarUsuario.cambiarIdioma(locale);
        }
        if(ventanaBuscarPrestamo != null){
           ventanaBuscarPrestamo.cambiarIdioma(locale);
        }
        if(ventanaEditarPrestamo != null){
           ventanaEditarPrestamo.cambiarIdioma(locale);
        }
        if(ventanaEliminarPrestamo != null){
           ventanaEliminarPrestamo.cambiarIdioma(locale);
        }
         if(ventanaCrearPrestamo != null){
           ventanaCrearPrestamo.cambiarIdioma(locale);
        }
        
    }    
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Espaniol;
    private javax.swing.JMenu MenuBiblioteca;
    private javax.swing.JMenu MenuLibro;
    private javax.swing.JMenu MenuPrestamo;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JMenuItem buscarBibliotecaMenuItem;
    private javax.swing.JMenuItem buscarLibroMenu;
    private javax.swing.JMenuItem buscarUsuarioMenu;
    private javax.swing.JMenuItem crearBibliotecaMenuItem;
    private javax.swing.JMenuItem crearLibroMenu;
    private javax.swing.JMenuItem crearUsuarioMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem editarBibliotecaMenu;
    private javax.swing.JMenuItem editarLibroMenu;
    private javax.swing.JMenuItem editarUsuarioMenu;
    private javax.swing.JMenuItem eliminarBibliotecaMenu;
    private javax.swing.JMenuItem eliminarLibroMenu;
    private javax.swing.JMenuItem eliminarUsuarioMenu;
    private javax.swing.JMenuItem frances;
    private javax.swing.JMenuItem ingles;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem listarBibliotecaMenu;
    private javax.swing.JMenuItem listarLibroMenu;
    private javax.swing.JMenuItem listarUsuarioMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables

}
