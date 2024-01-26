package ec.edu.ups.ejemplogui.app.ejemplogui_app.dao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IBibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaDao implements IBibliotecaDao {
    private final String directorio = "/Users/juanguillenalbarracin/PRUEBAS/";
    private final String bibliotecasArchivo = directorio + "bibliotecas.dat";

    public BibliotecaDao() {
        new File(directorio).mkdirs();
    }

    @Override
    public void createBiblioteca(Biblioteca biblioteca) throws IOException {
        RandomAccessFile random = new RandomAccessFile(bibliotecasArchivo, "rw");
        
        while(random.getFilePointer() < random.length()) {
            int codigoExistente = random.readInt();
            if(codigoExistente == biblioteca.getCodigo()) {
                random.close();
                throw new IOException("Una biblioteca con el código " + biblioteca.getCodigo() + " ya existe.");
            }
            random.skipBytes(80); 
        }
        
        random.seek(random.length()); 
        escribirBiblioteca(random, biblioteca);
        random.close();
    }

    @Override
    public Biblioteca read(int codigo) throws IOException {
        RandomAccessFile random = new RandomAccessFile(bibliotecasArchivo, "r");
        while(random.getFilePointer() < random.length()) {
            long posicionInicio = random.getFilePointer();
            int codigoActual = random.readInt();
            if(codigoActual == codigo) {
                Biblioteca biblioteca = leerBiblioteca(random,codigoActual);
                random.close();
                return biblioteca;
            } else {
                random.skipBytes(80); 
            }
        }
        random.close();
        return null;
    }

    @Override
    public boolean update(int codigo, Biblioteca bibliotecaNueva) throws IOException {
        RandomAccessFile random = new RandomAccessFile(bibliotecasArchivo, "rw");
        while(random.getFilePointer() < random.length()) {
            long posicionInicio = random.getFilePointer();
            int codigoActual = random.readInt();
            if(codigoActual == codigo) {
                random.seek(posicionInicio); 
                escribirBiblioteca(random, bibliotecaNueva);
                random.close();
                return true;
            } else {
                random.seek(posicionInicio + 84); 
            }
        }
        random.close();
        return false;
    }

    @Override
    public boolean delete(int codigo) throws IOException {
        RandomAccessFile random = new RandomAccessFile(bibliotecasArchivo, "rw");
        while(random.getFilePointer() < random.length()) {
            long posicionInicio = random.getFilePointer();
            int codigoActual = random.readInt();
            if(codigoActual == codigo) {
                random.seek(posicionInicio);
                random.writeInt(-1); 
                random.close();
                return true;
            } else {
                random.seek(posicionInicio + 84); // Salta al próximo registro.
            }
        }
        random.close();
        return false;
    }

   @Override
    public List<Biblioteca> list() throws IOException {
        List<Biblioteca> bibliotecas = new ArrayList<>();
        RandomAccessFile random = new RandomAccessFile(bibliotecasArchivo, "r");
        while(random.getFilePointer() < random.length()) {
            int codigoBiblioteca = random.readInt();
            if(codigoBiblioteca != -1) { 
                Biblioteca biblioteca = leerBiblioteca(random,codigoBiblioteca);
                bibliotecas.add(biblioteca);
            } else {
                random.skipBytes(80); 
            }
        }
        random.close();
        return bibliotecas;
    }

    private void escribirBiblioteca(RandomAccessFile random, Biblioteca biblioteca) throws IOException {
    random.writeInt(biblioteca.getCodigo()); 
    writeFixedString(random, biblioteca.getNombre(), 20); // 20 bytes para el nombre
    writeFixedString(random, biblioteca.getDireccion(), 20); // 20 bytes para la dirección
    writeFixedString(random, biblioteca.getTelefono(), 20); // 20 bytes para el teléfono
    
    for (int i = 0; i < 5; i++) {
        random.writeInt(0); 
    }
}

    private Biblioteca leerBiblioteca(RandomAccessFile random, int codigo) throws IOException {
    String nombre = readFixedString(random, 20);
    String direccion = readFixedString(random, 20);
    String telefono = readFixedString(random, 20);
    
    int[] codigosLibros = new int[5];
    for (int i = 0; i < 5; i++) {
        codigosLibros[i] = random.readInt(); 
    }

    Biblioteca biblioteca = new Biblioteca(codigo, nombre, direccion, telefono);
    biblioteca.setCodigosLibros(codigosLibros); // Asigna los códigos de libros leídos a la biblioteca

    return biblioteca;
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