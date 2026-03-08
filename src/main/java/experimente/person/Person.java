package experimente.person;

import java.util.Map;
import java.util.StringJoiner;

public class Person {

  private static final Map<Integer, String> DB = Map.of(
      40225, "Düsseldorf",
      77977, "Rust"
  );

  static record Name(String value) {
  }

  static record Adresse(String strasse, int plz, String stadt) {
    @Override
    public String toString() {
      return strasse + "\n" + plz + " " + stadt + "\n";
    }
  }

  private Name name;
  private Adresse adresse;

  Person(Name name, Adresse adresse) {
    this.name = name;
    this.adresse = adresse;
  }

  public Person(String name, String strasse, int plz, String stadt) {
    this(new Name(name), new Adresse(strasse, plz, stadt));
  }

  public static Person create(String name, String strasse, int plz) {
    String stadt = DB.getOrDefault(plz, "Unbekannt");
    return new Person(name, strasse, plz, stadt);
  }

  String adressAufkleberDrucken(String frankiercode) {
    return """
        CODE: %s
        
        %s
        %s
        
        """
        .formatted(frankiercode, name.value, adresse.toString());
  }

  public String name() {
    return name.value;
  }

  private void setName(String name) {
    this.name = new Name(name);
  }


  @Override
  public String toString() {
    return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
        .add("name=" + name)
        .add("adresse=" + adresse)
        .toString();
  }
}
