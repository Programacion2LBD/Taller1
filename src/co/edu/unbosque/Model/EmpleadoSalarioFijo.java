package co.edu.unbosque.Model;

import java.io.Serializable;
import java.time.Year;

public abstract class EmpleadoSalarioFijo extends Empleado implements Serializable {
	/**
	 * 
	 */
	static final int salarioBase=3500000;
	int añoDeTrabajo;
	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param genero
	 * @param telefono
	 * @param correoElectronico
	 * @param direccion
	 * @param añoIngreso
	 */
	public EmpleadoSalarioFijo(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int añoIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);
	
	this.	añoDeTrabajo = Integer.parseInt(Year.parse("2020").minusYears(añoIngreso).toString());

	}
	
	public abstract double calcularSalario();
		
	

	/**
	 * 
	 */
	
	
	/**
	 * 
	 * @return
	 */
	
	public int getAñoDeTrabajo() {
		return añoDeTrabajo;
	}
	/**
	 * 
	 * @param añoDeTrabajo
	 */
	public void setAñoDeTrabajo(int añoDeTrabajo) {
		this.añoDeTrabajo = añoDeTrabajo;
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
		return "EmpleadoSalarioFijo [salarioBase=" + salarioBase + ", añoDeTrabajo=" + añoDeTrabajo + "]";
	}
	

}
