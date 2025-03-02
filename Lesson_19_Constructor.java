// A constructor in Java is a special method that is called when an object is instantiated. 
// It is used to initialize the object. Constructors have the same name as the class and do not have a return type.

class Car {
  String model;
  int year;

  // Default constructor
  public Car() {
    model = "Unknown";
    year = 0;
  }

  // Parameterized constructor
  public Car(String model, int year) {
    this.model = model;
    this.year = year;
  }

  // Method to display car details
  public void display() {
    System.out.println("Model: " + model + ", Year: " + year);
  }

}

public class Lesson_19_Constructor {
  public static void main(String args[]) {
    // Using default constructor
    Car car1 = new Car();
    car1.display(); // Output: Model: Unknown, Year: 0

    // Using parameterized constructor
    Car car2 = new Car("Toyota", 2022);
    car2.display(); // Output: Model: Toyota, Year: 2022
  }
}
