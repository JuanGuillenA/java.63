/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.guillenjuan_practica6.controlador;

import ec.edu.ups.guillenjuan_practica6.modelo.Files;
import ec.edu.ups.guillenjuan_practica6.vista.VentanaPrincipal;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author juanguillenalbarracin
 */
public class FilesControlador {
    
    private Files modelo;

    public FilesControlador(Files modelo) {
        this.modelo = modelo;
    }

    public boolean crearDirectorioYArchivo(String nombreArchivo) {
        // Verificar si la ruta no está vacía
        try {
            // Obtener el nombre del directorio mediante JOptionPane
            String nDirectorio = JOptionPane.showInputDialog("Ingrese el directorio:");
            if (nDirectorio == null || nDirectorio.trim().isEmpty()) {
                System.out.println("No se proporcionó un directorio válido.");
                return false;
            }

            // Crear la ruta del directorio
            File directorio = new File(nDirectorio);

            // Crear el directorio si no existe
            if (!directorio.exists()) {
                directorio.mkdir();
            } else {
                System.out.println("El directorio ya existe.");
                return false;
            }

            // Ruta del archivo
            File archivo = new File(directorio, nombreArchivo);

            // Crear el archivo y comprobar si se ha creado
            if (!archivo.exists()) {
                archivo.createNewFile();
                System.out.println("El archivo se ha creado.");
                return true; // Devolver true si el archivo fue creado
            } else {
                System.out.println("El archivo ya existe.");
                return false; // Devolver false
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura/escritura");
            return false; // Devolver false si ocurre un error
        }
    }

    public List<String> listarDirectorios(String ruta) {
        // Verificar si la ruta no está vacía
        if (ruta.isEmpty()) {
            System.out.println("Debe ingresar una ruta válida.");
            return null;
        }

        // Establecer la ruta en el modelo
        modelo.setRuta(ruta);

        // Obtener la lista de directorios
        return modelo.listDirectorios();
    }

    public boolean eliminar(String ruta) {
    try {
        if (ruta == null || ruta.trim().isEmpty()) {
            System.out.println("Debe proporcionar una ruta válida.");
            return false;
        }

        File archivoAEliminar = new File(ruta);
            return eliminarArchivo(archivoAEliminar);
    } catch (Exception e) {
        System.err.println("Se produjo un error: " + e.getMessage());
        return false;
        }
    }

    private boolean eliminarArchivo(File archivo) {
        // Si el archivo es un directorio, eliminar su contenido primero
        if (archivo.isDirectory()) {
            File[] archivos = archivo.listFiles();
            if (archivos != null) {
                for (File archivoHijo : archivos) {
                    if (!eliminarArchivo(archivoHijo)) {
                        return false;
                    }
                }
            }
        }

        // Eliminar el archivo o directorio
        return archivo.delete();

    }

    public boolean renombrar(String ruta, String nuevoNombre) {
        return modelo.rename(ruta, nuevoNombre);
    }

    public List<String> listarArchivosOcultos(String ruta) {
        // Verificar si la ruta no está vacía
        if (ruta.isEmpty()) {
            System.out.println("Debe ingresar una ruta válida.");
            return null;
        }

        modelo.setRuta(ruta);

        // Obtener la lista de archivos ocultos
        return modelo.listArchivosOcultos();
    }

    public List<String> listarDirectoriosOcultos(String ruta) {
        // Verificar si la ruta no está vacía
        if (ruta.isEmpty()) {
            System.out.println("Debe ingresar una ruta válida.");
            return null;
        }

        modelo.setRuta(ruta);

        // Obtener la lista de directorios ocultos
        return modelo.listDirectoriosOcultos();
    }


}