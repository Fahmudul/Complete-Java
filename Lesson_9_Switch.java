public class Lesson_9_Switch {
  public static void main(String args[]) {
    // Swtich Statements
    // Switch case is used to execute a block of code based on given value of the
    // variable.
    // It is used when we have multiple conditions to check.
    // The value of the variable is compared with the value of the case.
    // It is more efficient than using multiple if-else statements.
    // The break statement is used inside the switch to terminate the switch.
    int day = 4;

    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("No such day");
    }

    // New Way to write Switch Statement. Without break statement. (you have to
    // follow any of the syntax. You can't use both : and ->)

    switch (day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      case 3 -> System.out.println("Wednesday");
      case 4 -> System.out.println("Thursday");
      case 5 -> System.out.println("Friday");
      case 6 -> System.out.println("Saturday");
      case 7 -> System.out.println("Sunday");
      default -> System.out.println("No such day");
    }

    // changing variable value inside switch statement (Using java new switch)
    String newDay = "Sunday";
    String result = "";
    String result_1 = "";
    switch (newDay) {
      case "Sunday" -> result = "Today is Sunday";
      case "Monday", "Tuesday", "Wednesday" -> result = "This is Meeting day"; // Here we are checking with multiple
                                                                               // newDay values instead of one newDay
                                                                               // value
    }

    // Another way to do this

    result_1 = switch (newDay) { // here we are using yield keyword. It is similar to return keyword.
      case "Sunday" -> {
        yield "Today is Sunday";
      }
      case "Monday", "Tuesday", "Wednesday" -> {
        yield "This is Meeting day";
      }
      default -> {
        yield "No such day";
      }
    };
    result = switch (newDay) { // here we are using yield keyword. It is similar to return keyword. and using : instead
                               // of ->
      case "Sunday": {
        yield "Today is Sunday";
      }
      case "Monday", "Tuesday", "Wednesday": {
        yield "This is Meeting day";
      }
      default: {
        yield "No such day";
      }
    };
    System.out.println(result);

  }

}
