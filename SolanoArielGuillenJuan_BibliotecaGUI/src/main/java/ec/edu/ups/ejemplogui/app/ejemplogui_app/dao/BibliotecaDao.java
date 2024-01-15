/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.dao;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IBibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import java.util.ArrayList;
import java.util.List;


public class BibliotecaDao implements IBibliotecaDao {
    
    private List<Biblioteca> bibliotecas;
    private List<Libro> libros;
    
    public BibliotecaDao() {
        bibliotecas = new ArrayList<>();
        libros = new ArrayList<>();
    }
    @Override
    public void createBiblioteca(Biblioteca biblioteca) {
        bibliotecas.add(biblioteca);
    }

    @Override
    public Biblioteca read(int codigo) {
        for (Biblioteca biblioteca : bibliotecas) {
            if(biblioteca.getCodigo() == codigo) {
                return biblioteca;
            }
        }
        return null;
    }
    
    public boolean update(int codigo, Biblioteca biblioteca) {
        for (int i = 0; i < bibliotecas.size(); i++) {
            Biblioteca bibliotecaEncontrada = bibliotecas.get(i);
            if(bibliotecaEncontrada.getCodigo() == codigo) {
                bibliotecas.set(i, biblioteca);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int codigo) {
        for (int i = 0; i < bibliotecas.size(); i++) {
            Biblioteca bibliotecaEncontrada = bibliotecas.get(i);
            if(bibliotecaEncontrada.getCodigo()==codigo){
                bibliotecas.remove(i);
                return true;
            }            
        }
        return false;
    }    

    @Override
    public List<Biblioteca> list() {
        return bibliotecas;
    }

    @Override
    public void createLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public List<Libro> listLibros() {
        return libros;
    }
    
   
}

