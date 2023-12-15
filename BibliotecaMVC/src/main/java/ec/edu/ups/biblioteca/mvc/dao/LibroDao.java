package ec.edu.ups.biblioteca.mvc.dao;
import java.util.*;
import ec.edu.ups.biblioteca.mvc.idao.ILibroDao;
import ec.edu.ups.biblioteca.mvc.modelo.Libro;

public class LibroDao implements ILibroDao {
	private List<Libro> libros;

    public LibroDao() {
        this.libros = new ArrayList<>();
    }

    @Override
    public void crearLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Libro obtenerLibroPorId(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    @Override
    public Libro obtenerLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public Libro obtenerLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public Libro obtenerLibroPorAño(int año) {
        for (Libro libro : libros) {
            if (libro.getAño() == año) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public void actualizarLibro(Libro libro) {
        // Buscar el libro por su ID
        int idLibroActualizar = libro.getId();
        for (int i = 0; i < libros.size(); i++) {
            Libro libroExistente = libros.get(i);
            if (libroExistente.getId() == idLibroActualizar) {
                // Reemplazar el libro existente con el libro actualizado
                libros.set(i, libro);

                // Informar que el libro se ha actualizado exitosamente
                System.out.println("Libro actualizado exitosamente.");
                return; // Salir
            }
        }
    }

    @Override
    public void eliminarLibro(String titulo) {
        Libro libroAEliminar = null;

        for (Libro libro : libros) {
            if (libro.getTitulo() == titulo) {
                libroAEliminar = libro;
                break; // No es necesario seguir iterando después de encontrar el libro a eliminar
            }
        }

        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
        }
    }

    @Override
    public List<Libro> obtenerLibros() {
        return new ArrayList<>(libros);
    }
}
 