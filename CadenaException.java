package mx.unam.fi.poo.g1.p9_10;

/**
 * Clase CadenaException extends Exception
 * @author Axel Cote 
 * @version Octubre-2024
**/

public class CadenaException extends Exception {
  /**
   * Metodo Constructor
   * @param mensaje -> Atributo del mensaje que arrojara Exception
  **/

  public CadenaException(String mensaje) {
    super(mensaje);
  }

  /**
   * Metodo getMensaje
   * @return mensaje -> Regresa el atributo mensaje
  **/

  public String getNombre() {
    return super.getMessage();
  }
}
