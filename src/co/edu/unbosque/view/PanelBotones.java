package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel {
	JButton agregar;
	JButton agregarventa;
	JButton aumentar;
	View vp;

	public PanelBotones() {
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("BOTONES:")));
		agregar = new JButton("AGREGAR");
		agregar.setActionCommand("agregar");
		agregarventa = new JButton("AGREGAR VENTA");
		agregarventa.setActionCommand("agregarv");
		aumentar = new JButton("AUMENTAR SALARIO");
		aumentar.setActionCommand("aumentars");

		add(agregar).setBounds(50, 30, 170, 50);
		add(agregarventa).setBounds(250, 30, 170, 50);
		add(aumentar).setBounds(450, 30, 170, 50);
	}

}
