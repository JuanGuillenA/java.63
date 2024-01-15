/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.dao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IUsuarioDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public class UsuarioDao implements IUsuarioDao {
    
    private List<Usuario> usuarios;
    
    public UsuarioDao () {
        usuarios = new ArrayList<>();
    }

    @Override
    public void create(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public Usuario read (String identificacion) {
        for (Usuario usuario : usuarios) {
            if(usuario.getIdentificacion().equalsIgnoreCase(identificacion)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public boolean update (String identifiacion, Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuarioEncontrado = usuarios.get(i);
            if(usuarioEncontrado.getIdentificacion().equalsIgnoreCase(identifiacion)) {
                usuarios.set(i, usuario);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete (String identificacion) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuarioEncontrado = usuarios.get(i);
            if(usuarioEncontrado.getIdentificacion().equalsIgnoreCase(identificacion)) {
                usuarios.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Usuario> list() {
        return usuarios;
    }
    
    
}
