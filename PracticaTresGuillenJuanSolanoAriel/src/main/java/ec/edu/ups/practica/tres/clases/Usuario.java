package ec.edu.ups.practica.tres.clases;
import java.util.ArrayList;

public class Usuario extends Persona { //Herencia entre Usuario y Persona
    // Atributos de la clase Usuario
	//Se complementan con los atributos de la clase Persona gracias a la herencia
	private String nombreUsuario;
    private String correo;
    // Composicion entre Usuario y Prestamo
    private ArrayList<Prestamo> listaPrestamos;

    // Constructor super, debido a la herencia entre Usuario y persona 
    public Usuario(String nombre,String apellido, String identificacion,String nombreUsuario, String correo) {
    	super (nombre,apellido,identificacion);
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.listaPrestamos = new ArrayList<>();
    }

	// Implementación del método mostrarInformacion sobreescrito
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Correo: " + correo);
    }

    // Métodos adicionales
    
    //Metodo para solicitarpRESTAMO
    //Se conecta con el metodo privado solitarPrestamo para realizar el prestamo del libro
    public void solicitarPrestamo(Libro libro) {
    	if (libro.isDisponible()) {
            // Se crea un nuevo préstamo
            Prestamo prestamo = new Prestamo(libro, this);
            // Agrega el préstamo a la lista de préstamos del usuario
            listaPrestamos.add(prestamo);
            // Cambia el estado del libro a no disponible
            libro.setDisponible(false);

            System.out.println("Préstamo solicitado con éxito.");
        } else { //Si ya esta prestado el libro se muestra este mensaje
            System.out.println("El libro no está disponible para préstamo en este momento.");
        }
    }
    
    //Metodo para devolverLibro y deshacer el prestamo
    //Se conecta con el metodo privado devolverLibro para hacer la devolucion
    public void devolverLibro(Libro libro) {
    	for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getLibro().equals(libro)) {
                // Elimina el préstamo de la lista de préstamos del usuario
                listaPrestamos.remove(prestamo);
                // Cambia el estado del libro a disponible
                libro.setDisponible(true);
                System.out.println("Libro devuelto con éxito.");
                return; 
            }
        }
        // Si no se encuentra el préstamo correspondiente al libro
        System.out.println("El libro no fue prestado por este usuario.");
    }    

    // Getters y setters de los atributos 
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	// Codigo para realizar la composicion y agregar el prestamo a la listaPrestamos
	public void agregarPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }
    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }
    //Metodo toString para mostrar la informacion
    @Override
    public String toString() {
        return super.toString() + "DATOS USUARIO{" +
                "\nnombreUsuario='" + nombreUsuario + '\'' +
                ", \ncorreo='" + correo + '\'' +
                '}';
    }
}
