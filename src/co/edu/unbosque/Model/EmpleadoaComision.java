package co.edu.unbosque.Model;


import java.io.Serializable;

public class EmpleadoaComision extends Empleado implements Serializable {
	/**
	 * 
	 */
	private int nventas;
	private static final int salarioBase = 1100000;
	int minimo=800000;
	/**
	 * crea un objeto de tipo empleado con los siguentes parametros la cual extiende de la clase empleado.
	 * @param nombre
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param genero
	 * @param telefono
	 * @param correoElectronico
	 * @param direccion
	 * @param añoIngreso
	 */
	

	
	public EmpleadoaComision(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int añoIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);

		nventas = 0;
	
	}
	/**
	 * este metodo calcula el salario de los empleados que trabajan por comision 
	 * <b>pre</b> calcular el salario del empleado a comision por el numero de ventas
	 * <b>post</b> se actualizo el salario del empleado 
	 * return retorna el salario del empleado 
	 */
	

	@Override
	public double calcularSalario() {
		double salarioaComision= salarioBase;
		if(nventas >=1) {
			salarioaComision = salarioaComision + minimo;
		}
			
			else if (nventas<=0) {
				salarioaComision = salarioaComision;
		}
		
		
		
		
		return salarioaComision;
		

			
		

		
	}


/**
 *  este metodo accede al atributo numero de ventas que realiza el empleado 
	 *  <b>pre</b> el numero de ventas es mayor a 0
	 * <b>post</b> se recibio el numero de ventas .
 * @return numero de ventas
 */

	public int getNventas() {
		return nventas;
	}
	/**
	 * este metodo accede al atributo numero de ventas que realiza el empleado 
	 *  <b>pre</b> el numero de ventas es mayor o igual a 0
	 * <b>post</b> se modifica el numero de ventas .
	 * @param nventas es el numero de ventas del nuevo empleado.nVentas != null, nVentas !" ".
	 */


	public void setNventas(int nventas) {
		this.nventas = nventas;
	}
	@Override
	public String toString() {
		return "EmpleadoaComision  \nnombre:" + getNombre() + ", \napellido:" + getApellido() + ", \ncedula:" + getCedula() + ", \ngenero:" + getGenero() + 
				" \ntelefono:" + getTelefono() + ", \ncorreoElectronico:" + getCorreoElectronico() + ", \ndireccion:" + getDireccion() + 
				"				, \nañoIngreso:" + getAñoIngreso() + "\nventas=" + nventas + ", \nminimo=" + minimo + "]";
	}

	

}
