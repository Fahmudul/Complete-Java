public class Lesson_10_Loop {
  public static void main(String args[]) {
    // While Loop
    int i = 1;
    System.out.println("hi " + i); // We are concatenating the value of i with the string. In java when we want to
                                   // concatenate we use + operator
    while (i <= 4) {
      System.out.println("hi " + i);
      i++;
    }
    System.out.println("Bye " + i);

    // For Loop
    // The for loop is used to iterate the elements of a data structure and then
    // perform a certain operation on the elements. It is used when we already
    // know the number of iterations.
    // Syntax: for (initialization; condition; iteration) {
    // code to be executed
    // }
    for (int j = 1; j <= 4; j++) {
      System.out.println("hi " + j);
    }

    // Do-While Loop
    // It is used when we want to execute the loop at least one time. It is used
    // when we don't know the number of iterations.
    // Syntax: do {
    // code to be executed
    // } while (condition);
    int k = 1;
    do {
      System.out.println("hi " + k);
      k++;
    } while (k <= 4);
    System.out.println("Bye " + k);

  }

}
