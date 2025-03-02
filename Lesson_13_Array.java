public class Lesson_13_Array {
  public static void main(String args[]) {
    // Array

    int[] numbers = { 1, 2, 3, 4, 5 };
    int newArr[] = new int[5];
    System.out.println(numbers);
    // 2D array
    int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    for (int n[] : array) { // This syntax is called Enhanced for loop or for each looop.
      /*
       * 
       * 
       * The syntax `for (int n[] : array)` and `for (int number : n)` is called the
       * "enhanced for loop" or "foreach loop" in Java.
       * 
       * Here's a breakdown of how it works:
       * 
       * `int n[]` declares a variable `n` that will hold each element of the outer
       * array `array`. The `[]` indicates that `n` will be an array itself, because
       * `array` is a 2D array.
       * `: array` means
       * "for each element in the `array` array, assign it to `n` and execute the loop body"
       * .
       * 
       * Similarly, in the inner loop:
       * 
       * `int number` declares a variable `number` that will hold each element of the
       * inner array `n`.
       * `: n` means
       * "for each element in the `n` array, assign it to `number` and execute the loop body"
       * .
       * 
       * So, the loop iterates over the outer array, assigning each inner array to
       * `n`, and then iterates over the inner array, assigning each element to
       * `number`.
       * 
       */
      for (int number : n) { // Beauty of for each loop is you don't have to worry about index, and the size
                             // of the array
        System.out.print(number + " ");
      }
      System.out.println();
    }
  }
}
