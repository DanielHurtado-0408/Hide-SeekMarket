package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelUsuario extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton btnCancelar;

	private JMenuBar barraSuperior;

	private JMenu carnes;
	private JMenu frutas;
	private JMenu lecteos;
	private JMenu granos;
	private JButton Login;

	private JMenuItem crearUsuarios;
	private JMenuItem asignarPareja;
	private JMenuItem modificarUser;
	private JMenuItem eliminarUser;
	private JMenuItem crearAlmacen;
	private JMenuItem consultarAlmacen;
	private JMenuItem estadisticas;

	ImageIcon iconAddUser = new ImageIcon("src/resources/iconAgregarUsuario.png");
	ImageIcon iconExit = new ImageIcon("src/resources/iconExit.png");
	ImageIcon iconLogin = new ImageIcon("src/resources/iconLogin.png");

	public PanelUsuario() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.white);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 10, 0), new TitledBorder("Bienvenidos")));

		Login = new JButton("");
		Login.setBackground(new Color(0, 150, 136));
		Login.setBounds(500, 100, 50, 20);
		Login.setIcon(new ImageIcon(
				iconLogin.getImage().getScaledInstance(Login.getWidth(), Login.getHeight(), Image.SCALE_SMOOTH)));

		barraSuperior = new JMenuBar();
		barraSuperior.setBackground(new Color(0, 150, 136));
		barraSuperior.setBounds(5, 20, 935, 40);

		carnes = new JMenu("Carnes");
		frutas = new JMenu("Frutas");
		lecteos = new JMenu("Lacteos");
		granos = new JMenu("Granos");

		crearUsuarios = new JMenuItem("Crear Usuario");
		asignarPareja = new JMenuItem("Asignar Pareja");
		modificarUser = new JMenuItem("Modificar Usuario");
		eliminarUser = new JMenuItem("Eliminar Usuario");
		crearAlmacen = new JMenuItem("Crear Almacen");
		consultarAlmacen = new JMenuItem("Consultar Almacen");
		estadisticas = new JMenuItem("Graficas");

		btnCancelar = new JButton(" Salir ");
		btnCancelar.setBackground(new Color(0, 150, 136));
		btnCancelar.setBounds(800, 450, 140, 30);

		add(btnCancelar);
		add(barraSuperior);

		barraSuperior.add(carnes);
		carnes.add(crearUsuarios);
		carnes.add(modificarUser);
		carnes.add(eliminarUser);
		carnes.add(asignarPareja);

		barraSuperior.add(frutas);
		frutas.add(crearAlmacen);
		frutas.add(consultarAlmacen);

		barraSuperior.add(lecteos);
		barraSuperior.add(granos);
		granos.add(estadisticas);

		barraSuperior.add(Login);

	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JMenuBar getBarraSuperior() {
		return barraSuperior;
	}

	public void setBarraSuperior(JMenuBar barraSuperior) {
		this.barraSuperior = barraSuperior;
	}

	public JMenu getCarnes() {
		return carnes;
	}

	public void setCarnes(JMenu carnes) {
		this.carnes = carnes;
	}

	public JMenu getFrutas() {
		return frutas;
	}

	public void setFrutas(JMenu frutas) {
		this.frutas = frutas;
	}

	public JMenu getLecteos() {
		return lecteos;
	}

	public void setLecteos(JMenu lecteos) {
		this.lecteos = lecteos;
	}

	public JMenu getGranos() {
		return granos;
	}

	public void setGranos(JMenu granos) {
		this.granos = granos;
	}

	public JButton getLogin() {
		return Login;
	}

	public void setLogin(JButton login) {
		Login = login;
	}

	public JMenuItem getCrearUsuarios() {
		return crearUsuarios;
	}

	public void setCrearUsuarios(JMenuItem crearUsuarios) {
		this.crearUsuarios = crearUsuarios;
	}

	public JMenuItem getAsignarPareja() {
		return asignarPareja;
	}

	public void setAsignarPareja(JMenuItem asignarPareja) {
		this.asignarPareja = asignarPareja;
	}

	public JMenuItem getModificarUser() {
		return modificarUser;
	}

	public void setModificarUser(JMenuItem modificarUser) {
		this.modificarUser = modificarUser;
	}

	public JMenuItem getEliminarUser() {
		return eliminarUser;
	}

	public void setEliminarUser(JMenuItem eliminarUser) {
		this.eliminarUser = eliminarUser;
	}

	public JMenuItem getCrearAlmacen() {
		return crearAlmacen;
	}

	public void setCrearAlmacen(JMenuItem crearAlmacen) {
		this.crearAlmacen = crearAlmacen;
	}

	public JMenuItem getConsultarAlmacen() {
		return consultarAlmacen;
	}

	public void setConsultarAlmacen(JMenuItem consultarAlmacen) {
		this.consultarAlmacen = consultarAlmacen;
	}

	public JMenuItem getEstadisticas() {
		return estadisticas;
	}

	public void setEstadisticas(JMenuItem estadisticas) {
		this.estadisticas = estadisticas;
	}

	public ImageIcon getIconAddUser() {
		return iconAddUser;
	}

	public void setIconAddUser(ImageIcon iconAddUser) {
		this.iconAddUser = iconAddUser;
	}

	public ImageIcon getIconExit() {
		return iconExit;
	}

	public void setIconExit(ImageIcon iconExit) {
		this.iconExit = iconExit;
	}

	public ImageIcon getIconLogin() {
		return iconLogin;
	}

	public void setIconLogin(ImageIcon iconLogin) {
		this.iconLogin = iconLogin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}