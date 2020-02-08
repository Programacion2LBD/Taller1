package co.edu.unbosque.Model;

import co.edu.unbosque.Persistence.File;

import java.util.ArrayList;

public class Empresa {
	/**
	 * 
	 * 
	 */

  private ArrayList<Empleado> listaEmpleados;
  /**
   * se crea un lista de tipo empleado 
   * <b>pre</b>existe la clase empledos
   * <b>post<b> existe una lista de empleados 
   * return lista empleados
   * 
   */

  public Empresa(){
    listaEmpleados = File.leerArchivo();
  }
  /**
   * este metodo accede a la lista de tipo empleados  
	 *  <b>pre</b> obtiene un vector con los objetos de empleados 
	 * <b>post</b> actualiza el vector de empleados .
   * @return lista empleados 
   */

  public ArrayList<Empleado> getListaEmpleados() {
    return listaEmpleados;
  }
  /**
   *   este metodo accede al atributo lista empleados para modificarlo
	 * <b>pre</b> modificar el vector de tipo empleado 
	 * <b>post</b> actualizar el vector de tipo  empleado .
	 * @param empleado. un objeto de tipo empleado.
	 
   */
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

}
