package ec.edu.ups.est.practica.cuatro.guillen.juan.solano.ariel.principal;

import java.awt.*;


public class Principal {
	public static void main (String [] args) {
		Frame bibliotecaUPS = new Frame();
		Panel panelMenuNorte = new Panel();
		Panel panelGeneral = new Panel();
		Label titulo1 = new Label("Seleccione Una Opcion");
		BorderLayout borderLayout = new BorderLayout();
		GridLayout matriz1 = new GridLayout (2,2);
		Button botonBiblioteca = new Button ("Bilbioteca");
		Button botonUsuario = new Button ("Usuario");
		Button botonLibro = new Button ("Libro");
		Button botonPrestamo = new Button ("Prestamo");
		
		bibliotecaUPS.add(panelMenuNorte, BorderLayout.NORTH);
		bibliotecaUPS.add(panelGeneral);
		panelGeneral.setLayout(matriz1);
		
		panelMenuNorte.add(titulo1);
		panelGeneral.add(botonBiblioteca);
		panelGeneral.add(botonUsuario);
		panelGeneral.add(botonLibro);
		panelGeneral.add(botonPrestamo);
		
		
		bibliotecaUPS.setSize(1080, 720);
		bibliotecaUPS.setTitle("BIBLIOTECA");
		bibliotecaUPS.setVisible(true);

		//.....................................
		
		Frame menuBiblioteca = new Frame();
		Panel panelGeneral1 = new Panel();
		GridLayout matriz2 = new GridLayout (5,1);
		Button botonCrearBiblioteca = new Button ("Crear Biblioteca");
		Button botonObtenerBiblioteca = new Button ("Obtener Biblioteca");
		Button botonMostrarBiblioteca = new Button ("Mostrar Biblioteca");
		Button botonActualizarBiblioteca = new Button ("Actualizar Biblioteca");
		Button botonEliminarBiblioteca = new Button ("Eliminar Biblioteca");
		
		menuBiblioteca.add(panelGeneral1);
		panelGeneral1.setLayout(matriz2);
		
		
		panelGeneral1.add(botonCrearBiblioteca);
		panelGeneral1.add(botonObtenerBiblioteca);
		panelGeneral1.add(botonMostrarBiblioteca);
		panelGeneral1.add(botonActualizarBiblioteca);
		panelGeneral1.add(botonEliminarBiblioteca);
		
		menuBiblioteca.setSize(1080, 720);
		menuBiblioteca.setTitle("MENU BIBLIOTECA");
		menuBiblioteca.setVisible(true);
	
		
		//.....................................
		
		Frame crearBiblioteca = new Frame();
		Panel panelGeneral2 = new Panel();
		GridLayout matriz3 = new GridLayout (4,1);
		Button cancelar = new Button ("Cancelar");
		Button confirmar = new Button ("Confirmar");
		
		crearBiblioteca.add(panelGeneral2);
		panelGeneral2.setLayout(matriz3);


		Panel panelSub1 = new Panel();
		TextField ingresarNombreB = new TextField(15);
		Label titulo2 = new Label("Ingresar El Nombre De La Biblioteca:");
		panelSub1.add(titulo2);
		panelSub1.add(ingresarNombreB);
		
		Panel panelSub2 = new Panel();
		TextField ingresarDireccionB = new TextField(15);
		Label titulo3 = new Label("Ingresar La Direccion De La Biblioteca:");
		panelSub2.add(titulo3);
		panelSub2.add(ingresarDireccionB);
		
		Panel panelSub3 = new Panel();
		TextField ingresarIdB = new TextField(15);
		Label titulo4 = new Label("Ingresar El ID De La Biblioteca:");
		panelSub3.add(titulo4);
		panelSub3.add(ingresarIdB);
		
		
		Panel panelSub4 = new Panel();
		panelSub4.add(cancelar);
		panelSub4.add(confirmar);	
		
        panelGeneral2.add(panelSub1);
        panelGeneral2.add(panelSub2);
        panelGeneral2.add(panelSub3);
        panelGeneral2.add(panelSub4);
        
		
		crearBiblioteca.setSize(1080, 720);
		crearBiblioteca.setTitle("CREAR BIBLIOTECA");
		crearBiblioteca.setVisible(true);
	
		//.....................................
		
		Frame mostrarBiblioteca = new Frame();
		Panel panelGeneral3 = new Panel();
		GridLayout matriz4 = new GridLayout (3,1);
		Button volver = new Button ("Volver");
		
		mostrarBiblioteca.add(panelGeneral3);
		panelGeneral3.setLayout(matriz4);

		Panel panelSub11 = new Panel();
		Label titulo11 = new Label("Ingresar El Nombre De La Biblioteca:");
		panelSub11.add(titulo11);
		
		
		Panel panelSub12 = new Panel();
		TextField mostrando = new TextField("Aqui Se MuestraN Las Bibliotecas", 100);
		panelSub12.add(mostrando);
		
		Panel panelSub13 = new Panel();
		panelSub13.add(volver);
		
		 panelGeneral3.add(panelSub11);
	     panelGeneral3.add(panelSub12);
	     panelGeneral3.add(panelSub13);
	    
	     mostrarBiblioteca.setSize(1080, 720);
	     mostrarBiblioteca.setTitle("MOSTRAR BIBLIOTECA");
	     mostrarBiblioteca.setVisible(true);
	   
	     //.....................................
	     
	     	Frame obtenerBiblioteca = new Frame();
			Panel panelGeneral4 = new Panel();
			Panel panelD= new Panel();
			BorderLayout ubicacion = new BorderLayout();
			GridLayout matriz5 = new GridLayout (3,1);
			GridLayout matriz6 = new GridLayout (2,1);
			Button cancelar1 = new Button ("Cancelar");
			Button confirmar1= new Button ("Confirmar");
			
			
	        obtenerBiblioteca.setLayout(ubicacion); 
	        obtenerBiblioteca.add(panelGeneral4, BorderLayout.WEST); 
	        obtenerBiblioteca.add(panelD, BorderLayout.EAST);
			panelGeneral4.setLayout(matriz5);
			panelD.setLayout(matriz6);
			
			Panel panelSub21 = new Panel();
			Label titulo21 = new Label("Ingresar El Nombre De La Biblioteca A Buscar:");
			panelSub21.add(titulo21);
			
			
			Panel panelSub22 = new Panel();
			TextField mostrando1 = new TextField(30);
			panelSub22.add(mostrando1);
			
			Panel panelSub23 = new Panel();
			panelSub23.add(cancelar1);
			panelSub23.add(confirmar1);
			
			Panel panelSub24 = new Panel();
			Label titulo22 = new Label("Datos De La Biblioteca:");
			panelSub24.add(titulo22);
			
			Panel panelSub25 = new Panel();
			TextField mostrando2 = new TextField("Aqui Se Muestra La Biblioteca Encontrada", 100);
			panelSub25.add(mostrando2);
			
			 panelGeneral4.add(panelSub21);
		     panelGeneral4.add(panelSub22);
		     panelGeneral4.add(panelSub23);
		     panelD.add(panelSub24);
		     panelD.add(panelSub25);
		     
		     
		     obtenerBiblioteca.setSize(1080, 720);
		     obtenerBiblioteca.setTitle("OBTENER BIBLIOTECA");
		     obtenerBiblioteca.setVisible(true);
		   
		   //.....................................
		     
		     	Frame actualizarBiblioteca = new Frame();
				Panel panelGeneral5 = new Panel();
				GridLayout matriz7 = new GridLayout (4,1);
				Button cancelar2 = new Button ("Cancelar");
				Button confirmar2 = new Button ("Confirmar");
				
				actualizarBiblioteca.add(panelGeneral5);
				panelGeneral5.setLayout(matriz7);


				Panel panelSub31 = new Panel();
				TextField ingresarNuevoNombreB = new TextField(15);
				Label titulo5 = new Label("Ingresar El Nombre De La Biblioteca A Actualizar:");
				panelSub31.add(titulo5);
				panelSub31.add(ingresarNuevoNombreB);
				
				Panel panelSub32 = new Panel();
				TextField ingresarNuevoNomB = new TextField(15);
				Label titulo7 = new Label("Ingresar El Nuevo Nombre De La Biblioteca:");
				panelSub32.add(titulo7);
				panelSub32.add(ingresarNuevoNomB);
				
				
				Panel panelSub33 = new Panel();
				TextField ingresarNuevaDireccionB = new TextField(15);
				Label titulo6 = new Label("Ingresar La Nueva Direccion De La Biblioteca:");
				panelSub33.add(titulo6);
				panelSub33.add(ingresarNuevaDireccionB);
				

				
				Panel panelSub34 = new Panel();
				panelSub34.add(cancelar2);
				panelSub34.add(confirmar2);	
				
		        panelGeneral5.add(panelSub31);
		        panelGeneral5.add(panelSub32);
		        panelGeneral5.add(panelSub33);
		        panelGeneral5.add(panelSub34);
		        
				
		        actualizarBiblioteca.setSize(1080, 720);
		        actualizarBiblioteca.setTitle("ACTUALIZAR BIBLIOTECA");
		        actualizarBiblioteca.setVisible(true);
		        
		        //.....................................
		        
		        Frame eliminarBiblioteca = new Frame();
				Panel panelGeneral6 = new Panel();
				GridLayout matriz8 = new GridLayout (4,1);
				Button cancelar4 = new Button ("Cancelar");
				Button confirmar4 = new Button ("Confirmar");
				
				eliminarBiblioteca.add(panelGeneral6);
				panelGeneral6.setLayout(matriz8);
				
				Panel panelSub41 = new Panel();
				TextField ingresarNombreEliminarB = new TextField(15);
				Label titulo8 = new Label("Ingresar El Nombre De La Biblioteca A Eliminar:");
				panelSub41.add(titulo8);
				panelSub41.add(ingresarNombreEliminarB);
				
				Panel panelSub42 = new Panel();
				panelSub42.add(cancelar4);
				panelSub42.add(confirmar4);	
				
				panelGeneral6.add(panelSub41);
			    panelGeneral6.add(panelSub42);
			    
				
				eliminarBiblioteca.setSize(1080, 720);
				eliminarBiblioteca.setTitle("ELIMINAR BIBLIOTECA");
				eliminarBiblioteca.setVisible(true);
				
				//...............USUARIOOOOO......................
				
				Frame menuUsuario= new Frame();
				Panel panelGeneral7 = new Panel();
				GridLayout matriz9 = new GridLayout (5,1);
				Button botonRegistrarUsuario = new Button ("Registrar Usuario");
				Button botonActualizarUsuario = new Button ("Actualizar Usuario ");
				Button botonMostrarUsuario = new Button ("Mostrar Usuario");
				Button botonEliminarUsuario = new Button ("Eliminar Usuario");
				
				menuUsuario.add(panelGeneral7);
				panelGeneral7.setLayout(matriz9);
				
				
				panelGeneral7.add(botonRegistrarUsuario);
				panelGeneral7.add(botonActualizarUsuario);
				panelGeneral7.add(botonMostrarUsuario);
				panelGeneral7.add(botonEliminarUsuario);
			
				
				menuUsuario.setSize(1080, 720);
				menuUsuario.setTitle("MENU BIBLIOTECA");
				menuUsuario.setVisible(true);
			
				//.....................................
				
				Frame registroUsuario = new Frame();
		        Panel panelGeneralUsuario = new Panel();
		        GridLayout matrizUsuario = new GridLayout(6, 1);
		        Button cancelarUsuario = new Button("Cancelar");
		        Button confirmarUsuario = new Button("Confirmar");

		        registroUsuario.setLayout(new BorderLayout());
		        registroUsuario.add(panelGeneralUsuario);

		        panelGeneralUsuario.setLayout(matrizUsuario);

		        Panel panelSub1Usuario = new Panel();
		        TextField ingresarNombre = new TextField(15);
		        Label tituloNombre = new Label("Ingrese su nombre:");
		        panelSub1Usuario.add(tituloNombre);
		        panelSub1Usuario.add(ingresarNombre);

		        Panel panelSub2Usuario = new Panel();
		        TextField ingresarApellido = new TextField(15);
		        Label tituloApellido = new Label("Ingrese su apellido:");
		        panelSub2Usuario.add(tituloApellido);
		        panelSub2Usuario.add(ingresarApellido);

		        Panel panelSub3Usuario = new Panel();
		        TextField ingresarIdentificacion = new TextField(15);
		        Label tituloIdentificacion = new Label("Ingrese su identificacion:");
		        panelSub3Usuario.add(tituloIdentificacion);
		        panelSub3Usuario.add(ingresarIdentificacion);

		        Panel panelSub4Usuario = new Panel();
		        TextField ingresarUsuario = new TextField(15);
		        Label tituloUsuario = new Label("Ingrese su nombre de usuario:");
		        panelSub4Usuario.add(tituloUsuario);
		        panelSub4Usuario.add(ingresarUsuario);

		        Panel panelSub5Usuario = new Panel();
		        TextField ingresarCorreo = new TextField(15);
		        Label tituloCorreo = new Label("Ingrese su correo:");
		        panelSub5Usuario.add(tituloCorreo);
		        panelSub5Usuario.add(ingresarCorreo);

		        Panel panelSub6Usuario = new Panel();
		        panelSub6Usuario.add(cancelarUsuario);
		        panelSub6Usuario.add(confirmarUsuario);

		        panelGeneralUsuario.add(panelSub1Usuario);
		        panelGeneralUsuario.add(panelSub2Usuario);
		        panelGeneralUsuario.add(panelSub3Usuario);
		        panelGeneralUsuario.add(panelSub4Usuario);
		        panelGeneralUsuario.add(panelSub5Usuario);
		        panelGeneralUsuario.add(panelSub6Usuario);

		        registroUsuario.setSize(1080, 720);
		        registroUsuario.setTitle("REGISTRO DE USUARIO");
		        registroUsuario.setVisible(true);
				
		      //.....................................
		        
		        Frame actualizarUsuario = new Frame();
		        Panel panelGeneralActualizar = new Panel();
		        GridLayout matrizActualizar = new GridLayout(6, 1);
		        Button cancelarActualizar = new Button("Cancelar");
		        Button confirmarActualizar = new Button("Confirmar");

		        actualizarUsuario.setLayout(new BorderLayout());
		        actualizarUsuario.add(panelGeneralActualizar);

		        panelGeneralActualizar.setLayout(matrizActualizar);

		        Panel panelSub1Actualizar = new Panel();
		        TextField ingresarIdentificacion1 = new TextField(15);
		        Label tituloIdentificacion1 = new Label("Ingrese la identificación del usuario a actualizar:");
		        panelSub1Actualizar.add(tituloIdentificacion1);
		        panelSub1Actualizar.add(ingresarIdentificacion1);

		        Panel panelSub2Actualizar = new Panel();
		        TextField ingresarNuevoNombre = new TextField(15);
		        Label tituloNuevoNombre = new Label("Ingrese el nuevo nombre:");
		        panelSub2Actualizar.add(tituloNuevoNombre);
		        panelSub2Actualizar.add(ingresarNuevoNombre);

		        Panel panelSub3Actualizar = new Panel();
		        TextField ingresarNuevoApellido = new TextField(15);
		        Label tituloNuevoApellido = new Label("Ingrese el nuevo apellido:");
		        panelSub3Actualizar.add(tituloNuevoApellido);
		        panelSub3Actualizar.add(ingresarNuevoApellido);

		        Panel panelSub4Actualizar = new Panel();
		        TextField ingresarNuevoUsuario = new TextField(15);
		        Label tituloNuevoUsuario = new Label("Ingrese el nuevo nombre de usuario:");
		        panelSub4Actualizar.add(tituloNuevoUsuario);
		        panelSub4Actualizar.add(ingresarNuevoUsuario);

		        Panel panelSub5Actualizar = new Panel();
		        TextField ingresarNuevoCorreo = new TextField(15);
		        Label tituloNuevoCorreo = new Label("Ingrese el nuevo correo:");
		        panelSub5Actualizar.add(tituloNuevoCorreo);
		        panelSub5Actualizar.add(ingresarNuevoCorreo);

		        Panel panelSub6Actualizar = new Panel();
		        panelSub6Actualizar.add(cancelarActualizar);
		        panelSub6Actualizar.add(confirmarActualizar);

		        panelGeneralActualizar.add(panelSub1Actualizar);
		        panelGeneralActualizar.add(panelSub2Actualizar);
		        panelGeneralActualizar.add(panelSub3Actualizar);
		        panelGeneralActualizar.add(panelSub4Actualizar);
		        panelGeneralActualizar.add(panelSub5Actualizar);
		        panelGeneralActualizar.add(panelSub6Actualizar);

		        actualizarUsuario.setSize(1080, 720);
		        actualizarUsuario.setTitle("ACTUALIZAR USUARIO");
		        actualizarUsuario.setVisible(true);
		      
		        //.....................................
		        
		        Frame mostrarUsuarios = new Frame();
		        Panel panelGeneralMostrar = new Panel();
		        GridLayout matrizMostrar = new GridLayout(3, 1);
		        Button volverMostrar = new Button("Volver");

		        mostrarUsuarios.setLayout(new BorderLayout());
		        mostrarUsuarios.add(panelGeneralMostrar);

		        panelGeneralMostrar.setLayout(matrizMostrar);

		        Panel panelSub11Mostrar = new Panel();
		        Label titulo11Mostrar = new Label("Ingresar El Nombre Del Usuario:");
		        panelSub11Mostrar.add(titulo11Mostrar);

		        Panel panelSub12Mostrar = new Panel();
		        TextField mostrandoUsuarios = new TextField("Aquí se muestran los usuarios", 100);
		        panelSub12Mostrar.add(mostrandoUsuarios);

		        Panel panelSub13Mostrar = new Panel();
		        panelSub13Mostrar.add(volverMostrar);

		        panelGeneralMostrar.add(panelSub11Mostrar);
		        panelGeneralMostrar.add(panelSub12Mostrar);
		        panelGeneralMostrar.add(panelSub13Mostrar);

		        mostrarUsuarios.setSize(1080, 720);
		        mostrarUsuarios.setTitle("MOSTRAR USUARIOS");
		        mostrarUsuarios.setVisible(true);
		        
		      //.....................................
		        Frame eliminarUsuario = new Frame();
		        Panel panelGeneralEliminar = new Panel();
		        GridLayout matrizEliminar = new GridLayout(4, 1);
		        Button cancelarEliminar = new Button("Cancelar");
		        Button confirmarEliminar = new Button("Confirmar");

		        eliminarUsuario.setLayout(new BorderLayout());
		        eliminarUsuario.add(panelGeneralEliminar);

		        panelGeneralEliminar.setLayout(matrizEliminar);

		        Panel panelSub41Eliminar = new Panel();
		        TextField ingresarNombreEliminar = new TextField(15);
		        Label tituloEliminar = new Label("Ingresar El Nombre Del Usuario A Eliminar:");
		        panelSub41Eliminar.add(tituloEliminar);
		        panelSub41Eliminar.add(ingresarNombreEliminar);

		        Panel panelSub42Eliminar = new Panel();
		        panelSub42Eliminar.add(cancelarEliminar);
		        panelSub42Eliminar.add(confirmarEliminar);

		        panelGeneralEliminar.add(panelSub41Eliminar);
		        panelGeneralEliminar.add(panelSub42Eliminar);

		        eliminarUsuario.setSize(1080, 720);
		        eliminarUsuario.setTitle("ELIMINAR USUARIO");
		        eliminarUsuario.setVisible(true); 
		        
		      //...............LIBROOOOOOOOOOOOO......................
		        
		        Frame menuLibro = new Frame();
		        Panel panelGeneralLibro = new Panel();
		        GridLayout matrizLibro = new GridLayout(5, 1);
		        Button botonRegistrarLibro = new Button("Registrar Libro");
		        Button botonActualizarLibro = new Button("Actualizar Libro");
		        Button botonMostrarLibro = new Button("Mostrar Libro");
		        Button botonEliminarLibro = new Button("Eliminar Libro");
		        Button botonBuscarLibro = new Button("Buscar Libro");

		        menuLibro.setLayout(new BorderLayout());
		        menuLibro.add(panelGeneralLibro);

		        panelGeneralLibro.setLayout(matrizLibro);

		        panelGeneralLibro.add(botonRegistrarLibro);
		        panelGeneralLibro.add(botonActualizarLibro);
		        panelGeneralLibro.add(botonMostrarLibro);
		        panelGeneralLibro.add(botonEliminarLibro);
		        panelGeneralLibro.add(botonBuscarLibro);

		        menuLibro.setSize(1080, 720);
		        menuLibro.setTitle("MENU LIBRO");
		        menuLibro.setVisible(true);
		        
		      //.....................................
		       
		        Frame registroLibro = new Frame();
		        Panel panelGeneralLibro1 = new Panel();
		        GridLayout matrizLibro1 = new GridLayout(4, 1);
		        Button cancelarLibro = new Button("Cancelar");
		        Button confirmarLibro = new Button("Confirmar");

		        registroLibro.setLayout(new BorderLayout());
		        registroLibro.add(panelGeneralLibro1);

		        panelGeneralLibro1.setLayout(matrizLibro1);

		        Panel panelSub1Libro = new Panel();
		        TextField ingresarTitulo = new TextField(15);
		        Label tituloTitulo = new Label("Ingresar el título del libro:");
		        panelSub1Libro.add(tituloTitulo);
		        panelSub1Libro.add(ingresarTitulo);

		        Panel panelSub2Libro = new Panel();
		        TextField ingresarAutor = new TextField(15);
		        Label tituloAutor = new Label("Ingresar el autor del libro:");
		        panelSub2Libro.add(tituloAutor);
		        panelSub2Libro.add(ingresarAutor);

		        Panel panelSub3Libro = new Panel();
		        TextField ingresarAnioPublicacion = new TextField(15);
		        Label tituloAnioPublicacion = new Label("Ingresar el año de publicación del libro:");
		        panelSub3Libro.add(tituloAnioPublicacion);
		        panelSub3Libro.add(ingresarAnioPublicacion);

		        Panel panelSub4Libro = new Panel();
		        panelSub4Libro.add(cancelarLibro);
		        panelSub4Libro.add(confirmarLibro);

		        panelGeneralLibro1.add(panelSub1Libro);
		        panelGeneralLibro1.add(panelSub2Libro);
		        panelGeneralLibro1.add(panelSub3Libro);
		        panelGeneralLibro1.add(panelSub4Libro);

		        registroLibro.setSize(1080, 720);
		        registroLibro.setTitle("REGISTRO DE LIBRO");
		        registroLibro.setVisible(true);
		        
		        //.....................................
		        
		        Frame actualizarLibro = new Frame();
		        Panel panelGeneralActualizarLibro = new Panel();
		        GridLayout matrizActualizarLibro = new GridLayout(4, 1);
		        Button cancelarActualizarLibro = new Button("Cancelar");
		        Button confirmarActualizarLibro = new Button("Confirmar");

		        actualizarLibro.setLayout(new BorderLayout());
		        actualizarLibro.add(panelGeneralActualizarLibro);

		        panelGeneralActualizarLibro.setLayout(matrizActualizarLibro);

		        Panel panelSub1ActualizarLibro = new Panel();
		        TextField ingresarTituloActualizar = new TextField(15);
		        Label tituloTituloActualizar = new Label("Ingrese el título del libro a actualizar:");
		        panelSub1ActualizarLibro.add(tituloTituloActualizar);
		        panelSub1ActualizarLibro.add(ingresarTituloActualizar);

		        Panel panelSub2ActualizarLibro = new Panel();
		        TextField ingresarNuevoAutor = new TextField(15);
		        Label tituloNuevoAutor = new Label("Ingrese el nuevo autor del libro:");
		        panelSub2ActualizarLibro.add(tituloNuevoAutor);
		        panelSub2ActualizarLibro.add(ingresarNuevoAutor);

		        Panel panelSub3ActualizarLibro = new Panel();
		        TextField ingresarNuevoAnioPublicacion = new TextField(15);
		        Label tituloNuevoAnioPublicacion = new Label("Ingrese el nuevo año de publicación del libro:");
		        panelSub3ActualizarLibro.add(tituloNuevoAnioPublicacion);
		        panelSub3ActualizarLibro.add(ingresarNuevoAnioPublicacion);

		        Panel panelSub4ActualizarLibro = new Panel();
		        panelSub4ActualizarLibro.add(cancelarActualizarLibro);
		        panelSub4ActualizarLibro.add(confirmarActualizarLibro);

		        panelGeneralActualizarLibro.add(panelSub1ActualizarLibro);
		        panelGeneralActualizarLibro.add(panelSub2ActualizarLibro);
		        panelGeneralActualizarLibro.add(panelSub3ActualizarLibro);
		        panelGeneralActualizarLibro.add(panelSub4ActualizarLibro);

		        actualizarLibro.setSize(1080, 720);
		        actualizarLibro.setTitle("ACTUALIZAR LIBRO");
		        actualizarLibro.setVisible(true);
		        
		      //.....................................
		       
		        Frame eliminarLibro = new Frame();
		        Panel panelGeneralEliminarLibro = new Panel();
		        GridLayout matrizEliminarLibro = new GridLayout(3, 1);
		        Button cancelarEliminarLibro = new Button("Cancelar");
		        Button confirmarEliminarLibro = new Button("Confirmar");

		        eliminarLibro.setLayout(new BorderLayout());
		        eliminarLibro.add(panelGeneralEliminarLibro);

		        panelGeneralEliminarLibro.setLayout(matrizEliminarLibro);

		        Panel panelSub1EliminarLibro = new Panel();
		        TextField ingresarTituloEliminar = new TextField(15);
		        Label tituloEliminar1 = new Label("Ingresar El Título Del Libro A Eliminar:");
		        panelSub1EliminarLibro.add(tituloEliminar1);
		        panelSub1EliminarLibro.add(ingresarTituloEliminar);

		        Panel panelSub2EliminarLibro = new Panel();
		        panelSub2EliminarLibro.add(cancelarEliminarLibro);
		        panelSub2EliminarLibro.add(confirmarEliminarLibro);

		        panelGeneralEliminarLibro.add(panelSub1EliminarLibro);
		        panelGeneralEliminarLibro.add(panelSub2EliminarLibro);

		        eliminarLibro.setSize(1080, 720);
		        eliminarLibro.setTitle("ELIMINAR LIBRO");
		        eliminarLibro.setVisible(true);
		        
		        //.....................................
		        
		        Frame mostrarLibros = new Frame();
		        Panel panelGeneralMostrarLibros = new Panel();
		        GridLayout matrizMostrarLibros = new GridLayout(3, 1);
		        Button volverMostrarLibros = new Button("Volver");

		        mostrarLibros.setLayout(new BorderLayout());
		        mostrarLibros.add(panelGeneralMostrarLibros);

		        panelGeneralMostrarLibros.setLayout(matrizMostrarLibros);

		        Panel panelSub11MostrarLibros = new Panel();
		        Label titulo11MostrarLibros = new Label("Ingresar El Título Del Libro:");
		        panelSub11MostrarLibros.add(titulo11MostrarLibros);

		        Panel panelSub12MostrarLibros = new Panel();
		        TextField mostrandoLibros = new TextField("Aquí se muestran los libros", 100);
		        panelSub12MostrarLibros.add(mostrandoLibros);

		        Panel panelSub13MostrarLibros = new Panel();
		        panelSub13MostrarLibros.add(volverMostrarLibros);

		        panelGeneralMostrarLibros.add(panelSub11MostrarLibros);
		        panelGeneralMostrarLibros.add(panelSub12MostrarLibros);
		        panelGeneralMostrarLibros.add(panelSub13MostrarLibros);

		        mostrarLibros.setSize(1080, 720);
		        mostrarLibros.setTitle("MOSTRAR LIBROS");
		        mostrarLibros.setVisible(true);
		        
		      //.....................................
		        
		        Frame obtenerLibro = new Frame();
				Panel panelGeneral9 = new Panel();
				Panel panelDerecha= new Panel();
				BorderLayout ubicacion1 = new BorderLayout();
				GridLayout matriz11 = new GridLayout (5,1);
				GridLayout matriz12 = new GridLayout (2,1);
				Button botonTitulo = new Button ("Buscar Por Titulo");
				Button botonAutor= new Button ("Buscar Por Autor");
				Button botonaAnio= new Button ("Buscar Por Año");
				
				obtenerLibro.setLayout(ubicacion1); 
				obtenerLibro.add(panelGeneral9, BorderLayout.WEST); 
				obtenerLibro.add(panelDerecha, BorderLayout.EAST);
				panelGeneral9.setLayout(matriz11);
				panelDerecha.setLayout(matriz12);
				
				Panel panelSub21L = new Panel();
				Label titulo21L = new Label("Ingresar El Dato Del A Libro:");
				panelSub21L.add(titulo21L);
				
				
				Panel panelSub22L = new Panel();
				TextField mostrando1L = new TextField(30);
				panelSub22L.add(mostrando1L);
				
				Panel panelSub23L = new Panel();
				panelSub23L.add(botonTitulo);
				
				Panel panelSub23L1 = new Panel();
				panelSub23L1.add(botonAutor);
				
				Panel panelSub23L2 = new Panel();
				panelSub23L2.add(botonaAnio);
				
				
				Panel panelSub24L = new Panel();
				Label titulo22L = new Label("Datos Del Libro:");
				panelSub24L.add(titulo22L);
				
				Panel panelSub25L = new Panel();
				TextField mostrando2L = new TextField("Aqui Se Muestra El Libro Encontrada", 100);
				panelSub25L.add(mostrando2L);
				
				panelGeneral9.add(panelSub21L);
				panelGeneral9.add(panelSub22L);
				panelGeneral9.add(panelSub23L);
				panelGeneral9.add(panelSub23L1);
				panelGeneral9.add(panelSub23L2);
			    panelDerecha.add(panelSub24L);
			    panelDerecha.add(panelSub25L);
			     
			     
			     obtenerLibro.setSize(1080, 720);
			     obtenerLibro.setTitle("OBTENER LIBRO");
			     obtenerLibro.setVisible(true);
			     
			   //...............PRESTAMOOOOOO......................
			     
			     Frame menuPrestamo = new Frame();
			        Panel panelGeneralPrestamo = new Panel();
			        GridLayout matrizPrestamo = new GridLayout(5, 1);
			        Button botonRegistrarPrestamo = new Button("Registrar Préstamo");
			        Button botonActualizarPrestamo = new Button("Actualizar Préstamo");
			        Button botonMostrarPrestamo = new Button("Mostrar Préstamo");
			        Button botonEliminarPrestamo = new Button("Eliminar Préstamo");
			        Button botonBuscarPrestamo = new Button("Buscar Préstamo");

			        menuPrestamo.setLayout(new BorderLayout());
			        menuPrestamo.add(panelGeneralPrestamo);

			        panelGeneralPrestamo.setLayout(matrizPrestamo);

			        panelGeneralPrestamo.add(botonRegistrarPrestamo);
			        panelGeneralPrestamo.add(botonActualizarPrestamo);
			        panelGeneralPrestamo.add(botonMostrarPrestamo);
			        panelGeneralPrestamo.add(botonEliminarPrestamo);
			        panelGeneralPrestamo.add(botonBuscarPrestamo);

			        menuPrestamo.setSize(1080, 720);
			        menuPrestamo.setTitle("MENU PRÉSTAMO");
			        menuPrestamo.setVisible(true);  
			        
			      //.....................................
			        
			        Frame registroPrestamo = new Frame();
			        Panel panelGeneralPrestamo1 = new Panel();
			        GridLayout matrizPrestamo1  = new GridLayout(4, 1);
			        Button cancelarPrestamo = new Button("Cancelar");
			        Button confirmarPrestamo = new Button("Confirmar");

			        registroPrestamo.setLayout(new BorderLayout());
			        registroPrestamo.add(panelGeneralPrestamo1);

			        panelGeneralPrestamo1.setLayout(matrizPrestamo1);

			        Panel panelSub1Prestamo = new Panel();
			        TextField ingresarIdPrestamo = new TextField(15);
			        Label tituloIdPrestamo = new Label("Ingresar el ID del préstamo:");
			        panelSub1Prestamo.add(tituloIdPrestamo);
			        panelSub1Prestamo.add(ingresarIdPrestamo);

			        Panel panelSub2Prestamo = new Panel();
			        TextField ingresarFechaPrestamo = new TextField(15);
			        Label tituloFechaPrestamo = new Label("Ingresar la fecha del préstamo:");
			        panelSub2Prestamo.add(tituloFechaPrestamo);
			        panelSub2Prestamo.add(ingresarFechaPrestamo);

			        Panel panelSub3Prestamo = new Panel();
			        panelSub3Prestamo.add(cancelarPrestamo);
			        panelSub3Prestamo.add(confirmarPrestamo);

			        panelGeneralPrestamo1.add(panelSub1Prestamo);
			        panelGeneralPrestamo1.add(panelSub2Prestamo);
			        panelGeneralPrestamo1.add(panelSub3Prestamo);

			        registroPrestamo.setSize(1080, 720);
			        registroPrestamo.setTitle("REGISTRO DE PRÉSTAMO");
			        registroPrestamo.setVisible(true); 
			     
			      //.....................................
			        
			        Frame actualizarPrestamo = new Frame();
			        Panel panelGeneralActualizarPrestamo = new Panel();
			        GridLayout matrizActualizarPrestamo = new GridLayout(4, 1);
			        Button cancelarActualizarPrestamo = new Button("Cancelar");
			        Button confirmarActualizarPrestamo = new Button("Confirmar");

			        actualizarPrestamo.setLayout(new BorderLayout());
			        actualizarPrestamo.add(panelGeneralActualizarPrestamo);

			        panelGeneralActualizarPrestamo.setLayout(matrizActualizarPrestamo);

			        Panel panelSub1ActualizarPrestamo = new Panel();
			        TextField ingresarIdActualizar = new TextField(15);
			        Label tituloIdActualizar = new Label("Ingrese el ID del préstamo a actualizar:");
			        panelSub1ActualizarPrestamo.add(tituloIdActualizar);
			        panelSub1ActualizarPrestamo.add(ingresarIdActualizar);

			        Panel panelSub2ActualizarPrestamo = new Panel();
			        TextField ingresarNuevaFecha = new TextField(15);
			        Label tituloNuevaFecha = new Label("Ingrese la nueva fecha del préstamo:");
			        panelSub2ActualizarPrestamo.add(tituloNuevaFecha);
			        panelSub2ActualizarPrestamo.add(ingresarNuevaFecha);

			        Panel panelSub3ActualizarPrestamo = new Panel();
			        panelSub3ActualizarPrestamo.add(cancelarActualizarPrestamo);
			        panelSub3ActualizarPrestamo.add(confirmarActualizarPrestamo);

			        panelGeneralActualizarPrestamo.add(panelSub1ActualizarPrestamo);
			        panelGeneralActualizarPrestamo.add(panelSub2ActualizarPrestamo);
			        panelGeneralActualizarPrestamo.add(panelSub3ActualizarPrestamo);

			        actualizarPrestamo.setSize(1080, 720);
			        actualizarPrestamo.setTitle("ACTUALIZAR PRÉSTAMO");
			        actualizarPrestamo.setVisible(true);
			        
			      //.....................................
			        
			        Frame eliminarPrestamo = new Frame();
			        Panel panelGeneralEliminarPrestamo = new Panel();
			        GridLayout matrizEliminarPrestamo = new GridLayout(2, 1);
			        Button cancelarEliminarPrestamo = new Button("Cancelar");
			        Button confirmarEliminarPrestamo = new Button("Confirmar");

			        eliminarPrestamo.setLayout(new BorderLayout());
			        eliminarPrestamo.add(panelGeneralEliminarPrestamo);

			        panelGeneralEliminarPrestamo.setLayout(matrizEliminarPrestamo);

			        Panel panelSub1EliminarPrestamo = new Panel();
			        TextField ingresarIdEliminar = new TextField(15);
			        Label tituloIdEliminar = new Label("Ingrese el ID del préstamo a eliminar:");
			        panelSub1EliminarPrestamo.add(tituloIdEliminar);
			        panelSub1EliminarPrestamo.add(ingresarIdEliminar);

			        Panel panelSub2EliminarPrestamo = new Panel();
			        panelSub2EliminarPrestamo.add(cancelarEliminarPrestamo);
			        panelSub2EliminarPrestamo.add(confirmarEliminarPrestamo);

			        panelGeneralEliminarPrestamo.add(panelSub1EliminarPrestamo);
			        panelGeneralEliminarPrestamo.add(panelSub2EliminarPrestamo);

			        eliminarPrestamo.setSize(1080, 720);
			        eliminarPrestamo.setTitle("ELIMINAR PRÉSTAMO");
			        eliminarPrestamo.setVisible(true);
			        
			      //.....................................

			        Frame mostrarPrestamo = new Frame();
			        Panel panelGeneralMostrarPrestamo = new Panel();
			        GridLayout matrizMostrarPrestamo = new GridLayout(3, 1);
			        Button volverMostrarPrestamo = new Button("Volver");

			        mostrarPrestamo.setLayout(new BorderLayout());
			        mostrarPrestamo.add(panelGeneralMostrarPrestamo);

			        panelGeneralMostrarPrestamo.setLayout(matrizMostrarPrestamo);

			        Panel panelSub11MostrarPrestamo = new Panel();
			        Label titulo11MostrarPrestamo = new Label("Ingresar El ID del Préstamo:");
			        panelSub11MostrarPrestamo.add(titulo11MostrarPrestamo);

			        Panel panelSub12MostrarPrestamo = new Panel();
			        TextField mostrandoPrestamo = new TextField("Aquí se muestran los préstamos", 100);
			        panelSub12MostrarPrestamo.add(mostrandoPrestamo);

			        Panel panelSub13MostrarPrestamo = new Panel();
			        panelSub13MostrarPrestamo.add(volverMostrarPrestamo);

			        panelGeneralMostrarPrestamo.add(panelSub11MostrarPrestamo);
			        panelGeneralMostrarPrestamo.add(panelSub12MostrarPrestamo);
			        panelGeneralMostrarPrestamo.add(panelSub13MostrarPrestamo);

			        mostrarPrestamo.setSize(1080, 720);
			        mostrarPrestamo.setTitle("MOSTRAR PRÉSTAMOS");
			        mostrarPrestamo.setVisible(true);
			        
			      //.....................................

			        
			        Frame obtenerPrestamo = new Frame();
			        Panel panelGeneralPrestamo2 = new Panel();
			        Panel panelDatos = new Panel();
			        BorderLayout ubicacionPrestamo = new BorderLayout();
			        GridLayout matrizGeneral = new GridLayout(3, 1);
			        GridLayout matrizDatos = new GridLayout(2, 1);
			        Button cancelarPrestamo1 = new Button("Cancelar");
			        Button confirmarPrestamo1 = new Button("Confirmar");

			        obtenerPrestamo.setLayout(ubicacionPrestamo);
			        obtenerPrestamo.add(panelGeneralPrestamo2, BorderLayout.WEST);
			        obtenerPrestamo.add(panelDatos, BorderLayout.EAST);
			        panelGeneralPrestamo2.setLayout(matrizGeneral);
			        panelDatos.setLayout(matrizDatos);

			        Panel panelSub1Prestamo1 = new Panel();
			        Label titulo1Prestamo = new Label("Ingresar el ID del Préstamo a buscar:");
			        panelSub1Prestamo1.add(titulo1Prestamo);

			        Panel panelSub2Prestamo1 = new Panel();
			        TextField mostrarInfo = new TextField(30);
			        panelSub2Prestamo1.add(mostrarInfo);

			        Panel panelSub3Prestamo1 = new Panel();
			        panelSub3Prestamo1.add(cancelarPrestamo1);
			        panelSub3Prestamo1.add(confirmarPrestamo1);

			        Panel panelSub4Prestamo = new Panel();
			        Label titulo2Prestamo = new Label("Datos del Préstamo:");
			        panelSub4Prestamo.add(titulo2Prestamo);

			        Panel panelSub5 = new Panel();
			        TextField mostrarDatos = new TextField("Aquí se muestra el préstamo encontrado", 100);
			        panelSub5.add(mostrarDatos);

			        panelGeneralPrestamo2.add(panelSub1Prestamo1);
			        panelGeneralPrestamo2.add(panelSub2Prestamo1);
			        panelGeneralPrestamo2.add(panelSub3Prestamo1);
			        panelDatos.add(panelSub4Prestamo);
			        panelDatos.add(panelSub5);

			        obtenerPrestamo.setSize(1080, 720);
			        obtenerPrestamo.setTitle("OBTENER PRÉSTAMO");
			        obtenerPrestamo.setVisible(true);
	}
}