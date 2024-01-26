package ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IBibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.ILibroDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;


public class BibliotecaControlador {
    
    private IBibliotecaDao bibliotecaDao;
    private Biblioteca biblioteca;
    private ILibroDao libroDao;
    private Libro libro;
    
    public BibliotecaControlador(IBibliotecaDao bibliotecaDao, ILibroDao libroDao) {
        this.bibliotecaDao = bibliotecaDao;
        this.libroDao = libroDao;
    }
    
    public void create(int codigo, String nombre, String direccion, String telefono) throws IOException {
         Biblioteca biblioteca = new Biblioteca(codigo, nombre, direccion, telefono);
    try {
        bibliotecaDao.createBiblioteca(biblioteca);
        JOptionPane.showMessageDialog(null, "Biblioteca guardada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error al Crear", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    public Biblioteca read(int codigo) throws IOException {
        try {
            biblioteca = bibliotecaDao.read(codigo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer la biblioteca: " + e.getMessage());
        }
        return biblioteca;
    }
    
    public void update(int codigo, String nombre, String direccion, String telefono) throws IOException {
        try {
            Biblioteca bibliotecaExistente = bibliotecaDao.read(codigo);
            if (bibliotecaExistente != null) {
                bibliotecaExistente.setNombre(nombre);
                bibliotecaExistente.setDireccion(direccion);
                bibliotecaExistente.setTelefono(telefono);
                bibliotecaDao.update(codigo, bibliotecaExistente);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la biblioteca: " + e.getMessage());
        }
    }
    
    public boolean delete(int codigo) throws IOException{
        try {
            return bibliotecaDao.delete(codigo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la biblioteca: " + e.getMessage());
            return false;
        }
    }
    
    public List<Biblioteca> list()throws IOException {
        try {
            return bibliotecaDao.list();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al listar las bibliotecas: " + e.getMessage());
            return null;
        }
    }
    
    public void createLibroYAsociarABiblioteca(int codigoLibro, String titulo, String autor, String año, int codigoBiblioteca) throws IOException {
    Libro nuevoLibro = new Libro(codigoLibro, titulo, autor, año, true); // Asume que true indica disponibilidad.
    libroDao.create(nuevoLibro);

    // Obtiene la biblioteca y añade el libro.
    Biblioteca biblioteca = bibliotecaDao.read(codigoBiblioteca);
    if (biblioteca != null) {
        biblioteca.addCodigoLibro(codigoLibro);
        bibliotecaDao.update(codigoBiblioteca, biblioteca); // Actualiza la biblioteca con el nuevo código de libro.
    } else {
        throw new IOException("Biblioteca no encontrada.");
    }
}
    

}