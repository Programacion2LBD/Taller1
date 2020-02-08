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
		return  "\nnombre:" + getNombre() + ", \napellido:" + getApellido() +", \ncedula:" + getCedula() +", \ngenero:" + getGenero() +", \ntelefono:" +getTelefono() +", \ncorreoElectronico:" + getCorreoElectronico() + ", \ndireccion:" + getDireccion() + ", \na�oIngreso:" + getA�oIngreso() + ",\nsalarioBase:" + salarioBase + ", \nporcentual:" + porcentual + "]";
	}
	

}
