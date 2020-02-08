package co.edu.unbosque.View;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTitulo extends JPanel {
	private ImageIcon titulo;
	private JLabel logoJLabel;

	public PanelTitulo() {
		titulo = new ImageIcon(getClass().getResource("/Imagenes/ueb.png"));
		ImageIcon newImage = new ImageIcon(titulo.getImage().getScaledInstance(680, 210, Image.SCALE_SMOOTH));
		logoJLabel = new JLabel(newImage);

		add(logoJLabel);
		setVisible(true);

	}

	public ImageIcon getTitulo() {
		return titulo;
	}

	public void setTitulo(ImageIcon titulo) {
		this.titulo = titulo;
	}

	public JLabel getLogoJLabel() {
		return logoJLabel;
	}

	public void setLogoJLabel(JLabel logoJLabel) {
		this.logoJLabel = logoJLabel;
	}

}
