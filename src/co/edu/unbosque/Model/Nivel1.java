package co.edu.unbosque.Model;

import java.io.Serializable;
public class Nivel1 extends IngenieroJunior implements Serializable {
	final int salarioBase=3500000;
	final double porcentual= 0.05;
	/*
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


	

	public Nivel1(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,

			String direccion, int añoIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);

	}
	/**
	 * este metodo calcula el salario del empleado dependiendo de los años que lleve en la empresa
	 * <b>pre</b> dependiendo de los años que lleve trabajando
	 * <b>post</b> arroja el salario dle empleado dependiendo de los años que se encuentre en la empresa 
	retun salario del empleado 
	 */
	

	@Override
	public double calcularSalario() {
		double salariofijo = salarioBase;
		double salarioNivel1= salarioBase;
		if(getAñoDeTrabajo()< 2 ) {
			salariofijo=salariofijo;
		}
		else	if (getAñoDeTrabajo() >= 2 && getAñoDeTrabajo()<3) {
			salariofijo = salariofijo + (salariofijo*0.05);

		}
		else	if (getAñoDeTrabajo() >=4 && getAñoDeTrabajo() <7) {
			salariofijo =salariofijo + (salariofijo*0.10);

		}
		else	if (getAñoDeTrabajo() >= 8 && getAñoDeTrabajo() <15) {

			salariofijo = salariofijo +(salariofijo*0.15);
		}
		else if(getAñoDeTrabajo() >= 15) {

			salariofijo = salariofijo +(salariofijo*0.20);
		}
		


		return salariofijo;
	}

	@Override
	public String toString() {
		return "Nivel1 [ \nnombre:" + getNombre() + ", \napellido:" + getApellido() +", \ncedula:" + getCedula() +", \ngenero:" + getGenero() +", \ntelefono:" +getTelefono() +", \ncorreoElectronico:" + getCorreoElectronico() + ", \ndireccion:" + getDireccion() + ",\nañoIngreso:" + getAñoIngreso()+ ",\nsalarioBase:" + salarioBase + ", \nporcentual:" + porcentual + "]";
	}

	
}
