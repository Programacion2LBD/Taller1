package co.edu.unbosque.Model;

import java.io.Serializable;
import java.time.Year;

public class IngenieroSenior extends EmpleadoSalarioFijo implements Serializable {
	int nVentas;
	static final int salarioBase=3500000;


	
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
		double salarosenior= salarioBase;
		if (nVentas >=1 && nVentas<=5 ) {
			salarosenior = salarosenior +( salarosenior*0.10);
						
		}
		else if(nVentas >=6 && nVentas <=10) {
			salarosenior= salarosenior +(salarosenior*0.15);
		}
		else if(nVentas >=11 && nVentas <=20) {
			salarosenior= salarosenior +(salarosenior*0.20);
			
		}
		else if (nVentas >=21) {
			salarosenior= salarosenior +(salarosenior*0.30);

			
		}
		return salarosenior;
	}
	
	


}
