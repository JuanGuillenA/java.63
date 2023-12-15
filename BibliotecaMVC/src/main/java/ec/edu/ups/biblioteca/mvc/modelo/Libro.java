package ec.edu.ups.biblioteca.mvc.modelo;

import java.util.*;

public class Libro implements Prestable 
{
	private String titulo;
	private int id;
	private String autor;
	private int año;
    private boolean disponible;
    private List<Prestamo> prestamos; // Lista de préstamos asociados al libro



    // Constructores
    public Libro(int id, String titulo, String autor, int año,boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.disponible = true;
    }
    
    
    
    public Libro(String titulo, int id, String autor, int año) {
		this.titulo = titulo;
		this.id = id;
		this.autor = autor;
		this.año = año;
	}



	public Libro(String titulo, String autor, int año) {
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
	}

	

	public Libro(int id) {
		super();
		this.id = id;
	}


	public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        // Puedes inicializar otros atributos si es necesario
    }

    public Libro(String titulo) {
        this(titulo, "");  // Llama al constructor con dos parámetros, pasando una cadena vacía como autor
    }
    
    // Getters y setters de los atributos
    
    public String getTitulo() {
        return titulo;
    }


	public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", año=" + año + ", disponible=" + disponible + "]";
	}


	@Override
	public void prestar() {
		if (disponible) {
            System.out.println("El libro '" + titulo + "' se ha prestado.");
            disponible = false;
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
        }
	}

	@Override
	public void devolver() {
		if (!disponible) {
            System.out.println("El libro '" + titulo + "' se ha devuelto.");
            disponible = true;
        } else {
            System.out.println("No se puede devolver el libro '" + titulo + "' que no ha sido prestado.");
        }
	}
}

