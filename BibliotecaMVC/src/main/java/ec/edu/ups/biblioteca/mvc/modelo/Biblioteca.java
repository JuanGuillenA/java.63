package ec.edu.ups.biblioteca.mvc.modelo;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    // Atributos pertenecientes a la clase Biblioteca
    private String nombre;
    private String dirección;
    
    // Agregacion para almacenar la lista de libros y lista de usuarios
    private ArrayList<Libro> listaLibros;
    private ArrayList<Usuario> listaUsuarios;
    private List<Prestamo> prestamos;

    // Constructores
    public Biblioteca(String nombre, String dirección) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.listaLibros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();

    }
   
	public Biblioteca() {
		this.listaLibros = listaLibros;
		this.listaUsuarios = listaUsuarios;
	}
	
	 // Método sobrecargado con Año para buscar libro por título
    public Libro getLibroPorTitulo(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

	 //Métodos de la clase Biblioteca
	
    public Biblioteca(String nombre) {
		this.nombre = nombre;
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

	public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);		
	}
}


