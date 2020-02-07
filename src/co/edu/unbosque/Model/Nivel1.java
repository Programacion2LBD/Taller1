package co.edu.unbosque.Model;

public class Nivel1 extends IngenieroJunior{
	static final int salarioBase=3500000;
	final double porcentual= 0.05;
	

	public Nivel1(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int añoIngreso, int añoDeTrabajo) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso, añoDeTrabajo);
	}

	@Override
	public double calcularSalario() {
		double salariofijo = salarioBase;
		double salarioNivel1= salarioBase;
		if(getAñoDeTrabajo()< 2 ) {
			salariofijo=salariofijo;
		}
		else	if (getAñoDeTrabajo() >= 2 && getAñoDeTrabajo()<3) {
			salariofijo = salariofijo + (salariofijo*0.05);

		}
		else	if (getAñoDeTrabajo() >=4 && getAñoDeTrabajo() <7) {
			salariofijo =salariofijo + (salariofijo*0.10);

		}
		else	if (getAñoDeTrabajo() >= 8 && getAñoDeTrabajo() <15) {

			salariofijo = salariofijo +(salariofijo*0.15);
		}
		else if(getAñoDeTrabajo() >= 15) {

			salariofijo = salariofijo +(salariofijo*0.20);
		}
		


		return salariofijo;
	}

	
}
