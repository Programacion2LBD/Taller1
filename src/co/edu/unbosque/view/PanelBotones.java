package co.edu.unbosque.View;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel {
	private JButton agregar;
	private JButton agregarventa;
	private JButton aumentar;

	public PanelBotones() {
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("BOTONES:")));
		agregar = new JButton("AGREGAR");
		agregarventa = new JButton("AGREGAR VENTA");
		aumentar = new JButton("AUMENTAR SALARIO");

		add(agregar).setBounds(50, 30, 170, 50);
		add(agregarventa).setBounds(250, 30, 170, 50);
		add(aumentar).setBounds(450, 30, 170, 50);
	}

	public JButton getAgregar() {
		return agregar;
	}

	public JButton getAgregarventa() {
		return agregarventa;
	}

	public JButton getAumentar() {
		return aumentar;
	}

}
