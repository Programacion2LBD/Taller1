package co.edu.unbosque.Model;

public abstract class IngenieroJunior extends EmpleadoSalarioFijo {
	
	int nVentas;

	public IngenieroJunior(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int a�oIngreso, int a�oDeTrabajo) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso, a�oDeTrabajo);
	
	
	}
	
	public abstract double calcularSalario();


}
