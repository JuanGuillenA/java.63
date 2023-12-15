package ec.edu.ups.biblioteca.mvc.dao;
import ec.edu.ups.biblioteca.mvc.idao.IUsuarioDao;
import ec.edu.ups.biblioteca.mvc.modelo.*;

import java.util.*;

public class UsuarioDao implements IUsuarioDao {
	private List<Usuario> usuarios;

    public UsuarioDao() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public Usuario obtenerUsuario(String identificacion) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdentificacion().equals(identificacion)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void actualizarUsuario(Usuario usuarioActualizado) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuarioExistente = usuarios.get(i);
            if (usuarioExistente.getIdentificacion().equals(usuarioActualizado.getIdentificacion())) {
                // Actualizar los campos del usuario existente con los valores del usuario actualizado
                usuarioExistente.setNombre(usuarioActualizado.getNombre());
                usuarioExistente.setApellido(usuarioActualizado.getApellido());
                usuarioExistente.setNombreUsuario(usuarioActualizado.getNombreUsuario());
                usuarioExistente.setTelefono(usuarioActualizado.getTelefono());
                usuarioExistente.setCorreo(usuarioActualizado.getCorreo());
                // No es necesario actualizar la identificación, ya que debería ser inmutable
                break; // Salir del bucle después de encontrar el usuario
            }
        }
    }

    @Override
    public void eliminarUsuario(String identificacion) {
        Usuario usuarioAEliminar = null;

        for (Usuario usuario : usuarios) {
            if (usuario.getIdentificacion().equals(identificacion)) {
                usuarioAEliminar = usuario;
                break;
            }
        }

        if (usuarioAEliminar != null) {
            usuarios.remove(usuarioAEliminar);
        }
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        return usuarios; // Devolver la lista original en lugar de una nueva instancia
    }
}