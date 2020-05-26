package co.edu.unbosque.model.persistence;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Almacen;
import co.edu.unbosque.model.Pareja;
import co.edu.unbosque.model.Usuario;

public class BaseDatosFile {

	private String rutaUsuarios = "C:\\proyectos\\archivosUsuario.out";
	private String rutaRegUsuarios = "C:\\proyectos\\registroUsuario.txt";
	private String rutaAlmacenes = "C:\\proyectos\\archivosAlmacenes.out";
	private String rutaRegAlmacenes = "C:\\proyectos\\registroAlmacenes.txt";
	private String rutaParejas = "C:\\proyectos\\archivosParejas.out";
	private String rutaRegParejas = "C:\\proyectos\\registroParejas.txt";

	private File f;
	private FileOutputStream fos;
	private DataOutputStream dos;
	private FileInputStream fis;
	private DataInputStream dis;
	private List<Usuario> usuarios;
	private List<Almacen> almacenes;
	private List<Pareja> parejas;

	public BaseDatosFile() {
		// TODO Auto-generated constructor stub
	}

	public void escribirArchivoUsuarios(List<Usuario> usuarios) {
		String mensaje = "Registro de Usuario!";

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaRegUsuarios));
			out.writeObject(usuarios);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> leerArchivoUsuarios(List<Usuario> usuarios) {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaRegUsuarios));
			usuarios = (ArrayList<Usuario>) in.readObject();
			in.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return usuarios;
	}

	public void escribirArchivoAlmacenes(List<Almacen> almacenes) {
		String mensaje = "Registro de Almacen!";

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaRegAlmacenes));
			out.writeObject(almacenes);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
	}

	@SuppressWarnings("unchecked")
	public List<Almacen> leerArchivoAlmacenes(List<Almacen> almacen) {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaRegAlmacenes));
			almacen = (ArrayList<Almacen>) in.readObject();
			in.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return almacen;
	}

	public void escribirArchivoParejas(List<Pareja> pareja) {
		String mensaje = "Registro de Pareja!";

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaRegParejas));
			out.writeObject(pareja);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
	}

	@SuppressWarnings("unchecked")
	public List<Pareja> leerArchivoPareja(List<Pareja> pareja) {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaRegParejas));
			pareja = (ArrayList<Pareja>) in.readObject();
			in.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return pareja;
	}

	public String getRutaUsuarios() {
		return rutaUsuarios;
	}

	public void setRutaUsuarios(String rutaUsuarios) {
		this.rutaUsuarios = rutaUsuarios;
	}

	public String getRutaRegUsuarios() {
		return rutaRegUsuarios;
	}

	public void setRutaRegUsuarios(String rutaRegUsuarios) {
		this.rutaRegUsuarios = rutaRegUsuarios;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

	public FileOutputStream getFos() {
		return fos;
	}

	public void setFos(FileOutputStream fos) {
		this.fos = fos;
	}

	public DataOutputStream getDos() {
		return dos;
	}

	public void setDos(DataOutputStream dos) {
		this.dos = dos;
	}

	public FileInputStream getFis() {
		return fis;
	}

	public void setFis(FileInputStream fis) {
		this.fis = fis;
	}

	public DataInputStream getDis() {
		return dis;
	}

	public void setDis(DataInputStream dis) {
		this.dis = dis;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public String getRutaAlmacenes() {
		return rutaAlmacenes;
	}

	public void setRutaAlmacenes(String rutaAlmacenes) {
		this.rutaAlmacenes = rutaAlmacenes;
	}

	public String getRutaRegAlmacenes() {
		return rutaRegAlmacenes;
	}

	public void setRutaRegAlmacenes(String rutaRegAlmacenes) {
		this.rutaRegAlmacenes = rutaRegAlmacenes;
	}

	public List<Almacen> getAlmacenes() {
		return almacenes;
	}

	public void setAlmacenes(List<Almacen> almacenes) {
		this.almacenes = almacenes;
	}

	public String getRutaParejas() {
		return rutaParejas;
	}

	public void setRutaParejas(String rutaParejas) {
		this.rutaParejas = rutaParejas;
	}

	public String getRutaRegParejas() {
		return rutaRegParejas;
	}

	public void setRutaRegParejas(String rutaRegParejas) {
		this.rutaRegParejas = rutaRegParejas;
	}

	public List<Pareja> getParejas() {
		return parejas;
	}

	public void setParejas(List<Pareja> parejas) {
		this.parejas = parejas;
	}
}