class Parent {
  Parent() {
    System.out.println("Parent constructor");
  }

  public void show(int n) {
    System.out.println("Parent method");
  }
}

class Child extends Parent {
  Child() {
    super(); // Calls Parent constructor
    this.show(12);
    this.display();
    System.out.println("Child constructor");
  }

  public void show(int n) {
    System.out.println("Child method");
  }

  void display() {
    this.show(12); // Calls current class method
    super.show(12); // Calls Parent class method
  }

  public static void main(String[] args) {
    Child c = new Child();
    c.display();
  }
}

public class Lesson_23_This_Super_Method {
  public static void main(String args[]) {
    /*
     * 4️⃣ Key Differences Between this and super
     * Feature | this | super
     * -------------------------|----------------------------------------|----------
     * ---------------
     * Refers to | Current class instance | Parent class instance
     * Used in | Same class | Subclass (inheritance)
     * Calls | Another constructor in the same class | Parent class constructor
     * Accesses | Current class fields/methods | Parent class fields/methods
     * Can be used in static methods? | ❌ No |❌ No
     * ------------------------|----------------------------------------|-----------
     * -------------
     * 
     */

    Child c = new Child();
  }
}
