package ec.edu.ups.biblioteca.mvc.vista;

import java.util.*;

import ec.edu.ups.biblioteca.mvc.modelo.Biblioteca;

public class BibliotecaVista {
	private Scanner entrada;

    public BibliotecaVista() {
        entrada = new Scanner(System.in);
    }

    public Biblioteca solicitarDatosBiblioteca() {
        System.out.println("Ingrese el nombre de la biblioteca:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la dirección de la biblioteca:");
        String direccion = entrada.nextLine();
        return new Biblioteca(nombre, direccion);
    }
    public Biblioteca solicitarDatosBibliotecaActualizada() {
        System.out.println("Ingrese el nuevo nombre de la biblioteca:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la nueva dirección de la biblioteca:");
        String direccion = entrada.nextLine();
        return new Biblioteca(nombre, direccion);
    }

    public String solicitarNombreBiblioteca() {
        System.out.println("Ingrese el nombre de la biblioteca:");
        return entrada.nextLine();
    }

    public void mostrarAlerta(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarBiblioteca(Biblioteca biblioteca) {
        System.out.println("*** Información de la Biblioteca ***");
        System.out.println("Nombre: " + biblioteca.getNombre());
        System.out.println("Dirección: " + biblioteca.getDirección());
        // Puedes mostrar más detalles según sea necesario
    }

    public void mostrarListaBibliotecas(List<Biblioteca> bibliotecas) {
        if (!bibliotecas.isEmpty()) {
            System.out.println("*** Lista de Bibliotecas ***");
            for (Biblioteca biblioteca : bibliotecas) {
                mostrarBiblioteca(biblioteca);
                System.out.println("----------------------");
            }
        } else {
            System.out.println("No hay bibliotecas.");
        }
    }

	public String solicitarTituloLibro() {
		System.out.println("Ingrese el título del libro:");
		return entrada.nextLine();
	}

	public String solicitarIdentificacionUsuario() {
	    System.out.println("Ingrese la identificación del usuario:");
	    return entrada.nextLine();
	}
	
		
}
        