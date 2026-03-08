package uebung_projekt1.testcases;

import static org.assertj.core.api.Assertions.assertThat;

import uebung_projekt1.jltest.TestMethode;
import uebung_projekt1.sut.SchaltjahrRechner;

public class SchaltjahrRechnerTest {

  private SchaltjahrRechner rechner = new SchaltjahrRechner();

  @TestMethode("Jahre, die durch 100, aber nicht durch 400 teilbar sind, sind keine Schaltjahre")
  void test_1900() {
    assertThat(rechner.isSchaltjahr(1900)).isFalse();
  }

  @TestMethode("Jahre, die durch 4, aber nicht durch 100 teilbar sind, sind Schaltjahre")
  void test_1904() {
    assertThat(rechner.isSchaltjahr(1904)).isTrue();
  }

  @TestMethode("Jahre, die nicht durch 4 teilbar sind, sind keine Schaltjahre")
  void test1_2001() {
    assertThat(rechner.isSchaltjahr(2001)).isFalse();
  }


  @TestMethode("Jahre, die durch 400 teilbar sind, sind Schaltjahre")
  void test_2000() {
    assertThat(rechner.isSchaltjahr(2000)).isTrue();
  }

}
