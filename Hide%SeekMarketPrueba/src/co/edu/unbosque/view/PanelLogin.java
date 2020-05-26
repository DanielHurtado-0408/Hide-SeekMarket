package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelLogin extends JPanel {

	// Atributos
	private static final long serialVersionUID = 1L;

	private JLabel lblUsuario;
	private JLabel lblContrasena;

	private JTextField txtUsuario;
	private JTextField txtContrasena;

	private JButton btnIngresar;
	private JButton btnCancelar;
	private JButton btnRegistrar;

	ImageIcon iconUser = new ImageIcon("src/resources/iconUser.png");
	ImageIcon iconPassword = new ImageIcon("src/resources/iconPassword.png");

	// Constructor
	public PanelLogin() {

		setLayout(null);
		setVisible(false);
		setBackground(Color.gray);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 20, 0), new TitledBorder("Bienvenidos")));

		lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setBounds(280, 250, 50, 20);
		lblUsuario.setIcon(new ImageIcon(iconUser.getImage().getScaledInstance(lblUsuario.getWidth(),
				lblUsuario.getHeight(), Image.SCALE_SMOOTH)));

		lblContrasena = new JLabel("Contraseña: ");
		lblContrasena.setBounds(280, 300, 50, 20);
		lblContrasena.setIcon(new ImageIcon(iconPassword.getImage().getScaledInstance(lblContrasena.getWidth(),
				lblContrasena.getHeight(), Image.SCALE_SMOOTH)));

		txtUsuario = new JTextField(" ");
		txtUsuario.setBounds(340, 250, 200, 30);

		txtContrasena = new JTextField(" ");
		txtContrasena.setBounds(340, 300, 200, 30);

		btnIngresar = new JButton(" Ingresar ");
		btnIngresar.setBackground(new Color(0, 150, 136));
		btnIngresar.setBounds(300, 380, 140, 30);

		btnCancelar = new JButton(" Cancelar ");
		btnCancelar.setBackground(new Color(0, 150, 136));
		btnCancelar.setBounds(450, 380, 140, 30);

		btnRegistrar = new JButton("Crear Usuario");
		btnRegistrar.setBackground(new Color(0, 150, 136));
		btnRegistrar.setBounds(380, 445, 130, 30);

		// Agregar al JPanel
		add(lblUsuario);
		add(lblContrasena);

		add(txtUsuario);
		add(txtContrasena);

		add(btnIngresar);
		add(btnCancelar);
		add(btnRegistrar);

	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JTextField getTxtContrasena() {
		return txtContrasena;
	}

	public void setTxtContrasena(JTextField txtContrasena) {
		this.txtContrasena = txtContrasena;
	}

	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	public void setBtnIngresar(JButton btnIngresar) {
		this.btnIngresar = btnIngresar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	// Metodo para agregar imagen de fondo
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