/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.controlador;

import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IBibliotecaDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.ILibroDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IPrestamoDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.idao.IUsuarioDao;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Biblioteca;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Libro;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Prestamo;
import ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo.Usuario;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author juanguillenalbarracin
 */
public class PrestamoControlador {
    
     private IPrestamoDao prestamoDao;

    public PrestamoControlador(IPrestamoDao prestamoDao) {
        this.prestamoDao = prestamoDao;
    }

    public void createPrestamo(int codigo, Date fechaPrestamo,Date fechaDevolucion,int codigoLibro, String codigoUsuario, int codigoBiblioteca  ) {
         Prestamo prestamo = new Prestamo(codigo, fechaPrestamo, fechaDevolucion, codigoLibro,codigoUsuario,codigoBiblioteca);
    try {
        prestamoDao.create(prestamo);
        JOptionPane.showMessageDialog(null, "Biblioteca guardada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error al Crear", JOptionPane.ERROR_MESSAGE);
    }
    }

    public Prestamo readPrestamo(int codigo) {
        try {
            return prestamoDao.read(codigo);
        } catch (IOException e) {
            System.out.println("Error al leer el prestamo: " + e.getMessage());
            return null;
        }
    }

    public void updatePrestamo(int codigo, Date fechaPrestamo,Date fechaDevolucion,int codigoLibro, String codigoUsuario, int codigoBiblioteca ) {
        try {
            Prestamo libroExistente = prestamoDao.read(codigo);
            if (libroExistente == null) {
                throw new IOException("El libro con el código " + codigo + " no existe.");
            }
            libroExistente.setCodigoBiblioteca(codigoBiblioteca);
            libroExistente.setCodigoLibro(codigoLibro);
            libroExistente.setCodigoUsuario(codigoUsuario);
            libroExistente.setFechaPrestamo(fechaPrestamo);
            libroExistente.setFechaDevolucion(fechaDevolucion);

            prestamoDao.update(codigo, libroExistente);
            JOptionPane.showMessageDialog(null, "Libro actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el libro: " + e.getMessage(), "Error de IO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deletePrestamo(int codigo) {
        try {
            if (prestamoDao.delete(codigo)) {
                System.out.println("Prestamo eliminado exitosamente.");
            } else {
                System.out.println("No se encontró el prestamo con el código proporcionado.");
            }
        } catch (IOException e) {
            System.out.println("Error al eliminar el prestamo: " + e.getMessage());
        }
    }

    public List<Prestamo> listPrestamos() {
        try {
            return prestamoDao.list();
        } catch (IOException e) {
            System.out.println("Error al listar los prestamos: " + e.getMessage());
            return null;
        }
    }
}

