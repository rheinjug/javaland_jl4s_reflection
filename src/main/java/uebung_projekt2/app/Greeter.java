package uebung_projekt2.app;

import uebung_projekt2.di.Komponente;

@Komponente
public class Greeter {

  private final Clock clock;

  public Greeter(Clock clock) {
    this.clock = clock;
  }

  public String getMessage() {
    int stunde = clock.now().getHour();

    if (stunde >= 5 && stunde < 11) {
      return "Guten Morgen, Javaland";
    }
    if (stunde >= 11 && stunde < 13) {
      return "Mahlzeit, Javaland";
    }
    if (stunde >= 13 && stunde < 18) {
      return "Guten Tag, Javaland";
    }
    if (stunde >= 18 && stunde < 21) {
      return "Guten Abend, Javaland";
    }
    return "Gute Nacht, Javaland";

  }

}
