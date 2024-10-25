package mx.unam.fi.poo.g1.p9_10;

class RaizNegativa extends Exception {
  public RaizNegativa(String mensaje) {
    super(mensaje);
  }
}

class OperacionM {
  public double raizcuadrada(double numero) throws RaizNegativa {
    if (numero < 0) {
      throw new RaizNegativa("No es posible obtener la raiz de un numero negativo");
    }
    return Math.sqrt(numero);
  }
}

public class Ejercicio1 {
  public static void main(String[] args) {
    OperacionM op = new OperacionM();
    try {
      double resultado = op.raizcuadrada(-9.0);
      System.out.println("Resultado: " + resultado);
    } catch (RaizNegativa e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
