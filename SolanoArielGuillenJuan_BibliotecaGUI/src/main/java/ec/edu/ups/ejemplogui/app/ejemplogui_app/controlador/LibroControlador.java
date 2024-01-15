
package ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IBibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.ILibroDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import java.util.List;

public class LibroControlador {
    
    private ILibroDao libroDao;
    private Libro libro;
    private IBibliotecaDao bibliotecaDao;
    private Biblioteca biblioteca;
    
    
    public LibroControlador (ILibroDao libroDao, IBibliotecaDao bibliotecaDao) {
        this.libroDao = libroDao;
        this.bibliotecaDao = bibliotecaDao;
        
    }
    
    public void create (int codigo, String titulo, String autor, int año , boolean disponible) {
        System.out.println("Creando libro con código: " + codigo); // Para depuración

        libro = new Libro (codigo, titulo, autor, año, disponible);
        libroDao.create(libro);
    }
    
    public Libro read (int codigo) {
        libro = libroDao.read(codigo);
        System.out.println("Buscando libro con código: " + codigo); // Para depuración

        return libro;
    }
    
    public void update(int codigo, String titulo, String autor, int año) {
    Libro libroExistente = libroDao.read(codigo);

    if (libroExistente != null) {
        libroExistente.setTitulo(titulo);
        libroExistente.setAutor(autor);
        libroExistente.setAño(año);

        libroDao.update(codigo,libro);
    }
}
    
    public Libro delete (int codigo) {
        if (libroDao.delete(codigo) == true) {
            return libro;
        }
        return null;
    }
    
    public List<Libro> list() {
        return libroDao.list();
    }
    
    public List<Biblioteca> listBiblioteca() {
        return bibliotecaDao.list();
    }
    
    public void addBook (int codigo) {
        for(Biblioteca biblioteca : bibliotecaDao.list())
        {
            if (biblioteca.getCodigo()==codigo)
            {
                bibliotecaDao.createLibro(libro);
            }
        }
    }
}
