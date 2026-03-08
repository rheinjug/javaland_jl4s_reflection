package uebung_projekt2.app;

import java.time.LocalDateTime;
import uebung_projekt2.di.Komponente;

@Komponente
public class SystemZeit implements Clock{

  @Override
  public LocalDateTime now() {
    return LocalDateTime.now();
  }
}
