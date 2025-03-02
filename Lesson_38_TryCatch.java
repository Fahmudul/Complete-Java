public class Lesson_38_TryCatch {
  public static void main(String args[]) {
    // Try-Catch Block
    // - **Try-catch blocks** are used to handle exceptions.
    // - **Try block**: Contains code that may throw an exception.
    // - **Catch block**: Contains code that handles the exception.
    // - **Finally block**: Contains code that is executed regardless of the
    // exception.
    // - **Syntax**:
    // try { 
    // // Code that may throw an exception
    // } catch (Exception e) {
    // // Code that handles the exception
    // } finally {
    // // Code that is executed regardless of the exception
    // }
    // - **Example**:
    try {
      int[] numbers = { 1, 2, 3 };
      System.out.println(numbers[10]);
    } catch (Exception e) {
      System.out.println("An error occurred: " + e);
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }

}
