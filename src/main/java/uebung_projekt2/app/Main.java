package uebung_projekt2.app;

import uebung_projekt2.di.Injector;

public class Main {


  public static void main(String[] args) {

    Injector injector = new Injector();
    injector.scanForComponents("uebung_projekt2.app");

    Greeter greeter = injector.create(Greeter.class);
    System.out.println(greeter.getMessage());

  }

}
