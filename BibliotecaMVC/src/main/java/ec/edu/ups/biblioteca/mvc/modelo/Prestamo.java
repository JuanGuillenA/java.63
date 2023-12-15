package ec.edu.ups.biblioteca.mvc.modelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Prestamo implements Prestable {
    private int id;
    private Date fechaPrestamo;
    private Usuario usuario;
    private List<Libro> libros;
    private boolean disponible;

    public Prestamo() {
        libros = new ArrayList<>();
    }

    public Prestamo(int id, Date fechaPrestamo, Usuario usuario) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.usuario = usuario;
        this.libros = new ArrayList<>();
        this.disponible = true; // Se inicia como disponible
    }
    
    public Prestamo(int id, Date fechaPrestamo) {
		this.id = id;
		this.fechaPrestamo = fechaPrestamo;
	}

	public Prestamo(int id, Date fechaPrestamo, List<Libro> libros) {
		this.id = id;
		this.fechaPrestamo = fechaPrestamo;
		this.libros = libros;
	}

	public int getId() {
        return id;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
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
        return "Prestamo [id=" + id + ", fechaPrestamo=" + fechaPrestamo + ", usuario=" + usuario + ", libros=" + libros
                + ", disponible=" + disponible + "]";
    }

    // Resto de métodos y atributos según sea necesario
}