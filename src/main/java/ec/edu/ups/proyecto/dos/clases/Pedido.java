package ec.edu.ups.proyecto.dos.clases;
import java.util.*;

public class Pedido 
{
	// Atributos privados
	private int numeroPedido;
	private String direccion;
	private int codigoPostal;
	private int numeroContacto;
	//Permite asociar multiples productos a un pedido
	private List<Producto> productos;
	
	// Constructor vacio
	public Pedido() {
		this.productos = new ArrayList<>();
	}
	
	// Constructor para poder llenar con informacion posteriormente
	public Pedido(int numeroPedido, String direccion, int codigoPostal, int numeroContacto) {
		this.numeroPedido = numeroPedido;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.numeroContacto = numeroContacto;
		this.productos = new ArrayList<>();
	}
	
	// Metodo get para poder leer al objeto
	public int getNumeroPedido() {
		return numeroPedido;
	}
	// Metodo set para darle un valor al objeto
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	// Metodo get para poder leer al objeto
	public String getDireccion() {
		return direccion;
	}
	// Metodo set para darle un valor al objeto
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	// Metodo get para poder leer al objeto
	public int getCodigoPostal() {
		return codigoPostal;
	}
	// Metodo set para darle un valor al objeto
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	// Metodo get para poder leer al objeto
	public int getNumeroContacto() {
		return numeroContacto;
	}
	// Metodo set para darle un valor al objeto
	public void setNumeroContacto(int numeroContacto) {
		this.numeroContacto = numeroContacto;
	}
	 public void setProductos(List<Producto> productos) {
	        this.productos = productos;
	 }
	 public List<Producto> getProductos() {
	        return this.productos; 
	 }
	// Metodo toString, para mostrar en forma de cadena la informacion de los atributos de la clase estudiante
	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal
				+ ", numeroContacto=" + numeroContacto + "]";
	}
}
