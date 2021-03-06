package co.edu.unbosque.View;

import co.edu.unbosque.Controller.Controlador;
import co.edu.unbosque.Model.Empleado;
import co.edu.unbosque.Model.EmpleadoaComision;
import co.edu.unbosque.Model.Empresa;
import co.edu.unbosque.Model.IngenieroSenior;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class View extends JFrame implements ActionListener, ListSelectionListener {

	private PanelLista pl;
	private PanelInformacion pi;
	private PanelTitulo pt;
	private PanelBotones pb;
	private VentanaAgregar va;
	private VentanaFijoComision vfc;
	private VentanaJuniorSenior vjs;
	private VentanaNiveles vn;
	private Controlador c;
	private VentanaModificar vm;

	public View(Controlador c) {
		this.c = c;
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
		setTitle("UNIVERSIDAD EL BOSQUE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 700, 710);
		setLocationRelativeTo(null);

		pl = new PanelLista();
		pi = new PanelInformacion();
		pb = new PanelBotones();
		pt = new PanelTitulo();
		va = new VentanaAgregar(c);
		vfc = new VentanaFijoComision(this);
		vjs = new VentanaJuniorSenior(this);
		vn = new VentanaNiveles(this);
		vm = new VentanaModificar(c);

		pl.setBackground(Color.white);
		add(pl).setBounds(10, 220, 340, 350);
		pi.setBackground(Color.white);
		add(pi).setBounds(355, 220, 330, 350);
		pt.setBackground(Color.white);
		add(pt).setBounds(5, 5, 682, 210);
		pb.setBackground(Color.white);
		add(pb).setBounds(12, 570, 673, 100);

		pi.getEliminar().addActionListener(this);
		pi.getModificar().addActionListener(this);
		pb.getAgregar().addActionListener(this);

		pb.getAgregarventa().addActionListener(this);
		pb.getAumentar().addActionListener(this);

		pl.getListaPersonal().addListSelectionListener(this);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int opcion;
		if (e.getActionCommand().equals("AGREGAR")) {
			vfc.setVisible(true);
			va.getNombre_().setText("");
			va.getApellidos_().setText("");
			va.getiden_().setText("");
			va.getHombre_().setSelected(false);
			va.getMujer_().setSelected(false);
			va.getTelefono_().setText("");
			va.getCorreo_().setText("");
			va.getDireccion_().setText("");
			va.getFecha_ingreso().setText("");
		} else if(e.getActionCommand().equals("COMISION")){
			opcion = 1;
			va.setOpcion(opcion);
			vfc.setVisible(false);
			va.setVisible(true);
		} else if (e.getActionCommand().equals("SALARIO FIJO")) {
			vfc.setVisible(false);
			vjs.setVisible(true);
		} else if (e.getActionCommand().equals("JUNIOR")) {
			vjs.setVisible(false);
			vn.setVisible(true);
		} else if (e.getActionCommand().equals("SENIOR")) {
			opcion = 2;
			va.setOpcion(opcion);
			vjs.setVisible(false);
			va.setVisible(true);
		} else if (e.getActionCommand().equals("NIVEL 1")) {
			opcion = 3;
			va.setOpcion(opcion);
			vn.setVisible(false);
			va.setVisible(true);
		} else if (e.getActionCommand().equals("NIVEL 2")) {
			opcion = 4;
			va.setOpcion(opcion);
			va.setVisible(true);
			vn.setVisible(false);
		} else if (e.getActionCommand().equals("NIVEL 3")) {
			opcion = 5;
			va.setOpcion(opcion);
			va.setVisible(true);
			vn.setVisible(false);
		} else if (e.getActionCommand().equals("NIVEL 4")) {
			opcion = 6;
			va.setOpcion(opcion);
			va.setVisible(true);
			vn.setVisible(false);
		} else if (e.getActionCommand().equals("NIVEL 5")) {
			opcion = 7;
			va.setOpcion(opcion);
			va.setVisible(true);
			vn.setVisible(false);
		} else if (e.getActionCommand().equals("ELIMINAR")) {
			String cedula = pl.getListaPersonal().getSelectedValue();
			if (c.eliminarEmpleado(cedula)) {
				System.out.println(pl.getListaPersonal().getSelectedIndex());
				pl.getModeloLista().remove(pl.getListaPersonal().getSelectedIndex());

				pl.getListaPersonal().ensureIndexIsVisible(pl.getModeloLista().getSize());
				pl.getListaPersonal().clearSelection();
				pi.getInformacion().setText("");

			}

		} else if (e.getActionCommand().equals("AUMENTAR SALARIO")) {
			String cedula = pl.getListaPersonal().getSelectedValue();
			c.leerEmpleado(cedula).setSalario(c.leerEmpleado(cedula).calcularSalario());
			pi.getInformacion().setText(c.leerEmpleado(cedula).toString());

		} else if (e.getActionCommand().equals("AGREGAR VENTA")) {
			String cedula = pl.getListaPersonal().getSelectedValue();
			if (c.leerEmpleado(cedula) instanceof EmpleadoaComision) {
				EmpleadoaComision a = (EmpleadoaComision) c.leerEmpleado(cedula);
				a.setNventas(a.getNventas() + 1);
				pi.getInformacion().setText(c.leerEmpleado(cedula).toString());
			} else if (c.leerEmpleado(cedula) instanceof IngenieroSenior) {
				IngenieroSenior a = (IngenieroSenior) c.leerEmpleado(cedula);
				a.setnVentas(a.getnVentas()+1);
				pi.getInformacion().setText(c.leerEmpleado(cedula).toString());

			} else {
				JOptionPane.showMessageDialog(this, "No se pueden agregar ventas a este empleado");
			}
		}
		else if (e.getActionCommand().equals("MODIFICAR")) {
			Empleado empl = c.leerEmpleado(pl.getListaPersonal().getSelectedValue());
			vm.setVisible(true);
			vm.getNombre_().setText(empl.getNombre());
			vm.getApellidos_().setText(empl.getApellido());
			vm.getiden_().setText(empl.getCedula());
			if (empl.getGenero()=='H') vm.getHombre_().setSelected(true);
			else vm.getMujer_().setSelected(true);
			vm.getTelefono_().setText(Long.toString(empl.getTelefono()));
			vm.getCorreo_().setText(empl.getCorreoElectronico());
			vm.getDireccion_().setText(empl.getDireccion());
			vm.getFecha_ingreso().setText(Integer.toString(empl.getAñoIngreso()));
			}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if (pl.getListaPersonal().getSelectedValue()!=null){
			String cedula = pl.getListaPersonal().getSelectedValue();
			pi.getInformacion().setText(c.leerEmpleado(cedula).toString());
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

	public VentanaAgregar getVa() {
		return va;
	}

}