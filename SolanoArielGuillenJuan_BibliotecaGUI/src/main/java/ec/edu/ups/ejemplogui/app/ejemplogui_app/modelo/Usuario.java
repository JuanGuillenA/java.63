/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo;

import java.util.ArrayList;

/**
 *
 * @author juanguillenalbarracin
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String identificacion;
    private String telefono;
    private String nombreUsuario;
    private String correo;
    private ArrayList<Prestamo> prestamos;
    
    // Constructor super, debido a la herencia entre Usuario y persona 
    public Usuario(String identificacion,String nombre, String apellido,String telefono, String nombreUsuario, String correo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.prestamos = new ArrayList<>();
    }

	// Getters y setters de los atributos 
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
	this.nombreUsuario = nombreUsuario;
    }
	

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

        
    // Codigo para realizar la composicion y agregar el prestamo a la listaPrestamos
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
    
    
    
}

