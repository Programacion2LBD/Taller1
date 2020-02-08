package co.edu.unbosque.Controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.Model.*;
import co.edu.unbosque.Persistence.File;
import co.edu.unbosque.View.View;

public class Controlador {

  private View v;
  private Empresa e;

  public Controlador(){
    e = new Empresa();
    v = new View(this);
    for (Empleado e : e.getListaEmpleados()){
      v.getPl().getModeloLista().addElement(e.getCedula());
    }
    v.getPl().getListaPersonal().setModel(v.getPl().getModeloLista());
  }

  public int buscarEmpleado(String cedula){
    for (int i = 0; i<e.getListaEmpleados().size(); i++){
      if (e.getListaEmpleados().get(i).getCedula().equals(cedula)) return i;
    }
    return -1;
  }
  
  public Empleado leerEmpleado(String cedula) {
	  return e.getListaEmpleados().get(buscarEmpleado(cedula));
  }

  /**
   *
   * @param nombre
   * @param apellido
   * @param cedula
   * @param genero
   * @param telefono
   * @param correoElectronico
   * @param direccion
   * @param añoIngreso
   * @param tipoDeEmpleado es un entero que define que tipo de empleado es asi:
   *                       1 para un empleado por Comision
   *                       2 para un Ingeniero Senior
   *                       3 para un Ingeniero Junior de nivel 1
   *                       4 para un Ingeniero Junior de nivel 2
   *                       5 para un Ingeniero Junior de nivel 3
   *                       6 para un Ingeniero Junior de nivel 4
   *                       7 para un Ingeniero Junior de nivel 5
   * @return
   */
  public boolean agregarEmpleado(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico, String direccion, int añoIngreso, int tipoDeEmpleado){
    Empleado emp;
    if (buscarEmpleado(cedula)==-1){
      switch (tipoDeEmpleado){
        default: emp = new EmpleadoaComision(nombre,apellido,cedula,genero,telefono,correoElectronico,direccion,añoIngreso); break;
        case 2: emp = new IngenieroSenior(nombre,apellido,cedula,genero,telefono,correoElectronico,direccion, añoIngreso); break;
        case 3: emp = new Nivel1(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso); break;
        case 4: emp = new Nivel2(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso); break;
        case 5: emp = new Nivel3(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso); break;
        case 6: emp = new Nivel4(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso); break;
        case 7: emp = new Nivel5(nombre, apellido, cedula, genero, telefono, correoElectronico, direccion, añoIngreso); break;
      }
      try{
        emp.verificarInvariante();
        e.getListaEmpleados().add(emp);
        File.escribiraArchivo(e.getListaEmpleados());
        System.out.println("Empleado Creado");

        v.getPl().getModeloLista().addElement(cedula);
        v.getPl().getListaPersonal().setModel(v.getPl().getModeloLista());
        return true;
      } catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        return false;
      }
    } else {
    	JOptionPane.showMessageDialog(v.getVa(), "Ya existe un empleado con esa cedula");
    	return false;
    }

  }

  public boolean eliminarEmpleado(String cedula){
    int pos = buscarEmpleado(cedula);
    if (pos == -1){
      return false;
    } else {
      e.getListaEmpleados().remove(pos);
      File.escribiraArchivo(e.getListaEmpleados());
      return true;
    }
  }

  public boolean modificarEmpleado(String nombre, String apellido, String cedula, char genero, long telefono, String correoElectronico, String direccion, int añoIngreso){
    int pos = buscarEmpleado(cedula);
    if (pos == -1){
      return false;
    } else {
      e.getListaEmpleados().get(pos).setNombre(nombre);
      e.getListaEmpleados().get(pos).setApellido(apellido);
      e.getListaEmpleados().get(pos).setGenero(genero);
      e.getListaEmpleados().get(pos).setTelefono(telefono);
      e.getListaEmpleados().get(pos).setCorreoElectronico(correoElectronico);
      e.getListaEmpleados().get(pos).setDireccion(direccion);
      e.getListaEmpleados().get(pos).setAñoIngreso(añoIngreso);
      v.getPi().getInformacion().setText(leerEmpleado(v.getPl().getListaPersonal().getSelectedValue()).toString());
      return true;
    }
  }

}
