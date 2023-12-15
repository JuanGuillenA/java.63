package ec.edu.ups.biblioteca.mvc.controlador;

import java.util.List;

import ec.edu.ups.biblioteca.mvc.idao.ILibroDao;
import ec.edu.ups.biblioteca.mvc.modelo.Libro;
import ec.edu.ups.biblioteca.mvc.modelo.Usuario;
import ec.edu.ups.biblioteca.mvc.vista.LibroVista;

public class LibroControlador {

    private ILibroDao libroDao;
    private LibroVista libroVista;
    private Libro libro;

    public LibroControlador(ILibroDao libroDao, LibroVista libroVista) {
        this.libroDao = libroDao;
        this.libroVista = libroVista;
    }

    public void registrarLibro() {
        Libro nuevoLibro = libroVista.ingresarLibro();
        libroDao.crearLibro(nuevoLibro);
        libroVista.mostrarAlertas("Libro registrado exitosamente.");
    }

    public void buscarLibroPorTitulo() {
        String titulo = libroVista.buscarLibroPorTitulo();
        Libro libroEncontrado = libroDao.obtenerLibroPorTitulo(titulo);

        if (libroEncontrado != null) {
            libroVista.mostrarDatosLibro(libroEncontrado);
        } else {
            libroVista.mostrarAlertas("Libro no encontrado.");
        }
    }

    public void buscarLibroPorAutor() {
        String autor = libroVista.buscarLibroPorAutor();
        Libro libroEncontrado = libroDao.obtenerLibroPorAutor(autor);

        if (libroEncontrado != null) {
            libroVista.mostrarDatosLibro(libroEncontrado);
        } else {
            libroVista.mostrarAlertas("Libro no encontrado.");
        }
    }

    public void buscarLibroPorAño() {
        int año = libroVista.buscarLibroPorAño();
        Libro libroEncontrado = libroDao.obtenerLibroPorAño(año);

        if (libroEncontrado != null) {
            libroVista.mostrarDatosLibro(libroEncontrado);
        } else {
            libroVista.mostrarAlertas("Libro no encontrado.");
        }
    }

    public void actualizarLibro() {
        Libro libroExistente = libroVista.actualizarLibro();
        if (libroExistente != null) {
            Libro libroActualizado = libroVista.actualizarLibro();
            libroDao.actualizarLibro(libroActualizado);
            libroVista.mostrarAlertas("Libro actualizado exitosamente.");
        } else {
            libroVista.mostrarAlertas("Libro no encontrado.");
        }
    }

    public void eliminarLibro() {
        String titulo = libroVista.eliminarLibro();
        Libro libroExistente = libroDao.obtenerLibroPorTitulo(titulo);

        if (libroExistente != null) {
            libroDao.eliminarLibro(titulo);
            libroVista.mostrarAlertas("Libro eliminado exitosamente.");
        } else {
            libroVista.mostrarAlertas("Libro no encontrado.");
        }
    }

    public void listarLibros() {
        List<Libro> libros = libroDao.obtenerLibros();

        if (!libros.isEmpty()) {
            for (Libro libro : libros) {
                libroVista.mostrarDatosLibro(libro);
            }
        } else {
            libroVista.mostrarAlertas("No hay libros registrados.");
        }
    }
}