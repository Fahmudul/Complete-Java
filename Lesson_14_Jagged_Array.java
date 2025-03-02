public class Lesson_14_Jagged_Array {
  public static void main(String args[]) {
    // Jagged array
    int[][] jaggedArray = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
    /*
     * we can specify the size of the column.
     * int newJaggedArray[][] = new int[3][];
     * newJaggedArray[0] = int [] {1,2,3}; //! We are setting the value with the
     * length of the column array
     * newJaggedArray[1] =new int [2]
     * newJaggedArray[2] =new int [4]
     */
    // for (int row[] : jaggedArray) {
    // for (int num : row) {
    // System.out.print(num + " ");
    // }
    // System.out.println();
    // }
    int newJaggedArray[][] = new int[3][];
    newJaggedArray[0] = new int[] { 1, 2, 3 }; // ! We are setting the value with the
    // length of the column array
    newJaggedArray[1] = new int[2];
    newJaggedArray[2] = new int[4];
    // for (int row[] : newJaggedArray) {
    // for (int n : row) {
    // System.out.print(n + ' ');
    // }
    // System.out.println();
    // }

    // 3D array
    int[][][] threeDArray = new int[3][][];
    threeDArray[0] = new int[][] { { 1, 2 }, { 3, 4 } };
    threeDArray[1] = new int[3][4];
    threeDArray[2] = new int[2][3];
    int value = 2;
    for (int outer[][] : threeDArray) {
      for (int middle[] : outer) {
        for (int inner : middle) {
          inner = value * 2;
          System.out.print(inner + " ");
          value++;
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
