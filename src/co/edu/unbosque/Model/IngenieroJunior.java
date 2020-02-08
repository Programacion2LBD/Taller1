package co.edu.unbosque.Model;

import java.io.Serializable;

public abstract class IngenieroJunior extends EmpleadoSalarioFijo implements Serializable {
	
	int nVentas;

	public IngenieroJunior(String nombre, String apellido, String cedula, char genero, long telefono,

			String correoElectronico, String direccion, int a�oIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso);
	
	nVentas = 0 ;
	
	}
	
	public abstract double calcularSalario();

	@Override
	public String toString() {
		return "IngenieroJunior \nnombre:" + getNombre() + ", \napellido:" + getApellido() +", \ncedula:" + getCedula() +", \ngenero:" + getGenero() +", \ntelefono:" +getTelefono() +", \ncorreoElectronico:" + getCorreoElectronico() + ", \ndireccion:" + getDireccion() + ", \na�oIngreso:" + getA�oIngreso() + ",\nVentas:" + nVentas + "]";
	}
	
	


}
