package co.edu.unbosque.Model;

public class Nivel5 extends IngenieroJunior{
	final int salarioBase=3500000;
	final double porcentual=0.08;


	public Nivel5(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int añoIngreso,  int añoDeTrabajo) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso, añoDeTrabajo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		double salarioNivel5= salarioBase +salarioBase *porcentual;
		return salarioNivel5;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public double getPorcentual() {
		return porcentual;
	}
	
	

}
