package co.edu.unbosque.Model;

public abstract class IngenieroJunior extends EmpleadoSalarioFijo {
	
	int nVentas;

	public IngenieroJunior(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int añoIngreso, int añoDeTrabajo) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso, añoDeTrabajo);
	
	
	}
	
	public abstract double calcularSalario();


}
