package ec.edu.ups.biblioteca.mvc.dao;

import java.util.*;
import ec.edu.ups.biblioteca.mvc.idao.IBibliotecaDao;
import ec.edu.ups.biblioteca.mvc.modelo.Biblioteca;
import ec.edu.ups.biblioteca.mvc.modelo.Libro;
import ec.edu.ups.biblioteca.mvc.modelo.Prestamo;
import ec.edu.ups.biblioteca.mvc.modelo.Usuario;

public class BibliotecaDao implements IBibliotecaDao {

	private List<Biblioteca> bibliotecas;

    public BibliotecaDao() {
        this.bibliotecas = new ArrayList<>();
    }

    @Override
    public void crearBiblioteca(Biblioteca biblioteca) {
        bibliotecas.add(biblioteca);
    }

    @Override
    public Biblioteca obtenerBiblioteca(String nombre) {
        for (Biblioteca biblioteca : bibliotecas) {
            if (biblioteca.getNombre().equals(nombre)) {
                return biblioteca;
            }
        }
        return null;
    }

    @Override
    public List<Biblioteca> obtenerBibliotecas() {
        return new ArrayList<>(bibliotecas);
    }

    @Override
    public void actualizarBiblioteca(Biblioteca biblioteca) {
        for (int i = 0; i < bibliotecas.size(); i++) {
            if (bibliotecas.get(i).getNombre().equals(biblioteca.getNombre())) {
                bibliotecas.set(i, biblioteca);
                break;
            }
        }
    }

    @Override
    public void eliminarBiblioteca(String nombre) {
        Biblioteca bibliotecaAEliminar = null;

        for (Biblioteca biblioteca : bibliotecas) {
            if (biblioteca.getNombre().equals(nombre)) {
                bibliotecaAEliminar = biblioteca;
                break;
            }
        }

        if (bibliotecaAEliminar != null) {
            bibliotecas.remove(bibliotecaAEliminar);
        }
    }
}
