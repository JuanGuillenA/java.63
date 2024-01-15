
package ec.edu.ups.ejemplogui.app.ejemplogui_app.idao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public interface IUsuarioDao {
    
    void create(Usuario usuario);
    Usuario read(String identificacion);
    boolean update(String identifiacion, Usuario usuario);
    boolean delete(String identificacion);
    List<Usuario> list();
}
