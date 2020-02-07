package co.edu.unbosque.Model;

import java.io.Serializable;
import java.time.Year;

public class IngenieroSenior extends EmpleadoSalarioFijo implements Serializable {
	int nVentas;

	
	public IngenieroSenior(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int añoIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);

	nVentas = 0;

	}


	public int getnVentas() {
		return nVentas;
	}


	public void setnVentas(int nVentas) {
		this.nVentas = nVentas;
	}


	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	


}
