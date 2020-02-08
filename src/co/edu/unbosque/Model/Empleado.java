package co.edu.unbosque.Model;

import javax.swing.*;
import java.io.Serializable;
import java.time.Year;

public abstract class Empleado implements Serializable {
	
	private String nombre;
	private String apellido;
	private String cedula;
	private char genero;
	private long telefono;
	private String correoElectronico;
	private String direccion;
	private int añoIngreso;
	private double salario;
	/**
	 * crea un objeto de tipo empleado con los siguentes parametros.
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param genero
	 * @param telefono
	 * @param correoElectronico
	 * @param direccion
	 * @param añoIngreso
	 */
	
	public Empleado(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico,
			String direccion, int añoIngreso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.genero = genero;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.direccion = direccion;
		this.añoIngreso = añoIngreso;
		salario = calcularSalario();

		try{
			verificarInvariante();
		} catch (AssertionError e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}
	/**
	 * Este metodo abstracto que calcula el salario de un empleado 
	 * <b>pre</b> calcular salario del empleado 
	 * <b>post</b> se actualizo el salario del empleado 
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
		assert (añoIngreso>1950 && añoIngreso< 2020): "El año de ingreso debe ser mayor a 1950 y menor a 2020";
	}

	/**
	 * este metodo accede al atributo nombre del empleado 
	 *  <b>pre</b> obtiene el nombre del empleado 
	 * <b>post</b> actualiza el nombre del emplado .
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	 /**
	 * este metodo accede al atributo nombre del empleado para modificarlo
	 * <b>pre</b> modificar el nombre del empleado 
	 * <b>post</b> actualizar el nombre del empleado .
	 * @param nombre es el nombre del nuevo empleado.nombre != null, nombre !" ".
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * este metodo accede al atributo apellido del empleado 
	 *  <b>pre</b> obtiene el apellido del empleado 
	 * <b>post</b> actualiza el apellido del emplado .
	 * @return apellido 
	 */

	public String getApellido() {
		return apellido;
	}
	/**
	 *  este metodo accede al atributo apellido del empleado para modificarlo
	 * <b>pre</b> modificar el apellido del empleado 
	 * <b>post</b> actualizar el apellido del empleado .
	 * @param apellido es el apellido del nuevo empleado.apellido != null, apellido !" ".
	 */

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * este metodo accede al atributo cedula del empleado 
	 *  <b>pre</b> obtiene la cedula del empleado 
	 * <b>post</b> actualiza la cedula del emplado .
	 * @return cedula 
	 */

	public String getCedula() {
		return cedula;
	}
	/**
	 *  este metodo accede al atributo cedula del empleado para modificarlo
	 * <b>pre</b> modificar la cedula del empleado 
	 * <b>post</b> actualizar la cedula  del empleado .
	 * @param cedula es la  cedula  del nuevo empleado.cedula != null, cedula !" ".
	 */

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * este metodo accede al atributo genero del empleado 
	 *  <b>pre</b> obtiene el genero del empleado 
	 * <b>post</b> actualiza el genero del emplado .
	 * @return genero 
	 */

	public char getGenero() {
		return genero;
	}
	/**
	 *  este metodo accede al atributo genero del empleado para modificarlo
	 * <b>pre</b> modificar el genero del empleado 
	 * <b>post</b> actualizar el genero  del empleado .
	 * @param genero es el  genero  del nuevo empleado.genero != null, genero !" ".
	 */

	public void setGenero(char genero) {
		this.genero = genero;
	}
	/**
	 * este metodo accede al atributo telefono del empleado 
	 *  <b>pre</b> obtiene el telefono del empleado 
	 * <b>post</b> actualiza el telefono del emplado .
	 * @return telefono 
	 */

	public long getTelefono() {
		return telefono;
	}
	
	/**
	 *  este metodo accede al atributo telefono del empleado para modificarlo
	 * <b>pre</b> modificar el telefono del empleado 
	 * <b>post</b> actualizar el telefono  del empleado .
	 * @param telefono es el  telefono  del nuevo empleado.telefono != null, telefono !" ".
	 */

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	/**
	 * este metodo accede al atributo correoelectronico del empleado 
	 *  <b>pre</b> obtiene el correoelectronico del empleado 
	 * <b>post</b> actualiza el correoelectronico del emplado .
	 * @return correoelectronico
	 */

	public String getCorreoElectronico() {
		return correoElectronico;
	}
	/**
	 *  este metodo accede al atributo correoelectronico del empleado para modificarlo
	 * <b>pre</b> modificar el correoelectronico del empleado 
	 * <b>post</b> actualizar el correoelectronico  del empleado .
	 * @param correoelectronico es el  correoelectronico  del nuevo empleado.correoelectronico != null, correoelectronico !" ".
	 */

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	/**
	 * este metodo accede al atributo direccion del empleado 
	 *  <b>pre</b> obtiene la direccion del empleado 
	 * <b>post</b> actualiza la direccion del emplado .
	 * @return direccion
	 */

	public String getDireccion() {
		return direccion;
	}
	/**
	 *  este metodo accede al atributo direccion del empleado para modificarlo
	 * <b>pre</b> modificar la direccion del empleado 
	 * <b>post</b> actualizar la direccion  del empleado .
	 * @param direccion es la direccion  del nuevo empleado.direccion != null, direccion !" ".
	 */

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * * este metodo accede al atributo añoIngreso del empleado 
	 *  <b>pre</b> obtiene el añoIngreso del empleado 
	 * <b>post</b> actualiza el añoIngreso del emplado .
	 * @return añoIngreso 
	 
	 */

	public int getAñoIngreso() {
		return añoIngreso;
	}
	/**
	 *  este metodo accede al atributo añoIngreso del empleado para modificarlo
	 * <b>pre</b> modificar el añoIngreso del empleado 
	 * <b>post</b> actualizar el añoIngreso  del empleado .
	 * @param añoIngreso es el añoIngreso  del nuevo empleado.añoIngreso != null, añoIngreso !" ".
	 */

	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}
	/**
	 * metodo para mostrar informacion
	 */


	@Override
	public String toString() {
		return "Empleado \nnombre:" + nombre + ", \napellido:" + apellido + ", \ncedula:" + cedula + ", \ngenero:" + genero
				+ ", \ntelefono:" + telefono + ", \ncorreoElectronico:" + correoElectronico + ", \ndireccion:" + direccion
				+ ", \nañoIngreso:" + añoIngreso + "";
	}
	
	
	

}
