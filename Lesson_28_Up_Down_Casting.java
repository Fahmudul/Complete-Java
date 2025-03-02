class BiggerClass {
  public void biggerMethod() {
    System.out.println("Bigger Method");
  }
  // BiggerClass had no idea of SmallerClass and its methods.
}

class SmallerClass extends BiggerClass {
  // SmallerClass knows about BiggerClass and its methods.
  public void smallerMethod() {
    System.out.println("Smaller Method");
  }
}

public class Lesson_28_Up_Down_Casting {
  public static void main(String args[]) {
    // What is Upcasting and Downcasting?
    // We know typecasting. Upcasting and downcasting are related to typecasting.
    // Upcasting is a process of converting a lower class object into a higher class
    // object. Downcasting is a process of converting a higher class object into a
    // lower class object.
    // Example:
    double a = 23.34;
    int b = (int) a; // type casting (explicit)
    System.out.println(b);
    int i = 10;

    // Wideing TypeCasting (Automatic Casting)
    // from int to long
    long l = i;

    // Wideing TypeCasting (Automatic Casting)
    // from int to double
    double d = i;

    // Upcasting
    BiggerClass bc = (SmallerClass) new SmallerClass();
    bc.biggerMethod(); // This will work because biggerclass has biggerMethod.
    // bc.smallerMethod(); // This will not work because smallerclass does not have
    // smallerMethod.

    // Downcasting
    SmallerClass bc1 = (SmallerClass) bc;
    bc1.smallerMethod();
  }

}
