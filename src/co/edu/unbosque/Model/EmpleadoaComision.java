package co.edu.unbosque.Model;

import java.io.Serializable;

public class EmpleadoaComision extends Empleado implements Serializable {
	int nventas;

	public EmpleadoaComision(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int a�oIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso);

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
