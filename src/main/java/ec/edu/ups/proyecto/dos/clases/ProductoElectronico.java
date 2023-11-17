package ec.edu.ups.proyecto.dos.clases;

//Se relaiza la herencia hacia la clase Producto
public class ProductoElectronico extends Producto
{
	
	// Atributos privados
	protected int codigo;
	private String categoria;
	
	
	//Constructor vacio
	public ProductoElectronico() {
	}

	//Constructor para poder llenar con informacion posteriormente en conjunto con los atributos que se encuentra en la clase Producto
	public ProductoElectronico(int codigo, String categoria, String seccion, String nombre, String marca, double precio) {
		super(seccion,nombre, marca, precio);
		this.codigo = codigo;
		this.categoria = categoria;
	}

	//Constructor solo para la clase actual
	public ProductoElectronico(int codigo, String categoria) {
		this.codigo = codigo;
		this.categoria = categoria;
		
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
	public String getCategoria() {
		return categoria;
	}
	// Metodo set para darle un valor al objeto
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	// Metodo toString, para mostrar en forma de cadena la informacion de los atributos de la clase estudiante
	@Override
	public String toString() {
		return super.toString() + "\n" + "Producto Electronico [" + "codigo=" + codigo+ "categoria=" +categoria+ "]";
	}
}
