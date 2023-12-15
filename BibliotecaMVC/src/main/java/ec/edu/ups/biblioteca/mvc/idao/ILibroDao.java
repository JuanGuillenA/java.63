package ec.edu.ups.biblioteca.mvc.idao;
import java.util.List;
import ec.edu.ups.biblioteca.mvc.modelo.Libro;

public interface ILibroDao {
    void crearLibro(Libro libro);
    Libro obtenerLibroPorId(int id);
    Libro obtenerLibroPorTitulo(String titulo);
    Libro obtenerLibroPorAutor(String autor);
    Libro obtenerLibroPorAño(int año);
    void actualizarLibro(Libro libro);
    void eliminarLibro(String titulo);
    List<Libro> obtenerLibros();
}
