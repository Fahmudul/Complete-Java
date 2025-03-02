class A {
  public void show() {
    System.out.println("Hello World");
  }
}

abstract class B {
  public abstract void show();
}

public class Lesson_31_Annonymous {

  public static void main(String[] args) {
    /*
     * Annonymous Class.
     * 
     * An anonymous class is a local class without a name and is instantiated in
     * place.
     * It is used when you need to create a class that is only used once.
     * 
     * Use Cases:
     * - Implementing interface methods that are used only once.
     * - Creating a quick instance of a class with slight modifications.
     * - Shortening code when you need a simple implementation of an interface.
     */

    A test_2 = new A() { // here we are creating annonymous class. Which class don't have any name. And
                         // this is instantiated in place. It doesn't modify the original Class A
      public void show() {
        System.out.println("Hello World 2");
      }
    };
    test_2.show();
    A test = new A();
    test.show();

    /*-----------------------------------------------------------------
     * -------------------- Annonymous and Abstract Class -------------
     */

    // Since we know that we can't create an object from an abstract class.
    // Lets take a look on the code below
    B test_3 = new B() {
      public void show() {
        System.out.println("Hello World 3");
      }
    }; // Here we are creating an object from an abstract class. Which is not allowed.
       // But we can create an annonymous class. Its kinda like inheritance. We need to implement all the method that are abstract in that class.

  }

}
