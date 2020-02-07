package co.edu.unbosque.Model;

public class Nivel1 extends IngenieroJunior{
	static final int salarioBase=3500000;
	final double porcentual= 0.05;
	

	public Nivel1(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int a�oIngreso, int a�oDeTrabajo) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso, a�oDeTrabajo);
	}

	@Override
	public double calcularSalario() {
		double salariofijo = salarioBase;
		double salarioNivel1= salarioBase;
		if(getA�oDeTrabajo()< 2 ) {
			salariofijo=salariofijo;
		}
		else	if (getA�oDeTrabajo() >= 2 && getA�oDeTrabajo()<3) {
			salariofijo = salariofijo + (salariofijo*0.05);

		}
		else	if (getA�oDeTrabajo() >=4 && getA�oDeTrabajo() <7) {
			salariofijo =salariofijo + (salariofijo*0.10);

		}
		else	if (getA�oDeTrabajo() >= 8 && getA�oDeTrabajo() <15) {

			salariofijo = salariofijo +(salariofijo*0.15);
		}
		else if(getA�oDeTrabajo() >= 15) {

			salariofijo = salariofijo +(salariofijo*0.20);
		}
		


		return salariofijo;
	}

	
}
