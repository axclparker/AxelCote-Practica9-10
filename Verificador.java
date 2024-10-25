package mx.unam.fi.poo.g1.p9_10;

import  mx.unam.fi.poo.g1.p9_10.*;

/**
 * Clase Verificador
 * @author Axel Cote 
 * @version Octubre-2024
**/

public class Verificador {
  /**
   * Metodo verificar
   * Verifica y recorre una cadena dado una lista de vocales y sus variaciones
   * @param cadena -> Cadena que sera recorrida
  **/

  public void verificar(String cadena) throws CadenaException {
    if (cadena.matches(".*[aeiouáéíóúAEIOUÁÉÍÓÚ].*")) {
      System.out.println("La cadena contiene vocales");
    } else {
      throw new CadenaException("La cadena no contiene vocales");
    }
  }
}
