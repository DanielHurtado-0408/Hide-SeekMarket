package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelConsultarUsuarios extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel lblUsuario;
	private JLabel lblPareja;
	private JLabel lblAlmacen;
	private JLabel lblHorario;
	private JLabel lblApertura;
	private JLabel lblCierre;

	private JComboBox<String> cbUsuario;
	private JComboBox<String> cbPareja;
	private JComboBox<String> cbAlmacen;
	private JComboBox<String> cbApertura;
	private JComboBox<String> cbCierre;

	private JButton btnSave;
	private JButton btnRegresar;
	private JButton btnDelete;

	public PanelConsultarUsuarios() {

		setLayout(null);
		setVisible(false);
		setBackground(Color.white);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 10, 0), new TitledBorder("Asignación de Parejas")));

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(10, 140, 208, 20);

		cbUsuario = new JComboBox<String>();
		cbUsuario.setBackground(Color.WHITE);
		cbUsuario.setModel(new DefaultComboBoxModel<String>(new String[] { "Seleccione", "" }));
		cbUsuario.setBounds(64, 140, 208, 20);

		lblPareja = new JLabel("Pareja:");
		lblPareja.setBounds(310, 140, 50, 20);

		cbPareja = new JComboBox<String>();
		cbPareja.setBackground(Color.WHITE);
		cbPareja.setModel(new DefaultComboBoxModel<String>(new String[] { "Seleccione", "" }));
		cbPareja.setBounds(364, 140, 208, 20);

		lblAlmacen = new JLabel("Comercio: ");
		lblAlmacen.setBounds(580, 140, 130, 20);

		cbAlmacen = new JComboBox<String>();
		cbAlmacen.setBackground(Color.WHITE);
		cbAlmacen.setModel(new DefaultComboBoxModel<String>(new String[] { "Seleccione", " " }));
		cbAlmacen.setBounds(650, 140, 208, 20);

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

		add(lblUsuario);
		add(lblPareja);
		add(lblAlmacen);
		add(lblHorario);
		add(lblApertura);
		add(lblCierre);

		add(cbUsuario);
		add(cbPareja);
		add(cbAlmacen);
		add(cbApertura);
		add(cbCierre);

	}

	public JComboBox<String> getCbUsuario() {
		return cbUsuario;
	}

	public void setCbUsuario(JComboBox<String> cbUsuario) {
		this.cbUsuario = cbUsuario;
	}

	public JComboBox<String> getCbPareja() {
		return cbPareja;
	}

	public void setCbPareja(JComboBox<String> cbPareja) {
		this.cbPareja = cbPareja;
	}

	public JComboBox<String> getCbAlmacen() {
		return cbAlmacen;
	}

	public void setCbAlmacen(JComboBox<String> cbAlmacen) {
		this.cbAlmacen = cbAlmacen;
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