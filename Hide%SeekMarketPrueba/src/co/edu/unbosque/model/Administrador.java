package co.edu.unbosque.model;

public class Administrador {
	

	protected String nombre;
	protected String apeliido;
	protected String Id;
	protected String correo;
	protected String contrase�a;
	protected Usuario cliente;

	public Administrador() {

		this.nombre = "Pedro";
		this.apeliido = "Villa";
		this.Id = "1000435678";
		this.correo = "";
		this.contrase�a = "";

	}

	public void asignarParejas(Pareja pareja) {
		cliente.setPareja(pareja.getPareja());
		
		// cliente.getPareja();
	}

	public double AsignarCupo() {
		double cupo = Math.random() * 1000000 + 500000;
		return cupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApeliido() {
		return apeliido;
	}

	public void setApeliido(String apeliido) {
		this.apeliido = apeliido;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	
//	public double moda() {
//		
//	}
	
	

}
