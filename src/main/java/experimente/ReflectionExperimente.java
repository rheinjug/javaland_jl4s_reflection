package experimente;

import experimente.person.Person;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExperimente {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
      InstantiationException, IllegalAccessException {

    // ++++ Schritt 1
    // Infos über eine Klasse sammeln

    Person p = Person.create("Jens Bendisposto",
        "Universitätsstr 1",
        40225);

    System.out.println(p);


    // Klassenobjekt holen

    //    Class<? extends Person> aClass = p.getClass();
//    Class<Person> personClass = Person.class;

    Class<?> personClass = Class.forName("experimente.person.Person");


    System.out.println(personClass);


    // alle öffentliche Methoden

//    for (Method method : personClass.getMethods()) {
//      System.out.println(method);
//    }

    // alle öffentlichen Methoden der Klasse

    for (Method method : personClass.getMethods()) {
      if (method.getDeclaringClass() == Person.class) {
        System.out.println(method);
      }
    }

    // alle Methoden

//    for (Method method : personClass.getDeclaredMethods()) {
//        System.out.println(method);
//    }


    //  Methode adressAufkleberDrucken rausgreifen

    try {
      Method adressAufkleberDrucken =
          personClass.getDeclaredMethod("adressAufkleberDrucken",
              String.class);
      System.out.println(adressAufkleberDrucken);
      // Rückgabetyp ermitteln
      System.out.println(adressAufkleberDrucken.getReturnType());

      Method declaredMethod = personClass.getDeclaredMethod("setName", String.class);
      int modifiers = declaredMethod.getModifiers();
      System.out.println(modifiers);
      System.out.println(Modifier.isPrivate(modifiers));
      System.out.println(Modifier.isSynchronized(modifiers));


    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    }


    // Parametertypen ermitteln

    // Modifier ermitteln


    // ++++ Schritt 2
    // Vollständig dynamische Instanziierung und Methoden aufrufen

    // Klassenobjekt dynamisch holen
// siehe oben

    // Konstruktor holen

    Constructor<?> constructor =
        personClass.getConstructor(String.class, String.class, int.class, String.class);

    Object o =
        constructor.newInstance("Michael Schmidt", "Universitätsstr. 1", 40225, "Düsseldorf");

    Method method = personClass.getMethod("toString");

    String s = (String) method.invoke(o);
    System.out.println(s);

    // Instanz erzeugen (Konstruktor)

    // Instanz-Methode aufrufen

    // Statische Methode aufrufen (Factory)

    Method factory = personClass.getMethod("create", String.class, String.class, int.class);
    Object o1 = factory.invoke(null, "Franz", "Beethovenstr. 4", 42889);
    System.out.println(o1);


    // ++++ Schritt 3
    // Auf Wiedersehen Kapselung

    // Setter aufrufen

    // String kaputtmachen
    // Hint: --add-opens java.base/java.lang=ALL-UNNAMED

    // ++++ Schritt 4
    // Annotationen & Reflection

    // ++++ Schritt 5
    // Alle Klassen finden


  }


}
