package ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int MAX_LENGTH = 10; 
    private int[] codigosLibros = new int[5]; 
    private int codigo; 
    private String nombre; 
    private String direccion; 
    private String telefono; 
    private List<Prestamo> prestamos;
    private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        setNombre(nombre);
        setDireccion(direccion);
        setTelefono(telefono);
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
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
        this.nombre = ajustarLongitud(nombre);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = ajustarLongitud(direccion);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = ajustarLongitud(telefono);
    }

    public List<Libro> getListaLibros() {
        return libros;
    }

    public void setListaLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Usuario> getListaUsuarios() {
        return usuarios;
    }

    public void setListaUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public void setCodigosLibros(int[] codigosLibros) {
        this.codigosLibros = codigosLibros;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
    public void addCodigoLibro(int codigoLibro) {
        for (int i = 0; i < codigosLibros.length; i++) {
            if (codigosLibros[i] == 0) { 
                codigosLibros[i] = codigoLibro;
                return;
            }
        }
        throw new RuntimeException("No hay espacio para más libros en esta biblioteca.");
    }

    public int[] getCodigosLibros() {
        return codigosLibros;
    }
    public void eliminarCodigoLibro(int codigoLibro) {
        for (int i = 0; i < codigosLibros.length; i++) {
            if (codigosLibros[i] == codigoLibro) {
                codigosLibros[i] = 0; 
                break; 
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    private String ajustarLongitud(String input) {
        if (input == null) input = ""; 
        if (input.length() > MAX_LENGTH) {
            return input.substring(0, MAX_LENGTH);
        }
        return String.format("%1$-" + MAX_LENGTH + "s", input);
    }
}