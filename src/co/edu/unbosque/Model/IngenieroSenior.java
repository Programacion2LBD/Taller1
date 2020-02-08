package co.edu.unbosque.Model;

import java.io.Serializable;
import java.time.Year;

public class IngenieroSenior extends EmpleadoSalarioFijo implements Serializable {
	int nVentas;
	static final int salarioBase=3500000;
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



	
	public IngenieroSenior(String nombre, String apellido, String cedula, char genero, long telefono,

			String correoElectronico, String direccion, int añoIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);

	nVentas = 0;

	}
	/**
	 * este metodo accede al atributo numero de ventas del empleado 
	 *  <b>pre</b> obtiene el numero de ventas del empleado 
	 * <b>post</b> actualiza el numero de ventas del emplado .
	 * @return numero de ventas 
	 */


	public int getnVentas() {
		return nVentas;
	}
	/**
	 *  este metodo accede al atributo numero de ventas del empleado para modificarlo
	 * <b>pre</b> modificar el numero de ventas del empleado 
	 * <b>post</b> actualizar el numero de ventas  del empleado .
	 * @param nVentas de ventas es el  numero de ventas   del nuevo empleado.numero de ventas != null, numero de ventas !" ".
	 **/



	public void setnVentas(int nVentas) {
		this.nVentas = nVentas;
	}


	@Override
	public double calcularSalario() {
		double salarosenior= salarioBase;
		if (nVentas >=1 && nVentas<=5 ) {
			salarosenior = salarosenior +( salarosenior*0.10);
						
		}
		else if(nVentas >=6 && nVentas <=10) {
			salarosenior= salarosenior +(salarosenior*0.15);
		}
		else if(nVentas >=11 && nVentas <=20) {
			salarosenior= salarosenior +(salarosenior*0.20);
			
		}
		else if (nVentas >=21) {
			salarosenior= salarosenior +(salarosenior*0.30);

			
		}
		return salarosenior;
	}


	@Override
	public String toString() {
		return "Ingeniero Senior  \nnombre:" + getNombre() + ", \napellido:" + getApellido() +", \ncedula:" + getCedula() +", \ngenero:" + getGenero() +", \ntelefono:" +getTelefono() +", \ncorreoElectronico:" + getCorreoElectronico() + ", \ndireccion:" + getDireccion() + ", \nañoIngreso:" + getAñoIngreso() +",\nVentas:" + nVentas + "\nSalario: " + getSalario();
	}
	
	


}
