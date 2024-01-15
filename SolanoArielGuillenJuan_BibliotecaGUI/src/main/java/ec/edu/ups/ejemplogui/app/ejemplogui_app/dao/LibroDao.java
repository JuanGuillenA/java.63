/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.dao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.ILibroDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

public class LibroDao implements ILibroDao {
    
    private List<Libro> libros;
    
    public LibroDao () {
        libros = new ArrayList<>();
    }

    @Override
    public void create(Libro libro) {
        libros.add(libro);
        System.out.println("Libro creado: " + libro); // Agregar esta línea para depuración

    }

    @Override
    public Libro read (int codigo) {
        for (Libro libro : libros) {
            System.out.println("Buscando libro con código: " + codigo + ". Libro actual: " + libro.getCodigo()); // Agregar esta línea para depuración
            if(libro.getCodigo() == codigo) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public boolean update (int codigo, Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libroEncontrado = libros.get(i);
            if(libroEncontrado.getCodigo() == codigo) {
                libros.set(i, libro);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete (int codigo) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libroEncontrado = libros.get(i);
            if(libroEncontrado.getCodigo() == codigo) {
                libros.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Libro> list() {
        return libros;
    }
    
    
}
