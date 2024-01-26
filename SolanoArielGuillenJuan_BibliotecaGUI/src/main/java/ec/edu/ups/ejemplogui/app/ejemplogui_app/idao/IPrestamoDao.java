
package ec.edu.ups.ejemplogui.app.ejemplogui_app.idao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Prestamo;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public interface IPrestamoDao {
    void create(Prestamo prestamo) throws IOException;
    Prestamo read(int codigo) throws IOException;
    boolean update(int codigo, Prestamo prestamo) throws IOException;
    boolean delete(int codigo) throws IOException;
    List<Prestamo> list() throws IOException;
}
