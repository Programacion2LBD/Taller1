package co.edu.unbosque.View;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelLista extends JPanel {

	JList<String> listaPersonal;
	DefaultListModel<String> modeloLista;

	public PanelLista() {
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("EMPLEADOS:")));
		listaPersonal = new JList<String>();
		modeloLista = new DefaultListModel<String>();
		listaPersonal.setModel(modeloLista);
		listaPersonal.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane desplazamientolista = new JScrollPane(listaPersonal);
		desplazamientolista.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(desplazamientolista).setBounds(20, 25, 300, 308);

	}

	public JList<String> getListaPersonal() {
		return listaPersonal;
	}

	public DefaultListModel<String> getModeloLista() {
		return modeloLista;
	}

}
