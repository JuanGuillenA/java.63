package ec.edu.ups.biblioteca.mvc.idao;
import java.util.List;
import ec.edu.ups.biblioteca.mvc.modelo.Biblioteca;
import ec.edu.ups.biblioteca.mvc.modelo.Libro;
import ec.edu.ups.biblioteca.mvc.modelo.Usuario;

public interface IBibliotecaDao {
	 void crearBiblioteca(Biblioteca biblioteca);
	 Biblioteca obtenerBiblioteca(String nombre );
	 List<Biblioteca> obtenerBibliotecas();
	 void actualizarBiblioteca(Biblioteca biblioteca);
	 void eliminarBiblioteca(String nombre);
}
