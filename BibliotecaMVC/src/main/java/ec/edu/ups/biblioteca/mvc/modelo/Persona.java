package ec.edu.ups.biblioteca.mvc.modelo;

public abstract class Persona {
    // Atributos
    protected String nombre;
    protected String apellido;
    protected String identificacion;
    protected String telefono;

    // Constructor
    public Persona(String nombre, String apellido, String identificacion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.telefono = telefono;
    }

    public Persona(String identificacion) {
		this.identificacion = identificacion;
	}


	// Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", telefono=" + telefono + "]";
	}
}

