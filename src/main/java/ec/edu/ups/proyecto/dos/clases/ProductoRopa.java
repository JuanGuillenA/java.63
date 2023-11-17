package ec.edu.ups.proyecto.dos.clases;

// Se relaiza la herencia hacia la clase Producto
public class ProductoRopa extends Producto
{
	// Atributos privados

	protected int codigo;
	private String talla;
	
	//Constructor vacio
	public ProductoRopa()
	{
		
	}
	//Constructor para poder llenar con informacion posteriormente en conjunto con los atributos que se encuentra en la clase Producto

	public ProductoRopa(int codigo,String talla, String seccion, String nombre, String marca, double precio) 
	{
		super(seccion,nombre, marca, precio);
		this.codigo = codigo;
		this.talla = talla;
	}
	
	
	public ProductoRopa(int codigo, String talla) {
		this.codigo = codigo;
		this.talla = talla;
	}
	// Metodo get para poder obtener al objeto
	public int getCodigo() {
		return codigo;
	}
	// Metodo set para darle un valor al objeto
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	// Metodo get para poder obtener al objeto
	public String getTalla() {
		return talla;
	}
	// Metodo set para darle un valor al objeto
	public void setTalla(String talla) {
		this.talla = talla;
	}
	// Metodo toString, para mostrar en forma de cadena la informacion de los atributos de la clase estudiante

	@Override
	public String toString() {
		return super.toString() + "\n" + "Producto Ropa [" + "codigo=" + codigo + "nombre=" +" talla=" + talla +"]"
				+ talla + "]";
	}
}
