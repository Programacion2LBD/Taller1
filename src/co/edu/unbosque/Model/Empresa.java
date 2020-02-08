package co.edu.unbosque.Model;

import co.edu.unbosque.Persistence.File;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Empleado> listaEmpleados;

	public Empresa() {
		listaEmpleados = File.leerArchivo();
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

}
