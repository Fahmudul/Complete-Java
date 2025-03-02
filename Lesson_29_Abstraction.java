abstract class Abstraction {
  public abstract void show();

  public void display() {
    System.out.println("Hello");
  }
}

class Child extends Abstraction {
  public void show() {
    display();
  }
}

public class Lesson_29_Abstraction {
  public static void main(String[] args) {
    // What is Abstraction?
    // Abstraction is the process of hiding the internal details and showing only
    // the essential features of an object.
    // In Java, abstraction is achieved by using the abstract keyword.
    // Abstract class can have abstract and non-abstract methods.
    // Abstract class can have final methods.
    // Abstract class can have static methods.
    // Abstract class can have private methods.
    // Abstract class can have protected methods.
    // Abstract class can have public methods.
    // Abstract class can have private fields.
    // Abstract class can have protected fields.
    // Abstract class can have public fields.
    // Abstract class can have private constructors.
    // Abstract class can have protected constructors.
    // Abstract class can have public constructors.

    /*
     * *********************
     * Note : We can't create an object from an abstract class.
     * If we inherite an abstract class. Then we have to implement all method that
     * are abstract in that class(paraent).
     * If we can't declare a method (inherited from an abstract class) that are abstract in parant class. We have to make the child class abstract.
     * /***************
     */

     
  }

}
