import other.*;

class d extends A {
  void printBVar() {
    System.out.println(super.cVar);
  }
}

public class Lesson_24_Access_Modifiers {
  public static void main(String args[]) {
    /**
     * This method does XYZ.
     * <p>
     * ![Image Reference](other/accessModifier.png)
     * </p>
     */
    A a = new A();
  System.out.println(a.aVar) // ❌ Accessing private variable 
  System.out.println(a.bVar) // ❌ Accessing default variable but not in the same package
  }
}
