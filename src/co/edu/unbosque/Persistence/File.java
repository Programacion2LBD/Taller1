package co.edu.unbosque.Persistence;

import co.edu.unbosque.Model.Empleado;

import java.io.*;
import java.util.ArrayList;

public class File {

  private static final String ruta = "./archivos/empleados.dat";

  public static ArrayList<Empleado> leerArchivo() {
    ArrayList<Empleado> lista = new ArrayList<>();
    ObjectInputStream ois;
    java.io.File archivo = new java.io.File(ruta);
    if (archivo.exists()) {
      try {

        ois = new ObjectInputStream(new FileInputStream(archivo));
        lista = (ArrayList<Empleado>) ois.readObject();
        ois.close();
    } catch(IOException | ClassNotFoundException e){
      e.printStackTrace();
    }
  } else {
      try{
        archivo.createNewFile();
      } catch (IOException e){
        e.printStackTrace();
      }

    }
    return lista;
  }

  public static void escribiraArchivo(ArrayList<Empleado> lista){
    try{
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta));
      oos.writeObject(lista);
      oos.close();
    } catch(IOException e ){
      e.printStackTrace();
    }
  }
}
