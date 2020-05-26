package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Usuario;

public class DaoArchivoUsuario {

	private File archivoUsuarios = new File("src/data/Usuarios.dat");

	public void guardarDatos(ArrayList<Usuario> listUsuario) throws IOException {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoUsuarios));
			oos.writeObject(listUsuario);
			oos.writeObject("\n");
			oos.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "ERROR: No se encontro el archivo");

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERROR: No se puede escribir en el archivo");

		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Usuario> cargarDatos() {
		ArrayList<Usuario> listUsuario = new ArrayList<Usuario>();

		if (archivoUsuarios.length() != 0) {
			try {
				FileInputStream fis = new FileInputStream(archivoUsuarios);
				ObjectInputStream ois = new ObjectInputStream(fis);
				listUsuario = (ArrayList<Usuario>) ois.readObject();
				ois.close();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "No se encuentra el archivo");
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Hubo error al leer el archivo");
			} catch (ClassNotFoundException e) {
				JOptionPane.showMessageDialog(null, "La clase no existe");
			} catch (ClassCastException e) {
				JOptionPane.showMessageDialog(null, "Hubo un error al hacer el cast");
			}
		}
		return listUsuario;
	}

	public File getArchivoUsuarios() {
		return archivoUsuarios;
	}

}
