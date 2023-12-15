package ec.edu.ups.biblioteca.mvc.modelo;
import java.util.ArrayList;

public class Usuario extends Persona { //Herencia entre Usuario y Persona
    // Atributos de la clase Usuario
	//Se complementan con los atributos de la clase Persona gracias a la herencia
	private String nombreUsuario;
    private String correo;
    // Composicion entre Usuario y Prestamo
    private ArrayList<Prestamo> prestamos;

    // Constructor super, debido a la herencia entre Usuario y persona 
    public Usuario(String nombre,String apellido, String identificacion,String nombreUsuario, String telefono, String correo) {
    	super (nombre,apellido,identificacion, telefono);
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.prestamos = new ArrayList<>();
    }

    public Usuario(String identificacion) {
    	super(identificacion);
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
        prestamos.add(prestamo);
    }
    public ArrayList<Prestamo> getListaPrestamos() {
        return prestamos;
    }
    
    @Override
    public String toString() {
        return super.toString() + "DATOS USUARIO{" +
                "\nnombreUsuario='" + nombreUsuario + '\'' +
                ", \ncorreo='" + correo + '\'' +
                '}';
    }
}