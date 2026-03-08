package uebung_projekt1.sut;

public class SchaltjahrRechner {

  public boolean isSchaltjahr(int jahr) {
//    if (isTeilbar(jahr,400)) return true;
    if (isTeilbar(jahr, 100)) return false;
    return isTeilbar(jahr, 4);
  }


  private boolean isTeilbar(int a, int b) {
    return a % b == 0;
  }

}
