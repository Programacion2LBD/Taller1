package co.edu.unbosque.Model;

import java.io.Serializable;

public class Nivel3 extends IngenieroJunior implements Serializable {
	final int salarioBase=3500000;
	final double porcentual= 0.05;

	public Nivel3(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int añoIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);
	}

	@Override
	public double calcularSalario() {
		double salarioNivel3= salarioBase + salarioBase * porcentual;
		return salarioNivel3;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public double getPorcentual() {
		return porcentual;
	}
	
	@Override
	public String toString() {
		return  "\nnombre:" + getNombre() + ", \napellido:" + getApellido() +", \ncedula:" + getCedula() +", \ngenero:" + getGenero() +", \ntelefono:" +getTelefono() +", \ncorreoElectronico:" + getCorreoElectronico() + ", \ndireccion:" + getDireccion() + ", \nañoIngreso:" + getAñoIngreso() + ",\nsalarioBase:" + salarioBase + ", \nporcentual:" + porcentual + "]"; 
	}
}
