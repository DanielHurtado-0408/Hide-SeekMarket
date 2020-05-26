package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private int alturaPantalla;
	private int anchoPantalla;
	private Image iconJFrame;

	private PanelLogin panelLogin;
	private PanelAdministrador panelAdministrador;
	private PanelCrearUsuario panelCrearUsuario;
	private PanelUsuario panelUsuario;
	private PanelModificarUsuario panelModificarUsuario;
	private PanelConsultarUsuarios panelConsultarUsuario;
	private PanelCrearAlmacen panelCrearAlmacen;
	private PanelEstadisticas panelEstadisticas;
	private PanelAsignarParejas panelAsignarParejas;

	public VentanaJFrame() {

		panelLogin = new PanelLogin();
		panelUsuario = new PanelUsuario();
		panelAdministrador = new PanelAdministrador();
		panelCrearUsuario = new PanelCrearUsuario();
		panelConsultarUsuario = new PanelConsultarUsuarios();
		panelCrearAlmacen = new PanelCrearAlmacen();
		panelEstadisticas = new PanelEstadisticas();
		panelModificarUsuario = new PanelModificarUsuario();
		setPanelAsignarParejas(new PanelAsignarParejas());

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = toolkit.getScreenSize();

		alturaPantalla = tamanoPantalla.height;
		anchoPantalla = tamanoPantalla.width;
		iconJFrame = toolkit.getImage("src/resources/carro.png");

		setIconImage(iconJFrame);
		setSize(anchoPantalla / 2, alturaPantalla / 2);
		setLocation(anchoPantalla / 4, alturaPantalla / 4);
		setTitle("Hide & Seet Market");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(panelCrearAlmacen);
		add(panelEstadisticas);
		add(panelCrearUsuario);
		add(panelConsultarUsuario);
		add(panelModificarUsuario);
		add(panelAdministrador);
		add(panelLogin);
		add(panelUsuario);

	}

	public PanelLogin getPanelLogin() {
		return panelLogin;
	}

	public PanelAdministrador getPanelAdministrador() {
		return panelAdministrador;
	}

	public PanelCrearUsuario getPanelCrearUsuario() {
		return panelCrearUsuario;
	}

	public PanelEstadisticas getPanelEstadisticas() {
		return panelEstadisticas;
	}

	public PanelUsuario getPanelUsuario() {
		return panelUsuario;
	}

	public PanelConsultarUsuarios getPanelConsultarUsuario() {
		return panelConsultarUsuario;
	}

	public PanelCrearAlmacen getPanelCrearAlmacen() {
		return panelCrearAlmacen;
	}

	public PanelModificarUsuario getPanelModificarUsuario() {
		return panelModificarUsuario;
	}
	
	
	public String cargarString(String mensaje) {
		
		String m = JOptionPane.showInputDialog(mensaje);
		return m;
	}
	
public double cargarDouble() {
		
		String m = JOptionPane.showInputDialog("introduzca puntaje: ");
		double numero = Double.parseDouble(m);
		return numero;
	}

public PanelAsignarParejas getPanelAsignarParejas() {
	return panelAsignarParejas;
}

public void setPanelAsignarParejas(PanelAsignarParejas panelAsignarParejas) {
	this.panelAsignarParejas = panelAsignarParejas;
}



}