
package ec.edu.ups.ejemplogui.app.ejemplogui_app.idao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import java.io.IOException;
import java.util.List;

public interface ILibroDao {
    void create(Libro libro)throws IOException;
    Libro read (int codigo)throws IOException;
    boolean update (int codigo, Libro libro)throws IOException;
    boolean delete (int codigo)throws IOException;
    List<Libro> list()throws IOException;
}
