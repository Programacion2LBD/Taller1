package co.edu.unbosque.View;

import co.edu.unbosque.Model.Empresa;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame implements ActionListener {
	
	private PanelLista pl;
	private PanelInformacion pi;
	private PanelTitulo pt;
	private PanelBotones pb;
	private VentanaAgregar va;

	public View() {
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
		setTitle("UNIVERSIDAD EL BOSQUE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 700, 710);
		setLocationRelativeTo(null);

		pl = new PanelLista();
		pi= new PanelInformacion();
		pb = new PanelBotones();
		pt = new PanelTitulo();
		va= new VentanaAgregar();

		pl.setBackground(Color.white);
		add(pl).setBounds(10, 220, 340, 350);
		pi.setBackground(Color.white);
		add(pi).setBounds(355, 220, 330, 350);
		pt.setBackground(Color.white);
		add(pt).setBounds(5, 5, 682, 210);
		pb.setBackground(Color.white);
		add(pb).setBounds(12, 570, 673, 100);
	

		pi.eliminar.addActionListener(this);
		pi.modificar.addActionListener(this);
		pb.agregar.addActionListener(this);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("agregar")){
			va.setVisible(true);
		}
	}

	public PanelLista getPl() {
		return pl;
	}

	public PanelInformacion getPi() {
		return pi;
	}

	public PanelTitulo getPt() {
		return pt;
	}

	public PanelBotones getPb() {
		return pb;
	}
}