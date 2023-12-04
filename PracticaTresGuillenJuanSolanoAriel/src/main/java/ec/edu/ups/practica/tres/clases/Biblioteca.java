package ec.edu.ups.practica.tres.clases;

import java.util.ArrayList;

public class Biblioteca {
    // Atributos pertenecientes a la clase Biblioteca
    private String nombre;
    private String dirección;
    // Agregacion para almacenar la lista de libros y lista de usuarios
    private ArrayList<Libro> listaLibros;
    private ArrayList<Usuario> listaUsuarios;

    // Constructores
    public Biblioteca(String nombre, String dirección) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.listaLibros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }
   
	public Biblioteca() {
		this.listaLibros = listaLibros;
		this.listaUsuarios = listaUsuarios;
	}

	// Métodos de la clase Biblioteca
	
    // Agrega un libro a la lista de libros de la biblioteca
	// Se agrega con el metodo privado agregarLibro para agregar el libro a listaLibros
    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }
    // Registra un nuevo usuario en la biblioteca
	// Se agrega con el metodo privado agregarUsuario para agregar el libro a listaUsuarios
    public void registrarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    // Método sobrecargado con Año para buscar libro por título
    public Libro buscarLibro(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // Método para buscar libro por autor 
    public Libro buscarLibroPorAutor(String autor) {
        for (Libro libro : listaLibros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                return libro;
            }
        }
        return null;
    }

    // Método sobrecargado con titulo para buscar libro por año de publicación
    public Libro buscarLibro(int año) {
        for (Libro libro : listaLibros) {
            if (libro.getAño() == año) {
                return libro;
            }
        }
        return null;
    }
    // Registra un nuevo usuario en la biblioteca
	// Se agrega con el metodo privado prestarLibro para solicitar un prestamo
    public void prestarLibro(Libro libro, Usuario usuario) {
    	if (libro.isDisponible()) {
            usuario.solicitarPrestamo(libro);
        } else {
            System.out.println("El libro no está disponible para préstamo en este momento.");
        }
    }

    // Getters y setters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    // Agregacion de listaLibros y listaUsuarios
    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
	}
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
	}
    
    //Metodo toString para mostrar la informacion
    @Override
    public String toString() {
        return "Biblioteca{" +
                "\nnombre='" + nombre + '\'' +
                ", \ndirección='" + dirección + '\'' +
                ", \nlistaLibros=" + listaLibros +
                ", \nlistaUsuarios=" + listaUsuarios +
                '}';
    }
}

