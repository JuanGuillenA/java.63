package ec.edu.ups.biblioteca.mvc.vista;
import java.util.*;
import ec.edu.ups.biblioteca.mvc.modelo.Libro;

public class LibroVista {

	private Scanner entrada;

    public LibroVista() {
        this.entrada = new Scanner(System.in);
    }

    public Libro ingresarLibro() {
        System.out.println("*** Ingresar Libro ***");
        System.out.println("Ingrese el id del libro:");
        int id = entrada.nextInt();
        System.out.println("Ingrese el título del libro:");
        String titulo = entrada.next();
        System.out.println("Ingrese el autor del libro:");
        String autor = entrada.next();
        System.out.println("Ingrese el año de publicación del libro:");
        int año = entrada.nextInt();
        return new Libro(titulo, id, autor, año);
    }

    public String buscarLibroPorTitulo() {
        System.out.println("*** Buscar Libro por Título ***");
        System.out.println("Ingrese el título del libro a buscar:");
        return entrada.next();
    }

    public String buscarLibroPorAutor() {
        System.out.println("*** Buscar Libro por Autor ***");
        System.out.println("Ingrese el autor del libro a buscar:");
        return entrada.next();
    }

    public int buscarLibroPorAño() {
        System.out.println("*** Buscar Libro por Año de Publicación ***");
        System.out.println("Ingrese el año de publicación del libro a buscar:");
        return entrada.nextInt();
    }

    public Libro actualizarLibro() {
        System.out.println("*** Actualizar Libro ***");
        System.out.println("Ingrese el id del libro:");
        int id = entrada.nextInt();
        System.out.println("Ingrese el título del libro a actualizar:");
        String titulo = entrada.next();
        System.out.println("Ingrese el nuevo autor del libro:");
        String nuevoAutor = entrada.next();
        System.out.println("Ingrese el nuevo año de publicación del libro:");
        int nuevoAño = entrada.nextInt();
        return new Libro(titulo,id, nuevoAutor, nuevoAño);
    }

    public String eliminarLibro() {
        System.out.println("*** Eliminar Libro ***");
        System.out.println("Ingrese el título del libro a eliminar:");
        return entrada.next();
    }

    public void mostrarDatosLibro(Libro libro) {
        System.out.println("*** Datos del Libro ***");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de publicación: " + libro.getAño());
    }

    public void mostrarAlertas(String mensaje) {
        System.out.println("*** Alerta ***");
        System.out.println(mensaje);
    }
}