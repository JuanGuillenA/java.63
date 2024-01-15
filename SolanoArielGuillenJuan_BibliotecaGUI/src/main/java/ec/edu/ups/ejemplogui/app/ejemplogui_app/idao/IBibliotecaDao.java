
package ec.edu.ups.ejemplogui.app.ejemplogui_app.idao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import java.util.List;

public interface IBibliotecaDao {
    List<Biblioteca> list();   
    Biblioteca read(int codigo);   
    void createBiblioteca(Biblioteca biblioteca);
    boolean update(int codigo, Biblioteca biblioteca);
    boolean delete(int codigo);
    void createLibro(Libro libro);
    List<Libro>listLibros();
    
}
