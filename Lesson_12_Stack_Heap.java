public class Lesson_12_Stack_Heap {
  public static void main(String[] args) {
    // Stack Memory
    // Stack Memory is used to store primitive data types and object references.
    // It is a linear data structure. It is used to store local variables and
    // method calls. It is managed by the JVM. It is less secure than Heap Memory.
    // It is faster than Heap Memory.
    // It is used to store data that is not supposed to be accessed by other
    // threads.
    int num1 = 10; // Primitive data type
    int num2 = 20; // Primitive data type
    int num3 = 30; // Primitive data type
    Animal a = new Animal(); // Object Reference

    // Heap Memory
    // Heap Memory is used to store objects and their instance variables.
    // It is a non-linear data structure. It is managed by the JVM's garbage
    // collector. It is slower than Stack Memory. It is used to store data that
    // is supposed to be accessed by other threads.
    Animal b = new Animal();

    // Visualization of Stack Memory
    // num1 | num2 | num3 | a
    // 10 | 20 | 30 | reference to Animal object in Heap Memory

    // Visualization of Heap Memory
    // Animal object
    // name | weight | age | eat() | sleep()
    // "Kitty" | 10.0 | 2 | reference to eat() method | reference to sleep() method
  }

  static class Animal {
    String name;
    double weight;
    int age;

    void eat() {
    }

    void sleep() {
    }
  }
}
