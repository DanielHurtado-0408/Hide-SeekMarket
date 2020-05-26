package co.edu.unbosque.model;

public class Correo {

	private String usuaioCorreo;
	private String nombreArchivo;
	private String contraseña;
	private String rutaArchivo;
	private String destino;
	private String asunto;
	private String mensaje;

	public String getUsuaioCorreo() {
		return usuaioCorreo;
	}

	public void setUsuaioCorreo(String usuaioCorreo) {
		this.usuaioCorreo = usuaioCorreo;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getRutaArchivo() {
		return rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}
}
