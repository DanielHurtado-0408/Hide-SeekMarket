package co.edu.unbosque.model.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Usuario;

public class UsuarioDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	List<Usuario> Usuarios;
	BaseDatosFile BD;
	
	public UsuarioDAO() {
		Usuarios = new ArrayList<>();
		BD = new BaseDatosFile();
		Usuario usuario1 = new Usuario("Dani", "Alves", "09/12/1999", "163971849","09/12/2000",
				"masculino", "danialves@gmail.com,","dani", "cliente");
		Usuario usuario2 = new Usuario("Juan", "Alves", "09/12/1999", "163971849","09/12/2000",
				"masculino", "danialves@gmail.com,","dani", "cliente");
		Usuario usuario3 = new Usuario("Pedro", "Alves", "09/12/1999", "163971849","09/12/2000",
				"masculino", "danialves@gmail.com,","dani", "cliente");
		Usuarios.add(usuario1);
		Usuarios.add(usuario2);
		Usuarios.add(usuario3);

	}

	public boolean agregarUsuario(Usuario usuario) {
		boolean mensaje =true;

		Usuarios.add(usuario);
		mensaje = true;
		BD.escribirArchivoUsuarios(Usuarios);
		return mensaje;
	}

	public boolean modificarUsuario(Usuario usuario) {
		Usuario Usuario = null;
		boolean result  = true;
		for (int i = 0; i < Usuarios.size(); i++) {
			if (Usuarios.get(i).equals(usuario)) {
				Usuarios.get(i).setNombre(usuario.getNombre());
				Usuarios.get(i).setApellido(usuario.getApellido());
				Usuarios.get(i).setFechaNacimiento(usuario.getFechaNacimiento());
				Usuarios.get(i).setDocumento(usuario.getDocumento());
				Usuarios.get(i).setFechaExpedicion(usuario.getFechaExpedicion());
				Usuarios.get(i).setSexo(usuario.getSexo());
				Usuarios.get(i).setCorreo(usuario.getCorreo());
				Usuarios.get(i).setContrasena(usuario.getContrasena());
				Usuarios.get(i).setFoto(usuario.getFoto());
				Usuarios.get(i).setEdad(usuario.getEdad());
				Usuarios.get(i).setPareja(usuario.getPareja());
				Usuarios.get(i).setCupo(usuario.getCupo());
				Usuarios.get(i).setPerfil(usuario.getPerfil());
				Usuario = Usuarios.get(i);
			}
		}
		BD.escribirArchivoUsuarios(Usuarios);
		return result;
	}

	public String eliminarUsuario(String documento) {
		String mensaje = null;
		for (int i = 0; i < Usuarios.size(); i++) {
			if (Usuarios.get(i).getDocumento().equals(documento)) {
				Usuarios.remove(Usuarios.get(i));
				mensaje = ("Usuario " + documento + " fue eliminado exitosamente");
			}
		}
		BD.escribirArchivoUsuarios(Usuarios);
		return mensaje;
	}

	public String ListaUsuarios() {
		String mensaje = "";

		for (int i = 0; i < Usuarios.size(); i++) {
			mensaje += " nombre: " + Usuarios.get(i).getNombre() + "apellido: " + Usuarios.get(i).getApellido()
					+ "Fecha de  Nacimiento: " + Usuarios.get(i).getFechaNacimiento() + "Documento: "
					+ Usuarios.get(i).getDocumento() + "Fecha de expedicion: " + Usuarios.get(i).getFechaExpedicion()
					+ "Sexo: " + Usuarios.get(i).getSexo() + "Correo: " + Usuarios.get(i).getCorreo() + "Contraseña: "
					+ Usuarios.get(i).getContrasena() + "Pareja: " + Usuarios.get(i).getPareja() + "Cupo: "
					+ Usuarios.get(i).getCupo() + "Perfil: " + Usuarios.get(i).getPerfil();
		}

		BD.escribirArchivoUsuarios(Usuarios);
		return mensaje;

	}

	public String buscarUsuarioPorDocumentoString(String documento) {

		String mensaje = null;
		for (int i = 0; i < Usuarios.size(); i++) {
			if (Usuarios.get(i).getDocumento().equals(documento)) {
				mensaje = documento + " encontrado exitosamente " + " nombre: " + Usuarios.get(i).getNombre()
						+ "apellido: " + Usuarios.get(i).getApellido() + "Fecha de  Nacimiento: "
						+ Usuarios.get(i).getFechaNacimiento() + "Documento: " + Usuarios.get(i).getDocumento()
						+ "Fecha de expedicion: " + Usuarios.get(i).getFechaExpedicion() + "Sexo: "
						+ Usuarios.get(i).getSexo() + "Correo: " + Usuarios.get(i).getCorreo() + "Contraseña: "
						+ Usuarios.get(i).getContrasena() + "Pareja: " + Usuarios.get(i).getPareja() + "Cupo: "
						+ Usuarios.get(i).getCupo() + "Perfil: " + Usuarios.get(i).getPerfil();

			}
		}
		BD.escribirArchivoUsuarios(Usuarios);
		return mensaje;
	}

	public Usuario buscarUsuarioPorDocumnto(String documento) {
		String mensaje = "";
		Usuario usuario = null;
		for (int i = 0; i < Usuarios.size(); i++) {
			if (Usuarios.get(i).getDocumento().equals(documento)) {
				usuario = Usuarios.get(i);
			}
		}
		BD.escribirArchivoUsuarios(Usuarios);
		return usuario;
	}

	public List<Usuario> getUsuarios() {
		return Usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		Usuarios = usuarios;
	}

	public BaseDatosFile getBD() {
		return BD;
	}

	public void setBD(BaseDatosFile bD) {
		BD = bD;
	}

}
