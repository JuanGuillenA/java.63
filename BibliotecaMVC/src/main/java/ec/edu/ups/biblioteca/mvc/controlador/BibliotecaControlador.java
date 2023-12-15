package ec.edu.ups.biblioteca.mvc.controlador;

import java.util.List;

import ec.edu.ups.biblioteca.mvc.dao.BibliotecaDao;
import ec.edu.ups.biblioteca.mvc.idao.IBibliotecaDao;
import ec.edu.ups.biblioteca.mvc.modelo.Biblioteca;
import ec.edu.ups.biblioteca.mvc.modelo.Libro;
import ec.edu.ups.biblioteca.mvc.modelo.Usuario;
import ec.edu.ups.biblioteca.mvc.vista.BibliotecaVista;

public class BibliotecaControlador {

    private IBibliotecaDao bibliotecaDao;
    private BibliotecaVista bibliotecaVista;

    public BibliotecaControlador(IBibliotecaDao bibliotecaDao, BibliotecaVista bibliotecaVista) {
        this.bibliotecaDao = bibliotecaDao;
        this.bibliotecaVista = bibliotecaVista;
    }

    public BibliotecaControlador() {
    }

    public void crearBiblioteca() {
        Biblioteca biblioteca = bibliotecaVista.solicitarDatosBiblioteca();
        bibliotecaDao.crearBiblioteca(biblioteca);
        bibliotecaVista.mostrarAlerta("Biblioteca creada exitosamente.");
    }

    public void obtenerBiblioteca() {
        String nombre = bibliotecaVista.solicitarNombreBiblioteca();
        Biblioteca biblioteca = bibliotecaDao.obtenerBiblioteca(nombre);
        if (biblioteca != null) {
            bibliotecaVista.mostrarBiblioteca(biblioteca);
        } else {
            bibliotecaVista.mostrarAlerta("No se encontró la biblioteca con el nombre proporcionado.");
        }
    }

    public void obtenerTodasLasBibliotecas() {
        bibliotecaVista.mostrarListaBibliotecas(bibliotecaDao.obtenerBibliotecas());
    }

    public void actualizarBiblioteca() {
        String nombre = bibliotecaVista.solicitarNombreBiblioteca();
        Biblioteca biblioteca = bibliotecaDao.obtenerBiblioteca(nombre);
        if (biblioteca != null) {
            // Solicitar nuevos datos para actualizar
            Biblioteca nuevosDatos = bibliotecaVista.solicitarDatosBibliotecaActualizada();
            nuevosDatos.setNombre(nombre);
            bibliotecaDao.actualizarBiblioteca(nuevosDatos);
            bibliotecaVista.mostrarAlerta("Biblioteca actualizada exitosamente.");
        } else {
            bibliotecaVista.mostrarAlerta("No se encontró la biblioteca con el nombre proporcionado.");
        }
    }

    public void eliminarBiblioteca() {
        String nombre = bibliotecaVista.solicitarNombreBiblioteca();
        Biblioteca biblioteca = bibliotecaDao.obtenerBiblioteca(nombre);
        if (biblioteca != null) {
            bibliotecaDao.eliminarBiblioteca(nombre);
            bibliotecaVista.mostrarAlerta("Biblioteca eliminada exitosamente.");
        } else {
            bibliotecaVista.mostrarAlerta("No se encontró la biblioteca con el nombre proporcionado.");
        }
    }
}