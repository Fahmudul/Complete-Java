public class Lesson_39_Exception_Hierarchy {
  public static void main(String args[]) {
    // Exception Hierarchy
    // - **Exceptions are objects** that are thrown when an error occurs.
    // - **Java exceptions are organized in a hierarchy**.
    // - **Throwable** is the superclass of all exceptions.
    // - **Error** is the superclass of all errors.
    // - **Exception** is the superclass of all exceptions.
    // - **Checked exceptions** are exceptions that need to be handled. e.g
    // IOException, SQLException, etc.
    // - **Unchecked exceptions** are exceptions that do not need to be handled. e.g RunTimeException
    // Everything in Java that ends with able is an interface except Throwable,
    // Error, and Exception
    // Throwable is the parent class of Exception
    // try-catch block
    try {
      int a[] = new int[2];
      System.out.println("Access element three :" + a[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception thrown : " + e);
    }

    // try-catch block
    try {
      int x = 0;
      int y = 5 / x;
    } catch (ArithmeticException e) {
      System.out.println("Exception thrown : " + e);
    }

    // try-catch block
    try {
      String s = null;
      System.out.println(s.length());
    } catch (NullPointerException e) {
      System.out.println("Exception thrown : " + e);
    }
  }
}