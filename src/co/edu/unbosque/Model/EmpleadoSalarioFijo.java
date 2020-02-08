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
	 * crea un objeto de tipo empleado con los siguentes parametros la cual extiende de la clase empleado.

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
	
		this.añoDeTrabajo = Integer.parseInt(Year.parse("2020").minusYears(añoIngreso).toString());

	}
	/**
	 * Este metodo abstracto que calcula el salario de un empleado 
	 * <b>pre</b> calcular salario del empleado 
	 * <b>post</b> se actualizo el salario del empleado 
	 * @return
	 */
	
	public abstract double calcularSalario();
	
	
	
	/**
	 *  este metodo accede al atributo año de trabajo que lleva el empleado 
	 *  <b>pre</b> el año de trabajo  es mayor a 0
	 * <b>post</b> se recibio el año de trabajo .
	 * @return
	 */
	
	public int getAñoDeTrabajo() {
		return añoDeTrabajo;
	}
	/**
	 * este metodo accede al atributo año de trabajo que lleva el empleado 
	 *  <b>pre</b> el año de trabajo  es mayor o igual a 0
	 * <b>post</b> se modifico el año de trabajo .
	 * @param añoDeTrabajo  es el numero de años que el empleado lleva en la empresa. != null, nVentas !" ".

	 */
	public void setAñoDeTrabajo(int añoDeTrabajo) {
		this.añoDeTrabajo = añoDeTrabajo;
	}
	/**
	 *  este metodo accede al atributo salario base  que lleva el empleado 
	 *  <b>pre</b> el salario base  es mayor a 0
	 * <b>post</b> se recibio el salario base  .
	 * @return
	 */
	public int getSalarioBase() {
		return salarioBase;
	}
	@Override
	public String toString() {
		return "Empleado Salario Fijo \nNombre: " + getNombre()+ " \nApellido: " + getApellido() +" \nCedula: " + getCedula() + "\nGenero: " + getGenero() + 
				" \nTelefono: " + getTelefono() + "\nCorreo Electronico: " + getCorreoElectronico() + " \nDireccion: " + getDireccion() + 
				"\n Año Ingreso: " + getAñoIngreso() +"Salario: "+ getSalario() +"\nSalario Base: " + salarioBase + " \nAño De Trabajo: " + añoDeTrabajo ;
	}
	

}
