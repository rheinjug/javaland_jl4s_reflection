package experimente;

import experimente.person.Person;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExperimente {

  public static void main(String[] args) {

    // ++++ Schritt 1
    // Infos über eine Klasse sammeln

    Person p = Person.create("Jens Bendisposto",
        "Universitätsstr 1",
        40225);

    System.out.println(p);





    // Klassenobjekt holen

    //    Class<? extends Person> aClass = p.getClass();
    Class<Person> personClass = Person.class;

    System.out.println(personClass);


    // alle öffentliche Methoden

//    for (Method method : personClass.getMethods()) {
//      System.out.println(method);
//    }

    // alle öffentlichen Methoden der Klasse

    for (Method method : personClass.getMethods()) {
      if(method.getDeclaringClass() == Person.class)
      System.out.println(method);
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

    // Konstruktor holen

    // Instanz erzeugen (Konstruktor)

    // Instanz-Methode aufrufen

    // Statische Methode aufrufen (Factory)

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
