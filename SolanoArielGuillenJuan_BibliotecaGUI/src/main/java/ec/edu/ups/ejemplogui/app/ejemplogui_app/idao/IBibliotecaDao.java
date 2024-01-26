
package ec.edu.ups.ejemplogui.app.ejemplogui_app.idao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import java.io.IOException;
import java.util.List;

public interface IBibliotecaDao {
    List<Biblioteca> list() throws IOException;
    Biblioteca read(int codigo) throws IOException;
    void createBiblioteca(Biblioteca biblioteca) throws IOException;
    boolean update(int codigo, Biblioteca biblioteca) throws IOException;
    boolean delete(int codigo) throws IOException;

}
