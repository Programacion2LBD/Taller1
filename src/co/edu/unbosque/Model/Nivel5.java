package co.edu.unbosque.Model;

import java.io.Serializable;

public class Nivel5 extends IngenieroJunior implements Serializable {
	final int salarioBase=3500000;
	final double porcentual=0.08;


	public Nivel5(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int añoIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);

	}

	@Override
	public double calcularSalario() {
		double salarioNivel5= salarioBase +salarioBase *porcentual;
		if(getAñoDeTrabajo()< 2 ) {
			salarioNivel5=salarioNivel5;
		}
		else	if (getAñoDeTrabajo() >= 2 && getAñoDeTrabajo()<3) {
			salarioNivel5 = salarioNivel5 + (salarioNivel5*0.05);

		}
		else	if (getAñoDeTrabajo() >=4 && getAñoDeTrabajo() <7) {
			salarioNivel5 =salarioNivel5 + (salarioNivel5*0.10);

		}
		else	if (getAñoDeTrabajo() >= 8 && getAñoDeTrabajo() <15) {

			salarioNivel5 = salarioNivel5 +(salarioNivel5*0.15);
		}
		else if(getAñoDeTrabajo() >= 15) {

			salarioNivel5 = salarioNivel5 +(salarioNivel5*0.20);
		}
		return salarioNivel5;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public double getPorcentual() {
		return porcentual;
	}
	@Override
	public String toString() {
		return "Nivel5  \nnombre:" + getNombre() + ", \napellido:" + getApellido() +", \ncedula:" + getCedula() +", \ngenero:" + getGenero() +", \ntelefono:" +getTelefono() +", \ncorreoElectronico:" + getCorreoElectronico() + ", \ndireccion:" + getDireccion() + ", \nañoIngreso:" + getAñoIngreso() + "\nSalario" + getSalario();	}
	

}
