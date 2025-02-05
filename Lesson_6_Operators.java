public class Lesson_6_Operators {
  public static void main(String args[]) {
    // Operators
    // Arithmetic Operators
    int a = 10;
    int b = 20;
    System.out.println("Arithmetic Operators");
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));
    System.out.println("a++ = " + (a++));
    System.out.println("a-- = " + (a--));
    System.out.println("++a = " + (++a));
    System.out.println("--a = " + (--a));

    // Relational Operators
    System.out.println("Relational Operators");
    System.out.println("a == b = " + (a == b));
    System.out.println("a != b = " + (a != b));
    System.out.println("a > b = " + (a > b));
    System.out.println("a < b = " + (a < b));
    System.out.println("a >= b = " + (a >= b));
    System.out.println("a <= b = " + (a <= b));

    // Logical Operators
    System.out.println("Logical Operators");
    System.out.println("(a > b) && (b > 0) = " + ((a > b) && (b > 0)));
    System.out.println("(a > b) || (b > 0) = " + ((a > b) || (b > 0)));
    System.out.println(!(a > b));
  }

}
