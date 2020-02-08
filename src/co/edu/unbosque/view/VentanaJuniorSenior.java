package co.edu.unbosque.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJuniorSenior extends JFrame {

	private JButton botonJunior;
	private JButton botonSenior;
	private JLabel titulo;
	private ImageIcon fondo;
	private JLabel fondo_;

	public VentanaJuniorSenior(ActionListener action) {

		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
		setTitle("TIPO DE EMPLEADO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(Color.white);
		setResizable(false);
		setLayout(null);
		setSize(480, 280);
		setLayout(null);
		setLocationRelativeTo(null);

		Font fuente = new Font("Tahoma", 1, 16);
		
		fondo = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
		ImageIcon newImage = new ImageIcon(fondo.getImage().getScaledInstance(480, 300, Image.SCALE_SMOOTH));
		fondo_ = new JLabel(newImage);

		titulo = new JLabel("ELIGE EL TIPO DE EMPLEADO");
		titulo.setFont(fuente);
		botonJunior = new JButton("JUNIOR");
		botonJunior.addActionListener(action);
		botonJunior.setFont(fuente);
		botonJunior.setBorderPainted(false);
		botonSenior = new JButton("SENIOR");
		botonSenior.addActionListener(action);
		botonSenior.setFont(fuente);
		botonSenior.setBorderPainted(false);

		setLayout(null);

		add(titulo).setBounds(120, 0, 510, 100);
		add(botonJunior).setBounds(60, 100, 150, 90);
		add(botonSenior).setBounds(270, 100, 150, 90);
		add(fondo_).setBounds(0, 0, 480, 300);

	}

}
