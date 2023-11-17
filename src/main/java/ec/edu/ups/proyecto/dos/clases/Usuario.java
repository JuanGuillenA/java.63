package ec.edu.ups.proyecto.dos.clases;

import java.util.ArrayList;
import java.util.List;

public class Usuario 
{
	//Atributos privados
	private String nombre;
	private String apellido;
	private String nombreUsuario;
	private String contrasena;
	private String correoElectronico;
	//Asociación entre usuario y pedido 
	private Pedido unPedido;
	//Agregacion entre usuario y carrito 
	private List<Carrito> carritos;
	//Agregacion entre usuario y pedido
	private List<Pedido> pedidos;

	//Constructor solo con el ArrayList de la agregacion
	public Usuario() {
		this.carritos = new ArrayList<>();
		this.pedidos = new ArrayList<>();
	}
	//Constructor para poder llenar con informacion posteriormente en conjunto con los atributos que estan en la clase Carrito

	public Usuario(String nombre, String apellido, String nombreUsuario, String contrasena, Pedido unPedido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.unPedido = unPedido;
		
	}
	public Usuario(String nombre, String apellido, String nombreUsuario, String contrasena) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
	}
	
	
	public Usuario(String nombre, String apellido, String nombreUsuario, String contrasena, String correoElectronico) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.correoElectronico = correoElectronico;
		this.carritos = new ArrayList<>();
		this.pedidos = new ArrayList<>();
		
	}
	
	// Metodo get para poder leer al objeto

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// Metodo get para poder obtener al objeto
	public String getApellido() {
		return apellido;
	}
	// Metodo set para darle un valor al objeto
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	// Metodo get para poder obtener al objeto
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	// Metodo set para darle un valor al objeto

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	// Metodo get para poder obtener al objeto

	public String getContrasena() {
		return contrasena;
	}
	// Metodo set para darle un valor al objeto

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	// Metodo get para poder leer al objeto

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Pedido getUnPedido() {
		return unPedido;
	}
	// Metodo set para darle un valor al objeto

	public void setUnPedido(Pedido unPedido) {
		this.unPedido = unPedido;
	}
	//Para poder hacer la agregacion
	public void agregarCarrito(Carrito car) {
		carritos.add(car);
	}
	//Agregacion
	public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
	public List<Pedido> getPedidos() {
        return pedidos;
	}

	// Metodo toString, para mostrar en forma de cadena la informacion de los atributos de la clase estudiante
	@Override
	public String toString() {
	    return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", nombreUsuario=" + nombreUsuario
	            + ", contrasena=" + contrasena + ", unPedido=" + unPedido + ", carritos=" + carritos + ", pedidos="
	            + pedidos + "]";
	}
}
