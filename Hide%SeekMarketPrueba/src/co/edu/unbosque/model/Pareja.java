package co.edu.unbosque.model;

import java.io.Serializable;

public class Pareja implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String nombre;
	protected String documento;
	private   String pareja;
	protected String comercio;
	protected String apertura;
	protected String cierre;
	protected String cupo;
	
	public Pareja(String nombre, String documento,String pareja, String comercio, String apertura, String cierre) {
		this.nombre 	= nombre;
		this.documento 	= documento;
		this.pareja     =  pareja;
		this.comercio 	= comercio;
		this.apertura 	= apertura;
		this.cierre 	= cierre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getPareja() {
		return pareja;
	}

	public void setPareja(String pareja) {
		this.pareja = pareja;
	}

	public String getComercio() {
		return comercio;
	}

	public void setComercio(String comercio) {
		this.comercio = comercio;
	}

	public String getApertura() {
		return apertura;
	}

	public void setApertura(String apertura) {
		this.apertura = apertura;
	}

	public String getCierre() {
		return cierre;
	}

	public void setCierre(String cierre) {
		this.cierre = cierre;
	}

	public String getCupo() {
		return cupo;
	}

	public void setCupo(String cupo) {
		this.cupo = cupo;
	}

	@Override
	public String toString() {
		return 	nombre  	+ "; \r" +
				documento   + "; \r" +
				pareja 		+ "; \r" +				
				comercio 	+ "; \r" +
				apertura	+ "; \r" +
				cierre 		+ "; \r" +
				cupo 		+ "; \r" ;
	}
	
	

}