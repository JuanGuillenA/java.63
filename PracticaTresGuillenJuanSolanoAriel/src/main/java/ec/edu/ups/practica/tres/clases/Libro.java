package ec.edu.ups.practica.tres.clases;

public class Libro implements Prestable { //La clase Libro implementa el Interfaz Prestable
    // Atributos de la clase Libro
    private String titulo;
    private String autor;
    private int año;
    private boolean disponible;


    // Constructores
    public Libro(String titulo, String autor, int año,boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.disponible = true;
    }
    
    public Libro() {
	}

	// Implementación de los métodos de la interfaz Prestable (Sobreescritos
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

    // Método sobrescrito de mostrarInformacion
    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
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
    //Metodo toString para mostrar la informacion
    @Override
    public String toString() {
        return "Libro{" +
                "\ntitulo='" + titulo + '\'' +
                ", \nautor='" + autor + '\'' +
                ", \naño=" + año +
                ", \ndisponible=" + disponible +
                '}';
    }
}

