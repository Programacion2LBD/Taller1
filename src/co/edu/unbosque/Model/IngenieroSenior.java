package co.edu.unbosque.Model;

public class IngenieroSenior extends EmpleadoSalarioFijo{
	int nVentas;

	
	public IngenieroSenior(String nombre, String apellido, String cedula, char genero, long telefono,
			String correoElectronico, String direccion, int a�oIngreso, int salarioBase, int a�oDeTrabajo,int pnVentas) {
		super(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, a�oIngreso, salarioBase, a�oDeTrabajo);

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
