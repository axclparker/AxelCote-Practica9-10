package mx.unam.fi.poo.g1.p9_10;

import java.util.*;

class NumeroDuplicado extends Exception {
  public NumeroDuplicado(String mensaje) {
    super(mensaje);
  }
}

class IngresaUser {
  public static List<Integer> leerNum() {
    List<Integer> numeros = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    System.out.print("Cuantos numeros deseas ingresar: ");
    int cont = s.nextInt();

    System.out.println("Ingresa numeros enteros: ");
    for(int i = 0; i < cont; i++){
      int num = s.nextInt();
      numeros.add(num);
    }
    s.close();
    return numeros;
  }
}

class Revision {
  public static void checarDuplicado(List<Integer> numeros) throws NumeroDuplicado {
    Set<Integer> numUnicos = new HashSet<>();
      
    for (int num : numeros) {
      if (numUnicos.contains(num)) {
        throw new NumeroDuplicado("Numero duplicado: " + num);
      }
      numUnicos.add(num);
    }
  }
}

public class Ejercicio2 {
  public static void main(String[] args) {
    try {
      List<Integer> numeros = IngresaUser.leerNum();
      Revision.checarDuplicado(numeros);
      System.out.println("No hay duplicados");
    } catch (NumeroDuplicado e) {
      System.out.println("Error| " + e.getMessage());
    }
  }
}
