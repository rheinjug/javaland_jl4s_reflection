package uebung2;

import java.util.Map;
import uebung2.plugins.Space;
import uebung2.plugins.Star;
import uebung2.plugins.WavyLines;

public class Greet {

  private static Map<String, Dekorator> plugins = Map.of(
      "uebung2.plugins.Space", new Space(),
      "uebung2.plugins.Star", new Star(),
      "uebung2.plugins.WavyLines", new WavyLines()
  );

  // Hier müssen wir Reflection verwenden, um die Klassen dynamisch zu laden
  // und zu instanziieren.
  // Bonus-Aufgabe: Klassen nur einmal laden und die Instanzen cachen
  private static Dekorator getPlugin(String name) {
    return plugins.get(name);
  }

  public static void main(String[] args) {
    // In Produktion wollen wir beliebige Dekoratoren auflisten
    // String[] pluginNames = args;
    String[] pluginNames = {
        "uebung2.plugins.Space", "uebung2.plugins.Star",
        "uebung2.plugins.Space", "uebung2.plugins.WavyLines",
        "uebung2.plugins.WavyLines", "uebung2.plugins.WavyLines", "uebung2.plugins.Star", "uebung2.plugins.WavyLines"};
    String text = "Hallo";
    for (String pluginName : pluginNames) {
      Dekorator plugin = getPlugin(pluginName);
      text = plugin.dekorieren(text);
    }
    System.out.println(text);
  }


}
