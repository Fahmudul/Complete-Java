class Lesson_7_Conditionals {
  public static void main(String args) {
    int number = 25;

    // Simple if-else example
    if (number > 0) {
      System.out.println("The number is positive.");
    } else {
      System.out.println("The number is not positive.");
    }

    // Tricky if-else if-else example
    if (number > 0 && number < 10) {
      System.out.println("The number is a single-digit positive number.");
    } else if (number >= 10 && number < 100) {
      System.out.println("The number is a two-digit positive number.");
    } else {
      System.out.println("The number is either negative or has more than two digits.");
    }

    // Nested if-else example
    if (number > 0) {
      System.out.println("The number is positive.");
      if (number % 2 == 0) {
        System.out.println("The number is also even.");
      } else {
        System.out.println("The number is also odd.");
      }
    } else {
      System.out.println("The number is not positive.");
    }

  }
}