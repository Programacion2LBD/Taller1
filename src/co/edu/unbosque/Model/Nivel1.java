package co.edu.unbosque.Model;

import java.io.Serializable;

public class Nivel1 extends IngenieroJunior implements Serializable {
	final int salarioBase=3500000;
	final double porcentual= 0.05;
	

	public Nivel1(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int a�oIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso);
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
