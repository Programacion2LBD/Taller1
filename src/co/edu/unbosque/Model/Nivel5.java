package co.edu.unbosque.Model;

import java.io.Serializable;

public class Nivel5 extends IngenieroJunior implements Serializable {
	final int salarioBase=3500000;
	final double porcentual=0.08;


	public Nivel5(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int a�oIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso);

	}

	@Override
	public double calcularSalario() {
		double salarioNivel5= salarioBase +salarioBase *porcentual;
		if(getA�oDeTrabajo()< 2 ) {
			salarioNivel5=salarioNivel5;
		}
		else	if (getA�oDeTrabajo() >= 2 && getA�oDeTrabajo()<3) {
			salarioNivel5 = salarioNivel5 + (salarioNivel5*0.05);

		}
		else	if (getA�oDeTrabajo() >=4 && getA�oDeTrabajo() <7) {
			salarioNivel5 =salarioNivel5 + (salarioNivel5*0.10);

		}
		else	if (getA�oDeTrabajo() >= 8 && getA�oDeTrabajo() <15) {

			salarioNivel5 = salarioNivel5 +(salarioNivel5*0.15);
		}
		else if(getA�oDeTrabajo() >= 15) {

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
		return "Ingeniero Junior Nivel 5  \nnombre:" + getNombre() + ", \napellido:" + getApellido() +", \ncedula:" + getCedula() +", \ngenero:" + getGenero() +", \ntelefono:" +getTelefono() +", \ncorreoElectronico:" + getCorreoElectronico() + ", \ndireccion:" + getDireccion() + ", \na�oIngreso:" + getA�oIngreso() + "\nSalario" + getSalario();	}
	

}
