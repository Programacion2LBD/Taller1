package co.edu.unbosque.Model;

import java.io.Serializable;
import java.time.Year;

public abstract class EmpleadoSalarioFijo extends Empleado implements Serializable {
	/**
	 * 
	 */
	static final int salarioBase=3500000;
	int a�oDeTrabajo;
	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param genero
	 * @param telefono
	 * @param correoElectronico
	 * @param direccion
	 * @param a�oIngreso
	 */
	public EmpleadoSalarioFijo(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int a�oIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso);
	
	this.	a�oDeTrabajo = Integer.parseInt(Year.parse("2020").minusYears(a�oIngreso).toString());

	}
	
	public abstract double calcularSalario();
		
	

	/**
	 * 
	 */
	
	
	/**
	 * 
	 * @return
	 */
	
	public int getA�oDeTrabajo() {
		return a�oDeTrabajo;
	}
	/**
	 * 
	 * @param a�oDeTrabajo
	 */
	public void setA�oDeTrabajo(int a�oDeTrabajo) {
		this.a�oDeTrabajo = a�oDeTrabajo;
	}
	/**
	 * 
	 * @return
	 */
	public int getSalarioBase() {
		return salarioBase;
	}
	@Override
	public String toString() {
		return "EmpleadoSalarioFijo [salarioBase=" + salarioBase + ", a�oDeTrabajo=" + a�oDeTrabajo + "]";
	}
	

}
