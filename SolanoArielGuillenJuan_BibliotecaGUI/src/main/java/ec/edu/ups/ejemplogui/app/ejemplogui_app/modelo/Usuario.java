/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author juanguillenalbarracin
 */
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int MAX_LENGTH = 15; 

    private String nombre;
    private String apellido;
    private String identificacion;
    private String telefono;
    private String nombreUsuario;
    private String correo;
    private ArrayList<Prestamo> prestamos;
    
    public Usuario(String identificacion,String nombre, String apellido,String telefono, String nombreUsuario, String correo) {
        setIdentificacion(identificacion);
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setNombreUsuario(nombreUsuario);
        setCorreo(correo);
        this.prestamos = new ArrayList<>();
    }

    public Usuario(String nombre, String apellido, String telefono, String nombreUsuario, String correo) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setNombreUsuario(nombreUsuario);
        setCorreo(correo);
        this.prestamos = prestamos;
    }
    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = ajustarLongitud(correo);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = ajustarLongitud(nombreUsuario);
    }
	

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = ajustarLongitud(nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = ajustarLongitud(apellido);
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = ajustarLongitud(identificacion);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = ajustarLongitud(telefono);
    }

        
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
    public ArrayList<Prestamo> getListaPrestamos() {
        return prestamos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion + ", telefono=" + telefono + ", nombreUsuario=" + nombreUsuario + ", correo=" + correo  + ", prestamos=" + prestamos + '}';
    }
    
    private String ajustarLongitud(String input) {
        if (input == null) input = ""; 
        if (input.length() > MAX_LENGTH) {
            return input.substring(0, MAX_LENGTH);
        }
        return String.format("%1$-" + MAX_LENGTH + "s", input);
    }
    
}

