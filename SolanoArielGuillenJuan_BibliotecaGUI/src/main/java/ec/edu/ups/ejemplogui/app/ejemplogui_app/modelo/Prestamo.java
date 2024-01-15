
package ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public class Prestamo implements Prestable {
    private int codigo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Usuario usuario;
    private Biblioteca biblioteca;
    private Libro libro;
    private boolean disponible;

    public Prestamo() {
    }

    public Prestamo(int codigo, Date fechaPrestamo,Date fechaDevolucion,Biblioteca biblioteca, Usuario usuario, Libro libro) {
        this.codigo = codigo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.biblioteca = biblioteca;
        this.usuario = usuario;
        this.disponible = true; 
    }
    
    public Prestamo(int codigo, Date fechaPrestamo,Date fechaDevolucion) {
	this.codigo = codigo;
	this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
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

    public Usuario getUsuario() {
        return usuario;
    }

    

    public boolean isDisponible() {
        return disponible;
    }

    

    public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
    }

    @Override
    public void prestar() {
        if (disponible) {
            System.out.println("El libro se ha prestado.");
            disponible = false;
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }

    @Override
    public void devolver() {
        if (!disponible) {
            System.out.println("El libro se ha devuelto.");
            disponible = true;
        } else {
            System.out.println("No se puede devolver el libro que no ha sido prestado.");
        }
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigo=" + codigo + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", usuario=" + usuario + ", biblioteca=" + biblioteca + ", libro=" + libro + ", disponible=" + disponible + '}';
    }

    

}
