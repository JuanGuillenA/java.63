package ec.edu.ups.biblioteca.mvc.vista;
import java.util.*;

import ec.edu.ups.biblioteca.mvc.modelo.Libro;
import ec.edu.ups.biblioteca.mvc.modelo.Prestamo;
import ec.edu.ups.biblioteca.mvc.modelo.Usuario;
import ec.edu.ups.biblioteca.mvc.dao.*;
import ec.edu.ups.biblioteca.mvc.idao.ILibroDao;
import ec.edu.ups.biblioteca.mvc.idao.IPrestamoDao;
import ec.edu.ups.biblioteca.mvc.idao.IUsuarioDao;

public class PrestamoVista {

    private ILibroDao libroDao;
    private IUsuarioDao usuarioDao;
    private IPrestamoDao prestamoDao; // Asegúrate de tener una variable de tipo IPrestamoDao
    private Scanner entrada;

    public PrestamoVista(ILibroDao libroDao, IUsuarioDao usuarioDao, IPrestamoDao prestamoDao) {
        this.libroDao = libroDao;
        this.usuarioDao = usuarioDao;
        this.prestamoDao = prestamoDao;
        this.entrada = new Scanner(System.in);
    }

    public PrestamoVista() {
        entrada = new Scanner(System.in);
    }

    public Prestamo ingresarDatosPedido() {
        System.out.println("*** Ingrese los datos del prestamo ***");
        System.out.println("Ingresa el id del prestamo");
        int id = entrada.nextInt();
        System.out.println("¿Deseas ingresar una nueva fecha? (s/n)");
        String respuesta = entrada.next();
        Date fechaPrestamo;
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Ingresa el dia: ");
            int dia = entrada.nextInt();
            System.out.println("Ingresa el mes: ");
            int mes = entrada.nextInt();
            System.out.println("Ingresa el año: ");
            int anio = entrada.nextInt();
            fechaPrestamo = new Date(anio, (mes - 1), dia);
        } else {
            fechaPrestamo = new Date();
        }

        // Crea una lista vacía de libros
        List<Libro> libros = new ArrayList<>();

        // Crea y configura el objeto Prestamo con ID, fecha y lista de libros
        Prestamo prestamo = new Prestamo(id, fechaPrestamo, libros);

        return prestamo;
    }
    
    public Prestamo actualizarDatosPrestamo(){
        System.out.println("*** Actualizar Prestamo ***");
        System.out.println("Ingresa el id del Prestamo a actualizar");
        int id = entrada.nextInt();
        System.out.println("¿Deseas ingresar una nueva fecha? (s/n)");
        String respuesta = entrada.next();
        Date fechaPrestamo;
        if(respuesta.equalsIgnoreCase("s")){
            System.out.println("Ingresa el dia: ");
            int dia = entrada.nextInt();
            System.out.println("Ingresa el mes: ");
            int mes = entrada.nextInt();
            System.out.println("Ingresa el año: ");
            int anio = entrada.nextInt();
            fechaPrestamo = new Date(anio, (mes-1), dia);            
        }else{
            fechaPrestamo = new Date();
        }
        
        return new Prestamo(id, fechaPrestamo);
    }
    
    public int eliminarDatosPrestamo(){
        System.out.println("*** Eliminar Prestamo ***");
        System.out.println("Ingresa el id del prestamo a eliminar");
        int id = entrada.nextInt();
        return id;
    }
    
    public int buscarDatosPrestamo(){
        System.out.println("*** Buscar Prestamo ***");
        System.out.println("Ingresa el id del prestamo a buscar");
        int id = entrada.nextInt();
        return id;
    }   
    
    public int agregarLibrosAPrestamos(){
        System.out.println("*** Agregar Productos al Prestamo ***");
        System.out.println("Ingresa número de libros a agregar");
        int id = entrada.nextInt();
        return id;
    }        
    
    public void mostrarInformacionPrestamo(Prestamo prestamo){
        System.out.println(prestamo.toString());
    }
    
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
}