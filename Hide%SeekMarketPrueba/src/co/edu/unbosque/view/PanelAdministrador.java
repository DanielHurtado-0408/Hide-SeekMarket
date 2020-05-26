package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelAdministrador extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton btnCancelar;
	private JMenuBar barraSuperior;
	private JMenu usuarios;
	private JMenu almacenes;
	private JMenu tarjetas;
	private JMenu informacion;
	private JMenuItem crearUsuarios;
	private JMenuItem asignarPareja;
	private JMenuItem modificarUser;
	private JMenuItem eliminarUser;
	private JMenuItem crearAlmacen;
	private JMenuItem consultarAlmacen;
	private JMenuItem estadisticas;

	ImageIcon iconAddUser = new ImageIcon("src/resources/iconAgregarUsuario.png");
	ImageIcon iconExit = new ImageIcon("src/resources/iconExit.png");

	public PanelAdministrador() {

		setLayout(null);
		setVisible(false);
		setBackground(Color.gray);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 10, 0), new TitledBorder("Centro de administración")));

		btnCancelar = new JButton(" Salir ");
		btnCancelar.setBackground(new Color(0, 77, 64));
		btnCancelar.setFont(new Font("Tahoma", 1, 11));
		btnCancelar.setForeground(Color.white);
		btnCancelar.setBounds(800, 450, 140, 30);

		barraSuperior = new JMenuBar();
		barraSuperior.setBounds(320, 20, 280, 30);

		usuarios = new JMenu("Usuarios");
		almacenes = new JMenu("Comercios");
		tarjetas = new JMenu("Tarjetas");
		informacion = new JMenu("Informacion");

		crearUsuarios = new JMenuItem("Crear Usuario");
		asignarPareja = new JMenuItem("Asignar Pareja");
		modificarUser = new JMenuItem("Modificar Usuario");
		eliminarUser = new JMenuItem("Eliminar Usuario");
		crearAlmacen = new JMenuItem("Crear Almacen");
		consultarAlmacen = new JMenuItem("Consultar Almacen");
		estadisticas = new JMenuItem("Graficas");

		add(btnCancelar);
		add(barraSuperior);

		barraSuperior.add(usuarios);
		usuarios.add(crearUsuarios);
		usuarios.add(modificarUser);
		usuarios.add(eliminarUser);
		usuarios.add(asignarPareja);

		barraSuperior.add(almacenes);
		almacenes.add(crearAlmacen);
		almacenes.add(consultarAlmacen);

		barraSuperior.add(tarjetas);
		barraSuperior.add(informacion);
		informacion.add(estadisticas);

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

	public JMenu getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(JMenu usuarios) {
		this.usuarios = usuarios;
	}

	public JMenu getAlmacenes() {
		return almacenes;
	}

	public void setAlmacenes(JMenu almacenes) {
		this.almacenes = almacenes;
	}

	public JMenu getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(JMenu tarjetas) {
		this.tarjetas = tarjetas;
	}

	public JMenuItem getCrearUsuarios() {
		return crearUsuarios;
	}

	public void setCrearUsuarios(JMenuItem crearUsuarios) {
		this.crearUsuarios = crearUsuarios;
	}

	public JMenuItem getConsultarUsuarios() {
		return asignarPareja;
	}

	public void setConsultarUsuarios(JMenuItem consultarUsuarios) {
		this.asignarPareja = consultarUsuarios;
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

	public JMenu getInformacion() {
		return informacion;
	}

	public void setInformacion(JMenu informacion) {
		this.informacion = informacion;
	}

	public JMenuItem getEstadisticas() {
		return estadisticas;
	}

	public void setEstadisticas(JMenuItem estadisticas) {
		this.estadisticas = estadisticas;
	}

	public JMenuItem getAsignarPareja() {
		return asignarPareja;
	}

	public JMenuItem getModificarUser() {
		return modificarUser;
	}

	public JMenuItem getEliminarUser() {
		return eliminarUser;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		File carro = new File("src/resources/carro.png");

		try {
			imagen = ImageIO.read(carro);

		} catch (IOException e) {
			System.out.println("No se encuentra el logo " + "");
		}
		g.drawImage(imagen, 270, 23, null);

	}

	private Image imagen;
}

