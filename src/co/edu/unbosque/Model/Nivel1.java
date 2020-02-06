package co.edu.unbosque.Model;

public class Nivel1 extends IngenieroJunior{
	final int salarioBase=3500000;
	final double porcentual= 0.05;
	

	public Nivel1(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int añoIngreso, int salarioBase, int añoDeTrabajo, int pnVentas) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso, salarioBase, añoDeTrabajo,
				pnVentas);
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
