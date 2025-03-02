class Outer {

  private String outerMessage = "Outer class message";

  // Level 1: Middle class (nested inside Outer)
  public class Middle {

    private String middleMessage = "Middle class message";

    // Level 2: Inner class (nested inside Middle)
    public class Inner {

      private String innerMessage = "Inner class message";

      // Instance method of Inner class
      public void printMessages() {
        System.out.println(outerMessage); // Accessing outer class variable
        System.out.println(middleMessage); // Accessing middle class variable
        System.out.println(innerMessage); // Accessing inner class variable
      }
    }
  }

  // Static method in Outer class
  public static void outerStaticMethod() {
    System.out.println("This is a static method in the outer class.");
  }
}

public class Main {
  public static void main(String[] args) {

    // Create an instance of the Outer class
    Outer outer = new Outer();

    // Create an instance of the Middle class (nested inside Outer)
    Outer.Middle middle = outer.new Middle();

    // Create an instance of the Inner class (nested inside Middle)
    Outer.Middle.Inner inner = middle.new Inner();

    // Call the printMessages method of the Inner class
    inner.printMessages(); // This will print messages from Outer, Middle, and Inner classes
//  hallo check 
    // Using the static method from the Outer class
    Outer.outerStaticMethod(); // This will print: "This is a static method in the outer class."
  }
}
