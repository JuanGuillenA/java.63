package ec.edu.ups.practica.tres.clases;

public abstract class Persona {
    // Atributos de la clase abstracta Persona
    protected String nombre;
    protected String apellido;
    protected String identificacion;

    //Constructores
	public Persona() {
	}

	public Persona(String nombre,String apellido, String identificacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
	}

	// Método abstracto para mostrar la informacion
	// Al ser abstracto el metodo se debe instanciar el metodo en las demas clases 
    public abstract void mostrarInformacion();

    // Getters y setters
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

	public String getIdentificación() {
        return identificacion;
    }

    public void setIdentificación(String identificación) {
        this.identificacion = identificación;
    }
    //Metodo toString para mostrar la informacion
    @Override
    public String toString() {
        return "DATOS PERSONA{" +
                "\nnombre='" + nombre + '\'' +
                ", \napellido='" + apellido + '\'' +
                ", \nidentificación='" + identificacion + '\'' +
                '}';
    }
}

