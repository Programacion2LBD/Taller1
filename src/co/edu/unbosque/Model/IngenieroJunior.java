package co.edu.unbosque.Model;

public abstract class IngenieroJunior extends EmpleadoSalarioFijo {
	
	int nVentas;

	public IngenieroJunior(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int a�oIngreso, int salarioBase, int a�oDeTrabajo, int pnVentas) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso, salarioBase, a�oDeTrabajo);
	
	nVentas =pnVentas;
	
	}
	
	public abstract double calcularSalario();


}
