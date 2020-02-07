package co.edu.unbosque.Model;

import java.io.Serializable;

public class EmpleadoaComision extends Empleado implements Serializable {
	int nventas;

	public EmpleadoaComision(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int añoIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);

		nventas = 0;
		
				
	
	
	
	}
	

	@Override
	public double calcularSalario() {
		return 0;
	}




	public int getNventas() {
		return nventas;
	}


	public void setNventas(int nventas) {
		this.nventas = nventas;
	}

	

}
