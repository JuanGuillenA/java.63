package ec.edu.ups.proyecto.dos.clases;

//Se relaiza la herencia hacia la clase Producto
public class ProductoFerreteria extends Producto
{
	// Atributos privados
	protected int codigo;
	
	//Constructor vacio
	public ProductoFerreteria() {
		
	}
	//Constructor para poder llenar con informacion posteriormente en conjunto con los atributos que se encuentra en la clase Producto
	public ProductoFerreteria(int codigo, String seccion, String nombre, String marca, double precio) {
		super( seccion,nombre, marca, precio);
		this.codigo = codigo;
	}
	
	//Constructor solo para la clase actual
	public ProductoFerreteria(int codigo) {
		this.codigo = codigo;
	}

	// Metodo get para poder obtener al objeto
	public int getCodigo() {
		return codigo;
	}
	// Metodo set para darle un valor al objeto
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	// Metodo toString, para mostrar en forma de cadena la informacion de los atributos de la clase estudiante

	@Override
	public String toString() {
		return super.toString() + "\n" + "Producto Ferreteria[" + "codigo=" + codigo + "]";
	}
}
