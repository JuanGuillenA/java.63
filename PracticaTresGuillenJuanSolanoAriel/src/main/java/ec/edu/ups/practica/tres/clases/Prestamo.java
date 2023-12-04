package ec.edu.ups.practica.tres.clases;
import java.time.LocalDate;
import java.util.Date;

public class Prestamo {
    // Atributos de la clase Prestamo
    private Libro libro;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    // Constructores
    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = new Date();
        this.fechaDevolucion = null;
    }

    public Prestamo() {
	}

	public Prestamo(Date fechaPrestamo, Date fechaDevolucion) {
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}

	// Métodos
	
	//Calcula los dias que se ha realizado el prestamo hasta que se devuelve el libro
    public long calcularDiasPrestamo() {
    	 if (fechaDevolucion != null) {
    		 long tiempoInicio = fechaPrestamo.getTime();
             long tiempoFin = fechaDevolucion.getTime();

             // Calcula el tiempo
             long diferenciaTiempo = tiempoFin - tiempoInicio;

             // Convierte la diferencia a días
             long diasPrestamo = diferenciaTiempo / (24 * 60 * 60 * 1000);

             return diasPrestamo;
         } else {
             // Si el libro aún no ha sido devuelto
             return -1;
         }
     }
    
    // Mira si el prestamo esta vigente comparando la fecha de devolución con la fecha actual
    public boolean esPrestamoVigente() {
    	if (fechaDevolucion != null) {
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaDevolucionLocalDate = fechaDevolucion.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

            return fechaActual.isBefore(fechaDevolucionLocalDate);
        } else {
            // Si la fecha de devolución es null, consideramos que el préstamo está vigente
            return true;
        }
    }
    
    //Getters y Stters de los atributos
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

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
    //Metodo toString para mostrar la informacion
	@Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro +
                ", usuario=" + usuario +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
