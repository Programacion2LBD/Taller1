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
	 * @param a�oIngreso = a�oIngreso != null, a�oIngreso != " "
	 */


	

	public Nivel1(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,

			String direccion, int a�oIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso);

	}
	/**
	 * este metodo calcula el salario del empleado dependiendo de los a�os que lleve en la empresa
	 * <b>pre</b> dependiendo de los a�os que lleve trabajando
	 * <b>post</b> arroja el salario dle empleado dependiendo de los a�os que se encuentre en la empresa 
	retun salario del empleado 
	 */
	

	@Override
	public double calcularSalario() {
		double salariofijo = salarioBase;
		double salarioNivel1= salarioBase;
		if(getA�oDeTrabajo()< 2 ) {
			salariofijo=salariofijo;
		}
		else	if (getA�oDeTrabajo() >= 2 && getA�oDeTrabajo()<3) {
			salariofijo = salariofijo + (salariofijo*0.05);

		}
		else	if (getA�oDeTrabajo() >=4 && getA�oDeTrabajo() <7) {
			salariofijo =salariofijo + (salariofijo*0.10);

		}
		else	if (getA�oDeTrabajo() >= 8 && getA�oDeTrabajo() <15) {

			salariofijo = salariofijo +(salariofijo*0.15);
		}
		else if(getA�oDeTrabajo() >= 15) {

			salariofijo = salariofijo +(salariofijo*0.20);
		}
		


		return salariofijo;
	}

	@Override
	public String toString() {
		return "Nivel1 [ \nnombre:" + getNombre() + ", \napellido:" + getApellido() +", \ncedula:" + getCedula() +", \ngenero:" + getGenero() +", \ntelefono:" +getTelefono() +", \ncorreoElectronico:" + getCorreoElectronico() + ", \ndireccion:" + getDireccion() + ",\na�oIngreso:" + getA�oIngreso()+ ",\nsalarioBase:" + salarioBase + ", \nporcentual:" + porcentual + "]";
	}

	
}
