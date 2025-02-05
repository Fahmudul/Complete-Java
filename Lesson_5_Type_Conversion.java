public class Lesson_5_Type_Conversion {
  public static void main(String args[]) {
    // Type Conversion
    // ! Implicit Type Conversion
    int a = 10;
    float f = a; // Implicit Type Conversion
    System.out.println(f);
    // ! Explicit Type Conversion
    float g = 1.1F;
    int b = (int) g; // Explicit Type Conversion
    System.out.println(b);
    // ! Type Promotion
    byte c = 10;
    byte d = 20;
    int e = c * d; // Type Promotion. Here c and d are byte. But the result of c and d is out of
                   // the range of byte data types because 20 * 10 is 200. But byte can hold only 0
                   // to 127. We are storing the result inside a int variable. And the range of the
                   // int variable is satisfied with the result value. Because int has bigger
                   // range.
    // byte g = c * d; // ! This is incorrect beacuse the result of the operation is
    // out of the range of byte data type.
  }
}
