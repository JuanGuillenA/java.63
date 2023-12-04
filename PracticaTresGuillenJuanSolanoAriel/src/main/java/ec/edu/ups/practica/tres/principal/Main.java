package ec.edu.ups.practica.tres.principal;
import ec.edu.ups.practica.tres.clases.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	//Se instancia la clase Biblioteca y el objeto Scanner
        Biblioteca biblioteca = new Biblioteca("Biblioteca UPS", "Calle Vieja 10-07");
        Scanner scanner = new Scanner(System.in);
        int opcion;

        //Bucle principal (do) que realiza la accion que le digites que haga 
        do {
            System.out.println("Bienvenido al Sistema de Gestión de Biblioteca");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Registrar Usuario");
            System.out.println("3. Buscar Libro");
            System.out.println("4. Prestar Libro");
            System.out.println("5. Devolver Libro");
            System.out.println("6. Mostrar Información Biblioteca");
            System.out.println("7. Salir del programa");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            //Segun la opcion que elijas en el bucle se implementa el metodo seleccionado
            switch (opcion) {
                case 1:
                    agregarLibro(biblioteca, scanner);
                    break;
                case 2:
                    registrarUsuario(biblioteca, scanner);
                    break;
                case 3:
                    buscarLibro(biblioteca, scanner);
                    break;
                case 4:
                    prestarLibro(biblioteca, scanner);
                    break;
                case 5:
                    devolverLibro(biblioteca, scanner);
                    break;
                case 6:
                    mostrarInformacionBiblioteca(biblioteca);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    System.out.println("GRACIAS POR USAR LA BIBLOTECA DE LA UPS");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
            }
        } while (opcion != 7);
        // Se cierra el objeto Scanner
        scanner.close();
    }

    // Se hizo de la forma que estos metodos privados pidan toda la informacion y en las clases individuales,
    // solamente se realize la logica de implementacion en su respectivo ArrayList o return
    
    //Metodo privado para agregarLibro
    private static void agregarLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.println("### Agregar Libro ###");
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el año de publicación del libro: ");
        int año = scanner.nextInt();
        scanner.nextLine(); 
        //Se instancia la clase Libro como un libro y se le agrega a la biblioteca al ArrayList listaLibros
        Libro libro = new Libro(titulo, autor, año, true);
        biblioteca.agregarLibro(libro);
        System.out.println("Libro agregado con éxito.");
    }

    //Metodo privado para registrarUsuarios
    private static void registrarUsuario(Biblioteca biblioteca, Scanner scanner) {
        System.out.println("### Registrar Usuario ###");
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del usuario: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la identificación del usuario: ");
        String identificacion = scanner.nextLine();
        System.out.print("Ingrese el nombre de usuario del usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese el correo del usuario: ");
        String correo = scanner.nextLine();

        //Se instancia la clase Usuario como usuario y se le agrega a la listaUsuarios
        Usuario usuario = new Usuario(nombre, apellido, identificacion, nombreUsuario, correo);
        biblioteca.registrarUsuario(usuario);
        System.out.println("Usuario registrado con éxito.");
    }

    // Metodo privado para buscar Libro
    private static void buscarLibro(Biblioteca biblioteca, Scanner scanner) {
        int opcionBuscar;

        //Bucle interno que segun la opcion que elija se busca segun el titulo, autor o año
        do {
            System.out.println("### Buscar Libro ###");
            System.out.println("1. Buscar por título del libro");
            System.out.println("2. Buscar por autor del libro");
            System.out.println("3. Buscar por año de publicación del libro");
            System.out.println("4. Volver al menú principal");
            System.out.print("Ingrese una opción: ");
            opcionBuscar = scanner.nextInt();
            scanner.nextLine(); 

            //Segun la opcion se implementa el metodo con la logica para buscar segun el titulo, autor o año
            switch (opcionBuscar) {
                case 1:
                    buscarPorTitulo(biblioteca, scanner);
                    break;
                case 2:
                    buscarPorAutor(biblioteca, scanner);
                    break;
                case 3:
                    buscarPorAño(biblioteca, scanner);
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
            }
        } while (opcionBuscar != 4);
    }

    //metodo privado para implementar el metodo buscarLibro de la clase Biblioteca 
    private static void buscarPorTitulo(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el título del libro a buscar: ");
        String titulo = scanner.nextLine();
        Libro libroEncontrado = biblioteca.buscarLibro(titulo);

        //Si libroEncontrado no esta nulo si existe el libro en listaLibros
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            libroEncontrado.mostrarInformacion();
        } else { //Si esta nulo no existe en la listaLibros
            System.out.println("Libro no encontrado.");
        }
    }

    //metodo privado para implementar el metodo buscarLibroPorAutor de la clase Biblioteca 
    private static void buscarPorAutor(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el autor del libro a buscar: ");
        String autor = scanner.nextLine();
        Libro libroEncontrado = biblioteca.buscarLibroPorAutor(autor);

        // libroEncontrado no esta nulo, el libro si existe en listaLibros
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            libroEncontrado.mostrarInformacion();
        } else { //Si esta nulo quiere decir que el lirbo no esta en listaLibro
            System.out.println("Libro no encontrado.");
        }
    }

    //metodo privado para implementar el metodo buscarLibroPorAno de la clase Biblioteca 
    private static void buscarPorAño(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el año de publicación del libro a buscar: ");
        int año = scanner.nextInt();
        scanner.nextLine(); 
        Libro libroEncontrado = biblioteca.buscarLibro(año);

        // libroEncontrado no esta nulo, el libro si existe en listaLibros 
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            libroEncontrado.mostrarInformacion();
        } else { //Si esta nulo quiere decir que el lirbo no esta en listaLibro
            System.out.println("Libro no encontrado.");
        }
    }
    
    // Metodo privado para hacer el prestamo de un libro 
    private static void prestarLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.println("### Prestar Libro ###");
        System.out.println("Seleccione una opción de búsqueda:");
        System.out.println("1. Título");
        System.out.println("2. Autor");
        System.out.println("3. Año de publicación");
        System.out.println("4. Volver al menú principal");
        System.out.print("Ingrese una opción: ");
        
        int opcionBuscar = scanner.nextInt();
        scanner.nextLine(); 

        //Segun la opcion que digite realiza el metodo seleccionado
        switch (opcionBuscar) {
            case 1:
                prestarLibroPorTitulo(biblioteca, scanner);
                break;
            case 2:
                prestarLibroPorAutor(biblioteca, scanner);
                break;
            case 3:
                prestarLibroPorAño(biblioteca, scanner);
                break;
            case 4:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción no válida. Volviendo al menú principal...");
        }
    }

    //Metodo privado para prestar el libro haciendo la busqueda por el titulo
    private static void prestarLibroPorTitulo(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el título del libro a prestar: ");
        String titulo = scanner.nextLine();
        Libro libro = biblioteca.buscarLibro(titulo);

        procesarPrestamo(biblioteca, libro, scanner);
    }

    //Metodo privado para prestar el libro haciendo la busqueda por el autor
    private static void prestarLibroPorAutor(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el autor del libro a prestar: ");
        String autor = scanner.nextLine();
        Libro libro = biblioteca.buscarLibroPorAutor(autor);

        procesarPrestamo(biblioteca, libro, scanner);
    }

    //Metodo privado para prestar el libro haciendo la busqueda por el año
    private static void prestarLibroPorAño(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el año de publicación del libro a prestar: ");
        int año = scanner.nextInt();
        scanner.nextLine(); 

        Libro libro = biblioteca.buscarLibro(año);
        procesarPrestamo(biblioteca, libro, scanner);
    }

    //Metodo privado para procesar el prestamo segun la identifiacion del usuario que lo pida
    private static void procesarPrestamo(Biblioteca biblioteca, Libro libro, Scanner scanner) {
        if (libro != null) {
            System.out.print("Ingrese la identificación del usuario que solicita el préstamo: ");
            String identificacionUsuario = scanner.nextLine();
            Usuario usuario = buscarUsuarioPorIdentificacion(biblioteca, identificacionUsuario);

            if (usuario != null) {
                biblioteca.prestarLibro(libro, usuario);
            } else {
                System.out.println("Usuario no encontrado.");
                System.out.println("Volviendo al menu...");
            }
        } else {
            System.out.println("Libro no encontrado.");
            System.out.println("Volviendo al menu...");
        }
    }

    //Metodo privado para devolver el libro y que quede disponible para prestar de nuevo
    private static void devolverLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.println("### Devolver Libro ###");
        System.out.println("Seleccione una opción de búsqueda:");
        System.out.println("1. Título");
        System.out.println("2. Autor");
        System.out.println("3. Año de publicación");
        System.out.println("4. Volver al menú principal");
        System.out.print("Ingrese una opción: ");
        
        int opcionBuscar = scanner.nextInt();
        scanner.nextLine(); 

        //Segun la opcion que digite realiza el metodo seleccionado
        switch (opcionBuscar) {
            case 1:
                devolverLibroPorTitulo(biblioteca, scanner);
                break;
            case 2:
                devolverLibroPorAutor(biblioteca, scanner);
                break;
            case 3:
                devolverLibroPorAño(biblioteca, scanner);
                break;
            case 4:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción no válida. Volviendo al menú principal...");
        }
    }

    //Metodo privado para devolver el libro haciendo la busqueda por el titulo
    //Sobrecarga con Año
    private static void devolverLibroPorTitulo(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el título del libro a devolver: ");
        String titulo = scanner.nextLine();
        Libro libro = biblioteca.buscarLibro(titulo);

        procesarDevolucion(biblioteca, libro, scanner);
    }

    //Metodo privado para devolver el libro haciendo la busqueda por el autor
    private static void devolverLibroPorAutor(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el autor del libro a devolver: ");
        String autor = scanner.nextLine();
        Libro libro = biblioteca.buscarLibroPorAutor(autor);

        procesarDevolucion(biblioteca, libro, scanner);
    }

    //Metodo privado para devolver el libro haciendo la busqueda por el titulo
    //Sobrecarga con titulo
    private static void devolverLibroPorAño(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Ingrese el año de publicación del libro a devolver: ");
        int año = scanner.nextInt();
        scanner.nextLine(); 

        Libro libro = biblioteca.buscarLibro(año);

        procesarDevolucion(biblioteca, libro, scanner);
    }

    //Metodo privado para procesar la devolucion segun la identifiacion del usuario que lo pida
    private static void procesarDevolucion(Biblioteca biblioteca, Libro libro, Scanner scanner) {
        if (libro != null) {
            System.out.print("Ingrese la identificación del usuario que devuelve el libro: ");
            String identificacionUsuario = scanner.nextLine();
            Usuario usuario = buscarUsuarioPorIdentificacion(biblioteca, identificacionUsuario);

            if (usuario != null) {
                usuario.devolverLibro(libro);
            } else {
                System.out.println("Usuario no encontrado.");
                System.out.println("Volviendo al menu...");
            }
        } else {
            System.out.println("Libro no encontrado.");
            System.out.println("Volviendo al menu...");
        }
    }

    //Metodo privado para buscar un usuario en especifico 
    private static Usuario buscarUsuarioPorIdentificacion(Biblioteca biblioteca, String identificacion) {
    	// Compara el numerodeIdentificacion ya existente en listaUsuarios con el que se ingreso para hacer el prestamo
        for (Usuario usuario : biblioteca.getListaUsuarios()) {
            if (usuario.getIdentificación().equals(identificacion)) {
                return usuario;
            }
        }
        return null;
    }

    //Metodo privado para mostrar la informacion de toda la biblioteca
    //Lista de Usuarios con todos sus datos y la lista de libros con todos sus datos 
    private static void mostrarInformacionBiblioteca(Biblioteca biblioteca) {
        System.out.println("### Información de la Biblioteca ###");
        System.out.println(biblioteca);
    }
}


