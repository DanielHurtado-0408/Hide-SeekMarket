package co.edu.unbosque.model;

import java.io.Serializable;

public class Productos implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String marca;
	protected double precio;
	protected String cantidad;
	protected String descripcion;
	protected String imagen;

	public Productos( String marca, double precio, String cantidad, String descripcion, String imagen ) {
		this.marca 			= marca;
		this.precio 		= precio;
		this.cantidad 		= cantidad;
		this.descripcion 	= descripcion;
		this.imagen 		= imagen;
	}
	
	public double compras(double cupo, double precioProducto) {
		
		double nuevoCupo = cupo - precioProducto;
		cupo = nuevoCupo;
		return cupo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return 	marca 		+ "; \r" +
				precio 		+ "; \r" +
				cantidad 	+ "; \r" +
				descripcion + "; \r" +
				imagen 		+ "; \r" ;
	}	
	
}