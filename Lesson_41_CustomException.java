
class CustomException extends Exception {
  public CustomException(String message) {
    super(message);
  }

}

public class Lesson_41_CustomException {
  public static void main(String args[]) {
    int age = 19;
    try {
      if (age > 18) {

        throw new CustomException("My Custom Exception");
      }
    } catch (CustomException e) {
      System.out.println(e);
    }
  }

  // static void checkAge(int age) throws ArithmeticException {
  // if (age < 18) {
  // throw new ArithmeticException("Access denied - You must be at least 18 years
  // old.");
  // } else {
  // System.out.println("Access granted - You are old enough!");
  // }
  // }
}
