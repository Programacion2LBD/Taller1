package co.edu.unbosque.Model;

import java.io.Serializable;

public abstract class Empleado implements Serializable {
	/**
	 * 
	 */
	private String nombre;
	private String apellido;
	private String cedula;
	private char genero;
	private long telefono;
	private String correoElectronico;
	private String direccion;
	private int a�oIngreso;
	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param genero
	 * @param telefono
	 * @param correoElectronico
	 * @param direccion
	 * @param a�oIngreso
	 */
	
	public Empleado(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int a�oIngreso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.genero = genero;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.direccion = direccion;
		this.a�oIngreso = a�oIngreso;
		
		
		
	}
	/**
	 * 
	 * @return
	 */
	public abstract double calcularSalario();

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	 /**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return
	 */

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * 
	 * @return
	 */

	public String getCedula() {
		return cedula;
	}
	/**
	 * 
	 * @param cedula
	 */

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * 
	 * @return
	 */

	public char getGenero() {
		return genero;
	}
	/**
	 * 
	 * @param genero
	 */

	public void setGenero(char genero) {
		this.genero = genero;
	}
	/**
	 * 
	 * @return
	 */

	public long getTelefono() {
		return telefono;
	}
	/**
	 * 
	 * @return
	 */

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	/**
	 * 
	 * @return
	 */

	public String getCorreoElectronico() {
		return correoElectronico;
	}
	/**
	 * 
	 * @return
	 */

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	/**
	 * 
	 * @return
	 */

	public String getDireccion() {
		return direccion;
	}
	/**
	 * 
	 * @return
	 */

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * 
	 * @return
	 */

	public int getA�oIngreso() {
		return a�oIngreso;
	}
	/**
	 * 
	 * @return
	 */

	public void setA�oIngreso(int a�oIngreso) {
		this.a�oIngreso = a�oIngreso;
	}
	/**
	 */



	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", genero=" + genero
				+ ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + ", direccion=" + direccion
				+ ", a�oIngreso=" + a�oIngreso + "]";
	}
	
	
	

}
