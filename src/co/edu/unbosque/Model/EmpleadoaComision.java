package co.edu.unbosque.Model;

public class EmpleadoaComision extends Empleado{
	int salarioBase;
	int nventas;
	int salarioMinimo;

	public EmpleadoaComision(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int añoIngreso,  int psalarioBase,int pnventas,int psalarioMinimo) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso);
	
		salarioBase = psalarioBase;
		nventas = pnventas;
		salarioMinimo = psalarioMinimo;
		
				
	
	
	
	}
	

	@Override
	public double calcularSalario() {
		return 0;
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
