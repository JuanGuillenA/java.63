
package ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public class Prestamo implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int MAX_LENGTH = 10; 
    private int codigoLibro;    
    private String codigoUsuario;    
    private int codigoBiblioteca;    
    private int codigo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private List<Libro> libros;
    private List<Usuario> usuarios;    
    private List<Biblioteca> bibliotecas;
    private boolean disponible;
    private Biblioteca biblioteca;
    private Libro libro;
    private Usuario usuario;
    public Prestamo() {
    }

    public Prestamo(int codigo, Date fechaPrestamo,Date fechaDevolucion,int codigoLibro, String codigoUsuario, int codigoBiblioteca ) {
        this.codigo = codigo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.codigoLibro = codigoLibro;
        setCodigoUsuario(codigoUsuario);
        this.codigoBiblioteca = codigoBiblioteca;
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.bibliotecas = new ArrayList<>();
        this.disponible = true; 
    }

    public Prestamo(Biblioteca biblioteca, Libro libro, Usuario usuario) {
        this.biblioteca = biblioteca;
        this.libro = libro;
        this.usuario = usuario;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public boolean isDisponible() {
        return disponible;
    }
    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = ajustarLongitud(codigoUsuario);
}

    public String getCodigoUsuario() {
        return codigoUsuario;
}

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getCodigoBiblioteca() {
        return codigoBiblioteca;
    }

    public void setCodigoBiblioteca(int codigoBiblioteca) {
        this.codigoBiblioteca = codigoBiblioteca;
    }

    
    
    
    private String ajustarLongitud(String input) {
        if (input == null) input = ""; 
        if (input.length() > MAX_LENGTH) {
            return input.substring(0, MAX_LENGTH);
        }
        return String.format("%1$-" + MAX_LENGTH + "s", input);
    }
    

}
