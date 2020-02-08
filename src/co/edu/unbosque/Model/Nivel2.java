package co.edu.unbosque.Model;

import java.io.Serializable;

public class Nivel2 extends IngenieroJunior implements Serializable {
	final int salarioBase=3500000;
	final double porcentual= 0.05;
	/**
	* crea un objeto de tipo ingeniero junior 
	 * @param nombre =  nombre != null,nombre != " "
	 * @param apellido = apellido !=null, apellido != " "
	 * @param cedula = cedula != null , cedula != " "
	 * @param genero = genero != null , genero != " "
	 * @param telefono= telefono != null, telefono != " "
	 * @param correoElectronico = correoElectronico != null, correoElectronico != " "
	 * @param direccion = direccion ! = null , direcciom != " "
	 * @param añoIngreso = añoIngreso != null, añoIngreso != " "
	 */
	
	

	public Nivel2(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int añoIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);
	}

	@Override
	public double calcularSalario() {
		double salarioNivel2=salarioBase + salarioBase*porcentual;
		
		return salarioNivel2;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public double getPorcentual() {
		return porcentual;
	}

	@Override
	public String toString() {
		return "Nivel2 [ \nnombre:" + getNombre() + ", \napellido:" + getApellido() +", \ncedula:" + getCedula() +", \ngenero:" + getGenero() +", \ntelefono:" +getTelefono() +", \ncorreoElectronico:" + getCorreoElectronico() + ", \ndireccion:" + getDireccion() + ", \nañoIngreso:" + getAñoIngreso() + ",salarioBase=" + salarioBase + ", porcentual=" + porcentual + "]";
	}
	

}
