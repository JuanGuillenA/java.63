package ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IBibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import java.util.List;
import javax.swing.JOptionPane;


public class BibliotecaControlador {
    
    private IBibliotecaDao bibliotecaDao;
    private Biblioteca biblioteca;
    
    public BibliotecaControlador (IBibliotecaDao bibliotecaDao) {
        this.bibliotecaDao = bibliotecaDao;
    }
    
    public void create (int codigo, String nombre, String direccion, String telefono) {
        biblioteca = new Biblioteca (codigo, nombre, direccion, telefono);
        bibliotecaDao.createBiblioteca(biblioteca);
    }
    
    public Biblioteca read (int codigo) {
        biblioteca = bibliotecaDao.read(codigo);
        return biblioteca;
    }
    
    public void update(int codigo, String nombre, String direccion, String telefono) {
        Biblioteca bibliotecaExistente = bibliotecaDao.read(codigo);

        if (bibliotecaExistente != null) {
            bibliotecaExistente.setNombre(nombre);
            bibliotecaExistente.setDireccion(direccion);
            bibliotecaExistente.setTelefono(telefono);

            bibliotecaDao.update(codigo, biblioteca);
        }
    }
    
    public Biblioteca delete (int codigo) {
        
        if (bibliotecaDao.delete(codigo) == true) {
            return biblioteca;
        }
        return null;
    }
    
    public List<Biblioteca> list() {
        return bibliotecaDao.list();
    }
    

}
