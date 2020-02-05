package co.edu.unbosque.view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelInformacion extends JPanel {
	JTextArea informacion;
	JButton modificar;
	JButton eliminar;
	View vp;
	PanelLista pl;

	public PanelInformacion() {
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("INFORMACION:")));
		informacion = new JTextArea();
		informacion.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
		eliminar = new JButton("ELIMINAR");
		eliminar.setActionCommand("eliminar");
		modificar = new JButton("MODIFICAR");
		modificar.setActionCommand("modificar");

		add(informacion).setBounds(20, 30, 290, 230);
		add(eliminar).setBounds(20, 275, 130, 50);
		add(modificar).setBounds(180, 275, 130, 50);
	}

}
