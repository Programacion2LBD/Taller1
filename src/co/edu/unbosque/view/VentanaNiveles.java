package co.edu.unbosque.View;

import javax.swing.*;

import co.edu.unbosque.Model.Nivel1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaNiveles extends JFrame implements ActionListener {

	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JLabel titulo;
	private ImageIcon fondo;
	private JLabel fondo_;

	public VentanaNiveles(ActionListener action) {

		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
		setTitle("NIVEL DE EMPLEADO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(Color.white);
		setResizable(false);
		setLayout(null);
		setSize(700, 200);
		setLayout(null);
		setLocationRelativeTo(null);

		Font fuente = new Font("Tahoma", 1, 17);

		titulo = new JLabel("ELIGE EL NIVEL DEL INGENIERO JUNIOR");
		titulo.setFont(fuente);
		boton1 = new JButton("NIVEL 1");
		boton1.setFont(fuente);
		boton1.addActionListener(action);
		boton2 = new JButton("NIVEL 2");
		boton2.setFont(fuente);
		
		boton2.addActionListener(action);
		boton3 = new JButton("NIVEL 3");
		boton3.setFont(fuente);
		boton3.addActionListener(action);
		boton4 = new JButton("NIVEL 4");
		boton4.setFont(fuente);
		boton4.addActionListener(action);
		boton5 = new JButton("NIVEL 5");
		boton5.addActionListener(action);
		boton5.setFont(fuente);

		fondo = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
		ImageIcon newImage = new ImageIcon(fondo.getImage().getScaledInstance(700, 300, Image.SCALE_SMOOTH));
		fondo_ = new JLabel(newImage);

		add(titulo).setBounds(150, 10, 500 ,80);
		add(boton1).setBounds(20, 90, 120, 50);
		add(boton2).setBounds(150, 90, 120, 50);
		add(boton3).setBounds(280, 90, 120, 50);
		add(boton4).setBounds(410, 90, 120, 50);
		add(boton5).setBounds(540, 90, 120, 50);
		add(fondo_).setBounds(0, 0, 700, 300);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
