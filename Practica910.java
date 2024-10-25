package mx.unam.fi.poo.g1.p9_10;

import  mx.unam.fi.poo.g1.p9_10.*;

/**
 * Clase Practica910
 * @author Axel Cote 
 * @version Octubre-2024
**/

public class Practica910 {
  /**
   * Metodo main
   * Se ejecuta todo el funcionamiento de la aplicacion
   * @param args -> Arreglo por defecto del metodo main
  **/

  public static void main(String[] args) {
    Verificador ver = new Verificador();
    try {
      System.out.println("La primera cadena a probar es: \"Esto ES una PrúebÁ\"");
      ver.verificar("Esto ES una PrúebÁ");
      System.out.println("La segunda cadena a probar es: \"jsjsjsjsjs\"");
      ver.verificar("jsjsjsjsjs");
    } catch (CadenaException e) {
      System.out.println(e.getMessage());
    }
  }
}
