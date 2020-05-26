package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.model.Mundo;
import utils.TextPrompt;

public class PanelAsignarParejas extends JPanel {
	private static final long serialVersionUID = 1L;

	private JTextField txtNombre;
	private JLabel lblUsuario;
	private JLabel lblPareja;
	private JLabel lblAlmacen;
	private JLabel lblCupo;
	private JLabel lblTarjeta;
	private JLabel lblHorario;
	private JLabel lblApertura;
	private JLabel lblCierre;
	private Mundo m;

	private JComboBox<String> cbUsuario;
	private JComboBox<String> cbPareja;
	private JComboBox<String> cbAlmacen;
	private JComboBox<String> cbCupo;
	private JComboBox<String> cbTarjeta;
	private JComboBox<String> cbApertura;
	private JComboBox<String> cbCierre;

	private JButton btnSave;
	private JButton btnRegresar;
	private JButton btnDelete;
	private JButton btnCrearParejas;

	public PanelAsignarParejas() {
		
		m = new Mundo();

		setLayout		( null );
		setVisible		( false );
		setBackground	( Color.gray );
		setBorder( new CompoundBorder( new EmptyBorder(0, 0, 10, 0), new TitledBorder("Asignación de Parejas")));

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(10, 140, 208, 20);

		
		cbUsuario = new JComboBox();
		cbUsuario.setBackground(Color.WHITE);
		cbUsuario.setBounds(64, 140, 208, 20);
		for(int i = 0; i<m.getUsuarioDAO().getUsuarios().size(); i++) {
		cbUsuario.addItem(m.getUsuarioDAO().getUsuarios().get(i).getNombre());
		}

		lblPareja = new JLabel("Pareja:");
		lblPareja.setBounds(310, 140, 50, 20);

		cbPareja = new JComboBox();
		cbPareja.setBackground(Color.WHITE);
		cbPareja.setBounds(364, 140, 208, 20);
		for (int i = 0; i <m.getParejaDAO().getParejas().size(); i++) {
			cbPareja.addItem(m.getParejaDAO().getParejas().get(i).getPareja());
		}
		

		lblAlmacen = new JLabel("Comercio: ");
		lblAlmacen.setBounds(580, 140, 130, 20);
		

		txtNombre = new JTextField();
		txtNombre.setBounds(64, 140, 208, 20);
		TextPrompt nombrePt = new TextPrompt("Nombre del usuario", txtNombre);
		nombrePt.changeAlpha(0.55f);
		nombrePt.changeStyle(Font.ITALIC);

		cbAlmacen = new JComboBox();
		cbAlmacen.setBackground(Color.WHITE);
		cbAlmacen.setBounds(650, 140, 208, 20);
		for (int i = 0; i < m.getAlmacenDAO().getAlmacenes().size(); i++) {
			cbAlmacen.addItem(m.getAlmacenDAO().getAlmacenes().get(i).getNombre());
		}

		lblCupo = new JLabel("Cupo:");
		lblCupo.setBounds(10, 170, 208, 20);

		cbCupo = new JComboBox<String>();
		cbCupo.setBackground(Color.WHITE);
		cbCupo.setModel(new DefaultComboBoxModel<String>(new String[] { "Seleccione", "" }));
		cbCupo.setBounds(64, 170, 208, 20);

		lblHorario = new JLabel("Horario de Compras");
		lblHorario.setBounds(10, 200, 300, 30);

		lblApertura = new JLabel("Apertura:");
		lblApertura.setBounds(10, 240, 120, 20);

		cbApertura = new JComboBox<String>();
		cbApertura.setBackground(Color.WHITE);
		cbApertura.setModel(new DefaultComboBoxModel<String>(new String[] { "Seleccione", "00:00", "01:00", "02:00",
				"03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00",
				"14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
		cbApertura.setBounds(64, 240, 208, 22);

		lblCierre = new JLabel("Cierre:");
		lblCierre.setBounds(310, 240, 50, 20);

		cbCierre = new JComboBox<String>();
		cbCierre.setBackground(Color.WHITE);
		cbCierre.setModel(new DefaultComboBoxModel<String>(new String[] { "Seleccione", "00:00", "01:00", "02:00",
				"03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00",
				"14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
		cbCierre.setBounds(364, 240, 208, 22);

		btnSave = new JButton("Guardar");
		btnSave.setBackground(new Color(0, 150, 136));
		btnSave.setBounds(440, 455, 140, 30);

		btnDelete = new JButton("Borrar");
		btnDelete.setBackground(new Color(0, 150, 136));
		btnDelete.setBounds(300, 455, 140, 30);

		btnRegresar = new JButton("Regresar");
		btnRegresar.setBackground(new Color(0, 150, 136));
		btnRegresar.setBounds(800, 455, 140, 30);
		
		btnCrearParejas = new JButton ("Crear pareja");
		btnCrearParejas.setBackground(new Color(0, 150, 136));
		btnCrearParejas.setBounds(650, 455, 140, 30);

		// Adicion de elementos al panel
		add(btnSave);
		add(btnDelete);
		add(btnRegresar);
		add(btnCrearParejas);

		add(lblUsuario);
		add(lblPareja);
		add(lblAlmacen);
		add(lblCupo);
		add(lblHorario);
		add(lblApertura);
		add(lblCierre);

		add(cbUsuario);
		add(cbPareja);
		add(cbAlmacen);
		add(cbCupo);
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

	public JComboBox<String> getCbCupo() {
		return cbCupo;
	}

	public JComboBox<String> getCbTarjeta() {
		return cbTarjeta;
	}

	public JLabel getLblUsuario() {
		return lblUsuario;
	}

	public void setLblUsuario(JLabel lblUsuario) {
		this.lblUsuario = lblUsuario;
	}

	public JLabel getLblPareja() {
		return lblPareja;
	}

	public void setLblPareja(JLabel lblPareja) {
		this.lblPareja = lblPareja;
	}

	public JLabel getLblAlmacen() {
		return lblAlmacen;
	}

	public void setLblAlmacen(JLabel lblAlmacen) {
		this.lblAlmacen = lblAlmacen;
	}

	public JLabel getLblCupo() {
		return lblCupo;
	}

	public void setLblCupo(JLabel lblCupo) {
		this.lblCupo = lblCupo;
	}

	public JLabel getLblTarjeta() {
		return lblTarjeta;
	}

	public void setLblTarjeta(JLabel lblTarjeta) {
		this.lblTarjeta = lblTarjeta;
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

	public Mundo getM() {
		return m;
	}

	public void setM(Mundo m) {
		this.m = m;
	}

	public JButton getBtnCrearParejas() {
		return btnCrearParejas;
	}

	public void setBtnCrearParejas(JButton btnCrearParejas) {
		this.btnCrearParejas = btnCrearParejas;
	}

	public void setCbCupo(JComboBox<String> cbCupo) {
		this.cbCupo = cbCupo;
	}

	public void setCbTarjeta(JComboBox<String> cbTarjeta) {
		this.cbTarjeta = cbTarjeta;
	}
	

}