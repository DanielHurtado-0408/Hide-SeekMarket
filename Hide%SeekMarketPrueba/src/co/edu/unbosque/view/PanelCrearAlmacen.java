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

public class PanelCrearAlmacen extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel lblAlmacen;
	private JLabel lblNombre;
	private JLabel lblId;
	private JLabel lblDireccion;
	private JLabel lblHorario;
	private JLabel lblApertura;
	private JLabel lblCierre;

	private JTextField txtNombre;
	private JTextField txtId;
	private JTextField txtDireccion;

	private JComboBox<String> cbApertura;
	private JComboBox<String> cbCierre;

	private JButton btnSave;
	private JButton btnRegresar;
	private JButton btnDelete;

	ImageIcon iconAlmacen = new ImageIcon("src/resources/iconAlmacen.png");

	public PanelCrearAlmacen() {

		setLayout(null);
		setVisible(false);
		setBackground(Color.white);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 10, 0), new TitledBorder("Creación de Comercios")));

		lblAlmacen = new JLabel("Almacen");
		lblAlmacen.setBackground(Color.white);
		lblAlmacen.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmacen.setBounds(354, 21, 208, 108);
		lblAlmacen.setIcon(new ImageIcon(iconAlmacen.getImage().getScaledInstance(lblAlmacen.getWidth(),
				lblAlmacen.getHeight(), Image.SCALE_SMOOTH)));

		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 140, 208, 20);

		txtNombre = new JTextField();
		txtNombre.setBounds(64, 140, 208, 20);
		TextPrompt nombrePt = new TextPrompt("Nombre del Comercio", txtNombre);
		nombrePt.changeAlpha(0.55f);
		nombrePt.changeStyle(Font.ITALIC);

		lblId = new JLabel("ID Comercio:");
		lblId.setBounds(290, 140, 208, 20);

		txtId = new JTextField();
		txtId.setBounds(364, 140, 208, 20);
		TextPrompt apellidosPt = new TextPrompt("ID Comercio", txtId);
		apellidosPt.changeAlpha(0.55f);
		apellidosPt.changeStyle(Font.ITALIC);

		lblDireccion = new JLabel("Dirección: ");
		lblDireccion.setBounds(580, 140, 130, 20);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(650, 140, 208, 20);
		TextPrompt documentoPt = new TextPrompt("Dirección Comercio", txtDireccion);
		documentoPt.changeAlpha(0.55f);
		documentoPt.changeStyle(Font.ITALIC);

		lblHorario = new JLabel("Horario de Atención");
		lblHorario.setBounds(30, 180, 300, 30);

		lblApertura = new JLabel("Apertura:");
		lblApertura.setBounds(10, 220, 120, 20);

		cbApertura = new JComboBox<String>();
		cbApertura.setBackground(Color.WHITE);
		cbApertura.setModel(new DefaultComboBoxModel<String>(new String[] { "Seleccione", "00:00", "01:00", "02:00",
				"03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00",
				"14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
		cbApertura.setBounds(64, 220, 208, 22);

		lblCierre = new JLabel("Cierre:");
		lblCierre.setBounds(310, 220, 50, 20);

		cbCierre = new JComboBox<String>();
		cbCierre.setBackground(Color.WHITE);
		cbCierre.setModel(new DefaultComboBoxModel<String>(new String[] { "Seleccione", "00:00", "01:00", "02:00",
				"03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00",
				"14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
		cbCierre.setBounds(364, 220, 208, 22);

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

		add(lblAlmacen);
		add(lblNombre);
		add(lblId);
		add(lblDireccion);
		add(lblHorario);
		add(lblApertura);
		add(lblCierre);

		add(txtNombre);
		add(txtId);
		add(txtDireccion);
		add(cbApertura);
		add(cbCierre);

	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public JLabel getLblId() {
		return lblId;
	}

	public void setLblId(JLabel lblId) {
		this.lblId = lblId;
	}

	public JLabel getLblDireccion() {
		return lblDireccion;
	}

	public void setLblDireccion(JLabel lblDireccion) {
		this.lblDireccion = lblDireccion;
	}

	public JLabel getLblHorario() {
		return lblHorario;
	}

	public void setLblHorario(JLabel lblHorario) {
		this.lblHorario = lblHorario;
	}

	public JLabel getLblApertura() {
		return lblApertura;
	}

	public void setLblApertura(JLabel lblApertura) {
		this.lblApertura = lblApertura;
	}

	public JLabel getLblCierre() {
		return lblCierre;
	}

	public void setLblCierre(JLabel lblCierre) {
		this.lblCierre = lblCierre;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

	public JComboBox<String> getCbApertura() {
		return cbApertura;
	}

	public void setCbApertura(JComboBox<String> cbApertura) {
		this.cbApertura = cbApertura;
	}

	public JComboBox<String> getCbCierre() {
		return cbCierre;
	}

	public void setCbCierre(JComboBox<String> cbCierre) {
		this.cbCierre = cbCierre;
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

}