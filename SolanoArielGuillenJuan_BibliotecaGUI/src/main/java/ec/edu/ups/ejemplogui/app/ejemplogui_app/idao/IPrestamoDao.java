
package ec.edu.ups.ejemplogui.app.ejemplogui_app.idao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Prestamo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public interface IPrestamoDao {
    List<Prestamo> list();
    Prestamo read(int codigo);
    void create (Prestamo prestamo);
    boolean update(int codigo, Prestamo prestamo);
    boolean delete(int codigo);
}
