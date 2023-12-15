package ec.edu.ups.biblioteca.mvc.idao;
import java.util.*;

import ec.edu.ups.biblioteca.mvc.modelo.Biblioteca;
import ec.edu.ups.biblioteca.mvc.modelo.Libro;
import ec.edu.ups.biblioteca.mvc.modelo.Prestamo;
import ec.edu.ups.biblioteca.mvc.modelo.Usuario;

public interface IPrestamoDao {
	List<Prestamo> obtenerPedidos();
    Prestamo obtenerPrestamo(int id);
    void crearPrestamo(Prestamo prestamo);
    List<Prestamo> obtenerPrestamoPorFecha(Date fecha);
    boolean actualizarPrestamo(int id, Prestamo pedido);
    boolean eliminarPrestamo(int id);
}
