
/************* ✨ Codeium Command ⭐ *************/
// Enums in Java
// An enum type is a special data type that enables for a variable to be a set
// of predefined constants.

enum Day {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Lesson_35_Enums {
  public static void main(String args[]) {

    // Example of using enums
    Day today = Day.MONDAY;
    System.out.println("Today is " + today);

    // Example of using values() method
    System.out.println("Days of the week:");
    for (Day day : Day.values()) {
      System.out.println(day);
    }

    // Example of using ordinal() method
    System.out.println("Ordinal of " + today + " is " + today.ordinal());

    // Example of using enums with switch case
    switch (today) { 
      case MONDAY:
        System.out.println("Let's start the week!");
        break;
      case FRIDAY:
        System.out.println("Weekend is near!");
        break;
      case SATURDAY:
      case SUNDAY:
        System.out.println("It's the weekend!");
        break;
      default:
        System.out.println("It's a weekday.");
        break;
    }
  }
}
