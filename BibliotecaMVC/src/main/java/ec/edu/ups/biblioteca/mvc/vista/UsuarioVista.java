package ec.edu.ups.biblioteca.mvc.vista;
import java.util.Scanner;
import ec.edu.ups.biblioteca.mvc.modelo.Usuario;

public class UsuarioVista {

	private Scanner entrada;

    public UsuarioVista() {
        this.entrada = new Scanner(System.in);
    }

    public Usuario ingresarUsuario() {
        System.out.println("*** Ingresar Datos Usuario ***");
        System.out.println("Ingrese el nombre del usuario:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido del usuario:");
        String apellido = entrada.nextLine();

        System.out.println("Ingrese la identificación del usuario:");
        String identificacion = entrada.nextLine();

        System.out.println("Ingrese el nombre de usuario:");
        String nombreUsuario = entrada.nextLine();

        System.out.println("Ingrese el teléfono del usuario:");
        String telefono = entrada.nextLine();

        System.out.println("Ingrese el correo del usuario:");
        String correo = entrada.nextLine();

        return new Usuario(nombre, apellido, identificacion, nombreUsuario, telefono, correo);
    }

    public Usuario actualizarUsuario() {
        System.out.println("*** Actualizar Datos Usuario ***");
        System.out.println("Ingrese la identificación del usuario a actualizar:");
        String identificacion = entrada.nextLine();

        System.out.println("Ingrese el nuevo nombre del usuario:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el nuevo apellido del usuario:");
        String apellido = entrada.nextLine();

        System.out.println("Ingrese el nuevo nombre de usuario:");
        String nombreUsuario = entrada.nextLine();

        System.out.println("Ingrese el nuevo teléfono del usuario:");
        String telefono = entrada.nextLine();

        System.out.println("Ingrese el nuevo correo del usuario:");
        String correo = entrada.nextLine();

        return new Usuario(nombre, apellido, identificacion, nombreUsuario, telefono, correo);
    }

    public String eliminarUsuario() {
        System.out.println("*** Eliminar Datos Usuario ***");
        System.out.println("Ingrese la identificación del usuario a eliminar:");
        return entrada.nextLine();
    }

    public String buscarUsuario() {
        System.out.println("*** Buscar Datos Usuario ***");
        System.out.println("Ingrese la identificación del usuario a buscar:");
        return entrada.nextLine();
    }

    public void mostrarDatosUsuario(String nombre, String apellido, String identificacion, String nombreUsuario, String telefono, String correo) {
        System.out.println("*** Datos del Usuario ***");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
    }

    public void mostrarAlertas(String mensaje) {
        System.out.println(mensaje);
    }
}