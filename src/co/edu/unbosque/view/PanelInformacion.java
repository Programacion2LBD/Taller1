package co.edu.unbosque.View;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelInformacion extends JPanel {
	private JTextArea informacion;
	private JButton modificar;
	private JButton eliminar;
	private PanelLista pl;

	public PanelInformacion() {
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("INFORMACION:")));
		informacion = new JTextArea();
		informacion.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
		eliminar = new JButton("ELIMINAR");
		modificar = new JButton("MODIFICAR");

		add(informacion).setBounds(20, 30, 290, 230);
		add(eliminar).setBounds(20, 275, 130, 50);
		add(modificar).setBounds(180, 275, 130, 50);
	}

	public JTextArea getInformacion() {
		return informacion;
	}

	public JButton getModificar() {
		return modificar;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public PanelLista getPl() {
		return pl;
	}

}
