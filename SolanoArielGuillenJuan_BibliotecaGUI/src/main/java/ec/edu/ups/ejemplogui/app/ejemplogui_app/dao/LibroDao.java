/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.dao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.ILibroDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class LibroDao implements ILibroDao {
    
    private final String directorio = "/Users/juanguillenalbarracin/PRUEBAS/";
    private final String librosArchivo = directorio + "libros.dat";
    
    public LibroDao () {
        new File(directorio).mkdirs();

    }

   @Override
public void create(Libro libro) throws IOException {
    RandomAccessFile random = new RandomAccessFile(librosArchivo, "rw");

    // Busca si el libro ya existe
    while(random.getFilePointer() < random.length()) {
        int codigoExistente = random.readInt();
        if(codigoExistente == libro.getCodigo()) {
            random.close();
            throw new IOException("Un libro con el código " + libro.getCodigo() + " ya existe.");
        }
        random.skipBytes(45); 
    }

    // Posiciona el puntero al final del archivo y escribe el libro
    random.seek(random.length()); 
    escribirLibro(random, libro);
    random.close();
}
    @Override
    public Libro read(int codigo) throws IOException {
        RandomAccessFile random = new RandomAccessFile(librosArchivo, "r");
        while(random.getFilePointer() < random.length()) {
            long posicionInicio = random.getFilePointer();
            int codigoActual = random.readInt();
            if(codigoActual == codigo) {
                Libro libro = leerLibro(random,codigoActual);
                random.close();
                return libro;
            } else {
                random.skipBytes(45); 
            }
        }
        random.close();
        return null;
    }

    @Override
    public boolean update(int codigo, Libro libroNuevo) throws IOException {
        RandomAccessFile random = new RandomAccessFile(librosArchivo, "rw");
        while(random.getFilePointer() < random.length()) {
            long posicionInicio = random.getFilePointer();
            int codigoActual = random.readInt();
            if(codigoActual == codigo) {
                random.seek(posicionInicio); // Vuelve al inicio del registro.
                escribirLibro(random, libroNuevo);
                random.close();
                return true;
            } else {
                random.seek(posicionInicio + 49); 
            }
        }
        random.close();
        return false;
    }

    @Override
    public boolean delete(int codigo) throws IOException {
        RandomAccessFile random = new RandomAccessFile(librosArchivo, "rw");
        while(random.getFilePointer() < random.length()) {
            long posicionInicio = random.getFilePointer();
            int codigoActual = random.readInt();
            if(codigoActual == codigo) {
                random.seek(posicionInicio);
                random.writeInt(-1); 
                random.close();
                return true;
            } else {
                random.seek(posicionInicio + 49); 
            }
        }
        random.close();
        return false;
    }

   @Override
    public List<Libro> list() throws IOException {
        List<Libro> bibliotecas = new ArrayList<>();
        RandomAccessFile random = new RandomAccessFile(librosArchivo, "r");
        while(random.getFilePointer() < random.length()) {
            int codigoLibro = random.readInt();
            if(codigoLibro != -1) { 
                Libro libro = leerLibro(random,codigoLibro);
                bibliotecas.add(libro);
            } else {
                random.skipBytes(45); 
            }
        }
        random.close();
        return bibliotecas;
    }
    
    private void escribirLibro(RandomAccessFile random, Libro libro) throws IOException {
        random.writeInt(libro.getCodigo());
        writeFixedString(random, libro.getTitulo(), 20);
        writeFixedString(random, libro.getAutor(), 20);
        writeFixedString(random, libro.getAño(), 4);
        random.writeBoolean(libro.isDisponible());

    }

    private Libro leerLibro(RandomAccessFile random, int codigo) throws IOException {
    String titulo = readFixedString(random, 20);
    String autor = readFixedString(random, 20);
    String año = readFixedString(random, 4);
    boolean disponible = random.readBoolean();

    return new Libro(codigo, titulo, autor, año, disponible);
}

    private void writeFixedString(RandomAccessFile random, String string, int length) throws IOException {
    StringBuffer buffer = null;
    if (string != null) {
        buffer = new StringBuffer(string);
    } else {
        buffer = new StringBuffer(length);
    }
    buffer.setLength(length);
    random.writeBytes(buffer.toString());
}

    private String readFixedString(RandomAccessFile random, int length) throws IOException {
        byte[] bytes = new byte[length];
        random.readFully(bytes);
        return new String(bytes).trim();
    }
    
    
}
