/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.dao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IUsuarioDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public class UsuarioDao implements IUsuarioDao {
    
    private final String directorio = "/Users/juanguillenalbarracin/PRUEBAS/";
    private final String usuariosArchivo = directorio + "usuarios.dat";

    public UsuarioDao() {
        new File(directorio).mkdirs();
    }
    @Override
public void create(Usuario usuario) throws IOException {
    RandomAccessFile random = new RandomAccessFile(usuariosArchivo, "rw");

    boolean existe = false;
    while(random.getFilePointer() < random.length()) {
        String identificacionExistente = readFixedString(random, 15);
        random.skipBytes(75); 

        if(identificacionExistente.trim().equals(usuario.getIdentificacion())) {
            existe = true;
            break;
        }
    }

    if (!existe) {
        random.seek(random.length()); 
        escribirUsuario(random, usuario);
    } else {
        throw new IOException("Un usuario con la identificación " + usuario.getIdentificacion() + " ya existe.");
    }

    random.close();
}
    @Override
public Usuario read(String identificacion) throws IOException {
    try (RandomAccessFile random = new RandomAccessFile(usuariosArchivo, "r")) {
        while(random.getFilePointer() < random.length()) {
            String identificacionActual = readFixedString(random, 15);
            if(identificacionActual.equals(identificacion)) {
                return leerUsuario(random,identificacionActual);
            } else {
                random.skipBytes(75); 
            }
        }
    }
    return null;
}
    @Override
    public boolean update(String identificacion, Usuario usuarioNuevo) throws IOException {
    try (RandomAccessFile random = new RandomAccessFile(usuariosArchivo, "rw")) {
        while(random.getFilePointer() < random.length()) {
            long posicionInicio = random.getFilePointer();
            String identificacionActual = readFixedString(random, 15);
            if(identificacionActual.equals(identificacion)) {
                random.seek(posicionInicio);
                escribirUsuario(random, usuarioNuevo);
                return true;
            }
            random.skipBytes(75); // Solo saltar si la identificación no coincide.
        }
    }
    return false;
}
    @Override
    public boolean delete(String identificacion) throws IOException {
    try (RandomAccessFile random = new RandomAccessFile(usuariosArchivo, "rw")) {
        while(random.getFilePointer() < random.length()) {
            long posicionInicio = random.getFilePointer();
            String identificacionActual = readFixedString(random, 15);
            if(identificacionActual.equals(identificacion)) {
                random.seek(posicionInicio);
                writeFixedString(random, "", 15); 
                random.skipBytes(75); 
                return true;
            }
            random.skipBytes(75); 
        }
    }
    return false;
}
    
    @Override
        public List<Usuario> list() throws IOException {
            List<Usuario> usuarios = new ArrayList<>();
            try (RandomAccessFile random = new RandomAccessFile(usuariosArchivo, "r")) {
                while(random.getFilePointer() < random.length()) {
                    String identificacion = readFixedString(random,15);
                    Usuario usuario = leerUsuario(random,identificacion); 
                    usuarios.add(usuario);
                }
            }
            return usuarios;
        }

    private void escribirUsuario(RandomAccessFile random, Usuario usuario) throws IOException {
        writeFixedString(random, usuario.getIdentificacion(), 15);
        writeFixedString(random, usuario.getNombre(), 15);
        writeFixedString(random, usuario.getApellido(), 15);
        writeFixedString(random, usuario.getTelefono(), 15);
        writeFixedString(random, usuario.getNombreUsuario(), 15);
        writeFixedString(random, usuario.getCorreo(), 15);
    }

    private Usuario leerUsuario(RandomAccessFile random,String identificacion) throws IOException {
        String nombre = readFixedString(random, 15);
        String apellido = readFixedString(random, 15);
        String telefono = readFixedString(random, 15);
        String nombreUsuario = readFixedString(random, 15);
        String correo = readFixedString(random, 15);
        return new Usuario(identificacion, nombre, apellido, telefono, nombreUsuario, correo);
    }

    private void writeFixedString(RandomAccessFile random, String string, int length) throws IOException {
        if (string.length() > length) {
            string = string.substring(0, length);
        } else {
            while (string.length() < length) {
                string += " "; 
            }
        }
        random.writeBytes(string);
    }

private String readFixedString(RandomAccessFile random, int length) throws IOException {
        byte[] bytes = new byte[length];
        random.readFully(bytes);
        return new String(bytes).trim();
    }
    
}