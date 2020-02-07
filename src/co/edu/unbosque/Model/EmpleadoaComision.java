package co.edu.unbosque.Model;


import java.io.Serializable;

public class EmpleadoaComision extends Empleado implements Serializable {
	private int nventas;
	private static final int salarioBase = 1100000;
	int minimo=800000;
	

	
	public EmpleadoaComision(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int añoIngreso) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);

		nventas = 0;
	
	}
	

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




	public int getNventas() {
		return nventas;
	}


	public void setNventas(int nventas) {
		this.nventas = nventas;
	}

	

}
