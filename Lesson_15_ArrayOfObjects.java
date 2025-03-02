import java.util.Scanner;

class Student {
  int marks;
  String name;
  char grade;
}

public class Lesson_15_ArrayOfObjects {
  public static void main(String args[]) {
    // Array of objects
    // Scanner scan = new Scanner(System.in); // Create Reader
    // System.out.print("Enter Your Age"); // Ask the user for something
    // int age = scan.nextInt(); // Read value from user
    // System.out.print(age);
    Scanner input = new Scanner(System.in);
    Student student[] = new Student[2]; // here we are not creating the object. We have to mannually create the object.
    for (int i = 0; i < student.length; i++) {
      student[i] = new Student(); // In this line we are creating object of Student class
      System.out.println("Your marks");
      student[i].marks = input.nextInt();
      System.out.println("Your name");
      student[i].name = input.next();
      System.out.println("Your grade");
      student[i].grade = input.next().charAt(0);
    }

    for (Student stu : student) {
      System.out.println(stu.marks);
      System.out.println(stu.name);
      System.out.println(stu.grade);
    }
  }

}
