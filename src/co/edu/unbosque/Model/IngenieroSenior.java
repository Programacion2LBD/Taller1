package co.edu.unbosque.Model;

public class IngenieroSenior extends EmpleadoSalarioFijo{
	int nVentas;

	
	public IngenieroSenior(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int añoIngreso, int salarioBase, int añoDeTrabajo,int pnVentas) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso, salarioBase, añoDeTrabajo);

	nVentas = pnVentas;
	
	
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
