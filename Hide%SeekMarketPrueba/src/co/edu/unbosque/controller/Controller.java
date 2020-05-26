package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import co.edu.unbosque.model.Almacen;
import co.edu.unbosque.model.Correo;
import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.model.Pareja;
import co.edu.unbosque.model.Productos;
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.model.persistence.DaoAlmacen;
import co.edu.unbosque.model.persistence.DaoArchivoAlmacen;
import co.edu.unbosque.model.persistence.DaoArchivoPareja;
import co.edu.unbosque.model.persistence.DaoArchivoProducto;
import co.edu.unbosque.model.persistence.DaoArchivoUsuario;
import co.edu.unbosque.model.persistence.DaoPareja;
import co.edu.unbosque.model.persistence.DaoProductos;
import co.edu.unbosque.model.persistence.DaoUsuario;
import co.edu.unbosque.view.VentanaJFrame;

public class Controller implements ActionListener {

	private ArrayList<Usuario> 		listUsuario;
	private ArrayList<Productos> 	listProductos;
	private ArrayList<Almacen> 		listAlmacenes;
	private ArrayList<Pareja> 		listPareja;
	private Correo correo;
	private Mundo m;

	public DaoArchivoUsuario 	daoArchivoUsuario;
	private VentanaJFrame ventanaJFrame;

	public Controller( ) {

		listUsuario			= new ArrayList<Usuario>( );  
		listProductos		= new ArrayList<Productos>( );
		listAlmacenes		= new ArrayList<Almacen>( );
		listPareja			= new ArrayList<Pareja>( );
		correo 				= new Correo( );
		daoArchivoUsuario	= new DaoArchivoUsuario();
		ventanaJFrame		= new VentanaJFrame( );
		m = new Mundo();

		this.setActionListener();
	}
	public void setActionListener() {

		ventanaJFrame.getPanelUsuario().getLogin		().addActionListener( this );
		ventanaJFrame.getPanelUsuario().getBtnCancelar	().addActionListener( this );

		ventanaJFrame.getPanelLogin().getTxtUsuario		().addActionListener( this );
		ventanaJFrame.getPanelLogin().getTxtContrasena	().addActionListener( this );
		ventanaJFrame.getPanelLogin().getBtnIngresar	().addActionListener( this );
		ventanaJFrame.getPanelLogin().getBtnCancelar	().addActionListener( this );
		ventanaJFrame.getPanelLogin().getBtnRegistrar	().addActionListener( this );

		ventanaJFrame.getPanelCrearUsuario().getBtnAgregarFoto	().addActionListener( this );
		ventanaJFrame.getPanelCrearUsuario().getBtnDelete		().addActionListener( this );
		ventanaJFrame.getPanelCrearUsuario().getBtnRegresar		().addActionListener( this );
		ventanaJFrame.getPanelCrearUsuario().getBtnSave			().addActionListener( this );

		ventanaJFrame.getPanelModificarUsuario().getBtnSave		().addActionListener( this );
		ventanaJFrame.getPanelModificarUsuario().getBtnDelete	().addActionListener( this );
		ventanaJFrame.getPanelModificarUsuario().getBtnRegresar	().addActionListener( this );
		
		ventanaJFrame.getPanelAsignarParejas().getCbUsuario		().addActionListener( this );
		ventanaJFrame.getPanelAsignarParejas().getCbPareja		().addActionListener( this );
		ventanaJFrame.getPanelAsignarParejas().getCbAlmacen		().addActionListener( this );
		ventanaJFrame.getPanelAsignarParejas().getCbCupo			().addActionListener( this );
		ventanaJFrame.getPanelAsignarParejas().getCbApertura		().addActionListener( this );
		ventanaJFrame.getPanelAsignarParejas().getCbCierre		().addActionListener( this );
		ventanaJFrame.getPanelAsignarParejas().getBtnSave		().addActionListener( this );
		ventanaJFrame.getPanelAsignarParejas().getBtnDelete		().addActionListener( this );
		ventanaJFrame.getPanelAsignarParejas().getBtnRegresar	().addActionListener( this );
		ventanaJFrame.getPanelAsignarParejas().getBtnCrearParejas().addActionListener(this);

		ventanaJFrame.getPanelEstadisticas().getBtnCancelar		().addActionListener( this );

		ventanaJFrame.getPanelCrearAlmacen().getTxtNombre		().addActionListener( this );
		ventanaJFrame.getPanelCrearAlmacen().getTxtId			().addActionListener( this );
		ventanaJFrame.getPanelCrearAlmacen().getTxtDireccion	().addActionListener( this );
		ventanaJFrame.getPanelCrearAlmacen().getCbApertura		().addActionListener( this );
		ventanaJFrame.getPanelCrearAlmacen().getCbCierre		().addActionListener( this );
		ventanaJFrame.getPanelCrearAlmacen().getBtnSave			().addActionListener( this );
		ventanaJFrame.getPanelCrearAlmacen().getBtnDelete		().addActionListener( this );
		ventanaJFrame.getPanelCrearAlmacen().getBtnRegresar		().addActionListener( this );
		
		ventanaJFrame.getPanelAdministrador().getBtnCancelar		().addActionListener( this );
		ventanaJFrame.getPanelAdministrador().getUsuarios			().addActionListener( this );
		ventanaJFrame.getPanelAdministrador().getAlmacenes			().addActionListener( this );
		ventanaJFrame.getPanelAdministrador().getTarjetas			().addActionListener( this );
		ventanaJFrame.getPanelAdministrador().getCrearUsuarios		().addActionListener( this );
		ventanaJFrame.getPanelAdministrador().getConsultarUsuarios	().addActionListener( this );
		ventanaJFrame.getPanelAdministrador().getCrearAlmacen		().addActionListener( this );
		ventanaJFrame.getPanelAdministrador().getConsultarAlmacen	().addActionListener( this );
		ventanaJFrame.getPanelAdministrador().getEstadisticas		().addActionListener( this );
		ventanaJFrame.getPanelAdministrador().getEliminarUser		().addActionListener( this );
		ventanaJFrame.getPanelAdministrador().getModificarUser		().addActionListener( this );

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ventanaJFrame.getPanelLogin().getBtnIngresar()) {
			ventanaJFrame.getPanelAdministrador	().setVisible( true );
			ventanaJFrame.getContentPane		().remove( ventanaJFrame.getPanelLogin());
			ventanaJFrame.getContentPane		().add( ventanaJFrame.getPanelAdministrador());
			ventanaJFrame.repaint();
		}

		if (e.getSource() == ventanaJFrame.getPanelAdministrador().getCrearUsuarios()) {		
			ventanaJFrame.getPanelCrearUsuario	().setVisible( true );			
			ventanaJFrame.getContentPane		().remove(ventanaJFrame.getPanelAdministrador());
			ventanaJFrame.getContentPane		().add(ventanaJFrame.getPanelCrearUsuario());
			ventanaJFrame.repaint();
		}	

		if (e.getSource() == ventanaJFrame.getPanelLogin().getBtnRegistrar()) {		
			ventanaJFrame.getPanelCrearUsuario	().setVisible( true );			
			ventanaJFrame.getContentPane		().remove(ventanaJFrame.getPanelLogin());
			ventanaJFrame.getContentPane		().add(ventanaJFrame.getPanelCrearUsuario());
			ventanaJFrame.repaint();
		}

		if (e.getSource() == ventanaJFrame.getPanelCrearUsuario().getBtnRegresar()) {
			ventanaJFrame.getPanelLogin		().setVisible( true );
			ventanaJFrame.getContentPane	().remove(ventanaJFrame.getPanelCrearUsuario());
			ventanaJFrame.getContentPane	().add(ventanaJFrame.getPanelLogin());
			ventanaJFrame.repaint();
		}

		if (e.getSource() == ventanaJFrame.getPanelAdministrador().getEstadisticas()) {
			ventanaJFrame.getPanelEstadisticas	().setVisible( true );
			ventanaJFrame.getContentPane		().remove(ventanaJFrame.getPanelAdministrador());
			ventanaJFrame.getContentPane		().add(ventanaJFrame.getPanelEstadisticas());
			ventanaJFrame.repaint();
		}

		if (e.getSource() == ventanaJFrame.getPanelAdministrador().getEstadisticas()) {
			ventanaJFrame.getPanelEstadisticas	().setVisible( true );
			ventanaJFrame.getContentPane		().remove(ventanaJFrame.getPanelAdministrador());
			ventanaJFrame.getContentPane		().add(ventanaJFrame.getPanelEstadisticas());
			ventanaJFrame.repaint();
		}

		if (e.getSource() == ventanaJFrame.getPanelAdministrador().getConsultarUsuarios()) {
			ventanaJFrame.getPanelAsignarParejas		().setVisible( true );
			ventanaJFrame.getContentPane			().remove(ventanaJFrame.getPanelAdministrador());
			ventanaJFrame.getContentPane			().add(ventanaJFrame.getPanelAsignarParejas());
			ventanaJFrame.repaint();
		}

		if (e.getSource() == ventanaJFrame.getPanelAdministrador().getCrearAlmacen()) {
			ventanaJFrame.getPanelCrearAlmacen	().setVisible( true );
			ventanaJFrame.getContentPane		().remove(ventanaJFrame.getPanelAdministrador());
			ventanaJFrame.getContentPane		().add(ventanaJFrame.getPanelCrearAlmacen());
			ventanaJFrame.repaint();
		}

		if (e.getSource() == ventanaJFrame.getPanelUsuario().getLogin()) {
			ventanaJFrame.getPanelLogin	().setVisible( true );
			ventanaJFrame.getContentPane().remove(ventanaJFrame.getPanelUsuario());
			ventanaJFrame.getContentPane().add(ventanaJFrame.getPanelLogin());
			ventanaJFrame.repaint();
		}

		if (e.getSource() == ventanaJFrame.getPanelLogin().getBtnCancelar()) {
			ventanaJFrame.getPanelUsuario	().setVisible( true );
			ventanaJFrame.getContentPane	().remove( ventanaJFrame.getPanelLogin());
			ventanaJFrame.getContentPane	().add( ventanaJFrame.getPanelUsuario());
			ventanaJFrame.repaint();

		}
		
		if (e.getSource() == ventanaJFrame.getPanelModificarUsuario().getBtnRegresar()) {
			ventanaJFrame.getPanelAdministrador().setVisible( true );
			ventanaJFrame.getContentPane	().remove(ventanaJFrame.getPanelModificarUsuario());
			ventanaJFrame.getContentPane	().add(ventanaJFrame.getPanelAdministrador());
			ventanaJFrame.repaint();
		}
		
		if (e.getSource() == ventanaJFrame.getPanelAsignarParejas().getBtnRegresar()) {
			ventanaJFrame.getPanelAdministrador().setVisible( true );
			ventanaJFrame.getContentPane	().remove(ventanaJFrame.getPanelAsignarParejas());
			ventanaJFrame.getContentPane	().add(ventanaJFrame.getPanelAdministrador());
			ventanaJFrame.repaint();
		}
		
		if (e.getSource() == ventanaJFrame.getPanelAsignarParejas().getBtnCrearParejas()) {
			
		}
		
		if (e.getSource() == ventanaJFrame.getPanelUsuario().getBtnCancelar()) {
			getSalir();
		}

		if (e.getSource() == ventanaJFrame.getPanelAdministrador().getBtnCancelar()) {
			getSalir();
		}

		if (e.getSource() == ventanaJFrame.getPanelCrearUsuario().getBtnAgregarFoto()) {
			getCargarImagen();
		}

		if (e.getSource() == ventanaJFrame.getPanelModificarUsuario().getBtnSave()) {
			getDataModifyUser();
		}

		if (e.getSource() == ventanaJFrame.getPanelCrearUsuario().getBtnSave()) {
			getGuardarUsuario();
		}

		if (e.getSource() == ventanaJFrame.getPanelCrearAlmacen().getBtnSave()) {
			getGuardarComercio();
		}

		if (e.getSource() == ventanaJFrame.getPanelCrearUsuario().getBtnDelete()) {
			getLimpiaFormulario();
		}

		if (e.getSource() == ventanaJFrame.getPanelAdministrador().getModificarUser()) {
			getModificarUsuario();
		}
		
		if (e.getSource() == ventanaJFrame.getPanelModificarUsuario().getBtnDelete()) {
			getModificarUsuario();
		}

		if (e.getSource() == ventanaJFrame.getPanelAdministrador().getEliminarUser()) {
			getEliminarUsuario();
		}
	}

	public void getGuardarUsuario() {

		if (getValidarFecha(ventanaJFrame.getPanelCrearUsuario().getTxtFechaNacimiento().getText(), "Fecha de Nacimiento"))
			return;

		if (getValidarFecha(ventanaJFrame.getPanelCrearUsuario().getTxtFechaExpedicion().getText(),
				"Fecha de Expedicion de Documento"))
			return;		

		String nombre 			= ventanaJFrame.getPanelCrearUsuario().getTxtNombre			().getText();
		String apellido 		= ventanaJFrame.getPanelCrearUsuario().getTxtApellido		().getText();
		String fechaNacimiento 	= ventanaJFrame.getPanelCrearUsuario().getTxtFechaNacimiento().getText();
		String documento 		= ventanaJFrame.getPanelCrearUsuario().getTxtDocumento		().getText();		
		String fechaExpedicion 	= ventanaJFrame.getPanelCrearUsuario().getTxtFechaExpedicion().getText();
		String sexo 			= ventanaJFrame.getPanelCrearUsuario().getCbSexo			().getSelectedItem().toString();		
		String correo 			= ventanaJFrame.getPanelCrearUsuario().getTxtCorreo			().getText();		
		String contrasena 		= ventanaJFrame.getPanelCrearUsuario().getTxtContrasena		().getText();		
		String perfil			= ventanaJFrame.getPanelCrearUsuario().getCbTipoUser		().getSelectedItem().toString();

		if (nombre.isEmpty() || apellido.isEmpty() || fechaNacimiento.isEmpty() || documento.isEmpty()
				|| fechaExpedicion.isEmpty() || sexo.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || perfil.isEmpty()) {
			JOptionPane.showMessageDialog(null, "ERROR: Debe diligenciar todos los campos");


		} else {
			Usuario nuevoUsuario = new Usuario(nombre, apellido, fechaNacimiento, documento, fechaExpedicion, sexo.substring(0, 1), correo, contrasena, perfil.substring(0, 1));
			int edad = Integer.parseInt(nuevoUsuario.getEdad());
			if(edad == -1) {
				return;			
			}

			if(edad < 18 ) {
				JOptionPane.showMessageDialog(null, "_Error: Programa no permite el registro de menores de edad", "_Error: edad", JOptionPane.ERROR_MESSAGE);
				return;		
			}

			else if (!correo.contains("@") || !correo.contains(".")) {
				JOptionPane.showMessageDialog(null, "ERROR: Correo invalido");
				return;
			}

			boolean result = false;

			result = m.getUsuarioDAO().agregarUsuario(nuevoUsuario);
			//enviarCorreo(); 

			if(result) {
				JOptionPane.showMessageDialog(null, "Usuario creado correctamente " + nombre + 
						" " + apellido, "Creacion de usuario", JOptionPane.DEFAULT_OPTION);
				getLimpiaFormulario();
			}else {
				JOptionPane.showMessageDialog(null, "Usuario " + nombre + " " + apellido+ " "+ documento +
						" no creado ", "_Error: Usuario No creado", JOptionPane.ERROR_MESSAGE); 
			}
		}
		return;

	}
	
	public void getGuardarComercio ( ) {

		String nombre 		= ventanaJFrame.getPanelCrearAlmacen().getTxtNombre		().getText();
		String id 			= ventanaJFrame.getPanelCrearAlmacen().getTxtId			().getText();
		String direccion	= ventanaJFrame.getPanelCrearAlmacen().getTxtDireccion	().getText();
		String cbApertura	= ventanaJFrame.getPanelCrearAlmacen().getCbApertura	().getSelectedItem().toString();
		String cbCierre		= ventanaJFrame.getPanelCrearAlmacen().getCbCierre		().getSelectedItem().toString();		

		if (nombre.isEmpty() || id.isEmpty() || direccion.isEmpty() || cbApertura.isEmpty() || cbCierre.isEmpty() ) {
			JOptionPane.showMessageDialog(null, "ERROR: Debe diligenciar todos los campos");

		} else {
			Almacen nuevoAlmacen = new Almacen(nombre, id, direccion, cbApertura.substring(0, 1), cbCierre.substring(0, 1));

			boolean result = false;

			result = m.getAlmacenDAO().agregarAlmacen(nuevoAlmacen); 

			if(result) {
				JOptionPane.showMessageDialog(null, "Comercio creado correctamente " + nombre + 
						" " + id, "Creacion de comercio", JOptionPane.DEFAULT_OPTION);
				getLimpiaFormulario();
			}else {
				JOptionPane.showMessageDialog(null, "Comercio " + nombre + " " + id + " "+ direccion +
						" no creado ", "ERROR: Comercio no creado", JOptionPane.ERROR_MESSAGE); 
			}
		}
		return;

	}

	public void getGuardarPareja () {
		
		String nombre = ventanaJFrame.
		String usuario 		= ventanaJFrame.getPanelAsignarParejas().getCbUsuario().getSelectedItem().toString();
		String pareja 			= ventanaJFrame.getPanelAsignarParejas().getCbPareja().getSelectedItem().toString();
		String almacen	= ventanaJFrame.getPanelAsignarParejas().getCbAlmacen().getSelectedItem().toString();
		String cbApertura	= ventanaJFrame.getPanelAsignarParejas().getCbApertura().getSelectedItem().toString();
		String cbCierre		= ventanaJFrame.getPanelAsignarParejas().getCbCierre().getSelectedItem().toString(); 

		if (usuario.isEmpty() || pareja.isEmpty() || usuario.isEmpty() || cbApertura.isEmpty() || cbCierre.isEmpty() ) {
			JOptionPane.showMessageDialog(null, "ERROR: Debe diligenciar todos los campos");

		} else {
			Pareja nuevaPareja = new Pareja(usuario, pareja, almacen, cbApertura.substring(0, 1), cbCierre.substring(0, 1));

			boolean result = false;

			result = m.getParejaDAO().agregarPareja(nuevaPareja);

			if(result) {
				JOptionPane.showMessageDialog(null, "Pareja creado correctamente " + pareja + 
						" " + usuario, "Creacion de comercio", JOptionPane.DEFAULT_OPTION);
				getLimpiaFormulario();
			}else {
				JOptionPane.showMessageDialog(null, "Pareja " + usuario + " " + almacen + " "+ cbApertura + "" + cbCierre + 
						" no creado ", "ERROR: Comercio no creado", JOptionPane.ERROR_MESSAGE); 
			}
		}
		return;

	}

		
	
	
	public void getGuardarProducto ( ) {
		
	}
	
	public void getModificarUsuario ( ) {

		ventanaJFrame.getPanelModificarUsuario().getTxtNombre			().setEditable( true );
		ventanaJFrame.getPanelModificarUsuario().getTxtApellido			().setEditable( true );
		ventanaJFrame.getPanelModificarUsuario().getTxtFechaNacimiento	().setEditable( false );
		ventanaJFrame.getPanelModificarUsuario().getTxtDocumento		().setEditable( false );		
		ventanaJFrame.getPanelModificarUsuario().getTxtFechaExpedicion	().setEditable( false );
		ventanaJFrame.getPanelModificarUsuario().getCbSexo				().setEnabled ( true );		
		ventanaJFrame.getPanelModificarUsuario().getTxtCorreo			().setEditable( true );		
		ventanaJFrame.getPanelModificarUsuario().getTxtContrasena		().setEditable( true );
		ventanaJFrame.getPanelModificarUsuario().getLblFotoUsuario		().setEnabled ( true );
		ventanaJFrame.getPanelModificarUsuario().getCbTipoUser			().setEditable( true);;

		listUsuario = daoArchivoUsuario.cargarDatos();

		String cedula = JOptionPane.showInputDialog(null, "Ingrese el numero de cedula del usuario a modificar");
		int comparacion = 0;

		for (int i = 0; i < listUsuario.size(); i++) {
			String cc = listUsuario.get(i).getDocumento();
			if(cedula.equalsIgnoreCase(cc)) {
				comparacion = 1;
			
			}
		}

		for (int i = 0; i < listUsuario.size(); i++) {
			String cc = listUsuario.get(i).getDocumento();
			if(cedula.equalsIgnoreCase(cc)) {
				ventanaJFrame.getPanelModificarUsuario()	.setVisible( true );
				ventanaJFrame.getContentPane().remove(ventanaJFrame.getPanelAdministrador());
				ventanaJFrame.getContentPane().add(ventanaJFrame.getPanelModificarUsuario());
				ventanaJFrame.repaint();

				String nombre 			= listUsuario.get(i).getNombre();
				String apellido 		= listUsuario.get(i).getApellido();
				String fechaNacimiento 	= listUsuario.get(i).getFechaNacimiento();
				String documento 		= listUsuario.get(i).getDocumento();
				String fechaExpedicion 	= listUsuario.get(i).getFechaExpedicion();
				String sexo 			= listUsuario.get(i).getSexo();		
				String correo 			= listUsuario.get(i).getCorreo();		
				String contrasena 		= listUsuario.get(i).getContrasena();
				String perfil			= listUsuario.get(i).getPerfil();

				ventanaJFrame.getPanelModificarUsuario().getTxtNombre			().setText(nombre);
				ventanaJFrame.getPanelModificarUsuario().getTxtApellido			().setText(apellido);
				ventanaJFrame.getPanelModificarUsuario().getTxtFechaNacimiento	().setText(fechaNacimiento);
				ventanaJFrame.getPanelModificarUsuario().getTxtDocumento		().setText(documento);		
				ventanaJFrame.getPanelModificarUsuario().getTxtFechaExpedicion	().setText(fechaExpedicion);
				ventanaJFrame.getPanelModificarUsuario().getCbSexo				().setSelectedItem(sexo);		
				ventanaJFrame.getPanelModificarUsuario().getTxtCorreo			().setText(correo);		
				ventanaJFrame.getPanelModificarUsuario().getTxtContrasena		().setText(contrasena);
				ventanaJFrame.getPanelModificarUsuario().getCbTipoUser			().setSelectedItem(perfil);

			}
		}
		if(comparacion == 0) {
			JOptionPane.showMessageDialog(null, "El usuario no ha sido registrado");
		}	

	}

	public void getDataModifyUser ( ) {

		String nombre 			= ventanaJFrame.getPanelModificarUsuario().getTxtNombre			().getText();
		String apellido 		= ventanaJFrame.getPanelModificarUsuario().getTxtApellido		().getText();
		String fechaNacimiento 	= ventanaJFrame.getPanelModificarUsuario().getTxtFechaNacimiento().getText();
		String documento 		= ventanaJFrame.getPanelModificarUsuario().getTxtDocumento		().getText();		
		String fechaExpedicion 	= ventanaJFrame.getPanelModificarUsuario().getTxtFechaExpedicion().getText();
		String sexo 			= ventanaJFrame.getPanelModificarUsuario().getCbSexo			().getSelectedItem().toString();		
		String correo 			= ventanaJFrame.getPanelModificarUsuario().getTxtCorreo			().getText();		
		String contrasena 		= ventanaJFrame.getPanelModificarUsuario().getTxtContrasena		().getText();		
		String perfil			= ventanaJFrame.getPanelModificarUsuario().getCbTipoUser		().getSelectedItem().toString();

		if (nombre.isEmpty() || apellido.isEmpty() || fechaNacimiento.isEmpty() || documento.isEmpty()
				|| fechaExpedicion.isEmpty() || sexo.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || perfil.isEmpty()) {
			JOptionPane.showMessageDialog(null, "ERROR: Debe diligenciar todos los campos");


		} else {
			Usuario nuevoUsuario = new Usuario(nombre, apellido, fechaNacimiento, documento, fechaExpedicion, sexo.substring(0, 1), correo, contrasena, perfil.substring(0, 1));
						
			if (!correo.contains("@") || !correo.contains(".")) {
				JOptionPane.showMessageDialog(null, "ERROR: Correo invalido");
				return;
			}

			boolean result = false;

			result = m.getUsuarioDAO().modificarUsuario(nuevoUsuario); 

			if(result) {
				JOptionPane.showMessageDialog(null, "Usuario modificado correctamente " + nombre + 
						" " + apellido, "Modificación de usuario", JOptionPane.DEFAULT_OPTION);
				getLimpiaFormulario();
			}
		}
		

	}	

	public void getEliminarUsuario ( ) {

		String documento = JOptionPane.showInputDialog(null, "Ingrese el numero de cedula que quiere eliminar");
		m.getUsuarioDAO().eliminarUsuario(documento); 
		int comparacion = 0;
		for (int i = 0; i < listUsuario.size(); i++) {
			String cc = listUsuario.get(i).getDocumento();
			if(documento.equalsIgnoreCase(cc)) {
				comparacion=1;
			
			if(documento.equals(cc)) 
				m.getUsuarioDAO().eliminarUsuario(documento);
				JOptionPane.showMessageDialog(null, "Se ha eliminado");
			}else if(comparacion==0){
				JOptionPane.showMessageDialog(null, "El usuario no ha sido registrado");
			}
		}
	}

//	public void enviarCorreo() {
//
//		correo.setContraseña("Empresa312"); // nuestra contraseña del correo desde donde vamos a enviar el correo
//		correo.setUsuaioCorreo("hideseekmarket@gmail.com"); // Nuestro correo desde donde vamos a enviar el correo
//		correo.setAsunto("Bienvenidos a Hide & SeekMarket");
//		correo.setMensaje("Bievenido a nuestro sistema. Sus datos son los siguientes: \n\nUsuario: "
//				+ ventanaJFrame.getPanelCrearUsuario().getTxtCorreo().getText() + "\nContraseña: "
//				+ ventanaJFrame.getPanelCrearUsuario().getTxtContrasena().getText() + "\nNombre: "
//				+ ventanaJFrame.getPanelCrearUsuario().getTxtNombre().getText() + "\nApellido: "
//				+ ventanaJFrame.getPanelCrearUsuario().getTxtApellido().getText() + "\nFecha de nacimiento: "
//				+ ventanaJFrame.getPanelCrearUsuario().getTxtFechaNacimiento().getText() + "\nN° Documento: "
//				+ ventanaJFrame.getPanelCrearUsuario().getTxtDocumento().getText() + "\nFecha de expedicion: "
//				+ ventanaJFrame.getPanelCrearUsuario().getTxtFechaExpedicion().getText()
//				+ "\n\n¡Sea usted bievenido siempre!");
//		correo.setDestino(ventanaJFrame.getPanelCrearUsuario().getTxtCorreo().getText());
//
//		// Si queremos enviar un archivo adjunto (imagen, etc..)
//		correo.setNombreArchivo("Logo.jpg");
//		correo.setRutaArchivo("src\\resources\\carro.png");
//
//		if (eCorreo()) {
//			JOptionPane.showMessageDialog(null, "Mensaje enviado");
//		} else {
//			JOptionPane.showMessageDialog(null, "Mensaje no enviado");
//		}
//
//	}
//
//	public boolean eCorreo() {
//		try {
//
//			Properties p = new Properties();
//			p.put("mail.smtp.host", "smtp.gmail.com"); // Destinado para correos de gmail
//			p.setProperty("mail.smtp.starttls.enable", "true"); // Conexion de texto plano o conexion cifrada
//			p.setProperty("mail.smtp.port", "587"); // Valor de; puerto
//			p.setProperty("mail.smtp.user", correo.getUsuaioCorreo()); // Especificamos el usuario
//			p.setProperty("mail.smtp.auth", "true"); // Contraseña
//
//			Session s = Session.getDefaultInstance(p, null);
//			BodyPart texto = new MimeBodyPart();
//			texto.setText(correo.getMensaje());
//			BodyPart adjunto = new MimeBodyPart();
//			if (!correo.getRutaArchivo().equals("")) {
//				adjunto.setDataHandler(new DataHandler(new FileDataSource(correo.getRutaArchivo())));
//				adjunto.setFileName(correo.getNombreArchivo());
//			}
//			MimeMultipart m = new MimeMultipart();
//			m.addBodyPart(texto);
//			if (!correo.getRutaArchivo().equals("")) {
//				m.addBodyPart(adjunto);
//			}
//
//			MimeMessage mensaje = new MimeMessage(s);
//			mensaje.setFrom(new InternetAddress(correo.getUsuaioCorreo()));
//			mensaje.setRecipient(Message.RecipientType.TO, new InternetAddress(correo.getDestino()));
//
//			mensaje.setSubject(correo.getAsunto());
//			mensaje.setContent(m);
//
//			Transport t = s.getTransport("smtp");
//			t.connect(correo.getUsuaioCorreo(), correo.getContraseña());
//			t.sendMessage(mensaje, mensaje.getAllRecipients());
//			t.close();
//			return true;
//
//		} catch (Exception e) { // MessagingException
//			System.out.println("Error " + e);
//			return false;
//		}
//
//	}

	public void getSalir ( ) {
		int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?", "ADVERTENCIA !!",
				JOptionPane.YES_NO_OPTION);
		if (respuesta == JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}
	}

	public void getCargarImagen( ) {
		JFileChooser fileChooser = new JFileChooser(".");
		FileFilter filtro = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
		fileChooser.setFileFilter(filtro);
		int valor = fileChooser.showOpenDialog(fileChooser);
		if (valor == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {

				if (file.renameTo(new File("src\\temp\\" + file.getName()))) {
					ImageIcon img = new ImageIcon("src\\temp\\" + file.getName());
					ventanaJFrame.getPanelCrearUsuario().getLblFotoUsuario().setText("src\\temp\\" + file.getName());
					ventanaJFrame.getPanelCrearUsuario().getLblFotoUsuario().setIcon(img);
					ventanaJFrame.getPanelCrearUsuario().getLblFotoUsuario().repaint();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null, "No Se ha seleccionado ningun fichero", "_Error: No creado",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	public void getLimpiaFormulario() {

		ventanaJFrame.getPanelCrearUsuario().getTxtNombre			().setText("");
		ventanaJFrame.getPanelCrearUsuario().getTxtApellido			().setText("");
		ventanaJFrame.getPanelCrearUsuario().getTxtFechaNacimiento	().setText("");
		ventanaJFrame.getPanelCrearUsuario().getTxtDocumento		().setText("");
		ventanaJFrame.getPanelCrearUsuario().getTxtFechaExpedicion	().setText("");
		ventanaJFrame.getPanelCrearUsuario().getTxtCorreo			().setText("");
		ventanaJFrame.getPanelCrearUsuario().getTxtContrasena		().setText("");

		try {
			ventanaJFrame.getPanelCrearUsuario().getLblFotoUsuario().setText("");
			ventanaJFrame.getPanelCrearUsuario().getLblFotoUsuario().repaint();

		} catch (Exception e) {
			System.out.println("ERROR: " + e);
		}
	}

	public boolean getValidarFecha(String pFecha, String pCampo) {
		try {
			SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
			formatoFecha.setLenient(false);
			formatoFecha.parse(pFecha);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null,
					"Formato de fecha Invalivo en campo:  " + pCampo + ".	 Formato Valido (DD/MM/AAAA) ", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}
		return false;
	}

	public String getCalculaEdad(String pFechaNacimiento) {
		try {
			DateTimeFormatter 	fmt			= DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate 			fechaNac 	= LocalDate.parse(pFechaNacimiento, fmt);
			LocalDate 			ahora 		= LocalDate.now();

			Period periodo 			= Period.between(fechaNac, ahora);
			return  Integer.toString(periodo.getYears());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Formato de fecha Invalivo en campo: Fecha Nacimiento.	 Formato Valido (DD/MM/AAAA) ", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return "-1";
		}

	}

	public void getValidarPerfil ( ) {
		
	}

	public ArrayList<Usuario> filtrarUsuarios (ArrayList<Usuario> pFilter, String pAlmacen ) {
		ArrayList<Usuario> newListUsuarios = new ArrayList<Usuario>();
		return pFilter;

	}

	public void generarGrafica ( String pTipoGrafica, ArrayList<Usuario> listUsuario ) {


	}

	private int[] dataGraficaEdades( ArrayList<Usuario> listUsuario ) {

		return null;
	}


	private String[] calculaEstadisticas(ArrayList<Usuario> listUsuario) {

		return null;
	}

}
