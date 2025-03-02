class Sample {
  public int a;
  public int b;

  // What is object class?
  /*
   * When we create a class behind the scnene our created class get inherited from
   * Object class. so even if we dont create any method of our class, our class
   * will have all the method that Object class have. e.g equals, toString,
   * hashCode
   * 
   *
   */
  // Overridding toString class of Object class
  @Override
  public String toString() {
    return "Sample [a=" + a + ", b=" + b + "]";
  }

}

public class Lesson_27_Object_Class {
  public static void main(String args[]) {
    Sample s = new Sample();
    // System.out.println(s); // This will call toString method. But our class
    // doesn't have a toString method
    // so it will use the toString method of Object class.
    // After overridding toString method
    s.a = 10;
    s.b = 20;
    System.out.println(s);
  }
}
