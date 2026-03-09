package uebung1;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FactoryFinder {

  private static boolean isStatic(Method m) {
    return Modifier.isStatic(m.getModifiers());
  }


  private static boolean createsClass(Method m, Class<?> k) {
    return k.isAssignableFrom(m.getReturnType());
  }

  public static void printFactoryMethodsIn(Class<?> klasse) {
    Method[] methods = klasse.getMethods();
    for (Method method : methods) {
      if (isStatic(method) && createsClass(method, klasse)) {
        System.out.println("Kandidat: %s %s %n".formatted(method.getName(), Arrays.toString(method.getParameters())));
      }
    }


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
