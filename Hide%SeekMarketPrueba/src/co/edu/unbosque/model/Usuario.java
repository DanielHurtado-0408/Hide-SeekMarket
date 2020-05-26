package co.edu.unbosque.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String nombre;
	protected String apellido;
	protected String fechaNacimiento;
	protected String documento;
	protected String fechaExpedicion;
	protected String sexo;
	protected String edad;
	protected String correo;
	protected String contrasena;
	protected String foto;
	protected String pareja;
	protected double cupo;
	protected String perfil;

	public Usuario(String nombre, String apellido, String fechaNacimiento, String documento, String fechaExpedicion,
			String sexo, String correo, String contrasena, String perfil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.documento = documento;
		this.fechaExpedicion = fechaExpedicion;
		this.sexo = sexo;
		this.edad = calculaEdad(fechaNacimiento);
		this.correo = correo;
		this.contrasena = contrasena;
		this.perfil = perfil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getPareja() {
		return pareja;
	}

	public void setPareja(String pareja) {
		this.pareja = pareja;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public double getCupo() {
		return cupo;
	}

	public void setCupo(double cupo) {
		this.cupo = cupo;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getEdad() {
		return edad;
	}

	public String calculaEdad(String pFechaNacimiento) {

		try {
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaNac = LocalDate.parse(pFechaNacimiento, fmt);
			LocalDate ahora = LocalDate.now();

			Period periodo = Period.between(fechaNac, ahora);
			return Integer.toString(periodo.getYears());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Formato de fecha Invalivo en campo: Fecha Nacimiento.	 Formato Valido (DD/MM/AAAA) ", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return "-1";
		}

	}

	@Override
	public String toString() {
		return nombre + "; \r" + apellido + "; \r" + fechaNacimiento + "; \r" + documento + "; \r" + fechaExpedicion
				+ "; \r" + sexo + "; \r" + correo + "; \r" + contrasena + "; \r" + foto + "; \r" + fechaNacimiento
				+ "; \r" + pareja + "; \r" + cupo + "; \r" + perfil + "; \r";
	}
}