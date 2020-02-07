package co.edu.unbosque.Model;

public class Nivel3 extends IngenieroJunior {
	final int salarioBase=3500000;
	final double porcentual= 0.05;

	public Nivel3(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int a�oIngreso,  int a�oDeTrabajo) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso, a�oDeTrabajo);
	}

	@Override
	public double calcularSalario() {
		double salarioNivel3= salarioBase + salarioBase * porcentual;
		return salarioNivel3;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public double getPorcentual() {
		return porcentual;
	}
	

}
