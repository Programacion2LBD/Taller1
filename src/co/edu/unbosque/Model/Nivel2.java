package co.edu.unbosque.Model;

public class Nivel2 extends IngenieroJunior {
	final int salarioBase=3500000;
	final double porcentual= 0.05;
	
	

	public Nivel2(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int añoIngreso, int añoDeTrabajo) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso, añoDeTrabajo);
	}

	@Override
	public double calcularSalario() {
		double salarioNivel2=salarioBase + salarioBase*porcentual;
		
		return salarioNivel2;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public double getPorcentual() {
		return porcentual;
	}
	

}
