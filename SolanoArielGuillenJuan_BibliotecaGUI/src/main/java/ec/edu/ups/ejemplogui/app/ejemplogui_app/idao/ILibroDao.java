
package ec.edu.ups.ejemplogui.app.ejemplogui_app.idao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import java.util.List;

public interface ILibroDao {
    void create(Libro libro);
    Libro read (int codigo);
    boolean update (int codigo, Libro libro);
    boolean delete (int codigo);
    List<Libro> list();
}
