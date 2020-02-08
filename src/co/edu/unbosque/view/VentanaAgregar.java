package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import co.edu.unbosque.Controller.Controlador;

public class VentanaAgregar extends JFrame implements ActionListener {

	private JButton agregar;

	private ImageIcon imagen;
	private JLabel imagen_;

	private ImageIcon fondo;
	private JLabel fondo_;

	private JLabel fechaIngreso;
	private JTextField fecha_ingreso;

	private JLabel nombre;
	private JTextField nombre_;

	private JLabel apellidos;
	private JTextField apellidos_;

	private JLabel iden;
	private JTextField iden_;

	private JLabel correo;
	private JTextField correo_;

	private JLabel genero;

	private JLabel mujer;
	private JRadioButton mujer_;
	private JLabel hombre;
	private JRadioButton hombre_;
	private ButtonGroup generosSeleccion;

	private JLabel telefono;
	private JTextField telefono_;

	private JLabel direccion;
	private JTextField direccion_;
	private Controlador c;
	private int opcion;
	Icon icono = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));

	public VentanaAgregar(Controlador c) {
		this.c = c;
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
		setTitle("AGREGAR EMPLEADO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 450, 710);
		setLocationRelativeTo(null);

		Font fuente = new Font("Tahoma", 1, 15);

		fondo = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
		ImageIcon newImage = new ImageIcon(fondo.getImage().getScaledInstance(450, 700, Image.SCALE_SMOOTH));
		fondo_ = new JLabel(newImage);

		imagen = new ImageIcon(getClass().getResource("/Imagenes/agregarempleado.png"));
		ImageIcon newImagen = new ImageIcon(imagen.getImage().getScaledInstance(430, 200, Image.SCALE_SMOOTH));
		imagen_ = new JLabel(newImagen);

		nombre = new JLabel("NOMBRES:");
		nombre.setFont(fuente);
		nombre_ = new JTextField();
		nombre_.setHorizontalAlignment(SwingConstants.CENTER);

		apellidos = new JLabel("APELLIDOS:");
		apellidos.setFont(fuente);
		apellidos_ = new JTextField();
		apellidos_.setHorizontalAlignment(SwingConstants.CENTER);

		iden = new JLabel("IDENTIFICACION:");
		iden.setFont(fuente);
		iden_ = new JTextField();
		iden_.setHorizontalAlignment(SwingConstants.CENTER);

		generosSeleccion = new ButtonGroup();
		genero = new JLabel("GENERO:");
		genero.setFont(fuente);
		mujer = new JLabel("MUJER");
		mujer.setFont(fuente);
		mujer_ = new JRadioButton();
		hombre = new JLabel("HOMBRE");
		hombre.setFont(fuente);
		hombre_ = new JRadioButton();
		generosSeleccion.add(hombre_);
		generosSeleccion.add(mujer_);

		telefono = new JLabel("TELEFONO:");
		telefono.setFont(fuente);

		telefono_ = new JTextField();
		telefono_.setHorizontalAlignment(SwingConstants.CENTER);

		fechaIngreso = new JLabel("AÑO DE INGRESO:");
		fechaIngreso.setFont(fuente);

		fecha_ingreso = new JTextField();
		fecha_ingreso.setHorizontalAlignment(SwingConstants.CENTER);

		direccion = new JLabel("DIRECCION:");
		direccion.setFont(fuente);
		direccion_ = new JTextField();
		direccion_.setHorizontalAlignment(SwingConstants.CENTER);

		correo = new JLabel("CORREO:");
		correo.setFont(fuente);
		correo_ = new JTextField();
		correo_.setHorizontalAlignment(SwingConstants.CENTER);

		agregar = new JButton("AGREGAR");
		agregar.addActionListener(this);

		add(nombre).setBounds(20, 220, 120, 50);
		add(nombre_).setBounds(180, 230, 230, 30);
		add(apellidos).setBounds(20, 270, 130, 50);
		add(apellidos_).setBounds(180, 280, 230, 30);
		add(iden).setBounds(20, 320, 180, 50);
		add(iden_).setBounds(180, 330, 230, 30);
		add(genero).setBounds(20, 380, 120, 50);
		add(hombre).setBounds(190, 380, 120, 50);
		add(hombre_).setBounds(270, 398, 20, 20);
		add(mujer).setBounds(310, 380, 120, 50);
		add(mujer_).setBounds(370, 398, 20, 20);
		add(telefono).setBounds(20, 430, 120, 50);
		add(telefono_).setBounds(180, 440, 230, 30);
		add(correo).setBounds(20, 470, 120, 50);
		add(fechaIngreso).setBounds(20, 580, 300, 50);
		add(fecha_ingreso).setBounds(180, 590, 230, 30);
		add(correo).setBounds(20, 480, 200, 50);
		add(correo_).setBounds(180, 490, 230, 30);
		add(direccion).setBounds(20, 530, 200, 50);
		add(direccion_).setBounds(180, 540, 230, 30);
		add(agregar).setBounds(160, 635, 130, 30);
		add(imagen_).setBounds(10, 10, 425, 200);
		add(fondo_).setBounds(0, 0, 450, 720);

		setVisible(false);

	}

	public ImageIcon getFondo() {
		return fondo;
	}

	public void setFondo(ImageIcon fondo) {
		this.fondo = fondo;
	}

	public JLabel getFondoJLabel() {
		return fondo_;
	}

	public void setFondoJLabel(JLabel fondoJLabel) {
		this.fondo_ = fondoJLabel;
	}

	public JLabel getIden() {
		return iden;
	}

	public void setIden(JLabel iden) {
		this.iden = iden;
	}

	public JTextField getIden_() {
		return iden_;
	}

	public void setIden_(JTextField iden_) {
		this.iden_ = iden_;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JTextField getNombre_() {
		return nombre_;
	}

	public void setNombre_(JTextField nombre_) {
		this.nombre_ = nombre_;
	}

	public JLabel getApellidos() {
		return apellidos;
	}

	public void setApellidos(JLabel apellidos) {
		this.apellidos = apellidos;
	}

	public JTextField getApellidos_() {
		return apellidos_;
	}

	public void setApellidos_(JTextField apellidos_) {
		this.apellidos_ = apellidos_;
	}

	public JLabel getiden() {
		return iden;
	}

	public void setiden(JLabel iden) {
		this.iden = iden;
	}

	public JTextField getiden_() {
		return iden_;
	}

	public void setiden_(JTextField iden_) {
		this.iden_ = iden_;
	}

	public JLabel getCorreo() {
		return correo;
	}

	public void setCorreo(JLabel correo) {
		this.correo = correo;
	}

	public JTextField getCorreo_() {
		return correo_;
	}

	public void setCorreo_(JTextField correo_) {
		this.correo_ = correo_;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		if (comando.equals("AGREGAR")) {

			if (nombre_.getText().isEmpty() || apellidos_.getText().isEmpty() || iden_.getText().isEmpty()
					|| correo.getText().isEmpty() || genero.getText().isEmpty() || telefono_.getText().isEmpty()
					|| correo_.getText().isEmpty() || fecha_ingreso.getText().isEmpty()
					|| direccion_.getText().isEmpty()) {

				JOptionPane.showMessageDialog(null,
						"DEBES AGREGAR TODOS LOS VALORES SOLICITADOS PARA AGREGAR UN NUEVO EMPLEADO", "IMPORTANTE",
						JOptionPane.ERROR_MESSAGE, icono);
			} else {
				if (c.agregarEmpleado(nombre_.getText(), apellidos_.getText(), iden_.getText(),
						genero.getText().charAt(0), Long.parseLong(telefono_.getText()), correo_.getText(),
						direccion_.getText(), Integer.parseInt(fecha_ingreso.getText()), opcion)) {
					JOptionPane.showMessageDialog(null, "SE HA REGISTRADO EL EMPLEO CON LA CEDULA: " + iden_.getText(),
							" OPERACION EXITOSA", JOptionPane.INFORMATION_MESSAGE, icono);
					setVisible(false);
				}
			}
		}
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JLabel getFondo_() {
		return fondo_;
	}

	public void setFondo_(JLabel fondo_) {
		this.fondo_ = fondo_;
	}

	public JLabel getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(JLabel fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public JTextField getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(JTextField fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public JLabel getGenero() {
		return genero;
	}

	public void setGenero(JLabel genero) {
		this.genero = genero;
	}

	public JLabel getMujer() {
		return mujer;
	}

	public void setMujer(JLabel mujer) {
		this.mujer = mujer;
	}

	public JRadioButton getMujer_() {
		return mujer_;
	}

	public void setMujer_(JRadioButton mujer_) {
		this.mujer_ = mujer_;
	}

	public JLabel getHombre() {
		return hombre;
	}

	public void setHombre(JLabel hombre) {
		this.hombre = hombre;
	}

	public JRadioButton getHombre_() {
		return hombre_;
	}

	public void setHombre_(JRadioButton hombre_) {
		this.hombre_ = hombre_;
	}

	public ButtonGroup getGenerosSeleccion() {
		return generosSeleccion;
	}

	public void setGenerosSeleccion(ButtonGroup generosSeleccion) {
		this.generosSeleccion = generosSeleccion;
	}

	public JLabel getTelefono() {
		return telefono;
	}

	public void setTelefono(JLabel telefono) {
		this.telefono = telefono;
	}

	public JTextField getTelefono_() {
		return telefono_;
	}

	public void setTelefono_(JTextField telefono_) {
		this.telefono_ = telefono_;
	}

	public JLabel getDireccion() {
		return direccion;
	}

	public void setDireccion(JLabel direccion) {
		this.direccion = direccion;
	}

	public JTextField getDireccion_() {
		return direccion_;
	}

	public void setDireccion_(JTextField direccion_) {
		this.direccion_ = direccion_;
	}

}