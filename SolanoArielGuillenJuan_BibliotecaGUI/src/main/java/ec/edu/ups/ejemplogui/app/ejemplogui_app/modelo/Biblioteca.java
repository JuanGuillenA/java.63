package ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Prestamo> prestamos;
    private List<Libro> libros;
    private List<Usuario> usuarios;

    

    public Biblioteca(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();

    }
    public Biblioteca() {
        this.libros= new ArrayList<>();
	this.usuarios= new ArrayList<>();
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public List<Libro> getListaLibros() {
        return libros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.libros = libros;
    }
    public List<Usuario> getListaUsuarios() {
        return usuarios;
    }
    public void setListaUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);		
    }
    
    @Override
    public String toString() {
        return nombre;
    }
   
    
    
}
