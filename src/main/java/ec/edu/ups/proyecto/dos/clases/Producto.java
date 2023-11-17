package ec.edu.ups.proyecto.dos.clases;

public class Producto 
{
	// Atributo privado
	private String seccion;
	private String nombre;
	private String marca;
	private double precio;
	//Constructor vacio
	public Producto() {
		
	}
	// Constructor para poder llenar con informacion posteriormente
	public Producto(String seccion, String nombre, String marca, double precio) {
		this.seccion = seccion;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}
	// Metodo get para poder obtener al objeto
	public String getSeccion() {
		return seccion;
	}
	// Metodo set para darle un valor al objeto
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	// Metodo get para poder obtener al objeto
	public String getNombre() {
		return nombre;
	}

	// Metodo set para darle un valor al objeto
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Metodo get para poder obtener al objeto
	public String getMarca() {
		return marca;
	}

	// Metodo set para darle un valor al objeto
	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Metodo get para poder obtener al objeto
	public double getPrecio() {
		return precio;
	}

	// Metodo set para darle un valor al objeto
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Metodo toString, para mostrar en forma de cadena la informacion de los atributos de la clase estudiante
	@Override
	public String toString() {
		return "Producto [seccion=" + seccion + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + "]";
	}

	
	
	
	
	
	
	
	

}
