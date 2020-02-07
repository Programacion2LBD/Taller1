package co.edu.unbosque.Model;

import java.io.Serializable;

public class Nivel4 extends IngenieroJunior implements Serializable {
	final int salarioBase=3500000;
	final double porcentual=0.08;

	public Nivel4(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int a�oIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		double salarioNivel4= salarioBase +salarioBase *porcentual;
		return salarioNivel4;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public double getPorcentual() {
		return porcentual;
	}
	

}
