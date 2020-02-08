package co.edu.unbosque.Model;

import javax.swing.*;
import java.io.Serializable;
import java.time.Year;

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
	private double salario;
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
		salario = calcularSalario();

		try{
			verificarInvariante();
		} catch (AssertionError e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}
	/**
	 * 
	 * @return
	 */
	public abstract double calcularSalario();

	public void verificarInvariante(){
		assert (nombre!=null): "Por favor ingrese un nombre";
		assert (apellido!=null): "Por favor ingrese un apellido";
		assert (cedula!= null): "Por favor ingrese una cedula";
		assert (genero!=' '):"Por favor seleccione un genero";
		assert (telefono>Long.parseLong("3000000000")): "Por favor ingrese un numero valido";
		assert (correoElectronico.contains("@")): "El correo debe contener un arroba";
		assert (direccion!=null):"Por favor ingrese una direcicon";
		assert (a�oIngreso>1950 && a�oIngreso< 2020): "El a�o de ingreso debe ser mayor a 1950 y menor a 2020";
	}

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
