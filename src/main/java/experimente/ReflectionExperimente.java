package experimente;

import experimente.person.Person;
import java.lang.reflect.Method;

public class ReflectionExperimente {

  public static void main(String[] args) {

    // ++++ Schritt 1
    // Infos über eine Klasse sammeln

    Person p = Person.create("Jens Bendisposto",
        "Universitätsstr 1",
        40225);

    System.out.println(p);

    // Klassenobjekt holen

    // alle öffentliche Methoden

    // alle öffentlichen Methoden der Klasse

    // alle Methoden

    //  Methode adressAufkleberDrucken rausgreifen

    // Rückgabetyp ermitteln


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
