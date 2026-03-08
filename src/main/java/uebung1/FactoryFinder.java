package uebung1;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;

public class FactoryFinder {

  private static boolean isStatic(Method m) {
    System.err.println("Implementier mich");
    return false;
  }


  private static boolean createsClass(Method m, Class<?> aClass) {
    System.err.println("Implementier mich");
    return false;
  }

  public static void printFactoryMethodsIn(Class<?> klasse) {
    System.err.println("Implementier mich");
  }

  public static void main(String[] args) {
    printFactoryMethodsIn(HashSet.class);

    // erwartete Ausgabe (Bsp):
    // Kandidat: newHashSet [int]

    printFactoryMethodsIn(List.class);
    // Kandidat: copyOf [interface java.util.Collection]
    // Kandidat: of [class java.lang.Object]
    // insgesamt 12 Varianten von of, Reihenfolge ist egal
  }

}
