
package ec.edu.ups.ejemplogui.app.ejemplogui_app.dao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IPrestamoDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Prestamo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public class PrestamoDao implements IPrestamoDao {
    private List<Prestamo> prestamos;
    
    public PrestamoDao () {
        prestamos = new ArrayList<>();
    }

    @Override
    public void create(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    @Override
    public Prestamo read (int codigo) {
        for (Prestamo prestamo : prestamos) {
            if(prestamo.getCodigo() == codigo) {
                return prestamo;
            }
        }
        return null;
    }

    @Override
    public boolean update (int codigo, Prestamo prestamo) {
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo prestamoEncontrado = prestamos.get(i);
            if(prestamoEncontrado.getCodigo() == codigo) {
                prestamos.set(i, prestamo);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete (int codigo) {
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo prestamoEncontrado = prestamos.get(i);
            if(prestamoEncontrado.getCodigo() == codigo) {
                prestamos.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Prestamo> list() {
        return prestamos;
    }  
}


