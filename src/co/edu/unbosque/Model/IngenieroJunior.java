package co.edu.unbosque.Model;

public abstract class IngenieroJunior extends EmpleadoSalarioFijo {
	
	int nVentas;

	public IngenieroJunior(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int añoIngreso, int salarioBase, int añoDeTrabajo, int pnVentas) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso, salarioBase, añoDeTrabajo);
	
	nVentas =pnVentas;
	
	}
	
	public abstract double calcularSalario();


}
