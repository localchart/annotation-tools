package annotator.tests;

import java.util.List;

public class TypeCastSimple {
  public void foo(Object o) {
    List myList = (/* @Mutable*/ List) o;
    System.out.println(o);
  }
}
