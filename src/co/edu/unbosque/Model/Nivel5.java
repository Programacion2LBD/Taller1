package co.edu.unbosque.Model;

public class Nivel5 extends IngenieroJunior{
	final int salarioBase=3500000;
	final double porcentual=0.08;


	public Nivel5(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int a�oIngreso, int salarioBase, int a�oDeTrabajo, int pnVentas) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso, salarioBase, a�oDeTrabajo,
				pnVentas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public double getPorcentual() {
		return porcentual;
	}
	
	

}
