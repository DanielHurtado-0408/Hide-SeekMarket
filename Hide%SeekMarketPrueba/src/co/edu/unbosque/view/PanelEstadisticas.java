package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelEstadisticas extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel lblReportes;
	private JLabel lblTipoReporte;
	private JTable tablaPrincipal;
	private JTable tablaDetalle;

	private JComboBox<String> reportes;
	private JComboBox<String> cbTipoGrafica;
	private JCheckBox chbxConsultaGeneral;

	private ButtonGroup group;
	private JButton btnGeneraGrafica;
	private JButton btnVolver;
	private JButton btnDescargar;

	ImageIcon iconReport = new ImageIcon("src/resources/iconEstadisticas.png");

	public PanelEstadisticas() {

		setLayout(null);
		setVisible(false);
		setBackground(Color.gray);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 10, 0), new TitledBorder(" Gestion de Graficas ")));

		lblReportes = new JLabel("Sexo:");
		lblReportes.setBounds(5, 450, 50, 20);
		lblReportes.setIcon(new ImageIcon(iconReport.getImage().getScaledInstance(lblReportes.getWidth(),
				lblReportes.getHeight(), Image.SCALE_SMOOTH)));

		lblTipoReporte = new JLabel("Tipo de Grafica");
		lblTipoReporte.setBounds(333, 430, 212, 20);
		add(lblTipoReporte);

		reportes = new JComboBox<String>();
		reportes.setModel(
				new DefaultComboBoxModel<String>(new String[] { "Seleccione", "Clientes", "Parejas", "Comercios" }));
		reportes.setBounds(60, 450, 140, 30);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 111, 920, 242);

		tablaPrincipal = new JTable();
		tablaPrincipal.setColumnSelectionAllowed(false);
		tablaPrincipal.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(tablaPrincipal);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 364, 920, 40);
		add(scrollPane_1);

		tablaDetalle = new JTable();
		scrollPane_1.setViewportView(tablaDetalle);

		cbTipoGrafica = new JComboBox<String>();
		cbTipoGrafica.setModel(new DefaultComboBoxModel<String>(new String[] { "Barras", "Lineas" }));
		cbTipoGrafica.setBounds(333, 450, 167, 30);

		btnGeneraGrafica = new JButton("Generar Grafica");
		btnGeneraGrafica.setBounds(510, 450, 134, 30);

		btnDescargar = new JButton(" Descargar ");
		btnDescargar.setBounds(800, 20, 140, 30);

		btnVolver = new JButton(" Volver ");
		btnVolver.setBounds(800, 450, 140, 30);

		add(scrollPane);
		add(cbTipoGrafica);
		add(lblReportes);
		add(reportes);

		add(btnGeneraGrafica);
		add(btnVolver);
		add(btnDescargar);

	}

	public JButton getBtnCancelar() {
		return btnVolver;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnVolver = btnCancelar;
	}

	public JButton getBtnDescargar() {
		return btnDescargar;
	}

	public void setBtnDescargar(JButton btnDescargar) {
		this.btnDescargar = btnDescargar;
	}

	public JLabel getLblReportes() {
		return lblReportes;
	}

	public void setLblReportes(JLabel lblReportes) {
		this.lblReportes = lblReportes;
	}

	public JLabel getLblTipoReporte() {
		return lblTipoReporte;
	}

	public void setLblTipoReporte(JLabel lblTipoReporte) {
		this.lblTipoReporte = lblTipoReporte;
	}

	public JTable getTablaPrincipal() {
		return tablaPrincipal;
	}

	public void setTablaPrincipal(JTable tablaPrincipal) {
		this.tablaPrincipal = tablaPrincipal;
	}

	public JComboBox<String> getReportes() {
		return reportes;
	}

	public void setReportes(JComboBox<String> reportes) {
		this.reportes = reportes;
	}

	public JComboBox<String> getCbTipoGrafica() {
		return cbTipoGrafica;
	}

	public void setCbTipoGrafica(JComboBox<String> cbTipoGrafica) {
		this.cbTipoGrafica = cbTipoGrafica;
	}

	public JCheckBox getChbxConsultaGeneral() {
		return chbxConsultaGeneral;
	}

	public void setChbxConsultaGeneral(JCheckBox chbxConsultaGeneral) {
		this.chbxConsultaGeneral = chbxConsultaGeneral;
	}

	public ButtonGroup getGroup() {
		return group;
	}

	public void setGroup(ButtonGroup group) {
		this.group = group;
	}

	public JButton getBtnGeneraGrafica() {
		return btnGeneraGrafica;
	}

	public void setBtnGeneraGrafica(JButton btnGeneraGrafica) {
		this.btnGeneraGrafica = btnGeneraGrafica;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JTable getTablaDetalle() {
		return tablaDetalle;
	}

	public void setTablaDetalle(JTable tablaDetalle) {
		this.tablaDetalle = tablaDetalle;
	}

	public ImageIcon getIconReport() {
		return iconReport;
	}

	public void setIconReport(ImageIcon iconReport) {
		this.iconReport = iconReport;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}