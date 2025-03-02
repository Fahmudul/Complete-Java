public class Lesson_40_Throw {
  public static void main(String args[]) {
    // Throw keyword. Used to throw an exception.
    // Syntax:
    // throw new ExceptionType("Error message");
    // Example:
    try {
      throw new ArithmeticException("Cannot divide by zero");
    } catch (ArithmeticException e) {
      System.out.println("An error occurred: " + e);
    }
  }
}
