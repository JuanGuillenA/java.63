
package ec.edu.ups.ejemplogui.app.ejemplogui_app.idao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public interface IUsuarioDao {
    
    void create(Usuario usuario) throws IOException;
    Usuario read(String identificacion) throws IOException;
    boolean update(String identificacion, Usuario usuario) throws IOException;
    boolean delete(String identificacion) throws IOException;
    List<Usuario> list() throws IOException;
}
