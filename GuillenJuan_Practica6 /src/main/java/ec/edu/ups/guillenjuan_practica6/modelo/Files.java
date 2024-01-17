/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.guillenjuan_practica6.modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author juanguillenalbarracin
 */
public class Files {
    
    private String ruta;

    public Files() {
        this.ruta = "";
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    

    public boolean createDirectorioYArchivo(String nombreArchivo) {
        try {
        // Obtener el nombre del directorio mediante JOptionPane
        String nombreDirectorio = JOptionPane.showInputDialog("Ingrese el directorio:");
        if (nombreDirectorio == null || nombreDirectorio.trim().isEmpty()) {
            System.out.println("No se proporcionó un directorio válido.");
            return false;
        }

        // Crear la ruta del directorio
        File directorio = new File(nombreDirectorio);

        // Crear el directorio si no existe
        if (!directorio.exists()) {
            directorio.mkdir();
        }else{
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
    
    
    public List<String> listDirectorios() {
        List<String> listaElementos = new ArrayList<>();
        File Raiz = new File(ruta);

        // Verificar si la ruta existe y es un directorio
        if (Raiz.exists() && Raiz.isDirectory()) {
            File[] archivos = Raiz.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                     if (!archivo.isHidden()) {
                    listaElementos.add(archivo.getAbsolutePath());

                }
            }
            
        } else {
            System.out.println("La ruta proporcionada no es un directorio o no existe");
        }
    }
        return listaElementos;

    }
        
    
    public boolean delete() {
        File archivoDelete = new File(ruta);
        if (archivoDelete.exists()) {
            return archivoDelete.delete();
        } else {
            System.out.println("El archivo o directorio no existe.");
            return false;
        }
    }
    
    
    public boolean rename( String ruta, String nombreNuevo){
         if (ruta == null || ruta.trim().isEmpty() || nombreNuevo == null || nombreNuevo.trim().isEmpty()) {
            System.out.println("Debe proporcionar nombres válidos.");
            return false;
        }

        File archivoActual = new File(ruta);
        File archivoNuevo = new File(archivoActual.getParent(), nombreNuevo);

        if (archivoActual.renameTo(archivoNuevo)) {
            System.out.println("Directorio renombrado exitosamente a " + nombreNuevo);
            return true;
        } else {
            System.out.println("Error al renombrar el directorio.");
            return false;
        }
    }
    
    public List<String> listArchivosOcultos() {
        List<String> listaElementos = new ArrayList<>();
        File Raiz = new File(ruta);

        // Verificar si la ruta existe y es un directorio
        if (Raiz.exists() && Raiz.isDirectory()) {
            File[] archivos = Raiz.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                     if (archivo.isHidden()) {
                    listaElementos.add(archivo.getName());

                }
            }
            
        } else {
            System.out.println("La ruta proporcionada no es un directorio o no existe");
        }
    }
        return listaElementos;

    }
    
    public List<String> listDirectoriosOcultos(){
        List<String> listaElementos = new ArrayList<>();
        File Raiz = new File(ruta);

        // Verificar si la ruta existe y es un directorio
        if (Raiz.exists() && Raiz.isDirectory()) {
            File[] archivos = Raiz.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                     if (archivo.isHidden()) {
                    listaElementos.add(archivo.getAbsolutePath());

                }
            }
            
        } else {
            System.out.println("La ruta proporcionada no es un directorio o no existe");
        }
    }
        return listaElementos;

    }

}
    
  
