public class Lesson_21_Inheritance {
  public static void main(String args[]) {
    // Inheritance: Inheritance is a process in which one object can acquire the properties of another object.
    // In Java, inheritance is implemented using the keyword "extends". We can extend a class by using the keyword "extends".
    // After extending a class, we can access all the properties of the parent class. This is useful when we want to create a new class
    // which is similar to the existing class but with some additional features.
    
    // Example:
    
    // Animal is the parent class
    class Animal {
      void eat() {
        System.out.println("Eating...");
      }
    }
    
    // Dog is the child class
    class Dog extends Animal {
      void bark() {
        System.out.println("Barking...");
      }
    }
    
    Dog d = new Dog();
    d.eat();
    d.bark();
  }
}
