package mx.unam.fi.poo.g1.p9_10;

class DivisionCero extends Exception {
  public DivisionCero(String mensaje) {
    super(mensaje);
  }
}

class Operacion {
  public double dividir(double numerador, double denominador) throws DivisionCero {
    if (denominador == 0){
      throw new DivisionCero("No es posible dividir entre 0");
    }
    return numerador / denominador;
  }
}

public class Ejercicio0 { 
  public static void main(String[] args) {
    Operacion op = new Operacion();
    try {
      double resultado = op.dividir(10.0, 0.0);
      System.out.println("Resultado: " + resultado);
    } catch (DivisionCero e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
