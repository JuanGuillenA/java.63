package ec.edu.ups.biblioteca.mvc.controlador;
import java.util.List;

import ec.edu.ups.biblioteca.mvc.dao.UsuarioDao;
import ec.edu.ups.biblioteca.mvc.idao.IUsuarioDao;
import ec.edu.ups.biblioteca.mvc.modelo.Usuario;
import ec.edu.ups.biblioteca.mvc.vista.UsuarioVista;


public class UsuarioControlador {

    private IUsuarioDao usuarioDao;
    private UsuarioVista usuarioVista;

    public UsuarioControlador(IUsuarioDao usuarioDao, UsuarioVista usuarioVista) {
        this.usuarioDao = usuarioDao;
        this.usuarioVista = usuarioVista;
    }

    public void registrarUsuario() {
        Usuario nuevoUsuario = usuarioVista.ingresarUsuario();
        usuarioDao.crearUsuario(nuevoUsuario);
        usuarioVista.mostrarAlertas("Usuario registrado exitosamente.");
    }

    public void actualizarUsuario() {
        String identificacion = usuarioVista.buscarUsuario();
        Usuario usuario = usuarioDao.obtenerUsuario(identificacion);

        if (usuario != null) {
            Usuario usuarioActualizado = usuarioVista.actualizarUsuario();
            usuarioDao.actualizarUsuario(usuarioActualizado);
            usuarioVista.mostrarAlertas("Usuario actualizado exitosamente.");
        } else {
            usuarioVista.mostrarAlertas("Usuario no encontrado.");
        }
    }

    public void eliminarUsuario() {
        String identificacion = usuarioVista.eliminarUsuario();
        Usuario usuario = usuarioDao.obtenerUsuario(identificacion);

        if (usuario != null) {
            usuarioDao.eliminarUsuario(identificacion);
            usuarioVista.mostrarAlertas("Usuario eliminado exitosamente.");
        } else {
            usuarioVista.mostrarAlertas("Usuario no encontrado.");
        }
    }

    public void listarUsuarios() {
        List<Usuario> usuarios = usuarioDao.obtenerUsuarios();
        if (!usuarios.isEmpty()) {
            for (Usuario usuario : usuarios) {
                usuarioVista.mostrarDatosUsuario(
                        usuario.getNombre(),
                        usuario.getApellido(),
                        usuario.getIdentificacion(),
                        usuario.getNombreUsuario(),
                        usuario.getTelefono(),
                        usuario.getCorreo()
                );
            }
        } else {
            usuarioVista.mostrarAlertas("No hay usuarios registrados.");
        }
    }
}