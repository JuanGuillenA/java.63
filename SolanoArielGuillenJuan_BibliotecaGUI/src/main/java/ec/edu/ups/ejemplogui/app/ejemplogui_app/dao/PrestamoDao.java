
package ec.edu.ups.ejemplogui.app.ejemplogui_app.dao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IBibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.ILibroDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IPrestamoDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IUsuarioDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Prestamo;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public class PrestamoDao implements IPrestamoDao {
    private final String directorio = "/Users/juanguillenalbarracin/PRUEBAS/";
    private final String prestamosArchivo = directorio + "prestamos.dat";

    public PrestamoDao() {
        new File(directorio).mkdirs();
    }

    @Override
    public void create(Prestamo prestamo) throws IOException {
        RandomAccessFile random = new RandomAccessFile(prestamosArchivo, "rw");

        // Buscar si el préstamo ya existe
        while (random.getFilePointer() < random.length()) {
            int codigoExistente = random.readInt();
            if (codigoExistente == prestamo.getCodigo()) {
                random.close();
                throw new IOException("Un préstamo con el código " + prestamo.getCodigo() + " ya existe.");
            }
            random.skipBytes(39); // Ajustar según el tamaño total de registro de préstamo
        }
        

        // Posiciona el puntero al final del archivo y escribe el préstamo
        random.seek(random.length());
        escribirPrestamo(random, prestamo);
        random.close();
    }

    @Override
    public Prestamo read(int codigo) throws IOException {
        RandomAccessFile random = new RandomAccessFile(prestamosArchivo, "r");
        while (random.getFilePointer() < random.length()) {
            long posicionInicio = random.getFilePointer();
            int codigoActual = random.readInt();
            if (codigoActual == codigo) {
                Prestamo prestamo = leerPrestamo(random,codigoActual);
                random.close();
                return prestamo;
            } else {
                random.skipBytes(35); 
            }
        }
        random.close();
        return null;
    }

    @Override
    public boolean update(int codigo, Prestamo prestamoNuevo) throws IOException {
        RandomAccessFile random = new RandomAccessFile(prestamosArchivo, "rw");
        while (random.getFilePointer() < random.length()) {
            long posicionInicio = random.getFilePointer();
            int codigoActual = random.readInt();
            if (codigoActual == codigo) {
                random.seek(posicionInicio); // Vuelve al inicio del registro
                escribirPrestamo(random, prestamoNuevo);
                random.close();
                return true;
            } else {
                random.seek(posicionInicio + 39); 
            }
        }
        random.close();
        return false;
    }

    @Override
    public boolean delete(int codigo) throws IOException {
        RandomAccessFile random = new RandomAccessFile(prestamosArchivo, "rw");
        while (random.getFilePointer() < random.length()) {
            long posicionInicio = random.getFilePointer();
            int codigoActual = random.readInt();
            if (codigoActual == codigo) {
                random.seek(posicionInicio);
                random.writeInt(-1); // Marcar el préstamo como eliminado
                random.close();
                return true;
            } else {
                random.seek(posicionInicio + 39); 
            }
        }
        random.close();
        return false;
    }

    @Override
    public List<Prestamo> list() throws IOException {
        List<Prestamo> prestamos = new ArrayList<>();
        RandomAccessFile random = new RandomAccessFile(prestamosArchivo, "r");
        while(random.getFilePointer() < random.length()) {
            int codigoLibro = random.readInt();
            if(codigoLibro != -1) { 
                Prestamo prestamo = leerPrestamo(random,codigoLibro);
                prestamos.add(prestamo);
            } else {
                random.skipBytes(35); 
            }
        }
        random.close();
        return prestamos;
    }


    private void escribirPrestamo(RandomAccessFile random, Prestamo prestamo) throws IOException {
    random.writeInt(prestamo.getCodigo()); // Escribe el código del préstamo (4 bytes)
    random.writeLong(prestamo.getFechaPrestamo().getTime()); // Escribe la fecha de préstamo (8 bytes)
    random.writeLong(prestamo.getFechaDevolucion().getTime()); // Escribe la fecha de devolución (8 bytes)
    random.writeInt(prestamo.getCodigoBiblioteca()); // Escribe el código de la biblioteca (4 bytes)

    // Escribe el código de usuario. Asegúrate de que la cadena tenga exactamente 10 bytes
    String codigoUsuario = prestamo.getCodigoUsuario();
    if (codigoUsuario == null) codigoUsuario = "";
    codigoUsuario = String.format("%1$-10s", codigoUsuario);
    random.writeBytes(codigoUsuario); // Escribe el código de usuario ajustado a 10 bytes

    random.writeInt(prestamo.getCodigoLibro()); // Escribe el código del libro (4 bytes)
    random.writeBoolean(prestamo.isDisponible()); // Escribe la disponibilidad (1 byte)
}
    private Prestamo leerPrestamo(RandomAccessFile random, int codigo) throws IOException {
    Date fechaPrestamo = new Date(random.readLong()); // Lee la fecha de préstamo
    Date fechaDevolucion = new Date(random.readLong()); // Lee la fecha de devolución
    int codigoBiblioteca = random.readInt(); // Lee el código de la biblioteca

    // Lee el código de usuario ajustado a 10 bytes
    byte[] codigoUsuarioBytes = new byte[10];
    random.readFully(codigoUsuarioBytes);
    String codigoUsuario = new String(codigoUsuarioBytes).trim();

    int codigoLibro = random.readInt(); // Lee el código del libro
    boolean disponible = random.readBoolean(); // Lee la disponibilidad

    // Construye y retorna el objeto Prestamo con los datos leídos
    Prestamo prestamo = new Prestamo();
    prestamo.setCodigo(codigo);
    prestamo.setFechaPrestamo(fechaPrestamo);
    prestamo.setFechaDevolucion(fechaDevolucion);
    prestamo.setCodigoBiblioteca(codigoBiblioteca);
    prestamo.setCodigoUsuario(codigoUsuario);
    prestamo.setCodigoLibro(codigoLibro);
    prestamo.setDisponible(disponible);

    return prestamo;
}

    private void writeFixedString(RandomAccessFile random, String string, int length) throws IOException {
        if (string.length() > length) {
            string = string.substring(0, length);
        } else {
            while (string.length() < length) {
                string += " "; 
            }
        }
        random.writeBytes(string);
    }

    private String readFixedString(RandomAccessFile random, int length) throws IOException {
        byte[] bytes = new byte[length];
        random.readFully(bytes);
        return new String(bytes).trim();
    }
    
}