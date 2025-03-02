interface ITest {
  // Interface can have fields which are final(constant) and static
  int age = 12;
  String name = "Siam";

  // Interface can have methods. Here behind the scene interface method signature
  // have pubilc abstract keyword. We don't write it explicitly.
  void show();

  void show2();
}

class Test implements ITest { // implements keyword means the Test class must have to define method
                              // (Compulsory, If it not make it abstract class) that ITest interface has.

  public void show() {
    System.out.println("Hello Worlddd");
  }

  public void show2() {
    System.out.println("Hello World 2");
  }

}

public class Lesson_32_Interface {
  public static void main(String args[]) {
    /*
     * 
     * An interface in Java is a reference type, similar to a class, that can
     * contain only constants, method signatures, default methods, static methods,
     * and nested types.
     * Interfaces cannot contain instance fields or constructors and cannot be
     * instantiated directly.
     * They are used to achieve abstraction and multiple inheritance in Java,
     * allowing a class to implement multiple interfaces.
     * Interfaces define a contract for what a class can do rather than how it does
     * it, ensuring that implementing classes provide specific behaviors defined by
     * the interface. 
     */

     // ITest t = new ITest(); // ❌ We can't create an object from an interface
     ITest t = new Test();
     t.show();
  }

}
