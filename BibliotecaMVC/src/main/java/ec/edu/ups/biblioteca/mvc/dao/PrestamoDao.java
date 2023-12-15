package ec.edu.ups.biblioteca.mvc.dao;
import ec.edu.ups.biblioteca.mvc.modelo.*;
import ec.edu.ups.biblioteca.mvc.idao.*;
import ec.edu.ups.biblioteca.mvc.dao.*;
import java.util.*;

public class PrestamoDao implements IPrestamoDao {
	
	private List<Prestamo> prestamos;
    private ILibroDao libroDao;
    private IUsuarioDao usuarioDao;

    public PrestamoDao(ILibroDao libroDao, IUsuarioDao usuarioDao) {
        this.prestamos = new ArrayList<>();
        this.libroDao = libroDao;
        this.usuarioDao = usuarioDao;
    }

    public PrestamoDao() {
	}

    @Override
    public List<Prestamo> obtenerPedidos() {
        return prestamos;
    }


    @Override
    public Prestamo obtenerPrestamo(int id) {        
        for (Prestamo prestamo : prestamos) {
            if(prestamo.getId() ==  id){
                return prestamo;
            }
        }
        return null;
    }

    @Override
    public void crearPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    @Override
    public boolean actualizarPrestamo(int id, Prestamo prestamo) {
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo pedidoEncontrado = prestamos.get(i);
            if(pedidoEncontrado.getId() == id){
                prestamos.set(i, prestamo);
                return true;
            }            
        }
        return false;
    }

    @Override
    public boolean eliminarPrestamo(int id) {
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo pedidoEncontrado = prestamos.get(i);
            if(pedidoEncontrado.getId() == id){
                prestamos.remove(i);
                return true;
            }            
        }
        return false;
    }

	@Override
	public List<Prestamo> obtenerPrestamoPorFecha(Date fecha) {
	        List<Prestamo> prestamoEncontrados = new ArrayList<>();
	        for (Prestamo prestamo : prestamos) {
	            if(prestamo.getFechaPrestamo().equals(fecha)){
	                prestamoEncontrados.add(prestamo);
	            }
	        }
	        return prestamoEncontrados;
	    }
}
