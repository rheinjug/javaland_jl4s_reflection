package uebung_projekt2.di;

import com.google.common.reflect.ClassPath;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import uebung_projekt2.app.Greeter;
import uebung_projekt2.app.SystemZeit;

public class Injector {


  // Eine Liste reicht vollkommen aus.
  private List<? extends Class<?>> classes = new ArrayList<>();


  public void scanForComponents(String... packages) {
    // Alle Komponenten finden und in classes merken
  }

  // Wenn Greeter.class übergeben wird, soll das Framework sowas wie
  // new Greeter(new SystemZeit()) aufrufen
  public <T> T create(Class<T> klasse) {
   return null;
  }


}


