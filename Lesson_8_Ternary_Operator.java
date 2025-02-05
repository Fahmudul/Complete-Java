public class Lesson_8_Ternary_Operator {
  public static void main(String arg[]) {
    // Ternary Operator

    int a = 10;
    int b = 20;
    int c;
    String result;

    // Simple ternary operator
    c = (a > b) ? a : b;
    System.out.println("The greater number is " + c);

    // Ternary operator with String
    result = (a < b) ? "a is smaller than b" : "a is greater than or equal to b";
    System.out.println(result);

    // Ternary operator with multiple conditions
    result = (a < b) ? "a is smaller than b" : (a > b) ? "a is greater than b" : "a is equal to b";
    result = (a > b) ? "a is smaller than b" : (a == b) ? "a is equal to b" : "a is greater than b";

    System.out.println(result);
  }
}
