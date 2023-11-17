package ec.edu.ups.proyecto.dos.test;
import java.util.*;
import ec.edu.ups.proyecto.dos.clases.*;

public class Principal {
    public static void main(String[] args) {
        // Listas para almacenar productos, pedidos y carrito
        ArrayList<Producto> lista = new ArrayList<Producto>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Carrito unCarrito = new Carrito();

     // Creación de productos electrónicos
        ProductoElectronico productoElectronico0 = new ProductoElectronico ( 0, "Laptops");
        productoElectronico0.setSeccion("Electronico");
        productoElectronico0.setNombre("MacBook Pro M2");
        productoElectronico0.setMarca("Apple");
        productoElectronico0.setPrecio(999);
        
        ProductoElectronico productoElectronico1 = new ProductoElectronico ( 1,"Laptops" );
        productoElectronico1.setSeccion("Electronico");
        productoElectronico1.setNombre("Asus Rog One");
        productoElectronico1.setMarca("Asus");
        productoElectronico1.setPrecio(799);
        
        ProductoElectronico productoElectronico2 = new ProductoElectronico (2,"Monitores" );
        productoElectronico2.setSeccion("Electronico");
        productoElectronico2.setNombre("LG monitor IPS");
        productoElectronico2.setMarca("LG");
        productoElectronico2.setPrecio(100);
        
        // Creación de productos de ropa
        ProductoRopa productoRopa0 = new ProductoRopa (3,"M");
        productoRopa0.setSeccion("Ropa");
        productoRopa0.setNombre("Demin Jean");
        productoRopa0.setMarca("Zara");
        productoRopa0.setPrecio(49);
        
        ProductoRopa productoRopa1 = new ProductoRopa (4,"L");
        productoRopa1.setSeccion("Ropa");
        productoRopa1.setNombre("Cardigan");
        productoRopa1.setMarca("Pull & Bear");
        productoRopa1.setPrecio(70);
        
        ProductoRopa productoRopa2 = new ProductoRopa (5,"S");
        productoRopa2.setSeccion("Ropa");
        productoRopa2.setNombre("Print T-shirt");
        productoRopa2.setMarca("Bershka");
        productoRopa2.setPrecio(25);

        // Creación de productos de ferretería
        ProductoFerreteria productoFerreteria0 = new ProductoFerreteria (6);
        productoFerreteria0.setSeccion("Ferreteria");
        productoFerreteria0.setNombre("Amoladora");
        productoFerreteria0.setMarca("Bosch");
        productoFerreteria0.setPrecio(65);
        
        ProductoFerreteria productoFerreteria1 = new ProductoFerreteria (7);
        productoFerreteria1.setSeccion("Ferreteria");
        productoFerreteria1.setNombre("Sierra Ingleteadora");
        productoFerreteria1.setMarca("DeWalt");
        productoFerreteria1.setPrecio(299);
        
        ProductoFerreteria productoFerreteria2 = new ProductoFerreteria (8);
        productoFerreteria2.setSeccion("Ferreteria");
        productoFerreteria2.setNombre("Taladro percutor compacto");
        productoFerreteria2.setMarca("DeWalt");
        productoFerreteria2.setPrecio(123);

        // Agregar productos a la lista
        lista.add(productoElectronico0);
        lista.add(productoElectronico1);
        lista.add(productoElectronico2);
        lista.add(productoRopa0);
        lista.add(productoRopa1);
        lista.add(productoRopa2);
        lista.add(productoFerreteria0);
        lista.add(productoFerreteria1);
        lista.add(productoFerreteria2);

        System.out.println("-----Bienvenido a JG Artifacts----- \n");
        System.out.println("Regístrese para ingresar a la tienda.");

        // Registro 
        System.out.print("Ingrese sus nombres: ");
        String nombre = scanner.next();

        System.out.print("Ingrese sus apellidos: ");
        String apellidos = scanner.next();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su correo electrónico: ");
        String correo = scanner.next();

        System.out.print("Ingrese nombre de usuario: ");
        String nuevoUsuario = scanner.next();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.next();

        // Crear un nuevo objeto Usuario con la información ingresada
        Usuario nuevoUsuarioObj = new Usuario(nombre, apellidos, nuevoUsuario, contrasena, correo);

        // Agregar el carrito al usuario (Agregación)
        nuevoUsuarioObj.agregarCarrito(unCarrito);
        System.out.println("Registro exitoso. ¡Bienvenido, " + nuevoUsuario + "!");

        // Ingreso de sesión
        System.out.println("Ingrese a su sesión:");
        boolean inicioExitoso = false;
        int intentos = 5;

        while (!inicioExitoso && intentos > 0) {
            System.out.print("Nombre de usuario: ");
            String usuarioIngresado = scanner.next();

            System.out.print("Contraseña: ");
            String contrasenaIngresada = scanner.next();

            if (usuarioIngresado.equals(nuevoUsuarioObj.getNombreUsuario()) && contrasenaIngresada.equals(nuevoUsuarioObj.getContrasena())) {
                System.out.println("¡Inicio de sesión exitoso! Bienvenido, " + nuevoUsuarioObj.getNombreUsuario() + ".");
                inicioExitoso = true;
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos. Intente nuevamente.");
                intentos--;
            }
        }
        //Bucle principal de opciones
        while (true) {
            System.out.println("-----Seleccione la opcion que desea ejecutar----- \n");
            System.out.println("1. Productos");
            System.out.println("2. Carrito");
            System.out.println("3. Pedidos");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                // Mostrar lista de productos
                System.out.println("-----LISTA DE PRODUCTOS-----");
                for (Producto p : lista) {
                    System.out.println(p.toString());
                }

                boolean continuarComprando = true;
                //Bucle para sellecionar productos para comprar agregar al carrito mediante su codigo
                while (continuarComprando) {
                    System.out.print("Digite el código del producto que desea comprar: \n");
                    int codigoProducto = scanner.nextInt();

                    // Verificar si el código del producto es válido
                    if (codigoProducto >= 0 && codigoProducto < lista.size()) {
                        // Obtener el producto seleccionado
                        Producto productoSeleccionado = lista.get(codigoProducto);

                        // Agregar el producto al ArrayList del carrito usando la composición
                        unCarrito.getProductos().add(productoSeleccionado);

                        System.out.println("Producto agregado al carrito.");
                        System.out.println("Info de pedido: " + unCarrito.getProductos());

                        System.out.print("¿Desea seleccionar otro producto? (1: Sí, 0: No): ");
                        int continuar = scanner.nextInt();
                        continuarComprando = (continuar == 1);
                    } else {
                        System.out.println("Código de producto no válido.");
                    }
                }
            } else if (opcion == 2) {
                // Mostrar el contenido del carrito
                System.out.println("-----CARRITO DE COMPRAS-----");
                System.out.println("Datos: " + unCarrito.toString());

                // Pregunta para saber si se compra los Productos o se regresa al menu
                System.out.print("Ingrese 1 si desea comprar los artículos o 0 si desea volver al menú principal: ");
                int confirmarCompra = scanner.nextInt();
                if (confirmarCompra == 1) {
                    Random random = new Random();
                    System.out.print("Ingrese la dirección de envío: ");
                    String escanerDireccion = scanner.next();
                    System.out.print("Ingrese un número de contacto: ");
                    int escanerNumero = scanner.nextInt();
                    System.out.print("Ingrese su código postal: ");
                    int escanerCodigo = scanner.nextInt();

                    // Crear un nuevo pedido y agregarlo a la lista de pedidos
                    Pedido unPedido = new Pedido();
                    int numeroAleatorio = 100000 + random.nextInt(900000);
                    unPedido.setNumeroPedido(numeroAleatorio);
                    unPedido.setDireccion(escanerDireccion);
                    unPedido.setNumeroContacto(escanerNumero);
                    unPedido.setCodigoPostal(escanerCodigo);

                    // Agregar los productos del carrito al pedido
                    unPedido.setProductos(new ArrayList<>(unCarrito.getProductos()));

                    // Agregar el pedido a la lista de pedidos
                    pedidos.add(unPedido);

                    // Agregar el pedido al usuario
                    nuevoUsuarioObj.agregarPedido(unPedido);

                    // Calcular el valor final del carrito llamando al metodo que esta en carrito
                    double valorFinalCarrito = unCarrito.calcularValorFinal();
                    System.out.println("Valor final del carrito: $" + valorFinalCarrito);

                    System.out.println("Su pedido ha sido realizado exitosamente");
                    System.out.println("Consulte en el menú la opción Pedidos para revisar su pedido");
                    System.out.println("Volviendo al menú... \n");
                } else {
                    System.out.println("Volviendo al menú... \n");
                }
            } else if (opcion == 3) {
                // Mostrar detalles del pedido
                System.out.println("-----DETALLES DEL PEDIDO-----");
                if (pedidos.isEmpty()) {
                    System.out.println("Aún no hay ningún pedido realizado");
                    System.out.println("Volviendo al menú... \n");
                } else {
                    // Muestra la información del usuario
                    System.out.println("Información del Usuario:");
                    System.out.println("Nombre: " + nuevoUsuarioObj.getNombre());
                    System.out.println("Apellidos: " + nuevoUsuarioObj.getApellido());
                    System.out.println("Nombre de Usuario: " + nuevoUsuarioObj.getNombreUsuario());
                    System.out.println("Correo Electrónico: " + nuevoUsuarioObj.getCorreoElectronico());

                    // Muestra los detalles de cada pedido
                    System.out.println("Detalles del Pedidos:");
                    for (Pedido unPedido : pedidos) {
                        System.out.println(unPedido.toString());

                        // Mostrar productos específicos de este pedido
                        System.out.println("Productos en este pedido:");
                        for (Producto productoPedido : unPedido.getProductos()) {
                            System.out.println(productoPedido.toString());
                        }

                        System.out.println();
                    }
                }
            } else if (opcion == 4) {
                // Salir del programa
                System.out.println("Saliendo de la tienda...\nGracias por comprar en JG artifacts");
                break;
            }
        }
    }
}

        