package ec.edu.ups.biblioteca.mvc.main;
import ec.edu.ups.biblioteca.mvc.vista.*;
import ec.edu.ups.biblioteca.mvc.idao.*;
import ec.edu.ups.biblioteca.mvc.dao.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ec.edu.ups.biblioteca.mvc.controlador.*;
import ec.edu.ups.biblioteca.mvc.modelo.*;


public class Principal 
{
	public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        List<Prestamo> listaPrestamos = new ArrayList<>(); // Lista para almacenar los préstamos
        boolean bibliotecaCreada = false; // Bandera para verificar si se ha creado al menos una biblioteca

        
        IUsuarioDao usuarioDao = new UsuarioDao ();
		UsuarioVista usuarioVista = new UsuarioVista();
		ILibroDao libroDao = new LibroDao();
		LibroVista libroVista = new LibroVista();
		IPrestamoDao prestamoDao = new PrestamoDao(libroDao, usuarioDao);
		PrestamoVista prestamoVista = new PrestamoVista();
		IBibliotecaDao bibliotecaDao = new BibliotecaDao();
		BibliotecaVista bibliotecaVista = new BibliotecaVista();

	
		// Instanciar controladores y vistas
		UsuarioControlador usuarioControlador = new UsuarioControlador (usuarioDao, usuarioVista);
		LibroControlador libroControlador = new LibroControlador (libroDao, libroVista);
		PrestamoControlador prestamoControlador = new PrestamoControlador (prestamoDao, prestamoVista, libroDao, libroVista, usuarioDao, usuarioVista);
		BibliotecaControlador bibliotecaControlador = new BibliotecaControlador (bibliotecaDao, bibliotecaVista);
        
        

		// Variable para controlar la ejecución del bucle
	    boolean salir = false;
	    while (!salir) {
	        // Menú principal
	        System.out.println("Menú Principal");
	        System.out.println("1. Biblioteca");
	        System.out.println("2. Usuario");
	        System.out.println("3. Libros");
	        System.out.println("4. Prestamos");
	        System.out.println("5. Salir");

	        // Verificar si se ha creado al menos una biblioteca
	        if (!bibliotecaCreada) {
	            System.out.println("** No se ha creado ninguna biblioteca. **");
	            System.out.println("No puedes crear usuarios, libros o préstamos hasta que se cree al menos una biblioteca.");
	        }

	        System.out.print("Ingrese su opción: ");
	        int opcionPrincipal = entrada.nextInt();

	        switch (opcionPrincipal) {
	            case 1:
	                // Menú de Biblioteca
	                boolean salirBiblioteca = false;
	                while (!salirBiblioteca) {
	                    System.out.println("Submenú de Biblioteca");
	                    System.out.println("1. Crear Biblioteca");
	                    System.out.println("2. Mostrar Biblioteca");
	                    System.out.println("3. Actualizar Biblioteca");
	                    System.out.println("4. Eliminar Biblioteca");
	                    System.out.println("5. Regresar al Menú Principal");
	                    System.out.print("Ingrese su opción: ");

	                    int opcionBiblioteca = entrada.nextInt();

	                    switch (opcionBiblioteca) {
	                        case 1:
	                            bibliotecaControlador.crearBiblioteca();
	                            bibliotecaCreada = true; // Se ha creado al menos una biblioteca
	                            break;
	                        case 2:
	                            bibliotecaControlador.obtenerBiblioteca();
	                            break;
	                        case 3:
	                            bibliotecaControlador.actualizarBiblioteca();
	                            break;
	                        case 4:
	                            bibliotecaControlador.eliminarBiblioteca();
	                            break;
	                        case 5:
	                            salirBiblioteca = true;
	                            break;
	                        default:
	                            System.out.println("Opción no válida. Inténtelo de nuevo.");
	                    }
	                }
	                break;

	            case 2:
	                // Menú de Usuario
	                if (!bibliotecaCreada) {
	                    System.out.println("** No puedes crear usuarios hasta que se cree al menos una biblioteca. **");
	                    break;
	                }
	                boolean salirUsuario = false;
	                while (!salirUsuario) {
	                    System.out.println("Submenú de Usuario");
	                    System.out.println("1. Registrar Usuario");
	                    System.out.println("2. Actualizar Usuario");
	                    System.out.println("3. Eliminar Usuario");
	                    System.out.println("4. Listar Usuarios");
	                    System.out.println("5. Regresar al Menú Principal");
	                    System.out.print("Ingrese su opción: ");

	                    int opcionUsuario = entrada.nextInt();

	                    switch (opcionUsuario) {
	                        case 1:
	                            usuarioControlador.registrarUsuario();
	                            break;
	                        case 2:
	                            usuarioControlador.actualizarUsuario();
	                            break;
	                        case 3:
	                            usuarioControlador.eliminarUsuario();
	                            break;
	                        case 4:
	                            usuarioControlador.listarUsuarios();
	                            break;
	                        case 5:
	                            salirUsuario = true;
	                            break;
	                        default:
	                            System.out.println("Opción no válida. Inténtelo de nuevo.");
	                    }
	                }
	                break;

	            case 3:
	                // Menú de Libros
	                if (!bibliotecaCreada) {
	                    System.out.println("** No puedes crear libros hasta que se cree al menos una biblioteca. **");
	                    break;
	                }
	                boolean salirLibros = false;
	                while (!salirLibros) {
	                    System.out.println("Submenú de Libros");
	                    System.out.println("1. Registrar Libro");
	                    System.out.println("2. Buscar Libro por Título");
	                    System.out.println("3. Buscar Libro por Autor");
	                    System.out.println("4. Buscar Libro por Año");
	                    System.out.println("5. Actualizar Libro");
	                    System.out.println("6. Eliminar Libro");
	                    System.out.println("7. Listar Libros");
	                    System.out.println("8. Regresar al Menú Principal");
	                    System.out.print("Ingrese su opción: ");

	                    int opcionLibros = entrada.nextInt();

	                    switch (opcionLibros) {
	                        case 1:
	                            libroControlador.registrarLibro();
	                            break;
	                        case 2:
	                            libroControlador.buscarLibroPorTitulo();
	                            break;
	                        case 3:
	                            libroControlador.buscarLibroPorAutor();
	                            break;
	                        case 4:
	                            libroControlador.buscarLibroPorAño();
	                            break;
	                        case 5:
	                            libroControlador.actualizarLibro();
	                            break;
	                        case 6:
	                            libroControlador.eliminarLibro();
	                            break;
	                        case 7:
	                            libroControlador.listarLibros();
	                            break;
	                        case 8:
	                            salirLibros = true;
	                            break;
	                        default:
	                            System.out.println("Opción no válida. Inténtelo de nuevo.");
	                    }
	                }
	                break;

	            case 4:
	                // Menú de Préstamos
	                if (!bibliotecaCreada) {
	                    System.out.println("** No puedes gestionar préstamos hasta que se cree al menos una biblioteca. **");
	                    break;
	                }
	                boolean salirPrestamos = false;
	                while (!salirPrestamos) {
	                    System.out.println("Submenú de Préstamos");
	                    System.out.println("1. Solicitar Préstamo");
	                    System.out.println("2. Buscar Préstamo por ID");
	                    System.out.println("3. Actualizar Préstamo");
	                    System.out.println("4. Eliminar Préstamo");
	                    System.out.println("5. Mostrar Todos los Préstamos");
	                    System.out.println("6. Regresar al Menú Principal");
	                    System.out.print("Ingrese su opción: ");

	                    int opcionPrestamos = entrada.nextInt();

	                    switch (opcionPrestamos) {
	                        case 1:
	                            Prestamo nuevoPrestamo = prestamoControlador.crearPrestamo(); // Método que crea el préstamo
	                            listaPrestamos.add(nuevoPrestamo); // Agrega el préstamo a la lista
	                            break;
	                        case 2:
	                            prestamoControlador.buscarPrestamoPorId(listaPrestamos);
	                            break;
	                        case 3:
	                            prestamoControlador.actualizarPrestamo(listaPrestamos);
	                            break;
	                        case 4:
	                            prestamoControlador.eliminarPrestamo(listaPrestamos);
	                            break;
	                        case 5:
	                            prestamoControlador.listarPrestamos(listaPrestamos);
	                            break;
	                        case 6:
	                            salirPrestamos = true;
	                            break;
	                        default:
	                            System.out.println("Opción no válida. Inténtelo de nuevo.");
	                    }
	                }
	                break;

	            case 5:
	                salir = true;
	                break;

	            default:
	                System.out.println("Opción no válida. Inténtelo de nuevo.");
	        }
	    }

	    // Cerrar el scanner
	    entrada.close();
	}
}