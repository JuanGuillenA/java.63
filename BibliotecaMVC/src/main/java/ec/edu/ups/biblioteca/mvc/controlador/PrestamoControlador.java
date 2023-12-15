package ec.edu.ups.biblioteca.mvc.controlador;
import java.util.List;

import ec.edu.ups.biblioteca.mvc.dao.LibroDao;
import ec.edu.ups.biblioteca.mvc.dao.PrestamoDao;
import ec.edu.ups.biblioteca.mvc.dao.UsuarioDao;
import ec.edu.ups.biblioteca.mvc.idao.*;
import ec.edu.ups.biblioteca.mvc.modelo.*;
import ec.edu.ups.biblioteca.mvc.vista.*;

public class PrestamoControlador {
    private IPrestamoDao prestamoDao;
    private PrestamoVista prestamoVista;
    private Prestamo prestamo;
    
    private ILibroDao libroDao;
    private LibroVista libroVista;
    private Libro libro;
    
    private IUsuarioDao usuarioDao;
    private UsuarioVista usuarioVista;
    private Usuario usuario;

    public PrestamoControlador(IPrestamoDao prestamoDao, PrestamoVista prestamoVista, ILibroDao libroDao, LibroVista libroVista, IUsuarioDao usuarioDao, UsuarioVista usuarioVista) {
        this.prestamoDao = prestamoDao;
        this.prestamoVista = prestamoVista;
        this.libroDao = libroDao;
        this.libroVista = libroVista;
        this.usuarioDao = usuarioDao;
        this.usuarioVista = usuarioVista;
    }               
    
    public Prestamo crearPrestamo() {
        Prestamo nuevoPrestamo = prestamoVista.ingresarDatosPedido();
        String identificacion = usuarioVista.buscarUsuario();
        Usuario usuario = usuarioDao.obtenerUsuario(identificacion);
        
        if (usuario != null) {
            nuevoPrestamo.setUsuario(usuario);
            int numeroDeLibros = prestamoVista.agregarLibrosAPrestamos();
            
            for (int i = 0; i < numeroDeLibros; i++) {
                String titulo = libroVista.buscarLibroPorTitulo();
                Libro libro = libroDao.obtenerLibroPorTitulo(titulo);
                
                if (libro != null) {
                    nuevoPrestamo.agregarLibro(libro);
                } else {
                    libroVista.mostrarAlertas("No se ha encontrado los datos del Libro!");
                }
            }
            
            prestamoDao.crearPrestamo(nuevoPrestamo);
            prestamoVista.mostrarAlertas("Préstamo creado exitosamente.");
        } else {
            usuarioVista.mostrarAlertas("No se ha encontrado los datos del Usuario!");
        }
        
        return nuevoPrestamo;
    }

    
    public void listarPrestamos(List<Prestamo> listaPrestamos) {
        for (Prestamo prestamo : listaPrestamos) {
            prestamoVista.mostrarInformacionPrestamo(prestamo);
        }
    }
    public void actualizarPrestamo(List<Prestamo> listaPrestamos) {
        int id = prestamoVista.buscarDatosPrestamo();
        
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamo = listaPrestamos.get(i);
            if (prestamo.getId() == id) {
                Prestamo prestamoActualizado = prestamoVista.actualizarDatosPrestamo();
                listaPrestamos.set(i, prestamoActualizado);
                prestamoVista.mostrarAlertas("Préstamo actualizado exitosamente.");
                return; // Terminar el bucle si se actualiza el préstamo
            }
        }
        
        prestamoVista.mostrarAlertas("Préstamo no encontrado.");
    }
    
    public void eliminarPrestamo(List<Prestamo> listaPrestamos) {
        int id = prestamoVista.eliminarDatosPrestamo();
        
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamo = listaPrestamos.get(i);
            if (prestamo.getId() == id) {
                listaPrestamos.remove(i);
                prestamoVista.mostrarAlertas("Préstamo eliminado exitosamente.");
                return; // Terminar el bucle si se elimina el préstamo
            }
        }
        
        prestamoVista.mostrarAlertas("Préstamo no encontrado.");
    }
    
    public void buscarPrestamoPorId(List<Prestamo> listaPrestamos) {
        int id = prestamoVista.buscarDatosPrestamo();
        
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getId() == id) {
                prestamoVista.mostrarInformacionPrestamo(prestamo);
                return; // Terminar el bucle si se encuentra el préstamo
            }
        }
        
        prestamoVista.mostrarAlertas("Préstamo no encontrado.");
    }

}
