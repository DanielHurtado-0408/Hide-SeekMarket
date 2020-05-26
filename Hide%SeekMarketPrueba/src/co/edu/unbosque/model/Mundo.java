package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.AlmacenDAO;
import co.edu.unbosque.model.persistence.ParejaDAO;
import co.edu.unbosque.model.persistence.UsuarioDAO;

public class Mundo {

	private Administrador administrador;
	private AlmacenDAO almacenDAO;
	private ParejaDAO parejaDAO;
	private UsuarioDAO usuarioDAO;

	public Mundo() {
		administrador = new Administrador();

		almacenDAO = new AlmacenDAO();

		parejaDAO = new ParejaDAO();

		usuarioDAO = new UsuarioDAO();
		

	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public AlmacenDAO getAlmacenDAO() {
		return almacenDAO;
	}

	public void setAlmacenDAO(AlmacenDAO almacenDAO) {
		this.almacenDAO = almacenDAO;
	}

	public ParejaDAO getParejaDAO() {
		return parejaDAO;
	}

	public void setParejaDAO(ParejaDAO parejaDAO) {
		this.parejaDAO = parejaDAO;
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}


	

}
