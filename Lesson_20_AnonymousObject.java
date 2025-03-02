class AnonymousClass {
  AnonymousClass() {
    System.out.println("Anonymous Constructor");
  }

  public void display() {
    System.out.println("Hello World");
  }
}

public class Lesson_20_AnonymousObject {
  public static void main(String args[]) {
    // Anonymous Object
    /*
     * 
     ** 
     * Understanding Anonymous Objects**
     * =====================================
     * 
     * Let's break down the concept of anonymous objects and how they work in
     * memory.
     ** 
     * Step 1: Initializing a Variable**
     * ------------------------------------
     * 
     * When we declare a variable, such as `marks`, it creates a memory slot with a
     * null value. For example:
     * 
     * | Variable | Memory Address | Value |
     * | --- | --- | --- |
     * | marks | 101 | null |
     ** 
     * Step 2: Assigning a Value**
     * -----------------------------
     * 
     * When we assign a value to the variable, the null value is replaced with the
     * assigned value.
     * 
     * | Variable | Memory Address | Value |
     * | --- | --- | --- |
     * | marks | 101 | assigned value |
     ** 
     * Anonymous Objects**
     * ---------------------
     * 
     * Now, let's compare this with creating an anonymous object. When we declare a
     * variable of a class type, such as `AnonymousClass var1 = new
     * AnonymousClass();`, it also involves two steps:
     ** 
     * Step 1: Creating a Reference Variable**
     * -----------------------------------------
     * 
     * A variable is created in the stack memory with a memory address, but no
     * object is created yet.
     * 
     * | Variable | Memory Address |
     * | --- | --- |
     * | var1 | 203 |
     ** 
     * Step 2: Creating an Object**
     * -----------------------------
     * 
     * The `new AnonymousClass()` part creates an object in the heap memory with a
     * new memory address.
     * 
     * | Object | Memory Address |
     * | --- | --- |
     * | AnonymousClass | 305 |
     * 
     * The memory address of the object (305) is then assigned to the reference
     * variable `var1`. Note that `var1` is not the object itself, but a reference
     * to the object.
     * 
     * | Variable | Memory Address | Value |
     * | --- | --- | --- |
     * | var1 | 203 | 305 (memory address of the object) |
     * 
     * In summary, an anonymous object is created when we use the `new` keyword to
     * instantiate a class without assigning it to a named variable. The object is
     * created in the heap memory, and a reference to it is stored in a variable in
     * the stack memory.
     * 
     */

    AnonymousClass var1;
    var1 = new AnonymousClass(); // new AnonymousClass() created the anonymous object
    var1.display();

  }
}
