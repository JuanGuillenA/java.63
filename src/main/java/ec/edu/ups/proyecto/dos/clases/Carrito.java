package ec.edu.ups.proyecto.dos.clases;
import java.util.List;
import java.util.ArrayList;


public class Carrito 
{
	// Atributo privado
	private double precioFinal;
	// Composicion entre Carrito y Producto, se lo representa como un Arraylist
	private List<Producto> productos;
	
	// Método para calcular el valor final de los precios en el carrito
    public double calcularValorFinal() {
        double valorFinal = 0.0;

        // Verificar si el carrito no está vacío
        if (!productos.isEmpty()) {
            // Recorrer todos los productos en el carrito
            for (Producto producto : productos) {
                // Sumar el precio de cada producto al valor final
                valorFinal += producto.getPrecio();
            }
        }
        return valorFinal;
    }
	
	// Constructor para el Arraylist
	public Carrito() 
	{
		this.productos = new ArrayList<>();
	}
	
	// Constructor para todos los atributos
	public Carrito(int precioFinal) {
		this.precioFinal = precioFinal;
		this.productos = new ArrayList<>();
	}
	// Metodo get para poder obtener al objeto
	public double getPrecioFinal() {
		return precioFinal;
	}
	// Metodo set para darle un valor al objeto
	public void setPrecioFinal(double PrecioFinal) {
		this.precioFinal = precioFinal;
	}
	//Metodos para poder hacer la composicion 
	 public void agregarProductoElectronico(int codigo, String categoria, String seccion, String nombre, String marca, double precio){
	        productos.add(new ProductoElectronico(codigo, categoria, seccion, nombre, marca, precio));
	 }
	 public void agregarProductoRopa(int codigo,String talla, String seccion, String nombre, String marca, double precio) {
		 productos.add(new ProductoRopa(codigo, talla, seccion,nombre, marca, precio));
	 }
	 public void agregarProductoFerreteria(int codigo, String seccion, String nombre, String marca, double precio) {
		 productos.add(new ProductoFerreteria(codigo, seccion,nombre, marca, precio));
	 }
	 
	 public List<Producto> getProductos() {
		 return productos;
	 }        
	// Metodo toString, para mostrar en forma de cadena la informacion de los atributos de la clase estudiante
	@Override
	public String toString() {
		return "Carrito [PrecioFinal=" + precioFinal + ", info=" + productos + "]";
	}
}


