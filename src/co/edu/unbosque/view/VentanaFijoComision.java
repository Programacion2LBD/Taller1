package co.edu.unbosque.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaFijoComision extends JFrame {

	private JButton botonComision;
	private JButton botonFijo;
	private JLabel titulo;
	private ImageIcon fondo;
	private JLabel fondo_;

	public VentanaFijoComision(ActionListener action) {

		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
		setTitle("PAGO DE EMPLEADO");
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

		titulo = new JLabel("ELIGE EL TIPO DE SALARIO DEL EMPLEADO");
		titulo.setFont(fuente);
		botonComision = new JButton("COMISION");
		botonComision.addActionListener(action);
		botonComision.setFont(fuente);
		botonComision.setBorderPainted(false);
		botonFijo = new JButton("SALARIO FIJO");
		botonFijo.addActionListener(action);
		botonFijo.setFont(fuente);
		botonFijo.setBorderPainted(false);

		add(titulo).setBounds(70, 0, 510, 100);
		add(botonComision).setBounds(60, 100, 150, 90);
		add(botonFijo).setBounds(270, 100, 150, 90);
		add(fondo_).setBounds(0, 0, 480, 300);
	}

}
