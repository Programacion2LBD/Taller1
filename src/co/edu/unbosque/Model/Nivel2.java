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
	 * @param a�oIngreso = a�oIngreso != null, a�oIngreso != " "
	 */
	
	

	public Nivel2(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int a�oIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso);
	}

	@Override
	public double calcularSalario() {
		double salarioNivel2=salarioBase + salarioBase*porcentual;

		if(getA�oDeTrabajo()< 2 ) {
			salarioNivel2=salarioNivel2;
		}
		else	if (getA�oDeTrabajo() >= 2 && getA�oDeTrabajo()<3) {
			salarioNivel2 = salarioNivel2 + (salarioNivel2*0.05);

		}
		else	if (getA�oDeTrabajo() >=4 && getA�oDeTrabajo() <7) {
			salarioNivel2 =salarioNivel2 + (salarioNivel2*0.10);

		}
		else	if (getA�oDeTrabajo() >= 8 && getA�oDeTrabajo() <15) {

			salarioNivel2 = salarioNivel2 +(salarioNivel2*0.15);
		}
		else if(getA�oDeTrabajo() >= 15) {

			salarioNivel2 = salarioNivel2 +(salarioNivel2*0.20);
		}
		
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
		return "Ingeniero Junior Nivel 2  \nnombre:" + getNombre() + ", \napellido:" + getApellido() +", \ncedula:" + getCedula() +", \ngenero:" + getGenero() +", \ntelefono:" +getTelefono() +", \ncorreoElectronico:" + getCorreoElectronico() + ", \ndireccion:" + getDireccion() + ", \na�oIngreso:" + getA�oIngreso() + "\nSalario" + getSalario();
	}
	

}
