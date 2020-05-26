package co.edu.unbosque.model;

import java.io.Serializable;

public class Almacen implements Serializable {
	private static final long serialVersionUID = 1L;

	protected String nombre;
	protected String id;
	protected String direccion;
	protected String apertura;
	protected String cierre;	
	
	public Almacen(String nombre, String id, String direccion, String apertura, String cierre) {
		this.nombre = nombre;
		this.id = id;
		this.direccion = direccion;
		this.apertura = apertura;
		this.cierre = cierre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	@Override
	public String toString() {
		return 	nombre 		+ "; \r" +
				id 			+ "; \r" + 
				direccion 	+ "; \r" +
				apertura	+ "; \r" +
				cierre 		+ "; \r" ;
	}	

}