
package ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IBibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.ILibroDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LibroControlador {
    
    private ILibroDao libroDao;
    private Libro libro;
    private IBibliotecaDao bibliotecaDao;
    private Biblioteca biblioteca;
    
    public LibroControlador(ILibroDao libroDao, IBibliotecaDao bibliotecaDao) {
        this.libroDao = libroDao;
        this.bibliotecaDao = bibliotecaDao;
    }
    
    public void createLibro(int codigoLibro, String titulo, String autor, String año,boolean disponible, int codigoBiblioteca) {
        try {
            Biblioteca biblioteca = bibliotecaDao.read(codigoBiblioteca);
            if (biblioteca == null) {
                throw new IOException("La biblioteca con el código " + codigoBiblioteca + " no existe.");
            }
            Libro libro = new Libro(codigoLibro, titulo, autor, año, true);
            libroDao.create(libro);
            biblioteca.addCodigoLibro(codigoLibro);
            bibliotecaDao.update(codigoBiblioteca, biblioteca);
            JOptionPane.showMessageDialog(null, "Libro creado y asociado a la biblioteca correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al procesar", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Libro read(int codigo) {
        Libro libro = null;
        try {
            libro = libroDao.read(codigo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el libro: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
        }
        return libro;
    }

    public void update(int codigo, String titulo, String autor, String año, boolean disponible) {
        try {
            Libro libroExistente = libroDao.read(codigo);
            if (libroExistente == null) {
                throw new IOException("El libro con el código " + codigo + " no existe.");
            }
            libroExistente.setTitulo(titulo);
            libroExistente.setAutor(autor);
            libroExistente.setAño(año);
            libroExistente.setDisponible(disponible);
            libroDao.update(codigo, libroExistente);
            JOptionPane.showMessageDialog(null, "Libro actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el libro: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean delete(int codigo) {
        try {
            boolean result = libroDao.delete(codigo);
            if (!result) {
                throw new IOException("El libro con el código " + codigo + " no pudo ser eliminado.");
            }
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el libro: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public List<Libro> list() {
        try {
            return libroDao.list();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al listar los libros: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

   public List<Libro> listLibros() {
        try {
            return libroDao.list();
        } catch (IOException e) {
            // Manejo de la excepción
            e.printStackTrace();
            return new ArrayList<>(); // Devuelve una lista vacía si hay un error
        }
    }
}