/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IBibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.ILibroDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IPrestamoDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IUsuarioDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Prestamo;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public class PrestamoControlador {
    
    private IPrestamoDao prestamoDao;
    private Prestamo prestamo;
    private IBibliotecaDao bibliotecaDao;
    private Biblioteca biblioteca;
    private ILibroDao libroDao;
    private Libro libro;
    private IUsuarioDao usuarioDao;
    private Usuario usuario;
    
    
    public PrestamoControlador (IPrestamoDao prestamoDao,IBibliotecaDao bibliotecaDao,ILibroDao libroDao,IUsuarioDao usuarioDao   ) {
        this.prestamoDao = prestamoDao;
        this.bibliotecaDao = bibliotecaDao;
        this.libroDao = libroDao;
        this.usuarioDao = usuarioDao;
    }
    
    public void create (int codigo, Date fechaPrestamo, Date fechaDevolucion,Biblioteca biblioteca, Usuario usuario, Libro libro ) {
        prestamo = new Prestamo (codigo, fechaPrestamo,fechaDevolucion,biblioteca,usuario,libro);
        prestamoDao.create(prestamo);
    }
    
    public Prestamo read (int codigo) {
        prestamo = prestamoDao.read(codigo);
        return prestamo;
    }
    
    public void update(int codigo, Date fechaPrestamo, Date fechaDevolucion,Biblioteca biblioteca, Usuario usuario, Libro libro) {
        Prestamo prestamoExistente = prestamoDao.read(codigo);

        if (prestamoExistente != null) {
            prestamoExistente.setFechaPrestamo(fechaPrestamo);
            prestamoExistente.setBiblioteca(biblioteca);
            prestamoExistente.setUsuario(usuario);
            prestamoExistente.setLibro(libro);

            prestamoDao.update(codigo, prestamo);
        }
    }
    
    public Prestamo delete (int codigo) {
        if (prestamoDao.delete(codigo) == true) {
            return prestamo;
        }
        return null;
    }
    
    public List<Prestamo> list() {
        return prestamoDao.list();
    }
    
    public List<Biblioteca> listBiblioteca() {
        return bibliotecaDao.list();
    }
    
    public List<Usuario> listUsuario() {
        return usuarioDao.list();
    }
    
    public List<Libro> listLibro() {
        return libroDao.list();
    }
    
    public Usuario readUsuario (String identificacion) {
        usuario = usuarioDao.read(identificacion);
        return usuario;
    }
    public Libro readLibro (int codigo) {
        libro = libroDao.read(codigo);
        return libro;
    }
    public Biblioteca readBiblioteca (int codigo) {
        biblioteca = bibliotecaDao.read(codigo);
        return biblioteca;
    }
}


