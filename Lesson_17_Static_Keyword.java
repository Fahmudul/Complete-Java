class Sample {
  static int a = 10; // Static variable. Member of class not object.
  int b; // Instance variable. Member of object.
  // Static method

  public static void show() {
    System.out.println(a);
    // System.out.println(b); // This is wrong because the b is not a member of an object. So if we think logically. since this show method is a static. It will only have the access to static variable a. which is a class member. And a is constant. For every object that are created from Sample class. The value of a will be same. But the value of b can be different. So how a static method knows that which b(variable) he is trying to print. There will be a confussion. 
  }

  // Non-static (instance method)
  public void display() {
    System.out.println(b);
    System.out.println(a);
  }

}

public class Lesson_17_Static_Keyword {
  public static void main(String args[]) {
    Sample s1 = new Sample();
    Sample s2 = new Sample();
    Sample.show();
    s1.display();
    s2.display();
  }
}