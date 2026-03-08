package uebung2.plugins;

import uebung2.Dekorator;

public class Space implements Dekorator {

  @Override
  public String dekorieren(String text) {
    return " %s ".formatted(text);
  }
}
