
package ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IUsuarioDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public class UsuarioControlador {
    
    private IUsuarioDao usuarioDao;
    private Usuario usuario;
    
    public UsuarioControlador (IUsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
    
    public void create (String identificacion , String nombre, String apellido, String telefono, String nombreUsuario, String correo) {
        usuario = new Usuario (identificacion, nombre, apellido, telefono, nombreUsuario, correo);
        usuarioDao.create(usuario);
        System.out.println("Creando libro con código: " + identificacion); // Para depuración

    }
    
    public Usuario read (String identificacion) {
        usuario = usuarioDao.read(identificacion);
        System.out.println("Buscando usuario con código: " + identificacion); // Para depuración

        return usuario;
    }
    
    public void update(String identificacion , String nombre, String apellido, String telefono, String nombreUsuario, String correo) {
        Usuario usuarioExistente = usuarioDao.read(identificacion);

        if (usuarioExistente != null) {
            usuarioExistente.setNombre(nombre);
            usuarioExistente.setApellido(apellido);
            usuarioExistente.setTelefono(telefono);
            usuarioExistente.setNombreUsuario(nombreUsuario);
            usuarioExistente.setCorreo(correo);


            usuarioDao.update(identificacion, usuario);
        }
    }
    
    public Usuario delete (String identificacion) {
        
        if (usuarioDao.delete(identificacion) == true) {
            return usuario;
        }
        return null;
    }
    
    public List<Usuario> list() {
        return usuarioDao.list();
    }
}
