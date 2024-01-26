
package ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IUsuarioDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author juanguillenalbarracin
 */
public class UsuarioControlador {
    
    private IUsuarioDao usuarioDao;
    private Usuario usuario;
    
    public UsuarioControlador(IUsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
    
    public void createUsuario(String identificacion, String nombre, String apellido, String telefono, String nombreUsuario, String correo) {
        Usuario nuevoUsuario = new Usuario(identificacion, nombre, apellido, telefono, nombreUsuario, correo);
        try {
            usuarioDao.create(nuevoUsuario);
            JOptionPane.showMessageDialog(null, "Usuario guardado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el usuario: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Usuario readUsuario(String identificacion) {
        try {
            usuario = usuarioDao.read(identificacion);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el usuario: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
        }
        return usuario;
    }
    
    public void updateUsuario(String identificacion, String nombre, String apellido, String telefono, String nombreUsuario, String correo) {
        Usuario usuarioExistente = new Usuario(identificacion, nombre, apellido, telefono, nombreUsuario, correo);
        try {
            boolean esActualizado = usuarioDao.update(identificacion, usuarioExistente);
            if (esActualizado) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un usuario con la identificación dada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el usuario: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteUsuario(String identificacion) {
        try {
            boolean esEliminado = usuarioDao.delete(identificacion);
            if (esEliminado) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un usuario con la identificación dada para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public List<Usuario> listUsuarios() {
        try {
            return usuarioDao.list();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al listar los usuarios: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}