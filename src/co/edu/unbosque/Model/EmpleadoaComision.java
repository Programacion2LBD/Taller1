package co.edu.unbosque.Model;

public class EmpleadoaComision extends Empleado{
	int nventas;
	int salarioMinimo=800000;
	int salarioBase=1100000;

	public EmpleadoaComision(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int añoIngreso,int psalarioMinimo) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);
	
		salarioMinimo = psalarioMinimo;
		
				
	
	
	
	}
	

	@Override
	public double calcularSalario() {
		double salarioaComision= salarioBase;
		return salarioaComision;

			
		

		
	}


	public int getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}


	public int getNventas() {
		return nventas;
	}


	public void setNventas(int nventas) {
		this.nventas = nventas;
	}


	public int getSalarioMinimo() {
		return salarioMinimo;
	}


	public void setSalarioMinimo(int salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	

}
