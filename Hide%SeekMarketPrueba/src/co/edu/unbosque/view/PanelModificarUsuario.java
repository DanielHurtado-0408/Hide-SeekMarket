package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import utils.TextPrompt;

public class PanelModificarUsuario extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblFechaNacimiento;
	private JLabel lblDocumento;
	private JLabel lblFechaExpedicion;
	private JLabel lblCorreo;
	private JLabel lblContrasena;
	private JLabel lblSexo;
	private JLabel lblFotoUsuario;
	private JLabel lblPerfil;

	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDocumento;
	private JTextField txtCorreo;
	private JTextField txtContrasena;
	private JTextField txtFechaExpedicion;
	private JTextField txtFechaNacimiento;

	private JComboBox<String> cbSexo;
	private JComboBox<String> cbTipoUser;

	private JButton btnSave;
	private JButton btnRegresar;
	private JButton btnDelete;
	private JButton btnAgregarFoto;

	ImageIcon iconFoto = new ImageIcon("src/resources/iconFoto.png");
	ImageIcon iconAdd = new ImageIcon("src/resources/add.png");
	ImageIcon iconCorreo = new ImageIcon("src/resources/iconMail.jpg");
	ImageIcon iconId = new ImageIcon("src/resources/iconIdentidad.png");
	ImageIcon iconSexo = new ImageIcon("src/resources/iconSexo.jpg");
	ImageIcon iconPassword = new ImageIcon("src/resources/iconPassword.png");
	ImageIcon iconCalendar = new ImageIcon("src/resources/iconCalendario.jpg");
	ImageIcon iconPerfil = new ImageIcon("src/resources/iconPerfil.png");

	public PanelModificarUsuario() {

		setLayout(null);
		setVisible(false);
		setBackground(Color.white);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 10, 0), new TitledBorder("Creación de usuarios")));

		lblFotoUsuario = new JLabel("Foto");
		lblFotoUsuario.setBackground(Color.white);
		lblFotoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoUsuario.setBounds(354, 21, 208, 108);
		lblFotoUsuario.setIcon(new ImageIcon(iconFoto.getImage().getScaledInstance(lblFotoUsuario.getWidth(),
				lblFotoUsuario.getHeight(), Image.SCALE_SMOOTH)));

		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 140, 208, 20);

		txtNombre = new JTextField();
		txtNombre.setBounds(64, 140, 208, 20);
		TextPrompt nombrePt = new TextPrompt("Nombre del usuario", txtNombre);
		nombrePt.changeAlpha(0.55f);
		nombrePt.changeStyle(Font.ITALIC);

		lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(290, 140, 208, 20);

		txtApellido = new JTextField();
		txtApellido.setBounds(344, 140, 208, 20);
		TextPrompt apellidosPt = new TextPrompt("Apellidos del usuario", txtApellido);
		apellidosPt.changeAlpha(0.55f);
		apellidosPt.changeStyle(Font.ITALIC);

		lblFechaNacimiento = new JLabel("Fecha de Nacimiento: ");
		lblFechaNacimiento.setBounds(560, 140, 130, 20);

		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(688, 140, 208, 20);
		TextPrompt fechaNacimientoPt = new TextPrompt(" 01/10/1960 ", txtFechaNacimiento);
		fechaNacimientoPt.changeAlpha(0.55f);
		fechaNacimientoPt.changeStyle(Font.ITALIC);

		lblDocumento = new JLabel("");
		lblDocumento.setBackground(Color.white);
		lblDocumento.setBounds(290, 180, 50, 20);
		lblDocumento.setIcon(new ImageIcon(iconId.getImage().getScaledInstance(lblDocumento.getWidth(),
				lblDocumento.getHeight(), Image.SCALE_SMOOTH)));

		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(344, 180, 208, 20);
		TextPrompt documentoPt = new TextPrompt("Identificación", txtDocumento);
		documentoPt.changeAlpha(0.55f);
		documentoPt.changeStyle(Font.ITALIC);

		lblFechaExpedicion = new JLabel(" Fecha de Expedición: ");
		lblFechaExpedicion.setBounds(560, 180, 130, 20);

		txtFechaExpedicion = new JTextField();
		txtFechaExpedicion.setColumns(10);
		txtFechaExpedicion.setBounds(688, 180, 208, 20);

		TextPrompt fechaExpedicionPt = new TextPrompt(" 01/10/1989 ", txtFechaExpedicion);
		fechaExpedicionPt.changeAlpha(0.55f);
		fechaExpedicionPt.changeStyle(Font.ITALIC);

		lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 180, 50, 20);
		lblSexo.setIcon(new ImageIcon(
				iconSexo.getImage().getScaledInstance(lblSexo.getWidth(), lblSexo.getHeight(), Image.SCALE_SMOOTH)));

		cbSexo = new JComboBox<String>();
		cbSexo.setBackground(Color.WHITE);
		cbSexo.setModel(new DefaultComboBoxModel<String>(new String[] { "Seleccione", "Masculino", "Femenino" }));
		cbSexo.setBounds(64, 180, 208, 22);

		lblPerfil = new JLabel("");
		lblPerfil.setBounds(622, 220, 50, 20);
		lblPerfil.setIcon(new ImageIcon(iconPerfil.getImage().getScaledInstance(lblPerfil.getWidth(),
				lblPerfil.getHeight(), Image.SCALE_SMOOTH)));

		cbTipoUser = new JComboBox<String>();
		cbTipoUser.setBackground(Color.WHITE);
		cbTipoUser
				.setModel(new DefaultComboBoxModel<String>(new String[] { "Seleccione", "Cliente", "Administrador" }));
		cbTipoUser.setBounds(688, 220, 208, 22);

		lblCorreo = new JLabel("Correo: ");
		lblCorreo.setBounds(10, 220, 50, 20);
		lblCorreo.setIcon(new ImageIcon(iconCorreo.getImage().getScaledInstance(lblCorreo.getWidth(),
				lblCorreo.getHeight(), Image.SCALE_SMOOTH)));

		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(64, 220, 208, 20);

		TextPrompt correoPt = new TextPrompt("Correo Electronico", txtCorreo);
		correoPt.changeAlpha(0.55f);
		correoPt.changeStyle(Font.ITALIC);

		lblContrasena = new JLabel("");
		lblContrasena.setBounds(290, 220, 50, 20);
		lblContrasena.setIcon(new ImageIcon(iconPassword.getImage().getScaledInstance(lblContrasena.getWidth(),
				lblContrasena.getHeight(), Image.SCALE_SMOOTH)));

		txtContrasena = new JTextField();
		txtContrasena.setBounds(344, 220, 208, 20);

		TextPrompt contrasenaPt = new TextPrompt("Asignar Contraseña", txtContrasena);
		contrasenaPt.changeAlpha(0.55f);
		contrasenaPt.changeStyle(Font.ITALIC);

		btnAgregarFoto = new JButton("Foto");
		btnAgregarFoto.setBackground(Color.white);
		btnAgregarFoto.setBounds(532, 107, 50, 20);
		btnAgregarFoto.setIcon(new ImageIcon(iconAdd.getImage().getScaledInstance(btnAgregarFoto.getWidth(),
				btnAgregarFoto.getHeight(), Image.SCALE_SMOOTH)));

		btnSave = new JButton("Guardar");
		btnSave.setBounds(440, 455, 140, 30);

		btnDelete = new JButton("Borrar");
		btnDelete.setBounds(300, 455, 140, 30);

		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(800, 455, 140, 30);

		// Adicion de elementos al panel
		add(btnSave);
		add(btnDelete);
		add(btnRegresar);
		add(btnAgregarFoto);

		add(lblFotoUsuario);
		add(lblNombre);
		add(lblApellido);
		add(lblFechaNacimiento);
		add(lblDocumento);
		add(lblFechaExpedicion);
		add(lblSexo);
		add(lblCorreo);
		add(lblContrasena);
		add(lblPerfil);

		add(txtNombre);
		add(txtApellido);
		add(txtFechaNacimiento);
		add(txtDocumento);
		add(txtFechaExpedicion);
		add(cbSexo);
		add(cbTipoUser);
		add(txtCorreo);
		add(txtContrasena);
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextField getTxtDocumento() {
		return txtDocumento;
	}

	public void setTxtDocumento(JTextField txtDocumento) {
		this.txtDocumento = txtDocumento;
	}

	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}

	public JTextField getTxtContrasena() {
		return txtContrasena;
	}

	public void setTxtContrasena(JTextField txtContrasena) {
		this.txtContrasena = txtContrasena;
	}

	public JTextField getTxtFechaExpedicion() {
		return txtFechaExpedicion;
	}

	public void setTxtFechaExpedicion(JTextField txtFechaExpedicion) {
		this.txtFechaExpedicion = txtFechaExpedicion;
	}

	public JTextField getTxtFechaNacimiento() {
		return txtFechaNacimiento;
	}

	public void setTxtFechaNacimiento(JTextField txtFechaNacimiento) {
		this.txtFechaNacimiento = txtFechaNacimiento;
	}

	public JComboBox<String> getCbSexo() {
		return cbSexo;
	}

	public void setCbSexo(JComboBox<String> cbSexo) {
		this.cbSexo = cbSexo;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public void setBtnRegresar(JButton btnRegresar) {
		this.btnRegresar = btnRegresar;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	public JButton getBtnAgregarFoto() {
		return btnAgregarFoto;
	}

	public void setBtnAgregarFoto(JButton btnAgregarFoto) {
		this.btnAgregarFoto = btnAgregarFoto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public JLabel getLblApellido() {
		return lblApellido;
	}

	public void setLblApellido(JLabel lblApellido) {
		this.lblApellido = lblApellido;
	}

	public JLabel getLblFechaNacimiento() {
		return lblFechaNacimiento;
	}

	public void setLblFechaNacimiento(JLabel lblFechaNacimiento) {
		this.lblFechaNacimiento = lblFechaNacimiento;
	}

	public JLabel getLblDocumento() {
		return lblDocumento;
	}

	public void setLblDocumento(JLabel lblDocumento) {
		this.lblDocumento = lblDocumento;
	}

	public JLabel getLblFechaExpedicion() {
		return lblFechaExpedicion;
	}

	public void setLblFechaExpedicion(JLabel lblFechaExpedicion) {
		this.lblFechaExpedicion = lblFechaExpedicion;
	}

	public JLabel getLblCorreo() {
		return lblCorreo;
	}

	public void setLblCorreo(JLabel lblCorreo) {
		this.lblCorreo = lblCorreo;
	}

	public JLabel getLblContrasena() {
		return lblContrasena;
	}

	public void setLblContrasena(JLabel lblContrasena) {
		this.lblContrasena = lblContrasena;
	}

	public JLabel getLblSexo() {
		return lblSexo;
	}

	public void setLblSexo(JLabel lblSexo) {
		this.lblSexo = lblSexo;
	}

	public JLabel getLblFotoUsuario() {
		return lblFotoUsuario;
	}

	public void setLblFotoUsuario(JLabel lblFotoUsuario) {
		this.lblFotoUsuario = lblFotoUsuario;
	}

	public JComboBox<String> getCbTipoUser() {
		return cbTipoUser;
	}

	public void setCbTipoUser(JComboBox<String> cbTipoUser) {
		this.cbTipoUser = cbTipoUser;
	}

}