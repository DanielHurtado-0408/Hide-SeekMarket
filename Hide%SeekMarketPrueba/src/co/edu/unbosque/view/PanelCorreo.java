package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class PanelCorreo extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel labCorreoDestino;
	private JTextField txtCorreoDestino;
	private JLabel labAsunto;
	private JTextField txtAsunto;
	private JLabel labMensaje;
	private TextArea txtMensaje;
	private JButton btonEnviarCorreo;
	private Color colorRojo = new Color(125, 0, 0);

	public PanelCorreo() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {

		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("Correo");
		border.setTitleColor(Color.BLACK);
		setBorder(border);

		labCorreoDestino = new JLabel("Correo de destino:", SwingConstants.CENTER);
		labCorreoDestino.setForeground(Color.BLACK);
		labCorreoDestino.setFont(new Font("Times New Roman", 0, 20));
		labCorreoDestino.setBounds(40, 58, 174, 28);
		add(labCorreoDestino);

		txtCorreoDestino = new JTextField();
		txtCorreoDestino.setForeground(Color.black);
		txtCorreoDestino.setFont(new Font("Times New Roman", 0, 20));
		txtCorreoDestino.setEditable(true);
		txtCorreoDestino.setBounds(40, 86, 448, 33);
		add(txtCorreoDestino, BorderLayout.CENTER);

		labAsunto = new JLabel("Asunto del correo:", SwingConstants.CENTER);
		labAsunto.setForeground(Color.BLACK);
		labAsunto.setFont(new Font("Times New Roman", 0, 20));
		labAsunto.setBounds(40, 135, 174, 28);
		add(labAsunto);

		txtAsunto = new JTextField();
		txtAsunto.setForeground(Color.black);
		txtAsunto.setFont(new Font("Times New Roman", 0, 20));
		txtAsunto.setEditable(true);
		txtAsunto.setBounds(40, 163, 448, 33);
		add(txtAsunto, BorderLayout.CENTER);

		labMensaje = new JLabel("Mensaje:", SwingConstants.CENTER);
		labMensaje.setForeground(Color.BLACK);
		labMensaje.setFont(new Font("Times New Roman", 0, 20));
		labMensaje.setBounds(47, 217, 78, 24);
		add(labMensaje);

		txtMensaje = new TextArea();
		txtMensaje.setForeground(Color.black);
		txtMensaje.setFont(new Font("Times New Roman", 0, 20));
		txtMensaje.setEditable(true);
		txtMensaje.setBounds(40, 241, 448, 150);
		add(txtMensaje, BorderLayout.CENTER);

		btonEnviarCorreo = new JButton("Enviar correo");
		btonEnviarCorreo.setForeground(Color.WHITE);
		btonEnviarCorreo.setBackground(colorRojo);
		btonEnviarCorreo.setFont(new Font("Times New Roman", 0, 40));
		btonEnviarCorreo.setBounds(125, 410, 279, 61);
		add(btonEnviarCorreo);

	}

	public JLabel getLabCorreoDestino() {
		return labCorreoDestino;
	}

	public void setLabCorreoDestino(JLabel labCorreoDestino) {
		this.labCorreoDestino = labCorreoDestino;
	}

	public JTextField getTxtCorreoDestino() {
		return txtCorreoDestino;
	}

	public void setTxtCorreoDestino(JTextField txtCorreoDestino) {
		this.txtCorreoDestino = txtCorreoDestino;
	}

	public JLabel getLabAsunto() {
		return labAsunto;
	}

	public void setLabAsunto(JLabel labAsunto) {
		this.labAsunto = labAsunto;
	}

	public JTextField getTxtAsunto() {
		return txtAsunto;
	}

	public void setTxtAsunto(JTextField txtAsunto) {
		this.txtAsunto = txtAsunto;
	}

	public JLabel getLabMensaje() {
		return labMensaje;
	}

	public void setLabMensaje(JLabel labMensaje) {
		this.labMensaje = labMensaje;
	}

	public TextArea getTxtMensaje() {
		return txtMensaje;
	}

	public void setTxtMensaje(TextArea txtMensaje) {
		this.txtMensaje = txtMensaje;
	}

	public JButton getBtonEnviarCorreo() {
		return btonEnviarCorreo;
	}

	public void setBtonEnviarCorreo(JButton btonEnviarCorreo) {
		this.btonEnviarCorreo = btonEnviarCorreo;
	}

	public Color getColorRojo() {
		return colorRojo;
	}

	public void setColorRojo(Color colorRojo) {
		this.colorRojo = colorRojo;
	}

}
