package ec.edu.ups.biblioteca.mvc.idao;
import ec.edu.ups.biblioteca.mvc.modelo.*;
import java.util.List;


public interface IUsuarioDao {
    void crearUsuario(Usuario usuario);
    Usuario obtenerUsuario(String identificacion);
    void actualizarUsuario(Usuario usuario);
    void eliminarUsuario(String identificacion);
    List<Usuario> obtenerUsuarios();
}